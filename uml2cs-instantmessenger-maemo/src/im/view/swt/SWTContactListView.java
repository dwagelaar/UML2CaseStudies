package im.view.swt;

import org.eclipse.swt.widgets.*;
import org.eclipse.swt.*;
import im.InstantMessagingClient;
import org.eclipse.swt.events.*;
import org.eclipse.swt.layout.*;
import im.view.ContactListViewListener;
import org.eclipse.swt.graphics.*;

public class SWTContactListView implements im.view.ContactListView {
	private org.eclipse.swt.widgets.Composite panel = new Composite(
			InstantMessagingClient.getInstance().getShell(), SWT.NONE);

	private org.eclipse.swt.widgets.Table list = new Table(panel, SWT.SINGLE
			| SWT.V_SCROLL | SWT.BORDER);

	private org.eclipse.swt.widgets.Composite btnPanel = new Composite(panel,
			SWT.NONE);

	private org.eclipse.swt.widgets.Button addContactBtn = new Button(btnPanel,
			SWT.PUSH);

	private org.eclipse.swt.widgets.Button removeContactBtn = new Button(
			btnPanel, SWT.PUSH);

	private java.util.Set listener = new java.util.HashSet();

	public void addContact(final im.model.Contact c, final int index) {
		list.getDisplay().syncExec(new Runnable() {
			public void run() {
				TableItem item;
				try {
					item = new TableItem(list, SWT.NONE, index);
				} catch (IllegalArgumentException e) {
					item = new TableItem(list, SWT.NONE);
				}
				item.setText(c.toString());
				item.setImage(getStatusIcon(c.getStatus()));
			}
		});
	}

	public void setEnabled(final boolean enabled) {
		getPanel().getDisplay().syncExec(new Runnable() {
			public void run() {
				getPanel().setEnabled(enabled);
			}
		});
	}

	public int getSelectedContact() {
		return list.getSelectionIndex();
	}

	public void removeContact(final int index) {
		list.getDisplay().syncExec(new Runnable() {
			public void run() {
				list.remove(index);
			}
		});
	}

	public SWTContactListView() {
		super();
		addContactBtn.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				notifyAddClicked();
			}
		});
		removeContactBtn.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				notifyRemoveClicked();
			}
		});
		list.addSelectionListener(new SelectionAdapter() {
			public void widgetDefaultSelected(SelectionEvent e) {
				notifyContactAction();
			}
		});
		final Shell shell = InstantMessagingClient.getInstance().getShell();
		shell.setText("Instant Messenger");
		shell.setLayout(new FormLayout());
		FormData pfd = new FormData();
		pfd.top = new FormAttachment(0, 5);
		pfd.left = new FormAttachment(0, 5);
		pfd.right = new FormAttachment(100, -5);
		pfd.bottom = new FormAttachment(100, -5);
		panel.setLayoutData(pfd);
		panel.setLayout(new FormLayout());
		FormData bpfd = new FormData();
		bpfd.left = new FormAttachment(0, 5);
		bpfd.right = new FormAttachment(100, -5);
		bpfd.bottom = new FormAttachment(100, -5);
		btnPanel.setLayoutData(bpfd);
		btnPanel.setLayout(new FillLayout());
		FormData lfd = new FormData();
		lfd.top = new FormAttachment(0, 5);
		lfd.left = new FormAttachment(0, 5);
		lfd.right = new FormAttachment(100, -5);
		lfd.bottom = new FormAttachment(btnPanel, -5);
		list.setLayoutData(lfd);
		addContactBtn.setText("Add");
		removeContactBtn.setText("Remove");
	}

	private void notifyContactAction() {
		for (java.util.Enumeration ls = getListeners(); ls.hasMoreElements();) {
			((ContactListViewListener) ls.nextElement()).onContactListAction();
		}
	}

	private void notifyRemoveClicked() {
		for (java.util.Enumeration ls = getListeners(); ls.hasMoreElements();) {
			((ContactListViewListener) ls.nextElement()).onContactListRemove();
		}
	}

	private void notifyAddClicked() {
		for (java.util.Enumeration ls = getListeners(); ls.hasMoreElements();) {
			((ContactListViewListener) ls.nextElement()).onContactListAdd();
		}
	}

	private org.eclipse.swt.graphics.Image getStatusIcon(java.lang.String status) {
		final java.net.URL iconURL;
		if (status != null) {
			if (status.equals("away")) {
				iconURL = SWTContactListView.class.getResource("away.png");
			} else if (status.equals("dnd")) {
				iconURL = SWTContactListView.class.getResource("busy.png");
			} else if (status.equals("xa")) {
				iconURL = SWTContactListView.class
						.getResource("extended-away.png");
			} else if (status.equals("offline")) {
				iconURL = SWTContactListView.class.getResource("offline.png");
			} else {
				iconURL = SWTContactListView.class.getResource("available.png");
			}
		} else {
			iconURL = SWTContactListView.class.getResource("offline.png");
		}
		final im.InstantMessagingClient imc = im.InstantMessagingClient
				.getInstance();
		try {
			return new Image(imc.getShell().getDisplay(), iconURL.openStream());
		} catch (Exception e) {
			imc.report(e);
		}
		return null;
	}

	public org.eclipse.swt.widgets.Composite getPanel() {
		return panel;
	}

	public void setPanel(org.eclipse.swt.widgets.Composite panel) {
		this.panel = panel;
	}

	public org.eclipse.swt.widgets.Table getList() {
		return list;
	}

	public void setList(org.eclipse.swt.widgets.Table list) {
		this.list = list;
	}

	public org.eclipse.swt.widgets.Composite getBtnPanel() {
		return btnPanel;
	}

	public void setBtnPanel(org.eclipse.swt.widgets.Composite btnPanel) {
		this.btnPanel = btnPanel;
	}

	public org.eclipse.swt.widgets.Button getAddContactBtn() {
		return addContactBtn;
	}

	public void setAddContactBtn(org.eclipse.swt.widgets.Button addContactBtn) {
		this.addContactBtn = addContactBtn;
	}

	public org.eclipse.swt.widgets.Button getRemoveContactBtn() {
		return removeContactBtn;
	}

	public void setRemoveContactBtn(
			org.eclipse.swt.widgets.Button removeContactBtn) {
		this.removeContactBtn = removeContactBtn;
	}

	public java.util.Enumeration getListeners() {
		return new be.ac.vub.util.IteratorEnumerationAdapter(listener
				.iterator());
	}

	public void addListener(im.view.ContactListViewListener listener) {
		if (!this.listener.contains(listener)) {
			this.listener.add(listener);
		}
	}

	public void removeListener(im.view.ContactListViewListener listener) {
		this.listener.remove(listener);
	}

}
