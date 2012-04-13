package be.ac.vub.uml2cs.instantmessenger.popup.actions;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;

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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.core.ui.ATLConsole;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.EMFTVMUtil;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.StackFrame;
import org.eclipse.m2m.atl.emftvm.util.VMMonitor;
import org.eclipse.ui.IObjectActionDelegate;

import be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration;
import be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage;
import be.ac.vub.uml2cs.instantmessenger.presentation.InstantMessengerEditorPlugin;

/**
 * Popup action for generating and running the instant messenger build file from a configuration model.
 * 
 * @author dennis
 */
public class GenerateBuildFileAction extends ProgressMonitorAction implements IObjectActionDelegate {

	public static final URL COMMON_URL = InstantMessengerEditorPlugin.getPlugin().getBundle()
			.getResource("transformations/Transformations/common.xml");

	public static final URL HIBTOOLS_URL = InstantMessengerEditorPlugin.getPlugin().getBundle()
			.getResource("transformations/Transformations/hibernate-tools.jar");

	private static final String TRANS_PREFIX = "platform:/plugin/"
			+ InstantMessengerEditorPlugin.getPlugin().getBundle().getSymbolicName() + "/transformations/";

	private static final String XML_PATH = "/"
			+ InstantMessengerEditorPlugin.getPlugin().getBundle().getSymbolicName()
			+ "/metamodels/XML.ecore";

	/**
	 * Adapts {@link IProgressMonitor} to {@link VMMonitor}.
	 * 
	 * @author <a href="mailto:dennis.wagelaar@vub.ac.be">Dennis Wagelaar</a>
	 */
	public static class ProgressMonitorAdapter implements VMMonitor {

		private final IProgressMonitor monitor;

		/**
		 * Creates a new {@link ProgressMonitorAdapter}.
		 * 
		 * @param monitor
		 *            the adapter {@link IProgressMonitor}
		 */
		public ProgressMonitorAdapter(IProgressMonitor monitor) {
			this.monitor = monitor;
		}

		/**
		 * {@inheritDoc}
		 */
		public void terminated() {
		}

		/**
		 * {@inheritDoc}
		 */
		public void step(StackFrame frame) {
		}

		/**
		 * {@inheritDoc}
		 */
		public void leave(StackFrame frame) {
		}

		/**
		 * {@inheritDoc}
		 */
		public boolean isTerminated() {
			return monitor.isCanceled();
		}

		/**
		 * {@inheritDoc}
		 */
		public void error(StackFrame frame, String msg, Exception e) {
		}

		/**
		 * {@inheritDoc}
		 */
		public void enter(StackFrame frame) {
		}
	}

	/**
	 * Sub-action for running the build file.
	 * 
	 * @author dennis
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

	/**
	 * Invoked when the action is executed.
	 * 
	 * @param monitor
	 * @throws Exception
	 */
	protected void runAction(IProgressMonitor monitor) throws Exception {
		ATLConsole.findConsole(); // force ATL console startup
		monitor.beginTask("Generating code", 8);
		//
		// 1
		//
		monitor.subTask("Reading input model...");
		final InstantMessengerConfiguration object = (InstantMessengerConfiguration)((IStructuredSelection)selection)
				.getFirstElement();
		Assert.isNotNull(object);
		final Resource res = object.eResource();
		Assert.isNotNull(res);
		worked(monitor);
		//
		// 2
		//
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
		worked(monitor);
		//
		// 3
		//
		monitor.subTask("Copying common.xml...");
		copyURLToFile(COMMON_URL, commonFile);
		worked(monitor);
		//
		// 4
		//
		monitor.subTask("Copying hibernate-tools.jar...");
		copyURLToFile(HIBTOOLS_URL, hibtoolsFile);
		worked(monitor);
		//
		// 5
		//
		monitor.subTask("Loading models...");
		final ResourceSet rs = new ResourceSetImpl();
		final Metamodel cfg = EmftvmFactory.eINSTANCE.createMetamodel();
		cfg.setResource(InstantmessengerPackage.eINSTANCE.eResource());
		final Metamodel xml = EmftvmFactory.eINSTANCE.createMetamodel();
		xml.setResource(rs.getResource(URI.createPlatformPluginURI(XML_PATH, true), true));
		final Model in = EmftvmFactory.eINSTANCE.createModel();
		in.setResource(res);
		worked(monitor);
		//
		// 6
		//
		monitor.subTask("Generating parameters.xml...");
		final Model pars = EmftvmFactory.eINSTANCE.createModel();
		pars.setResource(rs.createResource(URI.createPlatformResourceURI(
				getWorkspacePath(parXMIFile), true)));
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		env.setMonitor(new ProgressMonitorAdapter(monitor));
		env.registerMetaModel("CFG", cfg);
		env.registerMetaModel("XML", xml);
		env.registerInputModel("IN", in);
		env.registerOutputModel("OUT", pars);
		final ModuleResolver resolver = new DefaultModuleResolver(TRANS_PREFIX, rs);
		env.loadModule(resolver, "Transformations::ConfigToParameters");
		env.run(null);
		pars.getResource().save(Collections.emptyMap());
		xmlExtraction(xml, pars, parFile, resolver, monitor);
		parFile.refreshLocal(0, null);
		worked(monitor);
		//
		// 7
		//
		monitor.subTask("Generating build.xml...");
		final Model build = EmftvmFactory.eINSTANCE.createModel();
		build.setResource(rs.createResource(URI.createPlatformResourceURI(
				getWorkspacePath(buildFile), true)));
		pars.setResource(rs.createResource(URI.createPlatformResourceURI(
				getWorkspacePath(parXMIFile), true)));
		env = EmftvmFactory.eINSTANCE.createExecEnv();
		env.setMonitor(new ProgressMonitorAdapter(monitor));
		env.registerMetaModel("CFG", cfg);
		env.registerMetaModel("XML", xml);
		env.registerInputModel("IN", in);
		env.registerOutputModel("OUT", build);
		env.loadModule(resolver, "InstantMessenger::ConfigToBuildFile");
		env.run(null);
		xmlExtraction(xml, build, buildFile, resolver, monitor);
		buildFile.refreshLocal(0, null);
		worked(monitor);
		//
		// 8
		//
		monitor.subTask("Running build.xml...");
		final RunBuildFileAction runBuildFile = new RunBuildFileAction(buildFile);
		InstantMessengerEditorPlugin.getPlugin().getWorkbench().getDisplay().syncExec(runBuildFile);
		worked(monitor);
	}

