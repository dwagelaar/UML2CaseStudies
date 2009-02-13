package be.ac.vub.uml2cs.instantmessenger.popup.actions;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.ant.core.AntRunner;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.adt.launching.AtlVM;
import org.eclipse.m2m.atl.drivers.emf4atl.EMFModelLoader;
import org.eclipse.m2m.atl.engine.AtlEMFModelHandler;
import org.eclipse.m2m.atl.engine.AtlModelHandler;
import org.eclipse.m2m.atl.engine.extractors.xml.XMLExtractor;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;
import org.eclipse.ui.IObjectActionDelegate;

import be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration;
import be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage;
import be.ac.vub.uml2cs.instantmessenger.presentation.InstantMessengerEditorPlugin;

/**
 * Popup action for generating and running the instant messenger build file from a configuration model.
 * @author dennis
 *
 */
public class GenerateBuildFileAction extends ProgressMonitorAction implements IObjectActionDelegate {
	
	public static final String ATL_VM = "EMF-specific VM";
	
	/**
	 * Sub-action for running the build file.
	 * @author dennis
	 *
	 */
	private class RunBuildFileAction extends ProgressMonitorAction {
		
		private IFile buildFile;
		
		public RunBuildFileAction(IFile buildFile) {
			Assert.isNotNull(buildFile);
			this.buildFile = buildFile;
		}
		
	    protected void runAction(IProgressMonitor monitor) throws Exception {
	    	monitor.beginTask("Running build.xml", IProgressMonitor.UNKNOWN);
	        monitor.subTask("Running build.xml...");
	        final AntRunner build = new AntRunner();
	        build.setBuildFileLocation(buildFile.getLocation().toString());
	        build.setAntHome(buildFile.getParent().getLocation().toString());
	        build.run(monitor);
	    }
	}

    private URL xmlResource = InstantMessengerEditorPlugin.getPlugin().getBundle().getResource("metamodels/XML.ecore");
    protected AtlEMFModelHandler amh = (AtlEMFModelHandler) AtlModelHandler.getDefault(AtlModelHandler.AMH_EMF);

