package im;

import im.model.*;
import im.networking.Network;
import im.edit.*;
import im.view.*;

public class InstantMessagingClient extends swt.SWTApplication
		implements
			java.util.Observer,
			im.ExceptionReporter {
	private java.util.List network = new java.util.ArrayList();

	private im.model.ContactList contactList = new ContactList();

	private java.util.Set conversation = new java.util.HashSet();

	private im.view.ViewFactory viewFactory = null;

	private static final long serialVersionUID = -3374609151465534159L;

	private im.edit.ContactListEdit contactListEdit = null;

	private static im.InstantMessagingClient instance = null;

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

	public void report(java.lang.Exception e) {
		for (java.util.Enumeration ns = getNetworks(); ns.hasMoreElements();) {
			Object n = ns.nextElement();
			if (n instanceof ExceptionReporter) {
				((ExceptionReporter) n).report(e);
				return;
			}
		}
		System.err.println(e.getMessage());
		e.printStackTrace();
	}

	public void init() {
		getShell().setLayout(new org.eclipse.swt.layout.FormLayout());
		try {
			// ViewFactory
			setViewFactory(ViewFactory.getDefault());
			// Network
			Network.discoverNetworks();
			// Create and register edit/view
			setContactListEdit(new ContactListEdit(contactList));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void start() {
		boolean hasID = false;
		for (java.util.Enumeration ns = getNetworks(); ns.hasMoreElements();) {
			Network n = (Network) ns.nextElement();
			Identity id = getContactList().getIdentity(n);
			if (id != null) {
				n.login(id.getUserId(), id.getPassword());
				hasID = true;
			}
		}
		if (!hasID) {
			getContactListEdit().onContactListAdd();
		}
	}

	public void stop() {
		for (java.util.Enumeration ns = getNetworks(); ns.hasMoreElements();) {
			Network n = (Network) ns.nextElement();
			if (getContactList().getIdentity(n) != null) {
				n.logout();
			}
		}
	}

	public void onRecvContactChange(im.model.Contact c) {
		for (java.util.Enumeration cs = getContactList().getContacts(); cs
				.hasMoreElements();) {
			Contact listed = (Contact) cs.nextElement();
			if (listed.getUserId().equals(c.getUserId())) {
				if (c.getStatus() != null) {
					listed.setStatus(c.getStatus());
				}
				if (c.getName() != null) {
					listed.setName(c.getName());
				}
				return;
			}
		}
		getContactList().addContact(c);
	}

	public void onRecvMsgChange(im.model.Message r) {
		for (java.util.Enumeration cs = getConversations(); cs
				.hasMoreElements();) {
			Conversation c = (Conversation) cs.nextElement();
			String contact = c.getContact().getUserId();
			if (contact.equals(r.getSender())) {
				c.setMessage(r);
				return;
			}
		}
		Conversation conv = new Conversation();
		new ConversationEdit(conv);
		addConversation(conv);
		for (java.util.Enumeration cs = getContactList().getContacts(); cs
				.hasMoreElements();) {
			Contact c = (Contact) cs.nextElement();
			if (c.getUserId().equals(r.getSender())) {
				conv.setContact(c);
				break;
			}
		}
		if (conv.getContact() == null) {
			conv.setContact(new Contact());
			conv.getContact().setUserId(r.getSender());
		}
		conv.setMessage(r);
	}

	public im.model.ContactList getContactList() {
		return contactList;
	}

	public void setContactList(im.model.ContactList contactList) {
		this.contactList = contactList;
	}

	public im.view.ViewFactory getViewFactory() {
		return viewFactory;
	}

	public void setViewFactory(im.view.ViewFactory viewFactory) {
		this.viewFactory = viewFactory;
	}

	public im.edit.ContactListEdit getContactListEdit() {
		return contactListEdit;
	}

	public void setContactListEdit(im.edit.ContactListEdit contactListEdit) {
		this.contactListEdit = contactListEdit;
	}

	public java.util.Enumeration getConversations() {
		return new be.ac.vub.util.IteratorEnumerationAdapter(conversation
				.iterator());
	}

	public void addConversation(im.model.Conversation conversation) {
		if (!this.conversation.contains(conversation)) {
			this.conversation.add(conversation);
		}
	}

	public void removeConversation(im.model.Conversation conversation) {
		this.conversation.remove(conversation);
	}

	public java.util.Enumeration getNetworks() {
		return new be.ac.vub.util.IteratorEnumerationAdapter(network.iterator());
	}

	public void addNetwork(im.networking.Network network) {
		if (!this.network.contains(network)) {
			this.network.add(network);
		}
		if (network != null)
			network.addObserver(this);
	}

	public void removeNetwork(im.networking.Network network) {
		if (network != null)
			network.deleteObserver(this);
		this.network.remove(network);
	}

	public im.networking.Network getNetworkAt(int index) {
		try {
			return (im.networking.Network) network.get(index);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}

	public int getIndexOfNetwork(im.networking.Network network) {
		return this.network.indexOf(network);
	}

	public void insertNetwork(im.networking.Network network, int index) {
		if (!this.network.contains(network)) {
			try {
				this.network.add(index, network);
			} catch (IndexOutOfBoundsException e) {
				this.network.add(network);
			}
		}
		if (network != null)
			network.addObserver(this);
	}

	public static im.InstantMessagingClient getInstance() {
		if (instance == null) {
			instance = new InstantMessagingClient();
		}
		return instance;
	}

	public static void main(java.lang.String[] args) {
		InstantMessagingClient app = getInstance();
		app.setRunning(true);
		final org.eclipse.swt.widgets.Shell shell = app.getShell();
		final org.eclipse.swt.widgets.Display display = shell.getDisplay();
		app.init();
		shell.pack();
		shell.open();
		app.start();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		app.stop();
		app.destroy();
		display.dispose();
	}

}
