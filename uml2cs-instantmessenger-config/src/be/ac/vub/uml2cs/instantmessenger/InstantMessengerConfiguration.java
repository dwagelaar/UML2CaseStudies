/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.instantmessenger;

import be.ac.vub.uml2cs.transformations.TransformationConfig;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instant Messenger Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getDeploymentTarget <em>Deployment Target</em>}</li>
 *   <li>{@link be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getLocalNetwork <em>Local Network</em>}</li>
 *   <li>{@link be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getJabberNetwork <em>Jabber Network</em>}</li>
 *   <li>{@link be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getUserInterface <em>User Interface</em>}</li>
 *   <li>{@link be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getPackaging <em>Packaging</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage#getInstantMessengerConfiguration()
 * @model annotation="GenModel documentation='Root node for an instant messenger configuration model'"
 *        annotation="CDDToolkit ContextConstraint='http://local/InstantMessenger.owl#InstantMessengerPlatform'"
 * @generated
 */
public interface InstantMessengerConfiguration extends TransformationConfig {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "(C) 2007, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * Returns the value of the '<em><b>Deployment Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Target</em>' attribute.
	 * @see #setDeploymentTarget(String)
	 * @see be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage#getInstantMessengerConfiguration_DeploymentTarget()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getDeploymentTarget();

	/**
	 * Sets the value of the '{@link be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getDeploymentTarget <em>Deployment Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Target</em>' attribute.
	 * @see #getDeploymentTarget()
	 * @generated
	 */
	void setDeploymentTarget(String value);

	/**
	 * Returns the value of the '<em><b>Local Network</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.uml2cs.instantmessenger.LocalNetwork#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Network</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Network</em>' containment reference.
	 * @see #setLocalNetwork(LocalNetwork)
	 * @see be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage#getInstantMessengerConfiguration_LocalNetwork()
	 * @see be.ac.vub.uml2cs.instantmessenger.LocalNetwork#getConfig
	 * @model opposite="config" containment="true"
	 * @generated
	 */
	LocalNetwork getLocalNetwork();

	/**
	 * Sets the value of the '{@link be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getLocalNetwork <em>Local Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Network</em>' containment reference.
	 * @see #getLocalNetwork()
	 * @generated
	 */
	void setLocalNetwork(LocalNetwork value);

	/**
	 * Returns the value of the '<em><b>Jabber Network</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.uml2cs.instantmessenger.JabberNetwork#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jabber Network</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jabber Network</em>' containment reference.
	 * @see #setJabberNetwork(JabberNetwork)
	 * @see be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage#getInstantMessengerConfiguration_JabberNetwork()
	 * @see be.ac.vub.uml2cs.instantmessenger.JabberNetwork#getConfig
	 * @model opposite="config" containment="true"
	 * @generated
	 */
	JabberNetwork getJabberNetwork();

	/**
	 * Sets the value of the '{@link be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getJabberNetwork <em>Jabber Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jabber Network</em>' containment reference.
	 * @see #getJabberNetwork()
	 * @generated
	 */
	void setJabberNetwork(JabberNetwork value);

	/**
	 * Returns the value of the '<em><b>User Interface</b></em>' containment reference list.
	 * The list contents are of type {@link be.ac.vub.uml2cs.instantmessenger.UserInterface}.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.uml2cs.instantmessenger.UserInterface#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Interface</em>' containment reference list.
	 * @see be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage#getInstantMessengerConfiguration_UserInterface()
	 * @see be.ac.vub.uml2cs.instantmessenger.UserInterface#getConfig
	 * @model type="be.ac.vub.uml2cs.instantmessenger.UserInterface" opposite="config" containment="true" required="true"
	 * @generated
	 */
	EList getUserInterface();

	/**
	 * Returns the value of the '<em><b>Packaging</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.uml2cs.instantmessenger.Packaging#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packaging</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packaging</em>' containment reference.
	 * @see #setPackaging(Packaging)
	 * @see be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage#getInstantMessengerConfiguration_Packaging()
	 * @see be.ac.vub.uml2cs.instantmessenger.Packaging#getConfig
	 * @model opposite="config" containment="true" required="true"
	 * @generated
	 */
	Packaging getPackaging();

	/**
	 * Sets the value of the '{@link be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getPackaging <em>Packaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packaging</em>' containment reference.
	 * @see #getPackaging()
	 * @generated
	 */
	void setPackaging(Packaging value);

} // InstantMessengerConfiguration