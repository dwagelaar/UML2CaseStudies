package be.ac.vub.uml2cs.instantmessenger.popup.actions;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
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
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.ui.vm.asm.ASMModelWrapper;
import org.eclipse.m2m.atl.engine.extractors.xml.XMLExtractor;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;
import org.eclipse.ui.IObjectActionDelegate;

import be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration;
import be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage;
import be.ac.vub.uml2cs.instantmessenger.presentation.InstantMessengerEditorPlugin;
import be.ac.vub.uml2cs.instantmessenger.util.ATLUtil;

/**
 * Popup action for generating and running the instant messenger build file from a configuration model.
 * @author dennis
 *
 */
public class GenerateBuildFileAction extends ProgressMonitorAction implements IObjectActionDelegate {
	
	public static final String ATL_VM = "Regular VM (with debugger)";
	public static final String MODEL_HANDLER = "EMF";

    public static final URL COMMON_URL = InstantMessengerEditorPlugin.getPlugin().getBundle().getResource("transformations/Transformations/common.xml");
    public static final URL HIBTOOLS_URL = InstantMessengerEditorPlugin.getPlugin().getBundle().getResource("transformations/Transformations/hibernate-tools.jar");

    public static final URL TRANS1 = InstantMessengerEditorPlugin.getPlugin().getBundle().getResource("transformations/Transformations/ConfigToBuildFile.asm");
    public static final URL TRANS2 = InstantMessengerEditorPlugin.getPlugin().getBundle().getResource("transformations/InstantMessenger/ConfigToBuildFile.asm");
    public static final URL TRANS3 = InstantMessengerEditorPlugin.getPlugin().getBundle().getResource("transformations/Transformations/ConfigToParameters.asm");

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

    /**
     * Invoked when the action is executed.
     * @param monitor
     * @throws Exception
     */
    protected void runAction(IProgressMonitor monitor) throws Exception {
        monitor.beginTask("Generating code", 8);
        
        monitor.subTask("Reading input model...");
        final InstantMessengerConfiguration object =
        	(InstantMessengerConfiguration) ((IStructuredSelection) selection).getFirstElement();
        Assert.isNotNull(object);
        final Resource res = object.eResource();
        Assert.isNotNull(res);
        //
        // 1
        //
        worked(monitor);
        monitor.subTask("Getting output folder...");
        final IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        final IPath projectPath = new Path(object.getTargetProject());
        final IResource projectResource = root.findMember(projectPath);
        if (projectResource == null) {
        	throw new IOException("project " + projectResource + " not found in workspace");
        }
        final IPath buildPath = projectPath.append("build");
        final IFolder buildFolder = root.getFolder(buildPath);
        if (buildFolder.exists()) {
        	buildFolder.delete(true, true, monitor);
        }
    	buildFolder.create(true, true, monitor);
        final IFile hibtoolsFile = root.getFile(buildPath.append("hibernate-tools.jar"));
        final IFile commonFile = root.getFile(buildPath.append("common.xml"));
        final IFile buildFile = root.getFile(buildPath.append("build.xml"));
        final IFile parFile = root.getFile(buildPath.append("parameters.xml"));
        final IFile parXMIFile = root.getFile(buildPath.append("parameters.xmi"));
        //
        // 2
        //
        worked(monitor);
        monitor.subTask("Copying common.xml...");
        copyURLToFile(COMMON_URL, commonFile);
        //
        // 3
        //
        worked(monitor);
        monitor.subTask("Copying hibernate-tools.jar...");
        copyURLToFile(HIBTOOLS_URL, hibtoolsFile);
        //
        // 4
        //
        worked(monitor);
        monitor.subTask("Loading models...");
		final ATLUtil atlUtil = new ATLUtil(ATL_VM);
		final IReferenceModel cfg = atlUtil.loadRefModel(InstantmessengerPackage.eNS_URI, "CFG", MODEL_HANDLER);
		final IReferenceModel xml = atlUtil.loadRefModel(xmlResource.openStream(), "XML", xmlResource.toString(), MODEL_HANDLER);
		final IModel in = atlUtil.loadModel(cfg, res.getURI().toString(), "IN");
		final IModel out = atlUtil.newModel(xml, "OUT", buildFile.getLocationURI().toString());
		final IModel out2 = atlUtil.newModel(xml, "OUT", parFile.getLocationURI().toString());
        //
        // 5
        //
        worked(monitor);
        monitor.subTask("Generating build.xml...");
        final Map<String, Object> vmoptions = new HashMap<String, Object>();
        vmoptions.put("printExecutionTime", "true");
        ILauncher launcher = atlUtil.getLauncher();
        launcher.addInModel(in, "IN", "CFG");
        launcher.addOutModel(out, "OUT", "XML");
        launcher.launch(ILauncher.RUN_MODE, monitor, vmoptions, TRANS1.openStream(), TRANS2.openStream());
        xmlExtraction(((ASMModelWrapper)out).getAsmModel(), buildFile);
        buildFile.refreshLocal(0, null);
        //
        // 6
        //
        worked(monitor);
        monitor.subTask("Generating parameters.xml...");
        launcher = atlUtil.newLauncher();
        launcher.addInModel(in, "IN", "CFG");
        launcher.addOutModel(out2, "OUT", "XML");
        launcher.launch(ILauncher.RUN_MODE, monitor, vmoptions, TRANS3.openStream());
        atlUtil.getExtractor().extract(out2, "file:/" + parXMIFile.getLocation().toString());
        xmlExtraction(((ASMModelWrapper)out2).getAsmModel(), parFile);
        parFile.refreshLocal(0, null);
        //
        // 7
        //
        worked(monitor);
        monitor.subTask("Running build.xml...");
        final RunBuildFileAction runBuildFile = new RunBuildFileAction(buildFile);
        InstantMessengerEditorPlugin.getPlugin().getWorkbench().getDisplay().syncExec(runBuildFile);
        //
        // 8
        //
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
