/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.transformations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see be.ac.vub.uml2cs.transformations.TransformationsPackage
 * @generated
 */
public interface TransformationsFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "(C) 2007, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransformationsFactory eINSTANCE = be.ac.vub.uml2cs.transformations.impl.TransformationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transformation Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Config</em>'.
	 * @generated
	 */
	TransformationConfig createTransformationConfig();

	/**
	 * Returns a new object of class '<em>Java Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Mapping</em>'.
	 * @generated
	 */
	JavaMapping createJavaMapping();

	/**
	 * Returns a new object of class '<em>Java1 Data Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java1 Data Types</em>'.
	 * @generated
	 */
	Java1DataTypes createJava1DataTypes();

	/**
	 * Returns a new object of class '<em>Java2 Data Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java2 Data Types</em>'.
	 * @generated
	 */
	Java2DataTypes createJava2DataTypes();

	/**
	 * Returns a new object of class '<em>UML2 Observer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML2 Observer</em>'.
	 * @generated
	 */
	UML2Observer createUML2Observer();

	/**
	 * Returns a new object of class '<em>UML2 Java Observer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML2 Java Observer</em>'.
	 * @generated
	 */
	UML2JavaObserver createUML2JavaObserver();

	/**
	 * Returns a new object of class '<em>UML2 Applet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML2 Applet</em>'.
	 * @generated
	 */
	UML2Applet createUML2Applet();

	/**
	 * Returns a new object of class '<em>UML2MI Dlet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML2MI Dlet</em>'.
	 * @generated
	 */
	UML2MIDlet createUML2MIDlet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TransformationsPackage getTransformationsPackage();

} //TransformationsFactory
