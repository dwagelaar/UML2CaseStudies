package im.view;

public interface NewContactDialog {
	public java.lang.String getUid();

	public java.lang.String getName();

	public int getNetwork();

	public java.lang.String getPassword();

	public void addNetwork(java.lang.String n);

	public void addListener(im.view.NewContactDialogListener l);

}
