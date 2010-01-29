package im.model;

public class Identity extends im.model.Contact {
	private java.lang.String password = null;

	public java.lang.String toString() {
		return "* " + super.toString().substring(2);
	}

	public java.lang.String getPassword() {
		return password;
	}

	public void setPassword(java.lang.String password) {
		if (this.password != password) {
			this.password = password;
			setChanged();
			java.util.Hashtable e = new java.util.Hashtable();
			e.put("name", "Password");
			e.put("class", String.class);
			if (password != null) {
				e.put("value", password);
			}
			notifyObservers(e);
		}
	}

}
