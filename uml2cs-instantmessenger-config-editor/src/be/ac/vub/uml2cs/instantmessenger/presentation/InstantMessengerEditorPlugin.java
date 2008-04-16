/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.instantmessenger.presentation;

import be.ac.vub.uml2cs.instantmessenger.util.ErrorDialogRunnable;
import be.ac.vub.uml2cs.transformations.provider.TransformationsEditPlugin;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.ui.EclipseUIPlugin;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

/**
 * This is the central singleton for the InstantMessenger editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class InstantMessengerEditorPlugin extends EMFPlugin {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(C) 2007, 2008, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InstantMessengerEditorPlugin INSTANCE = new InstantMessengerEditorPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantMessengerEditorPlugin() {
		super
			(new ResourceLocator [] {
				TransformationsEditPlugin.INSTANCE,
			});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipseUIPlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();
	
			// Remember the static instance.
			//
			plugin = this;
		}
	}
	
    /**
     * @return The active shell.
     */
    public Shell getShell() {
        return PlatformUI.getWorkbench().getDisplay().getActiveShell();
    }

    /**
     * Reports an exception/error in the log and on the screen.
     * @param e the exception to report.
     */
    public void report(Throwable e) {
        PlatformUI.getWorkbench().getDisplay().syncExec(new ErrorDialogRunnable(e));
    }

    /**
     * Logs a message.
     * @param message the log message.
     * @param level the log level (OK, INFO, WARNING, ERROR)
     * @param exception the related exception, if any.
     */
    public IStatus log(String message, int level, Throwable exception) {
        IStatus st = new Status(
                level, 
                getSymbolicName(), 
                IStatus.OK, 
                message, 
                exception);
        log(st);
        return st;
    }

}
