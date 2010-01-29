package im.view.swt;

import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;
import im.InstantMessagingClient;
import org.eclipse.swt.events.*;
import org.eclipse.swt.layout.*;
import im.view.ConversationViewListener;

public class SWTConversationView implements im.view.ConversationView {
	private org.eclipse.swt.widgets.Shell shell;

	private org.eclipse.swt.widgets.Composite convPanel;

	private org.eclipse.swt.widgets.Composite btnPanel;

	private org.eclipse.swt.widgets.Text textConvField;

	private org.eclipse.swt.widgets.Text messageField;

	private org.eclipse.swt.widgets.Button sendBtn;

	private java.util.Set listener = new java.util.HashSet();

	public java.lang.Object getContent() {
		return messageField.getText();
	}

	public void addContent(final java.lang.Object c) {
		if (c instanceof String) {
			textConvField.getDisplay().syncExec(new Runnable() {
				public void run() {
					textConvField.append(c.toString() + "\n");
				}
			});
		}
	}

	public void setTitle(final java.lang.String t) {
		getShell().getDisplay().syncExec(new Runnable() {
			public void run() {
				getShell().setText(t);
			}
		});
	}

	public void toFront() {
		getShell().getDisplay().syncExec(new Runnable() {
			public void run() {
				if (!getShell().isVisible()) {
					getShell().setVisible(true);
					pop();
				}
				getShell().setActive();
				getShell().traverse(SWT.TRAVERSE_TAB_NEXT);
			}
		});
	}

	public SWTConversationView() {
		super();
		InstantMessagingClient.getInstance().getShell().getDisplay().syncExec(
				new Runnable() {
					public void run() {
						initialize();
					}
				});
	}

	private void pop() {
		InstantMessagingClient.getInstance().getShell().getDisplay().beep();
	}

	private void notifyClose() {
		for (java.util.Enumeration ls = getListeners(); ls.hasMoreElements();) {
			((ConversationViewListener) ls.nextElement()).onConversationClose();
		}
	}

	private void notifySendClicked() {
		for (java.util.Enumeration ls = getListeners(); ls.hasMoreElements();) {
			((ConversationViewListener) ls.nextElement()).onConversationSend();
		}
		messageField.setText("");
	}

	private void initialize() {
		shell = new Shell(InstantMessagingClient.getInstance().getShell()
				.getDisplay());
		convPanel = new Composite(getShell(), SWT.NONE);
		btnPanel = new Composite(getShell(), SWT.NONE);
		textConvField = new Text(convPanel, SWT.MULTI | SWT.BORDER
				| SWT.V_SCROLL | SWT.SCROLL_LINE | SWT.READ_ONLY);
		messageField = new Text(btnPanel, SWT.SINGLE | SWT.BORDER);
		sendBtn = new Button(btnPanel, SWT.PUSH);
		shell.addShellListener(new ShellAdapter() {
			public void shellClosed(ShellEvent e) {
				notifyClose();
			}
		});
		sendBtn.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				notifySendClicked();
			}
		});
		setTitle("Message");
		shell.setLayout(new FormLayout());
		shell.setDefaultButton(sendBtn);
		shell.setTabList(new Control[]{btnPanel});
		FormData cpfd = new FormData();
		cpfd.top = new FormAttachment(0, 5);
		cpfd.left = new FormAttachment(0, 5);
		cpfd.right = new FormAttachment(100, -5);
		cpfd.bottom = new FormAttachment(btnPanel, -5);
		convPanel.setLayoutData(cpfd);
		convPanel.setLayout(new FillLayout());
		FormData bpfd = new FormData();
		bpfd.left = new FormAttachment(0, 5);
		bpfd.right = new FormAttachment(100, -5);
		bpfd.bottom = new FormAttachment(100, -5);
		btnPanel.setLayoutData(bpfd);
		btnPanel.setLayout(new FormLayout());
		btnPanel.setTabList(new Control[]{messageField});
		FormData mffd = new FormData();
		mffd.top = new FormAttachment(0, 5);
		mffd.left = new FormAttachment(0, 0);
		mffd.right = new FormAttachment(sendBtn, -5);
		messageField.setLayoutData(mffd);
		FormData sbfd = new FormData();
		sbfd.top = new FormAttachment(0, 0);
		sbfd.right = new FormAttachment(100, 0);
		sendBtn.setLayoutData(sbfd);
		sendBtn.setText("Send");
		shell.pack();
		shell.setSize(300, 300);
		toFront();
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

	public void addListener(im.view.ConversationViewListener listener) {
		if (!this.listener.contains(listener)) {
			this.listener.add(listener);
		}
	}

	public void removeListener(im.view.ConversationViewListener listener) {
		this.listener.remove(listener);
	}

}
