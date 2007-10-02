/**
 * (C) 2007, Dennis Wagelaar, Vrije Universiteit Brussel
 *
 * $Id$
 */
package be.ac.vub.uml2cs.instantmessenger.util;

import be.ac.vub.uml2cs.instantmessenger.*;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage
 * @generated
 */
public class InstantmessengerValidator extends EObjectValidator {
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
	public static final InstantmessengerValidator INSTANCE = new InstantmessengerValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "be.ac.vub.uml2cs.instantmessenger";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantmessengerValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return InstantmessengerPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION:
				return validateInstantMessengerConfiguration((InstantMessengerConfiguration)value, diagnostics, context);
			case InstantmessengerPackage.LOCAL_NETWORK:
				return validateLocalNetwork((LocalNetwork)value, diagnostics, context);
			case InstantmessengerPackage.JABBER_NETWORK:
				return validateJabberNetwork((JabberNetwork)value, diagnostics, context);
			case InstantmessengerPackage.JABBER_TRANSPORT:
				return validateJabberTransport((JabberTransport)value, diagnostics, context);
			case InstantmessengerPackage.DEFAULT_JABBER_TRANSPORT:
				return validateDefaultJabberTransport((DefaultJabberTransport)value, diagnostics, context);
			case InstantmessengerPackage.ME_JABBER_TRANSPORT:
				return validateMEJabberTransport((MEJabberTransport)value, diagnostics, context);
			case InstantmessengerPackage.USER_INTERFACE:
				return validateUserInterface((UserInterface)value, diagnostics, context);
			case InstantmessengerPackage.AWT_USER_INTERFACE:
				return validateAWTUserInterface((AWTUserInterface)value, diagnostics, context);
			case InstantmessengerPackage.SWING_USER_INTERFACE:
				return validateSwingUserInterface((SwingUserInterface)value, diagnostics, context);
			case InstantmessengerPackage.LCDUI_USER_INTERFACE:
				return validateLCDUIUserInterface((LCDUIUserInterface)value, diagnostics, context);
			case InstantmessengerPackage.PACKAGING:
				return validatePackaging((Packaging)value, diagnostics, context);
			case InstantmessengerPackage.WEB_APPLET_PACKAGING:
				return validateWebAppletPackaging((WebAppletPackaging)value, diagnostics, context);
			case InstantmessengerPackage.IPKG_APPLET_PACKAGING:
				return validateIpkgAppletPackaging((IpkgAppletPackaging)value, diagnostics, context);
			case InstantmessengerPackage.MI_DLET_PACKAGING:
				return validateMIDletPackaging((MIDletPackaging)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstantMessengerConfiguration(InstantMessengerConfiguration instantMessengerConfiguration, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(instantMessengerConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instantMessengerConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instantMessengerConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instantMessengerConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instantMessengerConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instantMessengerConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instantMessengerConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstantMessengerConfiguration_singletonAWTUI(instantMessengerConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstantMessengerConfiguration_singletonSwingUI(instantMessengerConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstantMessengerConfiguration_singletonLCDUI(instantMessengerConfiguration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the singletonAWTUI constraint of '<em>Instant Messenger Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstantMessengerConfiguration_singletonAWTUI(InstantMessengerConfiguration instantMessengerConfiguration, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "singletonAWTUI", getObjectLabel(instantMessengerConfiguration, context) }),
						 new Object[] { instantMessengerConfiguration }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the singletonSwingUI constraint of '<em>Instant Messenger Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstantMessengerConfiguration_singletonSwingUI(InstantMessengerConfiguration instantMessengerConfiguration, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "singletonSwingUI", getObjectLabel(instantMessengerConfiguration, context) }),
						 new Object[] { instantMessengerConfiguration }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the singletonLCDUI constraint of '<em>Instant Messenger Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstantMessengerConfiguration_singletonLCDUI(InstantMessengerConfiguration instantMessengerConfiguration, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "singletonLCDUI", getObjectLabel(instantMessengerConfiguration, context) }),
						 new Object[] { instantMessengerConfiguration }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalNetwork(LocalNetwork localNetwork, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(localNetwork, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJabberNetwork(JabberNetwork jabberNetwork, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(jabberNetwork, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJabberTransport(JabberTransport jabberTransport, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(jabberTransport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultJabberTransport(DefaultJabberTransport defaultJabberTransport, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(defaultJabberTransport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMEJabberTransport(MEJabberTransport meJabberTransport, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(meJabberTransport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserInterface(UserInterface userInterface, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(userInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAWTUserInterface(AWTUserInterface awtUserInterface, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(awtUserInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSwingUserInterface(SwingUserInterface swingUserInterface, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(swingUserInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLCDUIUserInterface(LCDUIUserInterface lcduiUserInterface, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(lcduiUserInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackaging(Packaging packaging, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(packaging, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebAppletPackaging(WebAppletPackaging webAppletPackaging, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(webAppletPackaging, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpkgAppletPackaging(IpkgAppletPackaging ipkgAppletPackaging, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(ipkgAppletPackaging, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMIDletPackaging(MIDletPackaging miDletPackaging, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(miDletPackaging, diagnostics, context);
	}

} //InstantmessengerValidator
