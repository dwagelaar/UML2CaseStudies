package im.edit;

import im.InstantMessagingClient;

public class ContactListEdit
		implements
			im.view.NewContactDialogListener,
			im.view.ContactListViewListener,
			java.util.Observer {
	private im.model.ContactList model = null;

	private im.view.ContactListView view = null;

	private java.util.List contactEdit = new java.util.ArrayList();

	public void update(java.util.Observable o, java.lang.Object arg) {
		if (arg instanceof java.util.Hashtable) {
			java.util.Hashtable e = (java.util.Hashtable) arg;
			String mName = "on" + ((String) e.get("name")) + "Change";
			Class[] parmTypes = {(Class) e.get("class")};
			try {
				java.lang.reflect.Method m = getClass().getDeclaredMethod(
						mName, parmTypes);
				Object[] args = {e.get("value")};
				m.invoke(this, args);
			} catch (NoSuchMethodException nex) {
				// no handler
			} catch (Exception ex) {
				// wrong handler configuration
				ex.printStackTrace();
			}
		}
	}

	public ContactListEdit(im.model.ContactList c) {
		setModel(c);
		InstantMessagingClient client = InstantMessagingClient.getInstance();
		setView(client.getViewFactory().createContactListView());
		getView().addListener(this);
	}

	public void onContactChange(im.model.Contact c) {
		int index = getModel().getIndexOfContact(c);
		if (index > -1) {
			ContactEdit edit = new ContactEdit(c);
			insertContactEdit(edit, index);
			getView().addContact(c, index);
		} else {
			ContactEdit edit = getContactEditFor(c);
			index = getIndexOfContactEdit(edit);
			getView().removeContact(index);
			removeContactEdit(edit);
		}
	}

	public void onContactListAdd() {
		getView().setEnabled(false);
		im.InstantMessagingClient client = im.InstantMessagingClient
				.getInstance();
		im.view.NewContactDialog dlg = client.getViewFactory()
				.createNewContactDialog();
		for (java.util.Enumeration ns = client.getNetworks(); ns
				.hasMoreElements();) {
			dlg
					.addNetwork(((im.networking.Network) ns.nextElement())
							.getName());
		}
		dlg.addListener(this);
	}

	public void onContactListRemove() {
		int index = getView().getSelectedContact();
		if (index > -1) {
			im.model.Contact c = getModel().getContactAt(index);
			if (c instanceof im.model.Identity) {
				im.model.Identity id = (im.model.Identity) c;
				id.getNetwork().logout();
			} else {
				c.getNetwork().removeContact(c);
			}
			getModel().removeContact(c);
		}
	}

	public void onContactListAction() {
		int index = getView().getSelectedContact();
		if (index > -1) {
			im.model.Contact c = getModel().getContactAt(index);
			im.InstantMessagingClient client = im.InstantMessagingClient
					.getInstance();
			// reuse existing conversation, if any
			for (java.util.Enumeration cs = client.getConversations(); cs
					.hasMoreElements();) {
				im.model.Conversation conv = (im.model.Conversation) cs
						.nextElement();
				im.model.Contact contact = conv.getContact();
				if (contact.equals(c)) {
					conv.setContact(new im.model.Contact());
					conv.setContact(c);
					return;
				}
			}
			// else new conversation
			im.model.Conversation conv = new im.model.Conversation();
			new ConversationEdit(conv);
			client.addConversation(conv);
			conv.setContact(c);
		}
	}

	public void onNewContactDialogClose(boolean okClicked,
			im.view.NewContactDialog dlg) {
		if (okClicked) {
			im.model.Contact c;
			im.networking.Network n = im.InstantMessagingClient.getInstance()
					.getNetworkAt(dlg.getNetwork());
			if (getModel().getIdentity(n) == null) {
				im.model.Identity id = new im.model.Identity();
				id.setNetwork(n);
				id.setUserId(dlg.getUid());
				id.setName(dlg.getName());
				id.setPassword(dlg.getPassword());
				c = id;
				getModel().addContact(c);
				id.getNetwork().login(id.getUserId(), id.getPassword());
			} else {
				c = new im.model.Contact();
				c.setNetwork(n);
				c.setUserId(dlg.getUid());
				c.setName(dlg.getName());
				getModel().addContact(c);
				c.getNetwork().addContact(c);
			}
		}
		getView().setEnabled(true);
	}

	private im.edit.ContactEdit getContactEditFor(im.model.Contact c) {
		for (java.util.Enumeration ces = getContactEdits(); ces
				.hasMoreElements();) {
			ContactEdit ce = (ContactEdit) ces.nextElement();
			if (ce.getModel().equals(c)) {
				return ce;
			}
		}
		return null;
	}

	public im.model.ContactList getModel() {
		return model;
	}

	public void setModel(im.model.ContactList model) {
		if (this.model != null)
			this.model.deleteObserver(this);
		this.model = model;
		if (model != null)
			model.addObserver(this);
	}

	public im.view.ContactListView getView() {
		return view;
	}

	public void setView(im.view.ContactListView view) {
		this.view = view;
	}

	public java.util.Enumeration getContactEdits() {
		return new be.ac.vub.util.IteratorEnumerationAdapter(contactEdit
				.iterator());
	}

	public void addContactEdit(im.edit.ContactEdit contactEdit) {
		if (!this.contactEdit.contains(contactEdit)) {
			this.contactEdit.add(contactEdit);
			contactEdit.setListEdit(this);
		}
	}

	public void removeContactEdit(im.edit.ContactEdit contactEdit) {
		if (this.contactEdit.contains(contactEdit)) {
			this.contactEdit.remove(contactEdit);
			contactEdit.setListEdit(null);
		}
	}

	public im.edit.ContactEdit getContactEditAt(int index) {
		try {
			return (im.edit.ContactEdit) contactEdit.get(index);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}

	public int getIndexOfContactEdit(im.edit.ContactEdit contactEdit) {
		return this.contactEdit.indexOf(contactEdit);
	}

	public void insertContactEdit(im.edit.ContactEdit contactEdit, int index) {
		if (!this.contactEdit.contains(contactEdit)) {
			try {
				this.contactEdit.add(index, contactEdit);
			} catch (IndexOutOfBoundsException e) {
				this.contactEdit.add(contactEdit);
			}
			contactEdit.setListEdit(this);
		}
	}

}
