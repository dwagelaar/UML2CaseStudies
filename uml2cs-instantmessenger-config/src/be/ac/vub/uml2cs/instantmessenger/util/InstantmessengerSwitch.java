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
public class InstantmessengerSwitch {
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
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION: {
				InstantMessengerConfiguration instantMessengerConfiguration = (InstantMessengerConfiguration)theEObject;
				Object result = caseInstantMessengerConfiguration(instantMessengerConfiguration);
				if (result == null) result = caseTransformationConfig(instantMessengerConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.LOCAL_NETWORK: {
				LocalNetwork localNetwork = (LocalNetwork)theEObject;
				Object result = caseLocalNetwork(localNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.JABBER_NETWORK: {
				JabberNetwork jabberNetwork = (JabberNetwork)theEObject;
				Object result = caseJabberNetwork(jabberNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.JABBER_TRANSPORT: {
				JabberTransport jabberTransport = (JabberTransport)theEObject;
				Object result = caseJabberTransport(jabberTransport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.DEFAULT_JABBER_TRANSPORT: {
				DefaultJabberTransport defaultJabberTransport = (DefaultJabberTransport)theEObject;
				Object result = caseDefaultJabberTransport(defaultJabberTransport);
				if (result == null) result = caseJabberTransport(defaultJabberTransport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.ME_JABBER_TRANSPORT: {
				MEJabberTransport meJabberTransport = (MEJabberTransport)theEObject;
				Object result = caseMEJabberTransport(meJabberTransport);
				if (result == null) result = caseJabberTransport(meJabberTransport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.USER_INTERFACE: {
				UserInterface userInterface = (UserInterface)theEObject;
				Object result = caseUserInterface(userInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.AWT_USER_INTERFACE: {
				AWTUserInterface awtUserInterface = (AWTUserInterface)theEObject;
				Object result = caseAWTUserInterface(awtUserInterface);
				if (result == null) result = caseUserInterface(awtUserInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.SWING_USER_INTERFACE: {
				SwingUserInterface swingUserInterface = (SwingUserInterface)theEObject;
				Object result = caseSwingUserInterface(swingUserInterface);
				if (result == null) result = caseUserInterface(swingUserInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.LCDUI_USER_INTERFACE: {
				LCDUIUserInterface lcduiUserInterface = (LCDUIUserInterface)theEObject;
				Object result = caseLCDUIUserInterface(lcduiUserInterface);
				if (result == null) result = caseUserInterface(lcduiUserInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.PACKAGING: {
				Packaging packaging = (Packaging)theEObject;
				Object result = casePackaging(packaging);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.WEB_APPLET_PACKAGING: {
				WebAppletPackaging webAppletPackaging = (WebAppletPackaging)theEObject;
				Object result = caseWebAppletPackaging(webAppletPackaging);
				if (result == null) result = casePackaging(webAppletPackaging);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.IPKG_APPLET_PACKAGING: {
				IpkgAppletPackaging ipkgAppletPackaging = (IpkgAppletPackaging)theEObject;
				Object result = caseIpkgAppletPackaging(ipkgAppletPackaging);
				if (result == null) result = casePackaging(ipkgAppletPackaging);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantmessengerPackage.MI_DLET_PACKAGING: {
				MIDletPackaging miDletPackaging = (MIDletPackaging)theEObject;
				Object result = caseMIDletPackaging(miDletPackaging);
				if (result == null) result = casePackaging(miDletPackaging);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Instant Messenger Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Instant Messenger Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInstantMessengerConfiguration(InstantMessengerConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Local Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Local Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLocalNetwork(LocalNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Jabber Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Jabber Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJabberNetwork(JabberNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Jabber Transport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Jabber Transport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJabberTransport(JabberTransport object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Default Jabber Transport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Default Jabber Transport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDefaultJabberTransport(DefaultJabberTransport object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>ME Jabber Transport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>ME Jabber Transport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMEJabberTransport(MEJabberTransport object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>User Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>User Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUserInterface(UserInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>AWT User Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>AWT User Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAWTUserInterface(AWTUserInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Swing User Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Swing User Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSwingUserInterface(SwingUserInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>LCDUI User Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>LCDUI User Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLCDUIUserInterface(LCDUIUserInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Packaging</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Packaging</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePackaging(Packaging object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Web Applet Packaging</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Web Applet Packaging</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWebAppletPackaging(WebAppletPackaging object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ipkg Applet Packaging</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ipkg Applet Packaging</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIpkgAppletPackaging(IpkgAppletPackaging object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>MI Dlet Packaging</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>MI Dlet Packaging</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMIDletPackaging(MIDletPackaging object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Transformation Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Transformation Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTransformationConfig(TransformationConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //InstantmessengerSwitch
