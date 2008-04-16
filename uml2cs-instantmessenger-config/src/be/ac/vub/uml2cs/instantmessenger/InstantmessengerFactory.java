/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.instantmessenger;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage
 * @generated
 */
public interface InstantmessengerFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "(C) 2007, 2008, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstantmessengerFactory eINSTANCE = be.ac.vub.uml2cs.instantmessenger.impl.InstantmessengerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Instant Messenger Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instant Messenger Configuration</em>'.
	 * @generated
	 */
	InstantMessengerConfiguration createInstantMessengerConfiguration();

	/**
	 * Returns a new object of class '<em>Local Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Network</em>'.
	 * @generated
	 */
	LocalNetwork createLocalNetwork();

	/**
	 * Returns a new object of class '<em>Jabber Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jabber Network</em>'.
	 * @generated
	 */
	JabberNetwork createJabberNetwork();

	/**
	 * Returns a new object of class '<em>Default Jabber Transport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Jabber Transport</em>'.
	 * @generated
	 */
	DefaultJabberTransport createDefaultJabberTransport();

	/**
	 * Returns a new object of class '<em>ME Jabber Transport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ME Jabber Transport</em>'.
	 * @generated
	 */
	MEJabberTransport createMEJabberTransport();

	/**
	 * Returns a new object of class '<em>AWT User Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AWT User Interface</em>'.
	 * @generated
	 */
	AWTUserInterface createAWTUserInterface();

	/**
	 * Returns a new object of class '<em>Swing User Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swing User Interface</em>'.
	 * @generated
	 */
	SwingUserInterface createSwingUserInterface();

	/**
	 * Returns a new object of class '<em>LCDUI User Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LCDUI User Interface</em>'.
	 * @generated
	 */
	LCDUIUserInterface createLCDUIUserInterface();

	/**
	 * Returns a new object of class '<em>Web Applet Packaging</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Applet Packaging</em>'.
	 * @generated
	 */
	WebAppletPackaging createWebAppletPackaging();

	/**
	 * Returns a new object of class '<em>Ipkg Applet Packaging</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ipkg Applet Packaging</em>'.
	 * @generated
	 */
	IpkgAppletPackaging createIpkgAppletPackaging();

	/**
	 * Returns a new object of class '<em>MI Dlet Packaging</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MI Dlet Packaging</em>'.
	 * @generated
	 */
	MIDletPackaging createMIDletPackaging();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InstantmessengerPackage getInstantmessengerPackage();

} //InstantmessengerFactory
