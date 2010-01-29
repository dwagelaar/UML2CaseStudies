package be.ac.vub.util;

public class IteratorEnumerationAdapter implements java.util.Enumeration {
	private java.util.Iterator iterator = null;

	public IteratorEnumerationAdapter(java.util.Iterator iterator) {
		this.iterator = iterator;
	}

	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	public java.lang.Object nextElement() {
		return iterator.next();
	}

}
