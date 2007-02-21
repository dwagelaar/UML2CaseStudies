/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.instantmessenger;

import be.ac.vub.uml2cs.transformations.TransformationsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see be.ac.vub.uml2cs.instantmessenger.InstantmessengerFactory
 * @model kind="package"
 *        annotation="CDDToolkit Ontology='InstantMessenger.owl'"
 *        annotation="PlatformKit Ontology='InstantMessenger.owl'"
 * @generated
 */
public interface InstantmessengerPackage extends EPackage {
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
	String eNAME = "instantmessenger";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ssel.vub.ac.be/uml2cs/InstantMessenger";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "instantmessenger";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstantmessengerPackage eINSTANCE = be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl.init();

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.InstantMessengerConfigurationImpl <em>Instant Messenger Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantMessengerConfigurationImpl
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getInstantMessengerConfiguration()
	 * @generated
	 */
	int INSTANT_MESSENGER_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Build Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER_CONFIGURATION__BUILD_PATH = TransformationsPackage.TRANSFORMATION_CONFIG__BUILD_PATH;

	/**
	 * The feature id for the '<em><b>Target Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER_CONFIGURATION__TARGET_PATH = TransformationsPackage.TRANSFORMATION_CONFIG__TARGET_PATH;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER_CONFIGURATION__MAPPING = TransformationsPackage.TRANSFORMATION_CONFIG__MAPPING;

	/**
	 * The feature id for the '<em><b>Save Models</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER_CONFIGURATION__SAVE_MODELS = TransformationsPackage.TRANSFORMATION_CONFIG__SAVE_MODELS;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER_CONFIGURATION__OBSERVER = TransformationsPackage.TRANSFORMATION_CONFIG__OBSERVER;

	/**
	 * The feature id for the '<em><b>Applet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER_CONFIGURATION__APPLET = TransformationsPackage.TRANSFORMATION_CONFIG__APPLET;

	/**
	 * The feature id for the '<em><b>Deployment Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER_CONFIGURATION__DEPLOYMENT_TARGET = TransformationsPackage.TRANSFORMATION_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Local Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER_CONFIGURATION__LOCAL_NETWORK = TransformationsPackage.TRANSFORMATION_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jabber Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER_CONFIGURATION__JABBER_NETWORK = TransformationsPackage.TRANSFORMATION_CONFIG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER_CONFIGURATION__USER_INTERFACE = TransformationsPackage.TRANSFORMATION_CONFIG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Packaging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER_CONFIGURATION__PACKAGING = TransformationsPackage.TRANSFORMATION_CONFIG_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Instant Messenger Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER_CONFIGURATION_FEATURE_COUNT = TransformationsPackage.TRANSFORMATION_CONFIG_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.LocalNetworkImpl <em>Local Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.LocalNetworkImpl
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getLocalNetwork()
	 * @generated
	 */
	int LOCAL_NETWORK = 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_NETWORK__CONFIG = 0;

	/**
	 * The number of structural features of the '<em>Local Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_NETWORK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.JabberNetworkImpl <em>Jabber Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.JabberNetworkImpl
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getJabberNetwork()
	 * @generated
	 */
	int JABBER_NETWORK = 2;

	/**
	 * The feature id for the '<em><b>Jabber Transport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JABBER_NETWORK__JABBER_TRANSPORT = 0;

	/**
	 * The feature id for the '<em><b>Config</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JABBER_NETWORK__CONFIG = 1;

	/**
	 * The number of structural features of the '<em>Jabber Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JABBER_NETWORK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.JabberTransportImpl <em>Jabber Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.JabberTransportImpl
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getJabberTransport()
	 * @generated
	 */
	int JABBER_TRANSPORT = 3;

	/**
	 * The feature id for the '<em><b>Jabber Network</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JABBER_TRANSPORT__JABBER_NETWORK = 0;

	/**
	 * The number of structural features of the '<em>Jabber Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JABBER_TRANSPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.DefaultJabberTransportImpl <em>Default Jabber Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.DefaultJabberTransportImpl
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getDefaultJabberTransport()
	 * @generated
	 */
	int DEFAULT_JABBER_TRANSPORT = 4;

