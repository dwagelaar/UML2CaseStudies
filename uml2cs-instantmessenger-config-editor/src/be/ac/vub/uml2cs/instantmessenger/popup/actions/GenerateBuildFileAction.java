package be.ac.vub.uml2cs.instantmessenger.popup.actions;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.util.Assert;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.engine.AtlEMFModelHandler;
import org.eclipse.m2m.atl.engine.AtlLauncher;
import org.eclipse.m2m.atl.engine.AtlModelHandler;
import org.eclipse.m2m.atl.engine.extractors.xml.XMLExtractor;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.WorkbenchException;

import be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration;
import be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage;
import be.ac.vub.uml2cs.instantmessenger.presentation.InstantMessengerEditorPlugin;

public class GenerateBuildFileAction implements IObjectActionDelegate {

    protected ISelection selection;
    protected IAction action;
    private boolean cancelled = false;
    protected ResourceSet resourceSet = new ResourceSetImpl();

    private URL xmlResource = InstantMessengerEditorPlugin.getPlugin().getBundle().getResource("metamodels/XML.ecore");
    protected AtlEMFModelHandler amh = (AtlEMFModelHandler) AtlModelHandler.getDefault(AtlModelHandler.AMH_EMF);

    public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	public void run(IAction action) {
        IRunnableWithProgress op = new IRunnableWithProgress() {
            public void run(IProgressMonitor monitor) {
                try {
                    runAction(monitor);
                } catch (Exception e) {
                    InstantMessengerEditorPlugin.INSTANCE.report(e);
                } finally {
                    monitor.done();
                }
            }
        };
        ProgressMonitorDialog dlg = new ProgressMonitorDialog(
        		InstantMessengerEditorPlugin.INSTANCE.getShell());
        try {
            cancelled = false;
            dlg.run(true, true, op);
        } catch (InvocationTargetException e) {
            Throwable t = e.getCause();
            InstantMessengerEditorPlugin.INSTANCE.report(t);
        } catch (InterruptedException ie) {
        	InstantMessengerEditorPlugin.INSTANCE.report(ie);
        } finally {
            resourceSet.getResources().clear();
        }
	}

	public void selectionChanged(IAction action, ISelection selection) {
        this.selection = selection;
        this.action = action;
	}
	
    /**
     * @return True if last run was cancelled.
     */
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * Increases the progressmonitor by 1.
     * @param monitor
     * @throws WorkbenchException if user pressed cancel button.
     */
    protected void worked(IProgressMonitor monitor) 
    throws OperationCanceledException {
        monitor.worked(1);
        if (monitor.isCanceled()) {
            cancelled = true;
            throw new OperationCanceledException("Operation cancelled by user");
        }
    }
    
    /**
     * Invoked when the action is executed.
     * @param monitor
     * @throws Exception
     */
    protected void runAction(IProgressMonitor monitor) throws Exception {
        monitor.beginTask("Generating build.xml file", 4);
        monitor.subTask("Reading input model...");
        InstantMessengerConfiguration object =
        	(InstantMessengerConfiguration) ((IStructuredSelection) selection).getFirstElement();
        Assert.isNotNull(object);
        Resource res = object.eResource();
        Assert.isNotNull(res);
        worked(monitor);
        monitor.subTask("Getting output folder...");
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        IPath folder = new Path(object.getBuildPath());
        if (root.findMember(folder) == null) {
        	throw new IOException("build path " + folder + " not found in workspace");
        }
        IFile buildFile = root.getFile(folder.append("build.xml"));
        IFile parFile = root.getFile(folder.append("parameters.xml"));
        worked(monitor);
        monitor.subTask("Loading models...");
        ASMModel cfg = amh.loadModel("CFG", amh.getMof(), "uri:" + InstantmessengerPackage.eNS_URI);
        cfg.setIsTarget(false);
        ASMModel xml = amh.loadModel("XML", amh.getMof(), xmlResource.openStream());
        xml.setIsTarget(false);
        ASMModel in = amh.loadModel("IN", cfg, res.getURI());
        in.setIsTarget(false);
        ASMModel out = amh.newModel("OUT", xml);
        worked(monitor);
        monitor.subTask("Generating build.xml...");
        Map params = Collections.EMPTY_MAP;
        Map libs = Collections.EMPTY_MAP;
        Map models = new HashMap();
        models.put(cfg.getName(), cfg);
        models.put(xml.getName(), xml);
        models.put(in.getName(), in);
        models.put(out.getName(), out);
        URL trans1 = InstantMessengerEditorPlugin.getPlugin().getBundle().getResource("transformations/Transformations/ConfigToBuildFile.asm");
        URL trans2 = InstantMessengerEditorPlugin.getPlugin().getBundle().getResource("transformations/InstantMessenger/ConfigToBuildFile.asm");
        List superimpose = new ArrayList();
        superimpose.add(trans2);
        AtlLauncher myLauncher = AtlLauncher.getDefault();
        myLauncher.launch(trans1, libs, models, params, superimpose);
        xmlExtraction(out, buildFile);
        buildFile.refreshLocal(0, null);
        worked(monitor);
        monitor.subTask("Generating parameters.xml...");
        out = amh.newModel("OUT", xml);
        models.clear();
        models.put(cfg.getName(), cfg);
        models.put(xml.getName(), xml);
        models.put(in.getName(), in);
        models.put(out.getName(), out);
        URL trans3 = InstantMessengerEditorPlugin.getPlugin().getBundle().getResource("transformations/Transformations/ConfigToParameters.asm");
        myLauncher.launch(trans3, libs, models, params, Collections.EMPTY_LIST);
        xmlExtraction(out, parFile);
        parFile.refreshLocal(0, null);
        worked(monitor);
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
		final Map parameters = Collections.EMPTY_MAP;
		final XMLExtractor xmle = new XMLExtractor();
		new Thread() {
			public void run() {
				try {
					xmle.extract(model, out, parameters);
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
