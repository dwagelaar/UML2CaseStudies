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
 * A representation of the model object '<em><b>Java Data Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Java language data types
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.uml2cs.transformations.JavaDataTypes#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.uml2cs.transformations.TransformationsPackage#getJavaDataTypes()
 * @model abstract="true"
 * @generated
 */
public interface JavaDataTypes extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "(C) 2007-2009, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.uml2cs.transformations.JavaMapping#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' container reference.
	 * @see #setMapping(JavaMapping)
	 * @see be.ac.vub.uml2cs.transformations.TransformationsPackage#getJavaDataTypes_Mapping()
	 * @see be.ac.vub.uml2cs.transformations.JavaMapping#getDataTypes
	 * @model opposite="dataTypes" required="true" transient="false"
	 * @generated
	 */
	JavaMapping getMapping();

	/**
	 * Sets the value of the '{@link be.ac.vub.uml2cs.transformations.JavaDataTypes#getMapping <em>Mapping</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' container reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(JavaMapping value);

} // JavaDataTypes