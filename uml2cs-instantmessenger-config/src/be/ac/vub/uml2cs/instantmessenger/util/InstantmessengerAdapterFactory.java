/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.instantmessenger.util;

import be.ac.vub.uml2cs.instantmessenger.*;

import be.ac.vub.uml2cs.transformations.TransformationConfig;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage
 * @generated
 */
public class InstantmessengerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(C) 2007, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InstantmessengerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantmessengerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InstantmessengerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstantmessengerSwitch modelSwitch =
		new InstantmessengerSwitch() {
			public Object caseInstantMessengerConfiguration(InstantMessengerConfiguration object) {
				return createInstantMessengerConfigurationAdapter();
			}
			public Object caseLocalNetwork(LocalNetwork object) {
				return createLocalNetworkAdapter();
			}
			public Object caseJabberNetwork(JabberNetwork object) {
				return createJabberNetworkAdapter();
			}
			public Object caseJabberTransport(JabberTransport object) {
				return createJabberTransportAdapter();
			}
			public Object caseDefaultJabberTransport(DefaultJabberTransport object) {
				return createDefaultJabberTransportAdapter();
			}
			public Object caseMEJabberTransport(MEJabberTransport object) {
				return createMEJabberTransportAdapter();
			}
			public Object caseUserInterface(UserInterface object) {
				return createUserInterfaceAdapter();
			}
			public Object caseAWTUserInterface(AWTUserInterface object) {
				return createAWTUserInterfaceAdapter();
			}
			public Object caseSwingUserInterface(SwingUserInterface object) {
				return createSwingUserInterfaceAdapter();
			}
			public Object caseLCDUIUserInterface(LCDUIUserInterface object) {
				return createLCDUIUserInterfaceAdapter();
			}
			public Object casePackaging(Packaging object) {
				return createPackagingAdapter();
			}
			public Object caseWebAppletPackaging(WebAppletPackaging object) {
				return createWebAppletPackagingAdapter();
			}
			public Object caseIpkgAppletPackaging(IpkgAppletPackaging object) {
				return createIpkgAppletPackagingAdapter();
			}
			public Object caseMIDletPackaging(MIDletPackaging object) {
				return createMIDletPackagingAdapter();
			}
			public Object caseTransformationConfig(TransformationConfig object) {
				return createTransformationConfigAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration <em>Instant Messenger Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration
	 * @generated
	 */
	public Adapter createInstantMessengerConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.instantmessenger.LocalNetwork <em>Local Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.instantmessenger.LocalNetwork
	 * @generated
	 */
	public Adapter createLocalNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.instantmessenger.JabberNetwork <em>Jabber Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.instantmessenger.JabberNetwork
	 * @generated
	 */
	public Adapter createJabberNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.instantmessenger.JabberTransport <em>Jabber Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.instantmessenger.JabberTransport
	 * @generated
	 */
	public Adapter createJabberTransportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.instantmessenger.DefaultJabberTransport <em>Default Jabber Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.instantmessenger.DefaultJabberTransport
	 * @generated
	 */
	public Adapter createDefaultJabberTransportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.instantmessenger.MEJabberTransport <em>ME Jabber Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.instantmessenger.MEJabberTransport
	 * @generated
	 */
	public Adapter createMEJabberTransportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.instantmessenger.UserInterface <em>User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.instantmessenger.UserInterface
	 * @generated
	 */
	public Adapter createUserInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.instantmessenger.AWTUserInterface <em>AWT User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.instantmessenger.AWTUserInterface
	 * @generated
	 */
	public Adapter createAWTUserInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.instantmessenger.SwingUserInterface <em>Swing User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.instantmessenger.SwingUserInterface
	 * @generated
	 */
	public Adapter createSwingUserInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.instantmessenger.LCDUIUserInterface <em>LCDUI User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.instantmessenger.LCDUIUserInterface
	 * @generated
	 */
	public Adapter createLCDUIUserInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.instantmessenger.Packaging <em>Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.instantmessenger.Packaging
	 * @generated
	 */
	public Adapter createPackagingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.instantmessenger.WebAppletPackaging <em>Web Applet Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.instantmessenger.WebAppletPackaging
	 * @generated
	 */
	public Adapter createWebAppletPackagingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.instantmessenger.IpkgAppletPackaging <em>Ipkg Applet Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.instantmessenger.IpkgAppletPackaging
	 * @generated
	 */
	public Adapter createIpkgAppletPackagingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.instantmessenger.MIDletPackaging <em>MI Dlet Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.instantmessenger.MIDletPackaging
	 * @generated
	 */
	public Adapter createMIDletPackagingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.transformations.TransformationConfig <em>Transformation Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.transformations.TransformationConfig
	 * @generated
	 */
	public Adapter createTransformationConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //InstantmessengerAdapterFactory
