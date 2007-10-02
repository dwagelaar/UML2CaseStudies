/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.transformations;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML2 Applet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.uml2cs.transformations.UML2Applet#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.uml2cs.transformations.TransformationsPackage#getUML2Applet()
 * @model annotation="GenModel documentation='Implements the Applet profile using a Java AWT Applet'"
 *        annotation="CDDToolkit ContextConstraint='http://local/Transformations.owl#AppletPlatform'"
 *        annotation="PlatformKit PlatformConstraint='http://local/Transformations.owl#AppletPlatform'"
 * @generated
 */
public interface UML2Applet extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "(C) 2007, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * Returns the value of the '<em><b>Config</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.uml2cs.transformations.TransformationConfig#getApplet <em>Applet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' container reference.
	 * @see #setConfig(TransformationConfig)
	 * @see be.ac.vub.uml2cs.transformations.TransformationsPackage#getUML2Applet_Config()
	 * @see be.ac.vub.uml2cs.transformations.TransformationConfig#getApplet
	 * @model opposite="applet" required="true" transient="false"
	 * @generated
	 */
	TransformationConfig getConfig();

	/**
	 * Sets the value of the '{@link be.ac.vub.uml2cs.transformations.UML2Applet#getConfig <em>Config</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' container reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(TransformationConfig value);

} // UML2Applet