	/**
	 * The feature id for the '<em><b>Jabber Network</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_JABBER_TRANSPORT__JABBER_NETWORK = JABBER_TRANSPORT__JABBER_NETWORK;

	/**
	 * The number of structural features of the '<em>Default Jabber Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_JABBER_TRANSPORT_FEATURE_COUNT = JABBER_TRANSPORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.MEJabberTransportImpl <em>ME Jabber Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.MEJabberTransportImpl
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getMEJabberTransport()
	 * @generated
	 */
	int ME_JABBER_TRANSPORT = 5;

	/**
	 * The feature id for the '<em><b>Jabber Network</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ME_JABBER_TRANSPORT__JABBER_NETWORK = JABBER_TRANSPORT__JABBER_NETWORK;

	/**
	 * The number of structural features of the '<em>ME Jabber Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ME_JABBER_TRANSPORT_FEATURE_COUNT = JABBER_TRANSPORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.UserInterfaceImpl <em>User Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.UserInterfaceImpl
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getUserInterface()
	 * @generated
	 */
	int USER_INTERFACE = 6;

	/**
	 * The feature id for the '<em><b>Config</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__CONFIG = 0;

	/**
	 * The number of structural features of the '<em>User Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.AWTUserInterfaceImpl <em>AWT User Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.AWTUserInterfaceImpl
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getAWTUserInterface()
	 * @generated
	 */
	int AWT_USER_INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Config</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWT_USER_INTERFACE__CONFIG = USER_INTERFACE__CONFIG;

	/**
	 * The number of structural features of the '<em>AWT User Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWT_USER_INTERFACE_FEATURE_COUNT = USER_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.SwingUserInterfaceImpl <em>Swing User Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.SwingUserInterfaceImpl
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getSwingUserInterface()
	 * @generated
	 */
	int SWING_USER_INTERFACE = 8;

	/**
	 * The feature id for the '<em><b>Config</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWING_USER_INTERFACE__CONFIG = USER_INTERFACE__CONFIG;

	/**
	 * The number of structural features of the '<em>Swing User Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWING_USER_INTERFACE_FEATURE_COUNT = USER_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.LCDUIUserInterfaceImpl <em>LCDUI User Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.LCDUIUserInterfaceImpl
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getLCDUIUserInterface()
	 * @generated
	 */
	int LCDUI_USER_INTERFACE = 9;

	/**
	 * The feature id for the '<em><b>Config</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCDUI_USER_INTERFACE__CONFIG = USER_INTERFACE__CONFIG;

	/**
	 * The number of structural features of the '<em>LCDUI User Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCDUI_USER_INTERFACE_FEATURE_COUNT = USER_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.PackagingImpl <em>Packaging</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.PackagingImpl
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getPackaging()
	 * @generated
	 */
	int PACKAGING = 10;

	/**
	 * The feature id for the '<em><b>Config</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGING__CONFIG = 0;

	/**
	 * The number of structural features of the '<em>Packaging</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.WebAppletPackagingImpl <em>Web Applet Packaging</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.WebAppletPackagingImpl
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getWebAppletPackaging()
	 * @generated
	 */
	int WEB_APPLET_PACKAGING = 11;

	/**
	 * The feature id for the '<em><b>Config</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLET_PACKAGING__CONFIG = PACKAGING__CONFIG;

	/**
	 * The number of structural features of the '<em>Web Applet Packaging</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLET_PACKAGING_FEATURE_COUNT = PACKAGING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.IpkgAppletPackagingImpl <em>Ipkg Applet Packaging</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.IpkgAppletPackagingImpl
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getIpkgAppletPackaging()
	 * @generated
	 */
	int IPKG_APPLET_PACKAGING = 12;

