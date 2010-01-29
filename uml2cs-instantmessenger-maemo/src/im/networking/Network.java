package im.networking;

public abstract class Network extends java.util.Observable {
	private java.lang.String name = null;

	private im.model.Contact recvContact = null;

	private im.model.Message recvMsg = null;

	public void login(java.lang.String uid, java.lang.String pwd) {

	}

	public void logout() {

	}

	public void addContact(im.model.Contact c) {

	}

	public void removeContact(im.model.Contact c) {

	}

	public void send(im.model.Message msg) {

	}

	public static void discoverNetworks() {
		String[] options = {"im.networking.jabber.mejabber.MEJabber",
				"im.networking.jabber.defaultjabber.DefaultJabber",
				"im.networking.sms.SMS", "im.networking.local.Local"};
		im.InstantMessagingClient client = im.InstantMessagingClient
				.getInstance();
		for (int i = 0; i < options.length; i++) {
			try {
				client.addNetwork((Network) Class.forName(options[i])
						.newInstance());
			} catch (Exception e) {
			}
		}
	}

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		if (this.name != name) {
			this.name = name;
			setChanged();
			java.util.Hashtable e = new java.util.Hashtable();
			e.put("name", "Name");
			e.put("class", String.class);
			if (name != null) {
				e.put("value", name);
			}
			notifyObservers(e);
		}
	}

	public im.model.Contact getRecvContact() {
		return recvContact;
	}

	public void setRecvContact(im.model.Contact recvContact) {
		if (this.recvContact != recvContact) {
			this.recvContact = recvContact;
			setChanged();
			java.util.Hashtable e = new java.util.Hashtable();
			e.put("name", "RecvContact");
			e.put("class", im.model.Contact.class);
			if (recvContact != null) {
				e.put("value", recvContact);
			}
			notifyObservers(e);
		}
	}

	public im.model.Message getRecvMsg() {
		return recvMsg;
	}

	public void setRecvMsg(im.model.Message recvMsg) {
		if (this.recvMsg != recvMsg) {
			this.recvMsg = recvMsg;
			setChanged();
			java.util.Hashtable e = new java.util.Hashtable();
			e.put("name", "RecvMsg");
			e.put("class", im.model.Message.class);
			if (recvMsg != null) {
				e.put("value", recvMsg);
			}
			notifyObservers(e);
		}
	}

}
