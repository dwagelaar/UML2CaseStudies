package im.model;

public class ContactList extends java.util.Observable {
	private java.util.List contact = new java.util.ArrayList();

	public im.model.Identity getIdentity(im.networking.Network forNw) {
		for (java.util.Enumeration cs = getContacts(); cs.hasMoreElements();) {
			Contact contact = (Contact) cs.nextElement();
			if ((contact instanceof Identity)
					&& (contact.getNetwork() == forNw)) {
				return (Identity) contact;
			}
		}
		return null;
	}

	public java.lang.String getUserName(java.lang.String userId) {
		for (java.util.Enumeration cs = getContacts(); cs.hasMoreElements();) {
			Contact contact = (Contact) cs.nextElement();
			if (contact.getUserId().equals(userId)) {
				if (contact.getName() == null) {
					return contact.getUserId();
				} else {
					return contact.getName();
				}
			}
		}
		return userId;
	}

	public java.util.Enumeration getContacts() {
		return new be.ac.vub.util.IteratorEnumerationAdapter(contact.iterator());
	}

	public void addContact(im.model.Contact contact) {
		if (!this.contact.contains(contact)) {
			if (!this.contact.contains(contact)) {
				this.contact.add(contact);
			}
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

	public void removeContact(im.model.Contact contact) {
		if (this.contact.contains(contact)) {
			this.contact.remove(contact);
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

	public im.model.Contact getContactAt(int index) {
		try {
			return (im.model.Contact) contact.get(index);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}

	public int getIndexOfContact(im.model.Contact contact) {
		return this.contact.indexOf(contact);
	}

	public void insertContact(im.model.Contact contact, int index) {
		if (!this.contact.contains(contact)) {
			if (!this.contact.contains(contact)) {
				try {
					this.contact.add(index, contact);
				} catch (IndexOutOfBoundsException e) {
					this.contact.add(contact);
				}
			}
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
