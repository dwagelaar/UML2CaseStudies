package be.ac.vub.uml2cs.instantmessenger.popup.actions;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.WorkbenchException;

import be.ac.vub.uml2cs.instantmessenger.presentation.InstantMessengerEditorPlugin;

/**
 * General superclass for popup actions with a progress monitor.
 * @author dennis
 *
 */
public abstract class ProgressMonitorAction implements Runnable {

	protected ISelection selection;
	protected IAction action;
	private boolean cancelled = false;

	public ProgressMonitorAction() {
		super();
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

    /**
     * @see Runnable#run()
     */
    public void run() {
        run(null);
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
	    }
	}
	
    /**
     * Invoked when the action is executed.
     * @param monitor
     * @throws Exception
     */
    protected abstract void runAction(IProgressMonitor monitor) throws Exception;

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
	protected void worked(IProgressMonitor monitor) throws OperationCanceledException {
	    monitor.worked(1);
	    if (monitor.isCanceled()) {
	        cancelled = true;
	        throw new OperationCanceledException("Operation cancelled by user");
	    }
	}

}