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
 * A representation of the model object '<em><b>User Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.uml2cs.instantmessenger.UserInterface#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage#getUserInterface()
 * @model abstract="true"
 * @generated
 */
public interface UserInterface extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "(C) 2007, 2008, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * Returns the value of the '<em><b>Config</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getUserInterface <em>User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' container reference.
	 * @see #setConfig(InstantMessengerConfiguration)
	 * @see be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage#getUserInterface_Config()
	 * @see be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getUserInterface
	 * @model opposite="userInterface" required="true" transient="false"
	 * @generated
	 */
	InstantMessengerConfiguration getConfig();

	/**
	 * Sets the value of the '{@link be.ac.vub.uml2cs.instantmessenger.UserInterface#getConfig <em>Config</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' container reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(InstantMessengerConfiguration value);

} // UserInterface