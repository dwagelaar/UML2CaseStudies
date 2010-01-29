package im.view;

public interface ContactListView {
	public void addContact(im.model.Contact c, int index);

	public void removeContact(int index);

	public int getSelectedContact();

	public void setEnabled(boolean enabled);

	public void addListener(im.view.ContactListViewListener l);

}
