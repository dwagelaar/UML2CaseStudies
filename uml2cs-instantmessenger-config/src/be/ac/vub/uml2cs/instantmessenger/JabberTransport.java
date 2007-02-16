/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.instantmessenger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jabber Transport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.uml2cs.instantmessenger.JabberTransport#getJabberNetwork <em>Jabber Network</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage#getJabberTransport()
 * @model abstract="true"
 * @generated
 */
public interface JabberTransport extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "(C) 2007, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * Returns the value of the '<em><b>Jabber Network</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.uml2cs.instantmessenger.JabberNetwork#getJabberTransport <em>Jabber Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jabber Network</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jabber Network</em>' container reference.
	 * @see #setJabberNetwork(JabberNetwork)
	 * @see be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage#getJabberTransport_JabberNetwork()
	 * @see be.ac.vub.uml2cs.instantmessenger.JabberNetwork#getJabberTransport
	 * @model opposite="jabberTransport" required="true"
	 * @generated
	 */
	JabberNetwork getJabberNetwork();

	/**
	 * Sets the value of the '{@link be.ac.vub.uml2cs.instantmessenger.JabberTransport#getJabberNetwork <em>Jabber Network</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jabber Network</em>' container reference.
	 * @see #getJabberNetwork()
	 * @generated
	 */
	void setJabberNetwork(JabberNetwork value);

} // JabberTransport