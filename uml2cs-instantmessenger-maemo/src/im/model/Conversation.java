package im.model;

public class Conversation extends java.util.Observable {
	private im.model.Message message = null;

	private im.model.Contact contact = null;

	public im.model.Message getMessage() {
		return message;
	}

	public void setMessage(im.model.Message message) {
		if (this.message != message) {
			this.message = message;
			setChanged();
			java.util.Hashtable e = new java.util.Hashtable();
			e.put("name", "Message");
			e.put("class", im.model.Message.class);
			if (message != null) {
				e.put("value", message);
			}
			notifyObservers(e);
		}
	}

	public im.model.Contact getContact() {
		return contact;
	}

	public void setContact(im.model.Contact contact) {
		if (this.contact != contact) {
			this.contact = contact;
			setChanged();
			java.util.Hashtable e = new java.util.Hashtable();
			e.put("name", "Contact");
			e.put("class", im.model.Contact.class);
			if (contact != null) {
				e.put("value", contact);
			}
			notifyObservers(e);
		}
	}

}