    /**
     * Invoked when the action is executed.
     * @param monitor
     * @throws Exception
     */
    protected void runAction(IProgressMonitor monitor) throws Exception {
        monitor.beginTask("Generating code", 8);
        
        monitor.subTask("Reading input model...");
        InstantMessengerConfiguration object =
        	(InstantMessengerConfiguration) ((IStructuredSelection) selection).getFirstElement();
        Assert.isNotNull(object);
        Resource res = object.eResource();
        Assert.isNotNull(res);
        worked(monitor);
        monitor.subTask("Getting output folder...");
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        IPath projectPath = new Path(object.getTargetProject());
        IResource projectResource = root.findMember(projectPath);
        if (projectResource == null) {
        	throw new IOException("project " + projectResource + " not found in workspace");
        }
        IPath buildPath = projectPath.append("build");
        IFolder buildFolder = root.getFolder(buildPath);
        if (!buildFolder.exists()) {
        	buildFolder.create(true, true, monitor);
        }
        IFile hibtoolsFile = root.getFile(buildPath.append("hibernate-tools.jar"));
        IFile commonFile = root.getFile(buildPath.append("common.xml"));
        IFile buildFile = root.getFile(buildPath.append("build.xml"));
        IFile parFile = root.getFile(buildPath.append("parameters.xml"));
        worked(monitor);
        
        monitor.subTask("Copying common.xml...");
        URL commonURL = InstantMessengerEditorPlugin.getPlugin().getBundle().getResource("transformations/Transformations/common.xml");
        copyURLToFile(commonURL, commonFile);
        worked(monitor);
        
        monitor.subTask("Copying hibernate-tools.jar...");
        URL hibtoolsURL = InstantMessengerEditorPlugin.getPlugin().getBundle().getResource("transformations/Transformations/hibernate-tools.jar");
        copyURLToFile(hibtoolsURL, hibtoolsFile);
        worked(monitor);
        
        monitor.subTask("Loading models...");
        final EMFModelLoader ml = (EMFModelLoader) amh.createModelLoader();
        final ASMModel cfg = ml.loadModel("CFG", ml.getMOF(), "uri:" + InstantmessengerPackage.eNS_URI);
        cfg.setIsTarget(false);
        final ASMModel xml = ml.loadModel("XML", ml.getMOF(), xmlResource.openStream());
        xml.setIsTarget(false);
        final ASMModel in = ml.loadModel("IN", cfg, res.getURI());
        in.setIsTarget(false);
        final ASMModel out = ml.newModel("OUT", buildFile.getLocationURI().toString(), xml);
        final ASMModel out2 = ml.newModel("OUT", parFile.getLocationURI().toString(), xml);
        worked(monitor);
        
        monitor.subTask("Generating build.xml...");
        Map<String, ASMModel> models = new HashMap<String, ASMModel>();
        models.put(cfg.getName(), cfg);
        models.put(xml.getName(), xml);
        models.put(in.getName(), in);
        models.put(out.getName(), out);
        URL trans1 = InstantMessengerEditorPlugin.getPlugin().getBundle().getResource("transformations/Transformations/ConfigToBuildFile.asm");
        URL trans2 = InstantMessengerEditorPlugin.getPlugin().getBundle().getResource("transformations/InstantMessenger/ConfigToBuildFile.asm");
        List<URL> superimpose = new ArrayList<URL>();
        superimpose.add(trans2);
		AtlVM atlVM = AtlVM.getVM(ATL_VM);
		atlVM.launch(trans1, Collections.EMPTY_MAP, models, Collections.EMPTY_MAP, superimpose, Collections.EMPTY_MAP);
        xmlExtraction(out, buildFile);
        buildFile.refreshLocal(0, null);
        worked(monitor);

        monitor.subTask("Generating parameters.xml...");
        models.clear();
        models.put(cfg.getName(), cfg);
        models.put(xml.getName(), xml);
        models.put(in.getName(), in);
        models.put(out2.getName(), out2);
        URL trans3 = InstantMessengerEditorPlugin.getPlugin().getBundle().getResource("transformations/Transformations/ConfigToParameters.asm");
		atlVM.launch(trans3, Collections.EMPTY_MAP, models, Collections.EMPTY_MAP, Collections.EMPTY_LIST, Collections.EMPTY_MAP);
        xmlExtraction(out2, parFile);
        parFile.refreshLocal(0, null);
        worked(monitor);
        
        monitor.subTask("Running build.xml...");
        RunBuildFileAction runBuildFile = new RunBuildFileAction(buildFile);
        InstantMessengerEditorPlugin.getPlugin().getWorkbench().getDisplay().syncExec(runBuildFile);
        worked(monitor);
    }
    
    /**
     * Copies the contents of "from" to "to".
     * @param from The URL that points to the contents to copy.
     * @param to The file to copy the contents to.
     * @throws IOException
     * @throws CoreException
     */
    private static void copyURLToFile(URL from, IFile to) throws IOException, CoreException {
        final InputStream source = from.openStream();
        if (!to.exists()) {
        	to.create(source, true, null);
        } else {
        	to.setContents(source, true, true, null);
        }
        source.close();
    }
    
    /**
     * Extracts model as an XML file.
     * @param model
     * @param file The file to write to.
     */
    private static void xmlExtraction(final ASMModel model, IFile file)
    throws IOException, CoreException {
		PipedInputStream in = new PipedInputStream();
		final OutputStream out = new PipedOutputStream(in);
		final XMLExtractor xmle = new XMLExtractor();
		new Thread() {
			public void run() {
				try {
					xmle.extract(model, out, Collections.EMPTY_MAP);
				} catch(Exception e) {
					e.printStackTrace();
				} finally {
					try {
						out.close();
					} catch(IOException ioe) {
						
					}
				}
			}
		}.start();
		if(file.exists()) {
			file.setContents(in, IFile.FORCE, null);
		} else {
			file.create(in, IFile.FORCE, null);
		}
    }

}
