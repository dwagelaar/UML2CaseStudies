package im.view.swt;

import im.InstantMessagingClient;

public class SWTViewFactory extends im.view.ViewFactory {
	public SWTViewFactory() throws java.lang.ClassNotFoundException {
		Class.forName("org.eclipse.swt.SWT");
		if (!InstantMessagingClient.getInstance().getRunning()) {
			throw new ClassNotFoundException("SWT app not running");
		}
	}

	public im.view.ContactListView createContactListView() {
		return new SWTContactListView();
	}

	public im.view.ConversationView createConversationView() {
		return new SWTConversationView();
	}

	public im.view.NewContactDialog createNewContactDialog() {
		return new SWTNewContactDialog();
	}

}
