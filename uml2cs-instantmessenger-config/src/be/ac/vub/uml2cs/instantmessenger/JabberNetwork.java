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
 * A representation of the model object '<em><b>Jabber Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.uml2cs.instantmessenger.JabberNetwork#getJabberTransport <em>Jabber Transport</em>}</li>
 *   <li>{@link be.ac.vub.uml2cs.instantmessenger.JabberNetwork#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage#getJabberNetwork()
 * @model annotation="CDDToolkit ContextConstraint='http://local/InstantMessenger.owl#JabberPlatform'"
 *        annotation="PlatformKit PlatformConstraint='http://local/InstantMessenger.owl#JabberPlatform'"
 * @generated
 */
public interface JabberNetwork extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "(C) 2007-2009, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * Returns the value of the '<em><b>Jabber Transport</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.uml2cs.instantmessenger.JabberTransport#getJabberNetwork <em>Jabber Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jabber Transport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jabber Transport</em>' containment reference.
	 * @see #setJabberTransport(JabberTransport)
	 * @see be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage#getJabberNetwork_JabberTransport()
	 * @see be.ac.vub.uml2cs.instantmessenger.JabberTransport#getJabberNetwork
	 * @model opposite="jabberNetwork" containment="true" required="true"
	 * @generated
	 */
	JabberTransport getJabberTransport();

	/**
	 * Sets the value of the '{@link be.ac.vub.uml2cs.instantmessenger.JabberNetwork#getJabberTransport <em>Jabber Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jabber Transport</em>' containment reference.
	 * @see #getJabberTransport()
	 * @generated
	 */
	void setJabberTransport(JabberTransport value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getJabberNetwork <em>Jabber Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' container reference.
	 * @see #setConfig(InstantMessengerConfiguration)
	 * @see be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage#getJabberNetwork_Config()
	 * @see be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getJabberNetwork
	 * @model opposite="jabberNetwork" required="true" transient="false"
	 * @generated
	 */
	InstantMessengerConfiguration getConfig();

	/**
	 * Sets the value of the '{@link be.ac.vub.uml2cs.instantmessenger.JabberNetwork#getConfig <em>Config</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' container reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(InstantMessengerConfiguration value);

} // JabberNetwork