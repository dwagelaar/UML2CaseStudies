package im.edit;

public class ConversationEdit
		implements
			im.view.ConversationViewListener,
			java.util.Observer {
	private im.model.Conversation model = null;

	private im.view.ConversationView view = null;

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

	public ConversationEdit(im.model.Conversation c) {
		setModel(c);
		im.InstantMessagingClient client = im.InstantMessagingClient
				.getInstance();
		setView(client.getViewFactory().createConversationView());
		getView().addListener(this);
	}

	public void onMessageChange(im.model.Message m) {
		if (m.getContent() instanceof String) {
			im.model.ContactList list = im.InstantMessagingClient.getInstance()
					.getContactList();
			getView().addContent(
					list.getUserName(m.getSender()) + ": " + m.getContent());
		} else {
			getView().addContent(m.getContent());
		}
		getView().toFront();
	}

	public void onContactChange(im.model.Contact c) {
		if (c.getName() != null) {
			getView().setTitle(c.getName());
		} else if (c.getUserId() != null) {
			getView().setTitle(c.getUserId());
		}
		getView().toFront();
	}

	public void onConversationClose() {
		im.InstantMessagingClient.getInstance().removeConversation(getModel());
	}

	public void onConversationSend() {
		try {
			im.model.Contact recipient = getModel().getContact();
			if (recipient == null) {
				throw new NullPointerException(
						"No recipient available in ConversationEdit.onConversationSend()");
			}
			im.model.Contact sender = getSender(recipient);
			if (sender == null) {
				throw new NullPointerException(
						"No sender available in ConversationEdit.onConversationSend()");
			}
			im.model.Message msg = new im.model.Message();
			msg.setNetwork(recipient.getNetwork());
			msg.setSender(sender.getUserId());
			msg.setRecipient(recipient.getUserId());
			msg.setContent(getView().getContent());
			msg.send();
			getModel().setMessage(msg);
		} catch (Exception e) {
			im.InstantMessagingClient.getInstance().report(e);
		}
	}

	public im.model.Contact getSender(im.model.Contact recipient) {
		im.InstantMessagingClient c = im.InstantMessagingClient.getInstance();
		return c.getContactList().getIdentity(recipient.getNetwork());
	}

	public im.model.Conversation getModel() {
		return model;
	}

	public void setModel(im.model.Conversation model) {
		if (this.model != null)
			this.model.deleteObserver(this);
		this.model = model;
		if (model != null)
			model.addObserver(this);
	}

	public im.view.ConversationView getView() {
		return view;
	}

	public void setView(im.view.ConversationView view) {
		this.view = view;
	}

}
