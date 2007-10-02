/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.instantmessenger.impl;

import be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration;
import be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage;
import be.ac.vub.uml2cs.instantmessenger.JabberNetwork;
import be.ac.vub.uml2cs.instantmessenger.LocalNetwork;
import be.ac.vub.uml2cs.instantmessenger.Packaging;
import be.ac.vub.uml2cs.instantmessenger.UserInterface;

import be.ac.vub.uml2cs.transformations.impl.TransformationConfigImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instant Messenger Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.ac.vub.uml2cs.instantmessenger.impl.InstantMessengerConfigurationImpl#getDeploymentTarget <em>Deployment Target</em>}</li>
 *   <li>{@link be.ac.vub.uml2cs.instantmessenger.impl.InstantMessengerConfigurationImpl#getLocalNetwork <em>Local Network</em>}</li>
 *   <li>{@link be.ac.vub.uml2cs.instantmessenger.impl.InstantMessengerConfigurationImpl#getJabberNetwork <em>Jabber Network</em>}</li>
 *   <li>{@link be.ac.vub.uml2cs.instantmessenger.impl.InstantMessengerConfigurationImpl#getUserInterface <em>User Interface</em>}</li>
 *   <li>{@link be.ac.vub.uml2cs.instantmessenger.impl.InstantMessengerConfigurationImpl#getPackaging <em>Packaging</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstantMessengerConfigurationImpl extends TransformationConfigImpl implements InstantMessengerConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(C) 2007, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * The default value of the '{@link #getDeploymentTarget() <em>Deployment Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYMENT_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeploymentTarget() <em>Deployment Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentTarget()
	 * @generated
	 * @ordered
	 */
	protected String deploymentTarget = DEPLOYMENT_TARGET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocalNetwork() <em>Local Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalNetwork()
	 * @generated
	 * @ordered
	 */
	protected LocalNetwork localNetwork;

	/**
	 * The cached value of the '{@link #getJabberNetwork() <em>Jabber Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJabberNetwork()
	 * @generated
	 * @ordered
	 */
	protected JabberNetwork jabberNetwork;

	/**
	 * The cached value of the '{@link #getUserInterface() <em>User Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInterface()
	 * @generated
	 * @ordered
	 */
	protected EList userInterface;

	/**
	 * The cached value of the '{@link #getPackaging() <em>Packaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackaging()
	 * @generated
	 * @ordered
	 */
	protected Packaging packaging;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstantMessengerConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InstantmessengerPackage.Literals.INSTANT_MESSENGER_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeploymentTarget() {
		return deploymentTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentTarget(String newDeploymentTarget) {
		String oldDeploymentTarget = deploymentTarget;
		deploymentTarget = newDeploymentTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__DEPLOYMENT_TARGET, oldDeploymentTarget, deploymentTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalNetwork getLocalNetwork() {
		return localNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalNetwork(LocalNetwork newLocalNetwork, NotificationChain msgs) {
		LocalNetwork oldLocalNetwork = localNetwork;
		localNetwork = newLocalNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__LOCAL_NETWORK, oldLocalNetwork, newLocalNetwork);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalNetwork(LocalNetwork newLocalNetwork) {
		if (newLocalNetwork != localNetwork) {
			NotificationChain msgs = null;
			if (localNetwork != null)
				msgs = ((InternalEObject)localNetwork).eInverseRemove(this, InstantmessengerPackage.LOCAL_NETWORK__CONFIG, LocalNetwork.class, msgs);
			if (newLocalNetwork != null)
				msgs = ((InternalEObject)newLocalNetwork).eInverseAdd(this, InstantmessengerPackage.LOCAL_NETWORK__CONFIG, LocalNetwork.class, msgs);
			msgs = basicSetLocalNetwork(newLocalNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__LOCAL_NETWORK, newLocalNetwork, newLocalNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JabberNetwork getJabberNetwork() {
		return jabberNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJabberNetwork(JabberNetwork newJabberNetwork, NotificationChain msgs) {
		JabberNetwork oldJabberNetwork = jabberNetwork;
		jabberNetwork = newJabberNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__JABBER_NETWORK, oldJabberNetwork, newJabberNetwork);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJabberNetwork(JabberNetwork newJabberNetwork) {
		if (newJabberNetwork != jabberNetwork) {
			NotificationChain msgs = null;
			if (jabberNetwork != null)
				msgs = ((InternalEObject)jabberNetwork).eInverseRemove(this, InstantmessengerPackage.JABBER_NETWORK__CONFIG, JabberNetwork.class, msgs);
			if (newJabberNetwork != null)
				msgs = ((InternalEObject)newJabberNetwork).eInverseAdd(this, InstantmessengerPackage.JABBER_NETWORK__CONFIG, JabberNetwork.class, msgs);
			msgs = basicSetJabberNetwork(newJabberNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__JABBER_NETWORK, newJabberNetwork, newJabberNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUserInterface() {
		if (userInterface == null) {
			userInterface = new EObjectContainmentWithInverseEList(UserInterface.class, this, InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__USER_INTERFACE, InstantmessengerPackage.USER_INTERFACE__CONFIG);
		}
		return userInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Packaging getPackaging() {
		return packaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackaging(Packaging newPackaging, NotificationChain msgs) {
		Packaging oldPackaging = packaging;
		packaging = newPackaging;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__PACKAGING, oldPackaging, newPackaging);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackaging(Packaging newPackaging) {
		if (newPackaging != packaging) {
			NotificationChain msgs = null;
			if (packaging != null)
				msgs = ((InternalEObject)packaging).eInverseRemove(this, InstantmessengerPackage.PACKAGING__CONFIG, Packaging.class, msgs);
			if (newPackaging != null)
				msgs = ((InternalEObject)newPackaging).eInverseAdd(this, InstantmessengerPackage.PACKAGING__CONFIG, Packaging.class, msgs);
			msgs = basicSetPackaging(newPackaging, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__PACKAGING, newPackaging, newPackaging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__LOCAL_NETWORK:
				if (localNetwork != null)
					msgs = ((InternalEObject)localNetwork).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__LOCAL_NETWORK, null, msgs);
				return basicSetLocalNetwork((LocalNetwork)otherEnd, msgs);
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__JABBER_NETWORK:
				if (jabberNetwork != null)
					msgs = ((InternalEObject)jabberNetwork).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__JABBER_NETWORK, null, msgs);
				return basicSetJabberNetwork((JabberNetwork)otherEnd, msgs);
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__USER_INTERFACE:
				return ((InternalEList)getUserInterface()).basicAdd(otherEnd, msgs);
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__PACKAGING:
				if (packaging != null)
					msgs = ((InternalEObject)packaging).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__PACKAGING, null, msgs);
				return basicSetPackaging((Packaging)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__LOCAL_NETWORK:
				return basicSetLocalNetwork(null, msgs);
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__JABBER_NETWORK:
				return basicSetJabberNetwork(null, msgs);
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__USER_INTERFACE:
				return ((InternalEList)getUserInterface()).basicRemove(otherEnd, msgs);
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__PACKAGING:
				return basicSetPackaging(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__DEPLOYMENT_TARGET:
				return getDeploymentTarget();
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__LOCAL_NETWORK:
				return getLocalNetwork();
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__JABBER_NETWORK:
				return getJabberNetwork();
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__USER_INTERFACE:
				return getUserInterface();
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__PACKAGING:
				return getPackaging();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__DEPLOYMENT_TARGET:
				setDeploymentTarget((String)newValue);
				return;
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__LOCAL_NETWORK:
				setLocalNetwork((LocalNetwork)newValue);
				return;
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__JABBER_NETWORK:
				setJabberNetwork((JabberNetwork)newValue);
				return;
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__USER_INTERFACE:
				getUserInterface().clear();
				getUserInterface().addAll((Collection)newValue);
				return;
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__PACKAGING:
				setPackaging((Packaging)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__DEPLOYMENT_TARGET:
				setDeploymentTarget(DEPLOYMENT_TARGET_EDEFAULT);
				return;
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__LOCAL_NETWORK:
				setLocalNetwork((LocalNetwork)null);
				return;
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__JABBER_NETWORK:
				setJabberNetwork((JabberNetwork)null);
				return;
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__USER_INTERFACE:
				getUserInterface().clear();
				return;
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__PACKAGING:
				setPackaging((Packaging)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__DEPLOYMENT_TARGET:
				return DEPLOYMENT_TARGET_EDEFAULT == null ? deploymentTarget != null : !DEPLOYMENT_TARGET_EDEFAULT.equals(deploymentTarget);
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__LOCAL_NETWORK:
				return localNetwork != null;
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__JABBER_NETWORK:
				return jabberNetwork != null;
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__USER_INTERFACE:
				return userInterface != null && !userInterface.isEmpty();
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__PACKAGING:
				return packaging != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (deploymentTarget: ");
		result.append(deploymentTarget);
		result.append(')');
		return result.toString();
	}

} //InstantMessengerConfigurationImpl