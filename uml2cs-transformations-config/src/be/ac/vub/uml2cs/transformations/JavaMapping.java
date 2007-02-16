/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.transformations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.uml2cs.transformations.JavaMapping#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.uml2cs.transformations.TransformationsPackage#getJavaMapping()
 * @model annotation="GenModel documentation='Java language mapping'"
 *        annotation="CDDToolkit ContextConstraint='http://local/Transformations.owl#JavaMappingsPlatform'"
 * @generated
 */
public interface JavaMapping extends Mapping {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "(C) 2007, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.uml2cs.transformations.JavaDataTypes#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference.
	 * @see #setDataTypes(JavaDataTypes)
	 * @see be.ac.vub.uml2cs.transformations.TransformationsPackage#getJavaMapping_DataTypes()
	 * @see be.ac.vub.uml2cs.transformations.JavaDataTypes#getMapping
	 * @model opposite="mapping" containment="true" required="true"
	 * @generated
	 */
	JavaDataTypes getDataTypes();

	/**
	 * Sets the value of the '{@link be.ac.vub.uml2cs.transformations.JavaMapping#getDataTypes <em>Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Types</em>' containment reference.
	 * @see #getDataTypes()
	 * @generated
	 */
	void setDataTypes(JavaDataTypes value);

} // JavaMapping