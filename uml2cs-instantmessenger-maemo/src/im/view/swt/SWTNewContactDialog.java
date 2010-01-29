package im.view.swt;

import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;
import im.InstantMessagingClient;
import org.eclipse.swt.events.*;
import org.eclipse.swt.layout.*;
import im.view.NewContactDialogListener;

public class SWTNewContactDialog implements im.view.NewContactDialog {
	private org.eclipse.swt.widgets.Shell shell;

	private org.eclipse.swt.widgets.Composite dlgPanel;

	private org.eclipse.swt.widgets.Composite btnPanel;

	private org.eclipse.swt.widgets.Button okBtn;

	private org.eclipse.swt.widgets.Button cancelBtn;

	private org.eclipse.swt.widgets.Label uid;

	private org.eclipse.swt.widgets.Text uidField;

	private org.eclipse.swt.widgets.Label name;

	private org.eclipse.swt.widgets.Text nameField;

	private org.eclipse.swt.widgets.Label network;

	private org.eclipse.swt.widgets.Combo networkField;

	private org.eclipse.swt.widgets.Label password;

	private org.eclipse.swt.widgets.Text passwordField;

	private java.util.Set listener = new java.util.HashSet();

	public java.lang.String getUid() {
		return uidField.getText();
	}

	public java.lang.String getName() {
		return nameField.getText();
	}

	public int getNetwork() {
		return networkField.getSelectionIndex();
	}

	public java.lang.String getPassword() {
		return passwordField.getText();
	}

	public void addNetwork(java.lang.String n) {
		networkField.add(n);
		networkField.select(0);
	}

	public SWTNewContactDialog() {
		super();
		InstantMessagingClient.getInstance().getShell().getDisplay().syncExec(
				new Runnable() {
					public void run() {
						initialize();
					}
				});
	}

	private void onOk() {
		notifyListeners(true);
	}

	private void onCancel() {
		notifyListeners(false);
	}

	private void notifyListeners(boolean okClicked) {
		for (java.util.Enumeration ls = getListeners(); ls.hasMoreElements();) {
			((NewContactDialogListener) ls.nextElement())
					.onNewContactDialogClose(okClicked, this);
		}
	}

	private void initialize() {
		shell = new Shell(InstantMessagingClient.getInstance().getShell(),
				SWT.RESIZE);
		dlgPanel = new Composite(getShell(), SWT.NONE);
		btnPanel = new Composite(getShell(), SWT.NONE);
		okBtn = new Button(btnPanel, SWT.PUSH);
		cancelBtn = new Button(btnPanel, SWT.PUSH);
		network = new Label(dlgPanel, SWT.HORIZONTAL | SWT.RIGHT);
		networkField = new Combo(dlgPanel, SWT.DROP_DOWN | SWT.READ_ONLY);
		uid = new Label(dlgPanel, SWT.HORIZONTAL | SWT.RIGHT);
		uidField = new Text(dlgPanel, SWT.SINGLE | SWT.BORDER);
		name = new Label(dlgPanel, SWT.HORIZONTAL | SWT.RIGHT);
		nameField = new Text(dlgPanel, SWT.SINGLE | SWT.BORDER);
		password = new Label(dlgPanel, SWT.HORIZONTAL | SWT.RIGHT);
		passwordField = new Text(dlgPanel, SWT.SINGLE | SWT.PASSWORD
				| SWT.BORDER);
		shell.addShellListener(new ShellAdapter() {
			public void shellClosed(ShellEvent e) {
				onCancel();
			}
		});
		cancelBtn.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				onCancel();
				getShell().close();
			}
		});
		okBtn.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				onOk();
				getShell().close();
			}
		});
		shell.setText("Add new contact");
		shell.setLayout(new FormLayout());
		shell.setDefaultButton(okBtn);
		FormData dpfd = new FormData();
		dpfd.top = new FormAttachment(0, 5);
		dpfd.left = new FormAttachment(0, 5);
		dpfd.right = new FormAttachment(100, -5);
		dpfd.bottom = new FormAttachment(btnPanel, -5);
		dlgPanel.setLayoutData(dpfd);
		dlgPanel.setLayout(new GridLayout(2, false));
		FormData bpfd = new FormData();
		bpfd.left = new FormAttachment(0, 5);
		bpfd.right = new FormAttachment(100, -5);
		bpfd.bottom = new FormAttachment(100, -5);
		btnPanel.setLayoutData(bpfd);
		btnPanel.setLayout(new FillLayout());
		okBtn.setText("OK");
		cancelBtn.setText("Cancel");
		uid.setText("User ID");
		name.setText("Name");
		network.setText("Network");
		password.setText("Password");
		GridData fgd = new GridData();
		fgd.horizontalAlignment = SWT.FILL;
		fgd.grabExcessHorizontalSpace = true;
		fgd.heightHint = Math.round(uidField.getLineHeight() * (float) 1.1);
		uidField.setLayoutData(fgd);
		nameField.setLayoutData(fgd);
		networkField.setLayoutData(fgd);
		passwordField.setLayoutData(fgd);
		shell.pack();
		shell.open();
		shell.traverse(SWT.TRAVERSE_TAB_NEXT);
	}

	public org.eclipse.swt.widgets.Shell getShell() {
		return shell;
	}

	public void setShell(org.eclipse.swt.widgets.Shell shell) {
		this.shell = shell;
	}

	public java.util.Enumeration getListeners() {
		return new be.ac.vub.util.IteratorEnumerationAdapter(listener
				.iterator());
	}

	public void addListener(im.view.NewContactDialogListener listener) {
		if (!this.listener.contains(listener)) {
			this.listener.add(listener);
		}
	}

	public void removeListener(im.view.NewContactDialogListener listener) {
		this.listener.remove(listener);
	}

}
