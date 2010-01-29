package im.edit;

public class ContactEdit implements java.util.Observer {
	private im.model.Contact model = null;

	private im.edit.ContactListEdit listEdit = null;

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

	public ContactEdit(im.model.Contact c) {
		setModel(c);
	}

	public void onNameChange(java.lang.String n) {
		onChange();
	}

	public void onStatusChange(java.lang.String s) {
		onChange();
	}

	public void onChange() {
		int index = getListEdit().getIndexOfContactEdit(this);
		if (index > -1) {
			getListEdit().getView().removeContact(index);
			getListEdit().getView().addContact(getModel(), index);
		}
	}

	public im.model.Contact getModel() {
		return model;
	}

	public void setModel(im.model.Contact model) {
		if (this.model != null)
			this.model.deleteObserver(this);
		this.model = model;
		if (model != null)
			model.addObserver(this);
	}

	public im.edit.ContactListEdit getListEdit() {
		return listEdit;
	}

	public void setListEdit(im.edit.ContactListEdit listEdit) {
		if (this.listEdit != listEdit) {
			if (this.listEdit != null)
				this.listEdit.removeContactEdit(this);
			this.listEdit = listEdit;
			if (listEdit != null)
				listEdit.addContactEdit(this);
		}
	}

}
