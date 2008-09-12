/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.instantmessenger.util;

import be.ac.vub.uml2cs.instantmessenger.*;

import be.ac.vub.uml2cs.transformations.TransformationConfig;

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
 * @see be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage
 * @generated
 */
public class InstantmessengerSwitch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(C) 2007, 2008, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InstantmessengerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantmessengerSwitch() {
		if (modelPackage == null) {
			modelPackage = InstantmessengerPackage.eINSTANCE;
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
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION: {
				InstantMessengerConfiguration instantMessengerConfiguration = (InstantMessengerConfiguration)theEObject;
				T result = caseInstantMessengerConfiguration(instantMessengerConfiguration);
				if (result == null) result = caseTransformationConfig(instantMessengerConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.LOCAL_NETWORK: {
				LocalNetwork localNetwork = (LocalNetwork)theEObject;
				T result = caseLocalNetwork(localNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.JABBER_NETWORK: {
				JabberNetwork jabberNetwork = (JabberNetwork)theEObject;
				T result = caseJabberNetwork(jabberNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.JABBER_TRANSPORT: {
				JabberTransport jabberTransport = (JabberTransport)theEObject;
				T result = caseJabberTransport(jabberTransport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.DEFAULT_JABBER_TRANSPORT: {
				DefaultJabberTransport defaultJabberTransport = (DefaultJabberTransport)theEObject;
				T result = caseDefaultJabberTransport(defaultJabberTransport);
				if (result == null) result = caseJabberTransport(defaultJabberTransport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.ME_JABBER_TRANSPORT: {
				MEJabberTransport meJabberTransport = (MEJabberTransport)theEObject;
				T result = caseMEJabberTransport(meJabberTransport);
				if (result == null) result = caseJabberTransport(meJabberTransport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.USER_INTERFACE: {
				UserInterface userInterface = (UserInterface)theEObject;
				T result = caseUserInterface(userInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.AWT_USER_INTERFACE: {
				AWTUserInterface awtUserInterface = (AWTUserInterface)theEObject;
				T result = caseAWTUserInterface(awtUserInterface);
				if (result == null) result = caseUserInterface(awtUserInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.SWING_USER_INTERFACE: {
				SwingUserInterface swingUserInterface = (SwingUserInterface)theEObject;
				T result = caseSwingUserInterface(swingUserInterface);
				if (result == null) result = caseUserInterface(swingUserInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.LCDUI_USER_INTERFACE: {
				LCDUIUserInterface lcduiUserInterface = (LCDUIUserInterface)theEObject;
				T result = caseLCDUIUserInterface(lcduiUserInterface);
				if (result == null) result = caseUserInterface(lcduiUserInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.PACKAGING: {
				Packaging packaging = (Packaging)theEObject;
				T result = casePackaging(packaging);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.WEB_APPLET_PACKAGING: {
				WebAppletPackaging webAppletPackaging = (WebAppletPackaging)theEObject;
				T result = caseWebAppletPackaging(webAppletPackaging);
				if (result == null) result = casePackaging(webAppletPackaging);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.IPKG_APPLET_PACKAGING: {
				IpkgAppletPackaging ipkgAppletPackaging = (IpkgAppletPackaging)theEObject;
				T result = caseIpkgAppletPackaging(ipkgAppletPackaging);
				if (result == null) result = casePackaging(ipkgAppletPackaging);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.MI_DLET_PACKAGING: {
				MIDletPackaging miDletPackaging = (MIDletPackaging)theEObject;
				T result = caseMIDletPackaging(miDletPackaging);
				if (result == null) result = casePackaging(miDletPackaging);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instant Messenger Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instant Messenger Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstantMessengerConfiguration(InstantMessengerConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalNetwork(LocalNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jabber Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jabber Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJabberNetwork(JabberNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jabber Transport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jabber Transport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJabberTransport(JabberTransport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Jabber Transport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Jabber Transport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultJabberTransport(DefaultJabberTransport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ME Jabber Transport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ME Jabber Transport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEJabberTransport(MEJabberTransport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserInterface(UserInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AWT User Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AWT User Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAWTUserInterface(AWTUserInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swing User Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swing User Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwingUserInterface(SwingUserInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LCDUI User Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LCDUI User Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLCDUIUserInterface(LCDUIUserInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packaging</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packaging</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackaging(Packaging object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Applet Packaging</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Applet Packaging</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebAppletPackaging(WebAppletPackaging object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ipkg Applet Packaging</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ipkg Applet Packaging</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIpkgAppletPackaging(IpkgAppletPackaging object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MI Dlet Packaging</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MI Dlet Packaging</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIDletPackaging(MIDletPackaging object) {
		return null;
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

} //InstantmessengerSwitch