	/**
	 * Copies the contents of "from" to "to".
	 * 
	 * @param from
	 *            The URL that points to the contents to copy.
	 * @param to
	 *            The file to copy the contents to.
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
	 * 
	 * @param xml
	 *            the XML metamodel
	 * @param model
	 *            the model to extract
	 * @param file
	 *            the file to write to
	 * @param resolver
	 *            the module resolver
	 * @param monitor
	 *            the progress monitor
	 */
	private static void xmlExtraction(final Metamodel xml, final Model model, final IFile file,
			final ModuleResolver resolver, final IProgressMonitor monitor) throws IOException, CoreException {
		final ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		env.setMonitor(new ProgressMonitorAdapter(monitor));

		final Resource parsRes = model.getResource().getResourceSet()
				.createResource(URI.createURI("parameters.xmi"));
		final Model pars = EmftvmFactory.eINSTANCE.createModel();
		pars.setResource(parsRes);
		final EClass root = (EClass)xml.findType("XML::Root");
		final EClass element = (EClass)xml.findType("XML::Element");
		final EStructuralFeature children = element.getEStructuralFeature("children");
		final EClass attribute = (EClass)xml.findType("XML::Attribute");
		final EClass node = (EClass)xml.findType("XML::Node");
		final EStructuralFeature name = node.getEStructuralFeature("name");
		final EStructuralFeature value = node.getEStructuralFeature("value");
		final EObject docroot = pars.newElement(root);
		final EObject param = pars.newElement(element);
		EMFTVMUtil.add(env, docroot, children, param, -1);
		EMFTVMUtil.set(env, param, name, "param");
		final EObject nameAtt = pars.newElement(attribute);
		EMFTVMUtil.add(env, param, children, nameAtt, -1);
		EMFTVMUtil.set(env, nameAtt, name, "name");
		EMFTVMUtil.set(env, nameAtt, value, "path");
		final EObject valueAtt = pars.newElement(attribute);
		EMFTVMUtil.add(env, param, children, valueAtt, -1);
		EMFTVMUtil.set(env, valueAtt, name, "value");
		EMFTVMUtil.set(env, valueAtt, value, getWorkspacePath(file));

		env.registerMetaModel("XML", xml);
		env.registerInputModel("IN", model);
		env.registerInputModel("parameters", pars);
		env.loadModule(resolver, "Transformations::XMLExtractor");
		env.run(null);
	}

	/**
	 * Returns the workspace-relative path of <code>res</code>.
	 * @param res the workspace resource
	 * @return the workspace-relative path of <code>res</code>
	 */
	private static String getWorkspacePath(IResource res) {
		final StringBuffer sb = new StringBuffer("/");
		sb.append(res.getProject().getName());
		sb.append('/');
		sb.append(res.getProjectRelativePath().toString());
		return sb.toString();
	}

}
