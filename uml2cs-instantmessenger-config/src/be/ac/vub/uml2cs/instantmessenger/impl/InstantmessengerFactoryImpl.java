/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.instantmessenger.impl;

import be.ac.vub.uml2cs.instantmessenger.*;

import org.eclipse.emf.ecore.EClass;
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
public class InstantmessengerFactoryImpl extends EFactoryImpl implements InstantmessengerFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(C) 2007, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InstantmessengerFactory init() {
		try {
			InstantmessengerFactory theInstantmessengerFactory = (InstantmessengerFactory)EPackage.Registry.INSTANCE.getEFactory("http://ssel.vub.ac.be/uml2cs/InstantMessenger"); 
			if (theInstantmessengerFactory != null) {
				return theInstantmessengerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InstantmessengerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantmessengerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION: return createInstantMessengerConfiguration();
			case InstantmessengerPackage.LOCAL_NETWORK: return createLocalNetwork();
			case InstantmessengerPackage.JABBER_NETWORK: return createJabberNetwork();
			case InstantmessengerPackage.DEFAULT_JABBER_TRANSPORT: return createDefaultJabberTransport();
			case InstantmessengerPackage.ME_JABBER_TRANSPORT: return createMEJabberTransport();
			case InstantmessengerPackage.AWT_USER_INTERFACE: return createAWTUserInterface();
			case InstantmessengerPackage.SWING_USER_INTERFACE: return createSwingUserInterface();
			case InstantmessengerPackage.LCDUI_USER_INTERFACE: return createLCDUIUserInterface();
			case InstantmessengerPackage.WEB_APPLET_PACKAGING: return createWebAppletPackaging();
			case InstantmessengerPackage.IPKG_APPLET_PACKAGING: return createIpkgAppletPackaging();
			case InstantmessengerPackage.MI_DLET_PACKAGING: return createMIDletPackaging();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantMessengerConfiguration createInstantMessengerConfiguration() {
		InstantMessengerConfigurationImpl instantMessengerConfiguration = new InstantMessengerConfigurationImpl();
		return instantMessengerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalNetwork createLocalNetwork() {
		LocalNetworkImpl localNetwork = new LocalNetworkImpl();
		return localNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JabberNetwork createJabberNetwork() {
		JabberNetworkImpl jabberNetwork = new JabberNetworkImpl();
		return jabberNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultJabberTransport createDefaultJabberTransport() {
		DefaultJabberTransportImpl defaultJabberTransport = new DefaultJabberTransportImpl();
		return defaultJabberTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEJabberTransport createMEJabberTransport() {
		MEJabberTransportImpl meJabberTransport = new MEJabberTransportImpl();
		return meJabberTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AWTUserInterface createAWTUserInterface() {
		AWTUserInterfaceImpl awtUserInterface = new AWTUserInterfaceImpl();
		return awtUserInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwingUserInterface createSwingUserInterface() {
		SwingUserInterfaceImpl swingUserInterface = new SwingUserInterfaceImpl();
		return swingUserInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LCDUIUserInterface createLCDUIUserInterface() {
		LCDUIUserInterfaceImpl lcduiUserInterface = new LCDUIUserInterfaceImpl();
		return lcduiUserInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebAppletPackaging createWebAppletPackaging() {
		WebAppletPackagingImpl webAppletPackaging = new WebAppletPackagingImpl();
		return webAppletPackaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpkgAppletPackaging createIpkgAppletPackaging() {
		IpkgAppletPackagingImpl ipkgAppletPackaging = new IpkgAppletPackagingImpl();
		return ipkgAppletPackaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MIDletPackaging createMIDletPackaging() {
		MIDletPackagingImpl miDletPackaging = new MIDletPackagingImpl();
		return miDletPackaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantmessengerPackage getInstantmessengerPackage() {
		return (InstantmessengerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static InstantmessengerPackage getPackage() {
		return InstantmessengerPackage.eINSTANCE;
	}

} //InstantmessengerFactoryImpl
