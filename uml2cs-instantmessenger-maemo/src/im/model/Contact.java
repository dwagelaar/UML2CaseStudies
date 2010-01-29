package im.model;

public class Contact extends im.model.NetworkSpecificData {
	public class Contact_toStringBehavior {
	}

	private java.lang.String userId = null;

	private java.lang.String name = null;

	private java.lang.String status = null;

	public java.lang.String toString() {
		final StringBuffer fmt = new StringBuffer();
		final String name = getName();
		final String status = getStatus();
		fmt.append("  ");
		fmt.append((name == null) ? getUserId() : name);
		if (getNetwork() != null) {
			fmt.append(" - ");
			fmt.append(getNetwork().getName());
		}
		fmt.append(" (");
		fmt.append((status == null) ? "offline" : status);
		fmt.append(")");
		return fmt.toString();
	}

	public java.lang.String getUserId() {
		return userId;
	}

	public void setUserId(java.lang.String userId) {
		if (this.userId != userId) {
			this.userId = userId;
			setChanged();
			java.util.Hashtable e = new java.util.Hashtable();
			e.put("name", "UserId");
			e.put("class", String.class);
			if (userId != null) {
				e.put("value", userId);
			}
			notifyObservers(e);
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

	public java.lang.String getStatus() {
		return status;
	}

	public void setStatus(java.lang.String status) {
		if (this.status != status) {
			this.status = status;
			setChanged();
			java.util.Hashtable e = new java.util.Hashtable();
			e.put("name", "Status");
			e.put("class", String.class);
			if (status != null) {
				e.put("value", status);
			}
			notifyObservers(e);
		}
	}

}
