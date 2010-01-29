package swt;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public abstract class SWTApplication {
	private org.eclipse.swt.widgets.Shell shell = null;

	private boolean running = false;

	public void init() {

	}

	public void start() {

	}

	public void stop() {

	}

	public SWTApplication() {
		final Display display = new Display();
		final Shell shell = new Shell(display);
		setShell(shell);
	}

	public void destroy() {

	}

	public org.eclipse.swt.widgets.Shell getShell() {
		return shell;
	}

	public void setShell(org.eclipse.swt.widgets.Shell shell) {
		this.shell = shell;
	}

	public boolean getRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

}
