package im.model;

public class Message extends im.model.NetworkSpecificData {
	private java.lang.String sender = null;

	private java.lang.String recipient = null;

	private java.lang.Object content = null;

	public void send() {
		if (getNetwork() != null) {
			getNetwork().send(this);
		}
	}

	public java.lang.String getSender() {
		return sender;
	}

	public void setSender(java.lang.String sender) {
		if (this.sender != sender) {
			this.sender = sender;
			setChanged();
			java.util.Hashtable e = new java.util.Hashtable();
			e.put("name", "Sender");
			e.put("class", String.class);
			if (sender != null) {
				e.put("value", sender);
			}
			notifyObservers(e);
		}
	}

	public java.lang.String getRecipient() {
		return recipient;
	}

	public void setRecipient(java.lang.String recipient) {
		if (this.recipient != recipient) {
			this.recipient = recipient;
			setChanged();
			java.util.Hashtable e = new java.util.Hashtable();
			e.put("name", "Recipient");
			e.put("class", String.class);
			if (recipient != null) {
				e.put("value", recipient);
			}
			notifyObservers(e);
		}
	}

	public java.lang.Object getContent() {
		return content;
	}

	public void setContent(java.lang.Object content) {
		if (this.content != content) {
			this.content = content;
			setChanged();
			java.util.Hashtable e = new java.util.Hashtable();
			e.put("name", "Content");
			e.put("class", Object.class);
			if (content != null) {
				e.put("value", content);
			}
			notifyObservers(e);
		}
	}

}
