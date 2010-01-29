/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.transformations.impl;

import be.ac.vub.uml2cs.transformations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformationsFactoryImpl extends EFactoryImpl implements TransformationsFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(C) 2007-2009, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransformationsFactory init() {
		try {
			TransformationsFactory theTransformationsFactory = (TransformationsFactory)EPackage.Registry.INSTANCE.getEFactory("http://ssel.vub.ac.be/uml2cs/Transformations"); 
			if (theTransformationsFactory != null) {
				return theTransformationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TransformationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TransformationsPackage.TRANSFORMATION_CONFIG: return createTransformationConfig();
			case TransformationsPackage.JAVA_MAPPING: return createJavaMapping();
			case TransformationsPackage.JAVA1_DATA_TYPES: return createJava1DataTypes();
			case TransformationsPackage.JAVA2_DATA_TYPES: return createJava2DataTypes();
			case TransformationsPackage.UML2_OBSERVER: return createUML2Observer();
			case TransformationsPackage.UML2_JAVA_OBSERVER: return createUML2JavaObserver();
			case TransformationsPackage.UML2_APPLET: return createUML2Applet();
			case TransformationsPackage.UML2MI_DLET: return createUML2MIDlet();
			case TransformationsPackage.UML2SWT_APPLICATION: return createUML2SWTApplication();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TransformationsPackage.SAVE_MODEL_TYPE:
				return createSaveModelTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TransformationsPackage.SAVE_MODEL_TYPE:
				return convertSaveModelTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationConfig createTransformationConfig() {
		TransformationConfigImpl transformationConfig = new TransformationConfigImpl();
		return transformationConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaMapping createJavaMapping() {
		JavaMappingImpl javaMapping = new JavaMappingImpl();
		return javaMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java1DataTypes createJava1DataTypes() {
		Java1DataTypesImpl java1DataTypes = new Java1DataTypesImpl();
		return java1DataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java2DataTypes createJava2DataTypes() {
		Java2DataTypesImpl java2DataTypes = new Java2DataTypesImpl();
		return java2DataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2Observer createUML2Observer() {
		UML2ObserverImpl uml2Observer = new UML2ObserverImpl();
		return uml2Observer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2JavaObserver createUML2JavaObserver() {
		UML2JavaObserverImpl uml2JavaObserver = new UML2JavaObserverImpl();
		return uml2JavaObserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2Applet createUML2Applet() {
		UML2AppletImpl uml2Applet = new UML2AppletImpl();
		return uml2Applet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2MIDlet createUML2MIDlet() {
		UML2MIDletImpl uml2MIDlet = new UML2MIDletImpl();
		return uml2MIDlet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2SWTApplication createUML2SWTApplication() {
		UML2SWTApplicationImpl uml2SWTApplication = new UML2SWTApplicationImpl();
		return uml2SWTApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaveModelType createSaveModelTypeFromString(EDataType eDataType, String initialValue) {
		SaveModelType result = SaveModelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSaveModelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationsPackage getTransformationsPackage() {
		return (TransformationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TransformationsPackage getPackage() {
		return TransformationsPackage.eINSTANCE;
	}

} //TransformationsFactoryImpl
