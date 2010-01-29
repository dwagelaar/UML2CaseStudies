package im.view;

public interface ConversationView {
	public java.lang.Object getContent();

	public void addContent(java.lang.Object c);

	public void setTitle(java.lang.String t);

	public void toFront();

	public void addListener(im.view.ConversationViewListener l);

}
