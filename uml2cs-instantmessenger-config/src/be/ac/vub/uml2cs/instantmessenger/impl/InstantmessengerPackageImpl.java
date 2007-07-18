/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.instantmessenger.impl;

import be.ac.vub.uml2cs.instantmessenger.AWTUserInterface;
import be.ac.vub.uml2cs.instantmessenger.DefaultJabberTransport;
import be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration;
import be.ac.vub.uml2cs.instantmessenger.InstantmessengerFactory;
import be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage;
import be.ac.vub.uml2cs.instantmessenger.IpkgAppletPackaging;
import be.ac.vub.uml2cs.instantmessenger.JabberNetwork;
import be.ac.vub.uml2cs.instantmessenger.JabberTransport;
import be.ac.vub.uml2cs.instantmessenger.LCDUIUserInterface;
import be.ac.vub.uml2cs.instantmessenger.LocalNetwork;
import be.ac.vub.uml2cs.instantmessenger.MEJabberTransport;
import be.ac.vub.uml2cs.instantmessenger.MIDletPackaging;
import be.ac.vub.uml2cs.instantmessenger.Packaging;
import be.ac.vub.uml2cs.instantmessenger.SwingUserInterface;
import be.ac.vub.uml2cs.instantmessenger.UserInterface;
import be.ac.vub.uml2cs.instantmessenger.WebAppletPackaging;