	/**
	 * The feature id for the '<em><b>Config</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPKG_APPLET_PACKAGING__CONFIG = PACKAGING__CONFIG;

	/**
	 * The number of structural features of the '<em>Ipkg Applet Packaging</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPKG_APPLET_PACKAGING_FEATURE_COUNT = PACKAGING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.MIDletPackagingImpl <em>MI Dlet Packaging</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.MIDletPackagingImpl
	 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getMIDletPackaging()
	 * @generated
	 */
	int MI_DLET_PACKAGING = 13;

	/**
	 * The feature id for the '<em><b>Config</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MI_DLET_PACKAGING__CONFIG = PACKAGING__CONFIG;

	/**
	 * The number of structural features of the '<em>MI Dlet Packaging</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MI_DLET_PACKAGING_FEATURE_COUNT = PACKAGING_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration <em>Instant Messenger Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instant Messenger Configuration</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration
	 * @generated
	 */
	EClass getInstantMessengerConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getDeploymentTarget <em>Deployment Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployment Target</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getDeploymentTarget()
	 * @see #getInstantMessengerConfiguration()
	 * @generated
	 */
	EAttribute getInstantMessengerConfiguration_DeploymentTarget();

	/**
	 * Returns the meta object for the containment reference '{@link be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getLocalNetwork <em>Local Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Network</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getLocalNetwork()
	 * @see #getInstantMessengerConfiguration()
	 * @generated
	 */
	EReference getInstantMessengerConfiguration_LocalNetwork();

	/**
	 * Returns the meta object for the containment reference '{@link be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getJabberNetwork <em>Jabber Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jabber Network</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getJabberNetwork()
	 * @see #getInstantMessengerConfiguration()
	 * @generated
	 */
	EReference getInstantMessengerConfiguration_JabberNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getUserInterface <em>User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Interface</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getUserInterface()
	 * @see #getInstantMessengerConfiguration()
	 * @generated
	 */
	EReference getInstantMessengerConfiguration_UserInterface();

	/**
	 * Returns the meta object for the containment reference '{@link be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getPackaging <em>Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Packaging</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration#getPackaging()
	 * @see #getInstantMessengerConfiguration()
	 * @generated
	 */
	EReference getInstantMessengerConfiguration_Packaging();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.instantmessenger.LocalNetwork <em>Local Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Network</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.LocalNetwork
	 * @generated
	 */
	EClass getLocalNetwork();

	/**
	 * Returns the meta object for the container reference '{@link be.ac.vub.uml2cs.instantmessenger.LocalNetwork#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Config</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.LocalNetwork#getConfig()
	 * @see #getLocalNetwork()
	 * @generated
	 */
	EReference getLocalNetwork_Config();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.instantmessenger.JabberNetwork <em>Jabber Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jabber Network</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.JabberNetwork
	 * @generated
	 */
	EClass getJabberNetwork();

	/**
	 * Returns the meta object for the containment reference '{@link be.ac.vub.uml2cs.instantmessenger.JabberNetwork#getJabberTransport <em>Jabber Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jabber Transport</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.JabberNetwork#getJabberTransport()
	 * @see #getJabberNetwork()
	 * @generated
	 */
	EReference getJabberNetwork_JabberTransport();

	/**
	 * Returns the meta object for the container reference '{@link be.ac.vub.uml2cs.instantmessenger.JabberNetwork#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Config</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.JabberNetwork#getConfig()
	 * @see #getJabberNetwork()
	 * @generated
	 */
	EReference getJabberNetwork_Config();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.instantmessenger.JabberTransport <em>Jabber Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jabber Transport</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.JabberTransport
	 * @generated
	 */
	EClass getJabberTransport();

