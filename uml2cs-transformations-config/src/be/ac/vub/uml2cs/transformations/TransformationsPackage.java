/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.transformations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see be.ac.vub.uml2cs.transformations.TransformationsFactory
 * @model kind="package"
 *        annotation="CDDToolkit Ontology='Transformations.owl'"
 *        annotation="PlatformKit Ontology='Transformations.owl'"
 * @generated
 */
public interface TransformationsPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "(C) 2007, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "transformations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ssel.vub.ac.be/uml2cs/Transformations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "transformations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransformationsPackage eINSTANCE = be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.transformations.impl.TransformationConfigImpl <em>Transformation Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.transformations.impl.TransformationConfigImpl
	 * @see be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl#getTransformationConfig()
	 * @generated
	 */
	int TRANSFORMATION_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CONFIG__MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Save Models</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CONFIG__SAVE_MODELS = 1;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CONFIG__OBSERVER = 2;

	/**
	 * The feature id for the '<em><b>Applet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CONFIG__APPLET = 3;

	/**
	 * The feature id for the '<em><b>Target Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CONFIG__TARGET_PROJECT = 4;

	/**
	 * The number of structural features of the '<em>Transformation Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CONFIG_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.transformations.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.transformations.impl.MappingImpl
	 * @see be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__CONFIG = 0;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.transformations.impl.JavaMappingImpl <em>Java Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.transformations.impl.JavaMappingImpl
	 * @see be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl#getJavaMapping()
	 * @generated
	 */
	int JAVA_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Config</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MAPPING__CONFIG = MAPPING__CONFIG;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MAPPING__DATA_TYPES = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.transformations.impl.JavaDataTypesImpl <em>Java Data Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.transformations.impl.JavaDataTypesImpl
	 * @see be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl#getJavaDataTypes()
	 * @generated
	 */
	int JAVA_DATA_TYPES = 3;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DATA_TYPES__MAPPING = 0;

	/**
	 * The number of structural features of the '<em>Java Data Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DATA_TYPES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.transformations.impl.Java1DataTypesImpl <em>Java1 Data Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.transformations.impl.Java1DataTypesImpl
	 * @see be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl#getJava1DataTypes()
	 * @generated
	 */
	int JAVA1_DATA_TYPES = 4;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.transformations.impl.Java2DataTypesImpl <em>Java2 Data Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.transformations.impl.Java2DataTypesImpl
	 * @see be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl#getJava2DataTypes()
	 * @generated
	 */
	int JAVA2_DATA_TYPES = 5;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA1_DATA_TYPES__MAPPING = JAVA_DATA_TYPES__MAPPING;

	/**
	 * The number of structural features of the '<em>Java1 Data Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA1_DATA_TYPES_FEATURE_COUNT = JAVA_DATA_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2_DATA_TYPES__MAPPING = JAVA_DATA_TYPES__MAPPING;

	/**
	 * The number of structural features of the '<em>Java2 Data Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2_DATA_TYPES_FEATURE_COUNT = JAVA_DATA_TYPES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.transformations.impl.UML2ObserverImpl <em>UML2 Observer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.transformations.impl.UML2ObserverImpl
	 * @see be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl#getUML2Observer()
	 * @generated
	 */
	int UML2_OBSERVER = 6;

	/**
	 * The feature id for the '<em><b>Config</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2_OBSERVER__CONFIG = 0;

	/**
	 * The number of structural features of the '<em>UML2 Observer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2_OBSERVER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.transformations.impl.UML2JavaObserverImpl <em>UML2 Java Observer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.transformations.impl.UML2JavaObserverImpl
	 * @see be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl#getUML2JavaObserver()
	 * @generated
	 */
	int UML2_JAVA_OBSERVER = 7;

	/**
	 * The feature id for the '<em><b>Config</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2_JAVA_OBSERVER__CONFIG = UML2_OBSERVER__CONFIG;

	/**
	 * The number of structural features of the '<em>UML2 Java Observer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2_JAVA_OBSERVER_FEATURE_COUNT = UML2_OBSERVER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.transformations.impl.UML2AppletImpl <em>UML2 Applet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.transformations.impl.UML2AppletImpl
	 * @see be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl#getUML2Applet()
	 * @generated
	 */
	int UML2_APPLET = 8;

	/**
	 * The feature id for the '<em><b>Config</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2_APPLET__CONFIG = 0;

	/**
	 * The number of structural features of the '<em>UML2 Applet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2_APPLET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.transformations.impl.UML2MIDletImpl <em>UML2MI Dlet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.transformations.impl.UML2MIDletImpl
	 * @see be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl#getUML2MIDlet()
	 * @generated
	 */
	int UML2MI_DLET = 9;

	/**
	 * The feature id for the '<em><b>Config</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2MI_DLET__CONFIG = UML2_APPLET__CONFIG;

	/**
	 * The number of structural features of the '<em>UML2MI Dlet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2MI_DLET_FEATURE_COUNT = UML2_APPLET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.transformations.SaveModelType <em>Save Model Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.transformations.SaveModelType
	 * @see be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl#getSaveModelType()
	 * @generated
	 */
	int SAVE_MODEL_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.transformations.TransformationConfig <em>Transformation Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Config</em>'.
	 * @see be.ac.vub.uml2cs.transformations.TransformationConfig
	 * @generated
	 */
	EClass getTransformationConfig();

	/**
	 * Returns the meta object for the containment reference '{@link be.ac.vub.uml2cs.transformations.TransformationConfig#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping</em>'.
	 * @see be.ac.vub.uml2cs.transformations.TransformationConfig#getMapping()
	 * @see #getTransformationConfig()
	 * @generated
	 */
	EReference getTransformationConfig_Mapping();

	/**
	 * Returns the meta object for the attribute '{@link be.ac.vub.uml2cs.transformations.TransformationConfig#getSaveModels <em>Save Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Save Models</em>'.
	 * @see be.ac.vub.uml2cs.transformations.TransformationConfig#getSaveModels()
	 * @see #getTransformationConfig()
	 * @generated
	 */
	EAttribute getTransformationConfig_SaveModels();

	/**
	 * Returns the meta object for the containment reference '{@link be.ac.vub.uml2cs.transformations.TransformationConfig#getObserver <em>Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Observer</em>'.
	 * @see be.ac.vub.uml2cs.transformations.TransformationConfig#getObserver()
	 * @see #getTransformationConfig()
	 * @generated
	 */
	EReference getTransformationConfig_Observer();

	/**
	 * Returns the meta object for the containment reference '{@link be.ac.vub.uml2cs.transformations.TransformationConfig#getApplet <em>Applet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applet</em>'.
	 * @see be.ac.vub.uml2cs.transformations.TransformationConfig#getApplet()
	 * @see #getTransformationConfig()
	 * @generated
	 */
	EReference getTransformationConfig_Applet();

	/**
	 * Returns the meta object for the attribute '{@link be.ac.vub.uml2cs.transformations.TransformationConfig#getTargetProject <em>Target Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Project</em>'.
	 * @see be.ac.vub.uml2cs.transformations.TransformationConfig#getTargetProject()
	 * @see #getTransformationConfig()
	 * @generated
	 */
	EAttribute getTransformationConfig_TargetProject();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.transformations.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see be.ac.vub.uml2cs.transformations.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the container reference '{@link be.ac.vub.uml2cs.transformations.Mapping#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Config</em>'.
	 * @see be.ac.vub.uml2cs.transformations.Mapping#getConfig()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Config();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.transformations.JavaMapping <em>Java Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Mapping</em>'.
	 * @see be.ac.vub.uml2cs.transformations.JavaMapping
	 * @generated
	 */
	EClass getJavaMapping();

	/**
	 * Returns the meta object for the containment reference '{@link be.ac.vub.uml2cs.transformations.JavaMapping#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Types</em>'.
	 * @see be.ac.vub.uml2cs.transformations.JavaMapping#getDataTypes()
	 * @see #getJavaMapping()
	 * @generated
	 */
	EReference getJavaMapping_DataTypes();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.transformations.JavaDataTypes <em>Java Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Data Types</em>'.
	 * @see be.ac.vub.uml2cs.transformations.JavaDataTypes
	 * @generated
	 */
	EClass getJavaDataTypes();

	/**
	 * Returns the meta object for the container reference '{@link be.ac.vub.uml2cs.transformations.JavaDataTypes#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Mapping</em>'.
	 * @see be.ac.vub.uml2cs.transformations.JavaDataTypes#getMapping()
	 * @see #getJavaDataTypes()
	 * @generated
	 */
	EReference getJavaDataTypes_Mapping();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.transformations.Java1DataTypes <em>Java1 Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java1 Data Types</em>'.
	 * @see be.ac.vub.uml2cs.transformations.Java1DataTypes
	 * @generated
	 */
	EClass getJava1DataTypes();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.transformations.Java2DataTypes <em>Java2 Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java2 Data Types</em>'.
	 * @see be.ac.vub.uml2cs.transformations.Java2DataTypes
	 * @generated
	 */
	EClass getJava2DataTypes();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.transformations.UML2Observer <em>UML2 Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML2 Observer</em>'.
	 * @see be.ac.vub.uml2cs.transformations.UML2Observer
	 * @generated
	 */
	EClass getUML2Observer();

	/**
	 * Returns the meta object for the container reference '{@link be.ac.vub.uml2cs.transformations.UML2Observer#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Config</em>'.
	 * @see be.ac.vub.uml2cs.transformations.UML2Observer#getConfig()
	 * @see #getUML2Observer()
	 * @generated
	 */
	EReference getUML2Observer_Config();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.transformations.UML2JavaObserver <em>UML2 Java Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML2 Java Observer</em>'.
	 * @see be.ac.vub.uml2cs.transformations.UML2JavaObserver
	 * @generated
	 */
	EClass getUML2JavaObserver();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.transformations.UML2Applet <em>UML2 Applet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML2 Applet</em>'.
	 * @see be.ac.vub.uml2cs.transformations.UML2Applet
	 * @generated
	 */
	EClass getUML2Applet();

	/**
	 * Returns the meta object for the container reference '{@link be.ac.vub.uml2cs.transformations.UML2Applet#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Config</em>'.
	 * @see be.ac.vub.uml2cs.transformations.UML2Applet#getConfig()
	 * @see #getUML2Applet()
	 * @generated
	 */
	EReference getUML2Applet_Config();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.transformations.UML2MIDlet <em>UML2MI Dlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML2MI Dlet</em>'.
	 * @see be.ac.vub.uml2cs.transformations.UML2MIDlet
	 * @generated
	 */
	EClass getUML2MIDlet();

	/**
	 * Returns the meta object for enum '{@link be.ac.vub.uml2cs.transformations.SaveModelType <em>Save Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Save Model Type</em>'.
	 * @see be.ac.vub.uml2cs.transformations.SaveModelType
	 * @generated
	 */
	EEnum getSaveModelType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TransformationsFactory getTransformationsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals  {
		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.transformations.impl.TransformationConfigImpl <em>Transformation Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.transformations.impl.TransformationConfigImpl
		 * @see be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl#getTransformationConfig()
		 * @generated
		 */
		EClass TRANSFORMATION_CONFIG = eINSTANCE.getTransformationConfig();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_CONFIG__MAPPING = eINSTANCE.getTransformationConfig_Mapping();

		/**
		 * The meta object literal for the '<em><b>Save Models</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_CONFIG__SAVE_MODELS = eINSTANCE.getTransformationConfig_SaveModels();

		/**
		 * The meta object literal for the '<em><b>Observer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_CONFIG__OBSERVER = eINSTANCE.getTransformationConfig_Observer();

		/**
		 * The meta object literal for the '<em><b>Applet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_CONFIG__APPLET = eINSTANCE.getTransformationConfig_Applet();

		/**
		 * The meta object literal for the '<em><b>Target Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_CONFIG__TARGET_PROJECT = eINSTANCE.getTransformationConfig_TargetProject();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.transformations.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.transformations.impl.MappingImpl
		 * @see be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__CONFIG = eINSTANCE.getMapping_Config();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.transformations.impl.JavaMappingImpl <em>Java Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.transformations.impl.JavaMappingImpl
		 * @see be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl#getJavaMapping()
		 * @generated
		 */
		EClass JAVA_MAPPING = eINSTANCE.getJavaMapping();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_MAPPING__DATA_TYPES = eINSTANCE.getJavaMapping_DataTypes();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.transformations.impl.JavaDataTypesImpl <em>Java Data Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.transformations.impl.JavaDataTypesImpl
		 * @see be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl#getJavaDataTypes()
		 * @generated
		 */
		EClass JAVA_DATA_TYPES = eINSTANCE.getJavaDataTypes();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_DATA_TYPES__MAPPING = eINSTANCE.getJavaDataTypes_Mapping();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.transformations.impl.Java1DataTypesImpl <em>Java1 Data Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.transformations.impl.Java1DataTypesImpl
		 * @see be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl#getJava1DataTypes()
		 * @generated
		 */
		EClass JAVA1_DATA_TYPES = eINSTANCE.getJava1DataTypes();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.transformations.impl.Java2DataTypesImpl <em>Java2 Data Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.transformations.impl.Java2DataTypesImpl
		 * @see be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl#getJava2DataTypes()
		 * @generated
		 */
		EClass JAVA2_DATA_TYPES = eINSTANCE.getJava2DataTypes();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.transformations.impl.UML2ObserverImpl <em>UML2 Observer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.transformations.impl.UML2ObserverImpl
		 * @see be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl#getUML2Observer()
		 * @generated
		 */
		EClass UML2_OBSERVER = eINSTANCE.getUML2Observer();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML2_OBSERVER__CONFIG = eINSTANCE.getUML2Observer_Config();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.transformations.impl.UML2JavaObserverImpl <em>UML2 Java Observer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.transformations.impl.UML2JavaObserverImpl
		 * @see be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl#getUML2JavaObserver()
		 * @generated
		 */
		EClass UML2_JAVA_OBSERVER = eINSTANCE.getUML2JavaObserver();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.transformations.impl.UML2AppletImpl <em>UML2 Applet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.transformations.impl.UML2AppletImpl
		 * @see be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl#getUML2Applet()
		 * @generated
		 */
		EClass UML2_APPLET = eINSTANCE.getUML2Applet();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML2_APPLET__CONFIG = eINSTANCE.getUML2Applet_Config();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.transformations.impl.UML2MIDletImpl <em>UML2MI Dlet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.transformations.impl.UML2MIDletImpl
		 * @see be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl#getUML2MIDlet()
		 * @generated
		 */
		EClass UML2MI_DLET = eINSTANCE.getUML2MIDlet();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.transformations.SaveModelType <em>Save Model Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.transformations.SaveModelType
		 * @see be.ac.vub.uml2cs.transformations.impl.TransformationsPackageImpl#getSaveModelType()
		 * @generated
		 */
		EEnum SAVE_MODEL_TYPE = eINSTANCE.getSaveModelType();

	}

} //TransformationsPackage
