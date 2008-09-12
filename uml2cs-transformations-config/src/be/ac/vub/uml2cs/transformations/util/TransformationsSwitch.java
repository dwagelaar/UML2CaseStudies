/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.transformations.util;

import be.ac.vub.uml2cs.transformations.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see be.ac.vub.uml2cs.transformations.TransformationsPackage
 * @generated
 */
public class TransformationsSwitch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(C) 2007, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TransformationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationsSwitch() {
		if (modelPackage == null) {
			modelPackage = TransformationsPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TransformationsPackage.TRANSFORMATION_CONFIG: {
				TransformationConfig transformationConfig = (TransformationConfig)theEObject;
				T result = caseTransformationConfig(transformationConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationsPackage.MAPPING: {
				Mapping mapping = (Mapping)theEObject;
				T result = caseMapping(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationsPackage.JAVA_MAPPING: {
				JavaMapping javaMapping = (JavaMapping)theEObject;
				T result = caseJavaMapping(javaMapping);
				if (result == null) result = caseMapping(javaMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationsPackage.JAVA_DATA_TYPES: {
				JavaDataTypes javaDataTypes = (JavaDataTypes)theEObject;
				T result = caseJavaDataTypes(javaDataTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationsPackage.JAVA1_DATA_TYPES: {
				Java1DataTypes java1DataTypes = (Java1DataTypes)theEObject;
				T result = caseJava1DataTypes(java1DataTypes);
				if (result == null) result = caseJavaDataTypes(java1DataTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationsPackage.JAVA2_DATA_TYPES: {
				Java2DataTypes java2DataTypes = (Java2DataTypes)theEObject;
				T result = caseJava2DataTypes(java2DataTypes);
				if (result == null) result = caseJavaDataTypes(java2DataTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationsPackage.UML2_OBSERVER: {
				UML2Observer uml2Observer = (UML2Observer)theEObject;
				T result = caseUML2Observer(uml2Observer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationsPackage.UML2_JAVA_OBSERVER: {
				UML2JavaObserver uml2JavaObserver = (UML2JavaObserver)theEObject;
				T result = caseUML2JavaObserver(uml2JavaObserver);
				if (result == null) result = caseUML2Observer(uml2JavaObserver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationsPackage.UML2_APPLET: {
				UML2Applet uml2Applet = (UML2Applet)theEObject;
				T result = caseUML2Applet(uml2Applet);
				if (result == null) result = caseApplet(uml2Applet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationsPackage.UML2MI_DLET: {
				UML2MIDlet uml2MIDlet = (UML2MIDlet)theEObject;
				T result = caseUML2MIDlet(uml2MIDlet);
				if (result == null) result = caseApplet(uml2MIDlet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationsPackage.APPLET: {
				Applet applet = (Applet)theEObject;
				T result = caseApplet(applet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationsPackage.UML2SWT_APPLICATION: {
				UML2SWTApplication uml2SWTApplication = (UML2SWTApplication)theEObject;
				T result = caseUML2SWTApplication(uml2SWTApplication);
				if (result == null) result = caseApplet(uml2SWTApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationConfig(TransformationConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaMapping(JavaMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Data Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Data Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaDataTypes(JavaDataTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java1 Data Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java1 Data Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJava1DataTypes(Java1DataTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java2 Data Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java2 Data Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJava2DataTypes(Java2DataTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML2 Observer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML2 Observer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUML2Observer(UML2Observer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML2 Java Observer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML2 Java Observer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUML2JavaObserver(UML2JavaObserver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML2 Applet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML2 Applet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUML2Applet(UML2Applet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML2MI Dlet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML2MI Dlet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUML2MIDlet(UML2MIDlet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Applet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Applet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplet(Applet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML2SWT Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML2SWT Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUML2SWTApplication(UML2SWTApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //TransformationsSwitch