	/**
	 * Returns the meta object for the container reference '{@link be.ac.vub.uml2cs.instantmessenger.JabberTransport#getJabberNetwork <em>Jabber Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Jabber Network</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.JabberTransport#getJabberNetwork()
	 * @see #getJabberTransport()
	 * @generated
	 */
	EReference getJabberTransport_JabberNetwork();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.instantmessenger.DefaultJabberTransport <em>Default Jabber Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Jabber Transport</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.DefaultJabberTransport
	 * @generated
	 */
	EClass getDefaultJabberTransport();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.instantmessenger.MEJabberTransport <em>ME Jabber Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ME Jabber Transport</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.MEJabberTransport
	 * @generated
	 */
	EClass getMEJabberTransport();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.instantmessenger.UserInterface <em>User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Interface</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.UserInterface
	 * @generated
	 */
	EClass getUserInterface();

	/**
	 * Returns the meta object for the container reference '{@link be.ac.vub.uml2cs.instantmessenger.UserInterface#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Config</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.UserInterface#getConfig()
	 * @see #getUserInterface()
	 * @generated
	 */
	EReference getUserInterface_Config();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.instantmessenger.AWTUserInterface <em>AWT User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AWT User Interface</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.AWTUserInterface
	 * @generated
	 */
	EClass getAWTUserInterface();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.instantmessenger.SwingUserInterface <em>Swing User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swing User Interface</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.SwingUserInterface
	 * @generated
	 */
	EClass getSwingUserInterface();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.instantmessenger.LCDUIUserInterface <em>LCDUI User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LCDUI User Interface</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.LCDUIUserInterface
	 * @generated
	 */
	EClass getLCDUIUserInterface();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.instantmessenger.Packaging <em>Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packaging</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.Packaging
	 * @generated
	 */
	EClass getPackaging();

	/**
	 * Returns the meta object for the container reference '{@link be.ac.vub.uml2cs.instantmessenger.Packaging#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Config</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.Packaging#getConfig()
	 * @see #getPackaging()
	 * @generated
	 */
	EReference getPackaging_Config();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.instantmessenger.WebAppletPackaging <em>Web Applet Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Applet Packaging</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.WebAppletPackaging
	 * @generated
	 */
	EClass getWebAppletPackaging();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.instantmessenger.IpkgAppletPackaging <em>Ipkg Applet Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ipkg Applet Packaging</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.IpkgAppletPackaging
	 * @generated
	 */
	EClass getIpkgAppletPackaging();

	/**
	 * Returns the meta object for class '{@link be.ac.vub.uml2cs.instantmessenger.MIDletPackaging <em>MI Dlet Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MI Dlet Packaging</em>'.
	 * @see be.ac.vub.uml2cs.instantmessenger.MIDletPackaging
	 * @generated
	 */
	EClass getMIDletPackaging();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InstantmessengerFactory getInstantmessengerFactory();

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
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.InstantMessengerConfigurationImpl <em>Instant Messenger Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantMessengerConfigurationImpl
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getInstantMessengerConfiguration()
		 * @generated
		 */
		EClass INSTANT_MESSENGER_CONFIGURATION = eINSTANCE.getInstantMessengerConfiguration();

		/**
		 * The meta object literal for the '<em><b>Deployment Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANT_MESSENGER_CONFIGURATION__DEPLOYMENT_TARGET = eINSTANCE.getInstantMessengerConfiguration_DeploymentTarget();

		/**
		 * The meta object literal for the '<em><b>Local Network</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANT_MESSENGER_CONFIGURATION__LOCAL_NETWORK = eINSTANCE.getInstantMessengerConfiguration_LocalNetwork();

		/**
		 * The meta object literal for the '<em><b>Jabber Network</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANT_MESSENGER_CONFIGURATION__JABBER_NETWORK = eINSTANCE.getInstantMessengerConfiguration_JabberNetwork();

		/**
		 * The meta object literal for the '<em><b>User Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANT_MESSENGER_CONFIGURATION__USER_INTERFACE = eINSTANCE.getInstantMessengerConfiguration_UserInterface();

		/**
		 * The meta object literal for the '<em><b>Packaging</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANT_MESSENGER_CONFIGURATION__PACKAGING = eINSTANCE.getInstantMessengerConfiguration_Packaging();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.LocalNetworkImpl <em>Local Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.LocalNetworkImpl
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getLocalNetwork()
		 * @generated
		 */
		EClass LOCAL_NETWORK = eINSTANCE.getLocalNetwork();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_NETWORK__CONFIG = eINSTANCE.getLocalNetwork_Config();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.JabberNetworkImpl <em>Jabber Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.JabberNetworkImpl
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getJabberNetwork()
		 * @generated
		 */
		EClass JABBER_NETWORK = eINSTANCE.getJabberNetwork();

