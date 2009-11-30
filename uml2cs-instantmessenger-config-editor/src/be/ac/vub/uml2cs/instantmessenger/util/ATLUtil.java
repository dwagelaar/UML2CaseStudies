package be.ac.vub.uml2cs.instantmessenger.util;

import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.CoreService;

/**
 * Utility class for handling the new 3.0 ATL VM.
 * @author Dennis Wagelaar <dennis.wagelaar@vub.ac.be>
 */
public class ATLUtil {
	
	private static final Map<String,Object> options = Collections.emptyMap();
	
	private String atlVM;
	private ILauncher launcher;
    private ModelFactory factory;
    private IInjector injector;
    private IExtractor extractor;

    /**
     * Creates a new ATLUtil instance for the given ATL VM
     * @param atlVMName The ATL VM name ("Regular VM (with debugger)" or "EMF-specific VM")
     * @throws ATLCoreException
     */
	public ATLUtil(String atlVMName) throws ATLCoreException {
		Assert.assertNotNull(atlVMName);
		atlVM = atlVMName;
		launcher = CoreService.getLauncher(atlVMName);
		if (launcher == null) {
			throw new ATLCoreException("ATL VM \"" + atlVMName + "\" not found");
		}
		launcher.initialize(options);
		factory = CoreService.getModelFactory(launcher.getDefaultModelFactoryName());
		injector = CoreService.getInjector(factory.getDefaultInjectorName());
		extractor = CoreService.getExtractor(factory.getDefaultExtractorName());
	}

	/**
	 * Loads a model from an input stream.
	 * @param refModel The meta-model.
	 * @param source The input stream to the model.
	 * @param name The model name in the transformation module.
	 * @param path The (descriptive) path to the model (file extension matters most here).
	 * @return The loaded model.
	 * @throws ATLCoreException
	 */
	public IModel loadModel(IReferenceModel refModel, InputStream source,
			String name, String path) throws ATLCoreException {
		final Map<String, Object> options = new HashMap<String, Object>();
		options.put("modelName", name);
		options.put("path", path);
		options.put("newModel", "false");
		final IModel model = factory.newModel(refModel, options);
		injector.inject(model, source, options);
		return model;
	}
    
	/**
	 * Loads a model from a path or URI.
	 * @param refModel The meta-model.
	 * @param source The path or URI to the model.
	 * @param name The model name in the transformation module.
	 * @return The loaded model.
	 * @throws ATLCoreException
	 */
	public IModel loadModel(IReferenceModel refModel, String source,
			String name) throws ATLCoreException {
		final Map<String, Object> options = new HashMap<String, Object>();
		options.put("modelName", name);
		options.put("path", source);
		options.put("newModel", "false");
		final IModel model = factory.newModel(refModel, options);
		injector.inject(model, source, options);
		return model;
	}
    
	/**
	 * Loads a meta-model from an input stream.
	 * @param source The input stream to the meta-model.
	 * @param name The meta-model name in the transformation module.
	 * @param path The (descriptive) path to the meta-model (file extension matters most here).
	 * @param handler The model handler ("MDR", "EMF", or "UML2")
	 * @return The loaded meta-model.
	 * @throws ATLCoreException
	 */
	public IReferenceModel loadRefModel(InputStream source,
			String name, String path, String handler) throws ATLCoreException {
		final Map<String, Object> options = new HashMap<String, Object>();
		options.put("modelHandlerName", handler);
		options.put("modelName", name);
		options.put("path", path);
		options.put("newModel", "false");
		final IReferenceModel model = factory.newReferenceModel(options);
		injector.inject(model, source, options);
		return model;
	}
    
	/**
	 * Loads a meta-model from a path or registered URI.
	 * @param source The path to or registered URI of the meta-model.
	 * @param name The meta-model name in the transformation module.
	 * @param handler The model handler ("MDR", "EMF", or "UML2")
	 * @return The loaded meta-model.
	 * @throws ATLCoreException
	 */
	public IReferenceModel loadRefModel(String source,
			String name, String handler) throws ATLCoreException {
		final Map<String, Object> options = new HashMap<String, Object>();
		options.put("modelHandlerName", handler);
		options.put("modelName", name);
		options.put("path", source);
		options.put("newModel", "false");
		final IReferenceModel model = factory.newReferenceModel(options);
		injector.inject(model, source, options);
		return model;
	}
    
	/**
	 * Creates a new model.
	 * @param refModel The meta-model.
	 * @param name The model name in the transformation module.
	 * @param path The (descriptive) path to the model (file extension matters most here).
	 * @return The new model.
	 * @throws ATLCoreException
	 */
	public IModel newModel(IReferenceModel refModel,
			String name, String path) throws ATLCoreException {
		final Map<String, Object> options = new HashMap<String, Object>();
		options.put("modelName", name);
		options.put("path", path);
		options.put("newModel", "true");
		final IModel model = factory.newModel(refModel, options);
		return model;
	}
	
	/**
	 * @return the launcher
	 */
	public ILauncher getLauncher() {
		return launcher;
	}
	
	/**
	 * @return A new launcher
	 * @throws ATLCoreException
	 */
	public ILauncher newLauncher() throws ATLCoreException {
		final ILauncher l = CoreService.getLauncher(atlVM);
		l.initialize(options);
		return l;
	}

	/**
	 * @return the factory
	 */
	public ModelFactory getFactory() {
		return factory;
	}

	/**
	 * @return the injector
	 */
	public IInjector getInjector() {
		return injector;
	}

	/**
	 * @return the extractor
	 */
	public IExtractor getExtractor() {
		return extractor;
	}
    
}