import be.ac.vub.uml2cs.transformations.TransformationsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstantmessengerPackageImpl extends EPackageImpl implements InstantmessengerPackage {
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
	private EClass instantMessengerConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jabberNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jabberTransportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultJabberTransportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meJabberTransportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awtUserInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swingUserInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lcduiUserInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packagingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webAppletPackagingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipkgAppletPackagingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miDletPackagingEClass = null;

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
	 * @see be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InstantmessengerPackageImpl() {
		super(eNS_URI, InstantmessengerFactory.eINSTANCE);
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
	public static InstantmessengerPackage init() {
		if (isInited) return (InstantmessengerPackage)EPackage.Registry.INSTANCE.getEPackage(InstantmessengerPackage.eNS_URI);

		// Obtain or create and register package
		InstantmessengerPackageImpl theInstantmessengerPackage = (InstantmessengerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof InstantmessengerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new InstantmessengerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TransformationsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theInstantmessengerPackage.createPackageContents();

		// Initialize created meta-data
		theInstantmessengerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInstantmessengerPackage.freeze();

		return theInstantmessengerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstantMessengerConfiguration() {
		return instantMessengerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstantMessengerConfiguration_DeploymentTarget() {
		return (EAttribute)instantMessengerConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstantMessengerConfiguration_LocalNetwork() {
		return (EReference)instantMessengerConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstantMessengerConfiguration_JabberNetwork() {
		return (EReference)instantMessengerConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstantMessengerConfiguration_UserInterface() {
		return (EReference)instantMessengerConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstantMessengerConfiguration_Packaging() {
		return (EReference)instantMessengerConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalNetwork() {
		return localNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalNetwork_Config() {
		return (EReference)localNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJabberNetwork() {
		return jabberNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJabberNetwork_JabberTransport() {
		return (EReference)jabberNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJabberNetwork_Config() {
		return (EReference)jabberNetworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJabberTransport() {
		return jabberTransportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJabberTransport_JabberNetwork() {
		return (EReference)jabberTransportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultJabberTransport() {
		return defaultJabberTransportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMEJabberTransport() {
		return meJabberTransportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserInterface() {
		return userInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserInterface_Config() {
		return (EReference)userInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAWTUserInterface() {
		return awtUserInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwingUserInterface() {
		return swingUserInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLCDUIUserInterface() {
		return lcduiUserInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackaging() {
		return packagingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackaging_Config() {
		return (EReference)packagingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebAppletPackaging() {
		return webAppletPackagingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIpkgAppletPackaging() {
		return ipkgAppletPackagingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMIDletPackaging() {
		return miDletPackagingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantmessengerFactory getInstantmessengerFactory() {
		return (InstantmessengerFactory)getEFactoryInstance();
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
		instantMessengerConfigurationEClass = createEClass(INSTANT_MESSENGER_CONFIGURATION);
		createEAttribute(instantMessengerConfigurationEClass, INSTANT_MESSENGER_CONFIGURATION__DEPLOYMENT_TARGET);
		createEReference(instantMessengerConfigurationEClass, INSTANT_MESSENGER_CONFIGURATION__LOCAL_NETWORK);
		createEReference(instantMessengerConfigurationEClass, INSTANT_MESSENGER_CONFIGURATION__JABBER_NETWORK);
		createEReference(instantMessengerConfigurationEClass, INSTANT_MESSENGER_CONFIGURATION__USER_INTERFACE);
		createEReference(instantMessengerConfigurationEClass, INSTANT_MESSENGER_CONFIGURATION__PACKAGING);

		localNetworkEClass = createEClass(LOCAL_NETWORK);
		createEReference(localNetworkEClass, LOCAL_NETWORK__CONFIG);

		jabberNetworkEClass = createEClass(JABBER_NETWORK);
		createEReference(jabberNetworkEClass, JABBER_NETWORK__JABBER_TRANSPORT);
		createEReference(jabberNetworkEClass, JABBER_NETWORK__CONFIG);

		jabberTransportEClass = createEClass(JABBER_TRANSPORT);
		createEReference(jabberTransportEClass, JABBER_TRANSPORT__JABBER_NETWORK);

		defaultJabberTransportEClass = createEClass(DEFAULT_JABBER_TRANSPORT);

		meJabberTransportEClass = createEClass(ME_JABBER_TRANSPORT);

		userInterfaceEClass = createEClass(USER_INTERFACE);
		createEReference(userInterfaceEClass, USER_INTERFACE__CONFIG);

		awtUserInterfaceEClass = createEClass(AWT_USER_INTERFACE);

		swingUserInterfaceEClass = createEClass(SWING_USER_INTERFACE);

		lcduiUserInterfaceEClass = createEClass(LCDUI_USER_INTERFACE);

		packagingEClass = createEClass(PACKAGING);
		createEReference(packagingEClass, PACKAGING__CONFIG);

		webAppletPackagingEClass = createEClass(WEB_APPLET_PACKAGING);

		ipkgAppletPackagingEClass = createEClass(IPKG_APPLET_PACKAGING);

		miDletPackagingEClass = createEClass(MI_DLET_PACKAGING);
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

		// Obtain other dependent packages
		TransformationsPackage theTransformationsPackage = (TransformationsPackage)EPackage.Registry.INSTANCE.getEPackage(TransformationsPackage.eNS_URI);

		// Add supertypes to classes
		instantMessengerConfigurationEClass.getESuperTypes().add(theTransformationsPackage.getTransformationConfig());
		defaultJabberTransportEClass.getESuperTypes().add(this.getJabberTransport());
		meJabberTransportEClass.getESuperTypes().add(this.getJabberTransport());
		awtUserInterfaceEClass.getESuperTypes().add(this.getUserInterface());
		swingUserInterfaceEClass.getESuperTypes().add(this.getUserInterface());
		lcduiUserInterfaceEClass.getESuperTypes().add(this.getUserInterface());
		webAppletPackagingEClass.getESuperTypes().add(this.getPackaging());
		ipkgAppletPackagingEClass.getESuperTypes().add(this.getPackaging());
		miDletPackagingEClass.getESuperTypes().add(this.getPackaging());

		// Initialize classes and features; add operations and parameters
		initEClass(instantMessengerConfigurationEClass, InstantMessengerConfiguration.class, "InstantMessengerConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstantMessengerConfiguration_DeploymentTarget(), ecorePackage.getEString(), "deploymentTarget", null, 1, 1, InstantMessengerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstantMessengerConfiguration_LocalNetwork(), this.getLocalNetwork(), this.getLocalNetwork_Config(), "localNetwork", "", 0, 1, InstantMessengerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstantMessengerConfiguration_JabberNetwork(), this.getJabberNetwork(), this.getJabberNetwork_Config(), "jabberNetwork", null, 0, 1, InstantMessengerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstantMessengerConfiguration_UserInterface(), this.getUserInterface(), this.getUserInterface_Config(), "userInterface", null, 1, -1, InstantMessengerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstantMessengerConfiguration_Packaging(), this.getPackaging(), this.getPackaging_Config(), "packaging", null, 1, 1, InstantMessengerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localNetworkEClass, LocalNetwork.class, "LocalNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalNetwork_Config(), this.getInstantMessengerConfiguration(), this.getInstantMessengerConfiguration_LocalNetwork(), "config", null, 1, 1, LocalNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jabberNetworkEClass, JabberNetwork.class, "JabberNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJabberNetwork_JabberTransport(), this.getJabberTransport(), this.getJabberTransport_JabberNetwork(), "jabberTransport", "", 1, 1, JabberNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJabberNetwork_Config(), this.getInstantMessengerConfiguration(), this.getInstantMessengerConfiguration_JabberNetwork(), "config", null, 1, 1, JabberNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jabberTransportEClass, JabberTransport.class, "JabberTransport", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJabberTransport_JabberNetwork(), this.getJabberNetwork(), this.getJabberNetwork_JabberTransport(), "jabberNetwork", null, 1, 1, JabberTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultJabberTransportEClass, DefaultJabberTransport.class, "DefaultJabberTransport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(meJabberTransportEClass, MEJabberTransport.class, "MEJabberTransport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userInterfaceEClass, UserInterface.class, "UserInterface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserInterface_Config(), this.getInstantMessengerConfiguration(), this.getInstantMessengerConfiguration_UserInterface(), "config", null, 1, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awtUserInterfaceEClass, AWTUserInterface.class, "AWTUserInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(swingUserInterfaceEClass, SwingUserInterface.class, "SwingUserInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lcduiUserInterfaceEClass, LCDUIUserInterface.class, "LCDUIUserInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(packagingEClass, Packaging.class, "Packaging", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackaging_Config(), this.getInstantMessengerConfiguration(), this.getInstantMessengerConfiguration_Packaging(), "config", null, 1, 1, Packaging.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webAppletPackagingEClass, WebAppletPackaging.class, "WebAppletPackaging", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ipkgAppletPackagingEClass, IpkgAppletPackaging.class, "IpkgAppletPackaging", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(miDletPackagingEClass, MIDletPackaging.class, "MIDletPackaging", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// CDDToolkit
		createCDDToolkitAnnotations();
		// PlatformKit
		createPlatformKitAnnotations();
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
			 "Ontology", "InstantMessenger.owl"
		   });				
		addAnnotation
		  (instantMessengerConfigurationEClass, 
		   source, 
		   new String[] {
			 "ContextConstraint", "http://local/InstantMessenger.owl#InstantMessengerPlatform"
		   });			
		addAnnotation
		  (localNetworkEClass, 
		   source, 
		   new String[] {
			 "ContextConstraint", "http://local/InstantMessenger.owl#LocalPlatform"
		   });			
		addAnnotation
		  (jabberNetworkEClass, 
		   source, 
		   new String[] {
			 "ContextConstraint", "http://local/InstantMessenger.owl#JabberPlatform"
		   });			
		addAnnotation
		  (defaultJabberTransportEClass, 
		   source, 
		   new String[] {
			 "ContextConstraint", "http://local/InstantMessenger.owl#DefaultJabberPlatform"
		   });			
		addAnnotation
		  (meJabberTransportEClass, 
		   source, 
		   new String[] {
			 "ContextConstraint", "http://local/InstantMessenger.owl#MEJabberPlatform"
		   });			
		addAnnotation
		  (awtUserInterfaceEClass, 
		   source, 
		   new String[] {
			 "ContextConstraint", "http://local/InstantMessenger.owl#AWTPlatform"
		   });			
		addAnnotation
		  (swingUserInterfaceEClass, 
		   source, 
		   new String[] {
			 "ContextConstraint", "http://local/InstantMessenger.owl#SwingPlatform"
		   });			
		addAnnotation
		  (lcduiUserInterfaceEClass, 
		   source, 
		   new String[] {
			 "ContextConstraint", "http://local/InstantMessenger.owl#LCDUIPlatform"
		   });			
		addAnnotation
		  (webAppletPackagingEClass, 
		   source, 
		   new String[] {
			 "ContextConstraint", "http://local/InstantMessenger.owl#WebAppletPlatform"
		   });			
		addAnnotation
		  (ipkgAppletPackagingEClass, 
		   source, 
		   new String[] {
			 "ContextConstraint", "http://local/InstantMessenger.owl#IpkgAppletPlatform"
		   });			
		addAnnotation
		  (miDletPackagingEClass, 
		   source, 
		   new String[] {
			 "ContextConstraint", "http://local/InstantMessenger.owl#MIDletPlatform"
		   });	
	}

	/**
	 * Initializes the annotations for <b>PlatformKit</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPlatformKitAnnotations() {
		String source = "PlatformKit";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "Ontology", "InstantMessenger.owl"
		   });				
		addAnnotation
		  (instantMessengerConfigurationEClass, 
		   source, 
		   new String[] {
			 "PlatformConstraint", "http://local/InstantMessenger.owl#InstantMessengerPlatform"
		   });			
		addAnnotation
		  (localNetworkEClass, 
		   source, 
		   new String[] {
			 "PlatformConstraint", "http://local/InstantMessenger.owl#LocalPlatform"
		   });			
		addAnnotation
		  (jabberNetworkEClass, 
		   source, 
		   new String[] {
			 "PlatformConstraint", "http://local/InstantMessenger.owl#JabberPlatform"
		   });			
		addAnnotation
		  (defaultJabberTransportEClass, 
		   source, 
		   new String[] {
			 "PlatformConstraint", "http://local/InstantMessenger.owl#DefaultJabberPlatform"
		   });			
		addAnnotation
		  (meJabberTransportEClass, 
		   source, 
		   new String[] {
			 "PlatformConstraint", "http://local/InstantMessenger.owl#MEJabberPlatform"
		   });			
		addAnnotation
		  (awtUserInterfaceEClass, 
		   source, 
		   new String[] {
			 "PlatformConstraint", "http://local/InstantMessenger.owl#AWTPlatform"
		   });			
		addAnnotation
		  (swingUserInterfaceEClass, 
		   source, 
		   new String[] {
			 "PlatformConstraint", "http://local/InstantMessenger.owl#SwingPlatform"
		   });			
		addAnnotation
		  (lcduiUserInterfaceEClass, 
		   source, 
		   new String[] {
			 "PlatformConstraint", "http://local/InstantMessenger.owl#LCDUIPlatform"
		   });			
		addAnnotation
		  (webAppletPackagingEClass, 
		   source, 
		   new String[] {
			 "PlatformConstraint", "http://local/InstantMessenger.owl#WebAppletPlatform"
		   });			
		addAnnotation
		  (ipkgAppletPackagingEClass, 
		   source, 
		   new String[] {
			 "PlatformConstraint", "http://local/InstantMessenger.owl#IpkgAppletPlatform"
		   });			
		addAnnotation
		  (miDletPackagingEClass, 
		   source, 
		   new String[] {
			 "PlatformConstraint", "http://local/InstantMessenger.owl#MIDletPlatform"
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
		  (instantMessengerConfigurationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Root node for an instant messenger configuration model"
		   });																						
	}

} //InstantmessengerPackageImpl