		/**
		 * The meta object literal for the '<em><b>Jabber Transport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JABBER_NETWORK__JABBER_TRANSPORT = eINSTANCE.getJabberNetwork_JabberTransport();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JABBER_NETWORK__CONFIG = eINSTANCE.getJabberNetwork_Config();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.JabberTransportImpl <em>Jabber Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.JabberTransportImpl
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getJabberTransport()
		 * @generated
		 */
		EClass JABBER_TRANSPORT = eINSTANCE.getJabberTransport();

		/**
		 * The meta object literal for the '<em><b>Jabber Network</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JABBER_TRANSPORT__JABBER_NETWORK = eINSTANCE.getJabberTransport_JabberNetwork();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.DefaultJabberTransportImpl <em>Default Jabber Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.DefaultJabberTransportImpl
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getDefaultJabberTransport()
		 * @generated
		 */
		EClass DEFAULT_JABBER_TRANSPORT = eINSTANCE.getDefaultJabberTransport();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.MEJabberTransportImpl <em>ME Jabber Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.MEJabberTransportImpl
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getMEJabberTransport()
		 * @generated
		 */
		EClass ME_JABBER_TRANSPORT = eINSTANCE.getMEJabberTransport();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.UserInterfaceImpl <em>User Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.UserInterfaceImpl
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getUserInterface()
		 * @generated
		 */
		EClass USER_INTERFACE = eINSTANCE.getUserInterface();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_INTERFACE__CONFIG = eINSTANCE.getUserInterface_Config();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.AWTUserInterfaceImpl <em>AWT User Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.AWTUserInterfaceImpl
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getAWTUserInterface()
		 * @generated
		 */
		EClass AWT_USER_INTERFACE = eINSTANCE.getAWTUserInterface();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.SwingUserInterfaceImpl <em>Swing User Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.SwingUserInterfaceImpl
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getSwingUserInterface()
		 * @generated
		 */
		EClass SWING_USER_INTERFACE = eINSTANCE.getSwingUserInterface();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.LCDUIUserInterfaceImpl <em>LCDUI User Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.LCDUIUserInterfaceImpl
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getLCDUIUserInterface()
		 * @generated
		 */
		EClass LCDUI_USER_INTERFACE = eINSTANCE.getLCDUIUserInterface();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.PackagingImpl <em>Packaging</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.PackagingImpl
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getPackaging()
		 * @generated
		 */
		EClass PACKAGING = eINSTANCE.getPackaging();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGING__CONFIG = eINSTANCE.getPackaging_Config();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.WebAppletPackagingImpl <em>Web Applet Packaging</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.WebAppletPackagingImpl
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getWebAppletPackaging()
		 * @generated
		 */
		EClass WEB_APPLET_PACKAGING = eINSTANCE.getWebAppletPackaging();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.IpkgAppletPackagingImpl <em>Ipkg Applet Packaging</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.IpkgAppletPackagingImpl
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getIpkgAppletPackaging()
		 * @generated
		 */
		EClass IPKG_APPLET_PACKAGING = eINSTANCE.getIpkgAppletPackaging();

		/**
		 * The meta object literal for the '{@link be.ac.vub.uml2cs.instantmessenger.impl.MIDletPackagingImpl <em>MI Dlet Packaging</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.MIDletPackagingImpl
		 * @see be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerPackageImpl#getMIDletPackaging()
		 * @generated
		 */
		EClass MI_DLET_PACKAGING = eINSTANCE.getMIDletPackaging();

	}

} //InstantmessengerPackage
