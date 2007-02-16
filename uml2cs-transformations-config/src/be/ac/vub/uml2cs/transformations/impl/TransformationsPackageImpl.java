/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.transformations.impl;

import be.ac.vub.uml2cs.transformations.Java1DataTypes;
import be.ac.vub.uml2cs.transformations.Java2DataTypes;
import be.ac.vub.uml2cs.transformations.JavaDataTypes;
import be.ac.vub.uml2cs.transformations.JavaMapping;
import be.ac.vub.uml2cs.transformations.Mapping;
import be.ac.vub.uml2cs.transformations.SaveModelType;
import be.ac.vub.uml2cs.transformations.TransformationConfig;
import be.ac.vub.uml2cs.transformations.TransformationsFactory;
import be.ac.vub.uml2cs.transformations.TransformationsPackage;
import be.ac.vub.uml2cs.transformations.UML2Applet;
import be.ac.vub.uml2cs.transformations.UML2JavaObserver;
import be.ac.vub.uml2cs.transformations.UML2MIDlet;
import be.ac.vub.uml2cs.transformations.UML2Observer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformationsPackageImpl extends EPackageImpl implements TransformationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(C) 2007, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaDataTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java1DataTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2DataTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uml2ObserverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uml2JavaObserverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uml2AppletEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uml2MIDletEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum saveModelTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see be.ac.vub.uml2cs.transformations.TransformationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TransformationsPackageImpl() {
		super(eNS_URI, TransformationsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TransformationsPackage init() {
		if (isInited) return (TransformationsPackage)EPackage.Registry.INSTANCE.getEPackage(TransformationsPackage.eNS_URI);

		// Obtain or create and register package
		TransformationsPackageImpl theTransformationsPackage = (TransformationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof TransformationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new TransformationsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTransformationsPackage.createPackageContents();

		// Initialize created meta-data
		theTransformationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTransformationsPackage.freeze();

		return theTransformationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformationConfig() {
		return transformationConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationConfig_BuildPath() {
		return (EAttribute)transformationConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationConfig_TargetPath() {
		return (EAttribute)transformationConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationConfig_Mapping() {
		return (EReference)transformationConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationConfig_SaveModels() {
		return (EAttribute)transformationConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationConfig_Observer() {
		return (EReference)transformationConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationConfig_Applet() {
		return (EReference)transformationConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Config() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaMapping() {
		return javaMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaMapping_DataTypes() {
		return (EReference)javaMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaDataTypes() {
		return javaDataTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaDataTypes_Mapping() {
		return (EReference)javaDataTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJava1DataTypes() {
		return java1DataTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJava2DataTypes() {
		return java2DataTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUML2Observer() {
		return uml2ObserverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUML2Observer_Config() {
		return (EReference)uml2ObserverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUML2JavaObserver() {
		return uml2JavaObserverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUML2Applet() {
		return uml2AppletEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUML2Applet_Config() {
		return (EReference)uml2AppletEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUML2MIDlet() {
		return uml2MIDletEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSaveModelType() {
		return saveModelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationsFactory getTransformationsFactory() {
		return (TransformationsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		transformationConfigEClass = createEClass(TRANSFORMATION_CONFIG);
		createEAttribute(transformationConfigEClass, TRANSFORMATION_CONFIG__BUILD_PATH);
		createEAttribute(transformationConfigEClass, TRANSFORMATION_CONFIG__TARGET_PATH);
		createEReference(transformationConfigEClass, TRANSFORMATION_CONFIG__MAPPING);
		createEAttribute(transformationConfigEClass, TRANSFORMATION_CONFIG__SAVE_MODELS);
		createEReference(transformationConfigEClass, TRANSFORMATION_CONFIG__OBSERVER);
		createEReference(transformationConfigEClass, TRANSFORMATION_CONFIG__APPLET);

		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__CONFIG);

		javaMappingEClass = createEClass(JAVA_MAPPING);
		createEReference(javaMappingEClass, JAVA_MAPPING__DATA_TYPES);

		javaDataTypesEClass = createEClass(JAVA_DATA_TYPES);
		createEReference(javaDataTypesEClass, JAVA_DATA_TYPES__MAPPING);

		java1DataTypesEClass = createEClass(JAVA1_DATA_TYPES);

		java2DataTypesEClass = createEClass(JAVA2_DATA_TYPES);

		uml2ObserverEClass = createEClass(UML2_OBSERVER);
		createEReference(uml2ObserverEClass, UML2_OBSERVER__CONFIG);

		uml2JavaObserverEClass = createEClass(UML2_JAVA_OBSERVER);

		uml2AppletEClass = createEClass(UML2_APPLET);
		createEReference(uml2AppletEClass, UML2_APPLET__CONFIG);

		uml2MIDletEClass = createEClass(UML2MI_DLET);

		// Create enums
		saveModelTypeEEnum = createEEnum(SAVE_MODEL_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes
		javaMappingEClass.getESuperTypes().add(this.getMapping());
		java1DataTypesEClass.getESuperTypes().add(this.getJavaDataTypes());
		java2DataTypesEClass.getESuperTypes().add(this.getJavaDataTypes());
		uml2JavaObserverEClass.getESuperTypes().add(this.getUML2Observer());
		uml2MIDletEClass.getESuperTypes().add(this.getUML2Applet());

		// Initialize classes and features; add operations and parameters
		initEClass(transformationConfigEClass, TransformationConfig.class, "TransformationConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformationConfig_BuildPath(), ecorePackage.getEString(), "buildPath", null, 1, 1, TransformationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformationConfig_TargetPath(), ecorePackage.getEString(), "targetPath", null, 1, 1, TransformationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationConfig_Mapping(), this.getMapping(), this.getMapping_Config(), "mapping", null, 1, 1, TransformationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformationConfig_SaveModels(), this.getSaveModelType(), "saveModels", null, 1, 1, TransformationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationConfig_Observer(), this.getUML2Observer(), this.getUML2Observer_Config(), "observer", null, 1, 1, TransformationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationConfig_Applet(), this.getUML2Applet(), this.getUML2Applet_Config(), "applet", null, 1, 1, TransformationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEClass, Mapping.class, "Mapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapping_Config(), this.getTransformationConfig(), this.getTransformationConfig_Mapping(), "config", null, 1, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaMappingEClass, JavaMapping.class, "JavaMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaMapping_DataTypes(), this.getJavaDataTypes(), this.getJavaDataTypes_Mapping(), "dataTypes", null, 1, 1, JavaMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaDataTypesEClass, JavaDataTypes.class, "JavaDataTypes", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaDataTypes_Mapping(), this.getJavaMapping(), this.getJavaMapping_DataTypes(), "mapping", null, 1, 1, JavaDataTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(java1DataTypesEClass, Java1DataTypes.class, "Java1DataTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(java2DataTypesEClass, Java2DataTypes.class, "Java2DataTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uml2ObserverEClass, UML2Observer.class, "UML2Observer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUML2Observer_Config(), this.getTransformationConfig(), this.getTransformationConfig_Observer(), "config", null, 1, 1, UML2Observer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uml2JavaObserverEClass, UML2JavaObserver.class, "UML2JavaObserver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uml2AppletEClass, UML2Applet.class, "UML2Applet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUML2Applet_Config(), this.getTransformationConfig(), this.getTransformationConfig_Applet(), "config", null, 1, 1, UML2Applet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uml2MIDletEClass, UML2MIDlet.class, "UML2MIDlet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(saveModelTypeEEnum, SaveModelType.class, "SaveModelType");
		addEEnumLiteral(saveModelTypeEEnum, SaveModelType.NONE_LITERAL);
		addEEnumLiteral(saveModelTypeEEnum, SaveModelType.LAST_LITERAL);
		addEEnumLiteral(saveModelTypeEEnum, SaveModelType.ALL_LITERAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// CDDToolkit
		createCDDToolkitAnnotations();
		// GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>CDDToolkit</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCDDToolkitAnnotations() {
		String source = "CDDToolkit";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "Ontology", "Transformations.owl"
		   });											
		addAnnotation
		  (javaMappingEClass, 
		   source, 
		   new String[] {
			 "ContextConstraint", "http://local/Transformations.owl#JavaMappingsPlatform"
		   });				
		addAnnotation
		  (java1DataTypesEClass, 
		   source, 
		   new String[] {
			 "ContextConstraint", "http://local/Transformations.owl#Java1Platform"
		   });			
		addAnnotation
		  (java2DataTypesEClass, 
		   source, 
		   new String[] {
			 "ContextConstraint", "http://local/Transformations.owl#Java2Platform"
		   });				
		addAnnotation
		  (uml2JavaObserverEClass, 
		   source, 
		   new String[] {
			 "ContextConstraint", "http://local/Transformations.owl#JavaObserverPlatform"
		   });			
		addAnnotation
		  (uml2AppletEClass, 
		   source, 
		   new String[] {
			 "ContextConstraint", "http://local/Transformations.owl#AppletPlatform"
		   });			
		addAnnotation
		  (uml2MIDletEClass, 
		   source, 
		   new String[] {
			 "ContextConstraint", "http://local/Transformations.owl#MIDletPlatform"
		   });	
	}

	/**
	 * Initializes the annotations for <b>GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "GenModel";			
		addAnnotation
		  (transformationConfigEClass, 
		   source, 
		   new String[] {
			 "documentation", "Root node for a transformation configuration model"
		   });		
		addAnnotation
		  (getTransformationConfig_BuildPath(), 
		   source, 
		   new String[] {
			 "documentation", "Path to store the generated build files"
		   });		
		addAnnotation
		  (getTransformationConfig_TargetPath(), 
		   source, 
		   new String[] {
			 "documentation", "Path to write the generated code to"
		   });		
		addAnnotation
		  (getTransformationConfig_Mapping(), 
		   source, 
		   new String[] {
			 "documentation", "Programming language mapping to use"
		   });		
		addAnnotation
		  (getTransformationConfig_SaveModels(), 
		   source, 
		   new String[] {
			 "documentation", "Select whether to save all intermediate models, save only the last model or don\'t save models"
		   });		
		addAnnotation
		  (getTransformationConfig_Observer(), 
		   source, 
		   new String[] {
			 "documentation", "Variant of UML2Observer transformation to use"
		   });		
		addAnnotation
		  (getTransformationConfig_Applet(), 
		   source, 
		   new String[] {
			 "documentation", "Variant of UML2Applet transformation to use"
		   });		
		addAnnotation
		  (mappingEClass, 
		   source, 
		   new String[] {
			 "documentation", "Programming language mapping"
		   });		
		addAnnotation
		  (javaMappingEClass, 
		   source, 
		   new String[] {
			 "documentation", "Java language mapping"
		   });			
		addAnnotation
		  (javaDataTypesEClass, 
		   source, 
		   new String[] {
			 "documentation", "Java language data types"
		   });		
		addAnnotation
		  (java1DataTypesEClass, 
		   source, 
		   new String[] {
			 "documentation", "Java 1.0 data types"
		   });			
		addAnnotation
		  (java2DataTypesEClass, 
		   source, 
		   new String[] {
			 "documentation", "Java 1.2 data types"
		   });			
		addAnnotation
		  (uml2ObserverEClass, 
		   source, 
		   new String[] {
			 "documentation", "Implements the Observer profile"
		   });		
		addAnnotation
		  (uml2JavaObserverEClass, 
		   source, 
		   new String[] {
			 "documentation", "Implements the Observer profile using the java.util.Observer API"
		   });			
		addAnnotation
		  (uml2AppletEClass, 
		   source, 
		   new String[] {
			 "documentation", "Implements the Applet profile using a Java AWT Applet"
		   });			
		addAnnotation
		  (uml2MIDletEClass, 
		   source, 
		   new String[] {
			 "documentation", "Implements the Applet profile using a Java MIDP MIDlet"
		   });			
		addAnnotation
		  (saveModelTypeEEnum, 
		   source, 
		   new String[] {
			 "documentation", "Save all intermediate models, only the last model or no models (generate code only)"
		   });
	}

} //TransformationsPackageImpl
