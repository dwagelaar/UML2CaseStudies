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
import be.ac.vub.uml2cs.instantmessenger.JabberTransport;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jabber Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.ac.vub.uml2cs.instantmessenger.impl.JabberNetworkImpl#getJabberTransport <em>Jabber Transport</em>}</li>
 *   <li>{@link be.ac.vub.uml2cs.instantmessenger.impl.JabberNetworkImpl#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JabberNetworkImpl extends EObjectImpl implements JabberNetwork {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(C) 2007, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * The cached value of the '{@link #getJabberTransport() <em>Jabber Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJabberTransport()
	 * @generated
	 * @ordered
	 */
	protected JabberTransport jabberTransport = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JabberNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InstantmessengerPackage.Literals.JABBER_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JabberTransport getJabberTransport() {
		return jabberTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJabberTransport(JabberTransport newJabberTransport, NotificationChain msgs) {
		JabberTransport oldJabberTransport = jabberTransport;
		jabberTransport = newJabberTransport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantmessengerPackage.JABBER_NETWORK__JABBER_TRANSPORT, oldJabberTransport, newJabberTransport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJabberTransport(JabberTransport newJabberTransport) {
		if (newJabberTransport != jabberTransport) {
			NotificationChain msgs = null;
			if (jabberTransport != null)
				msgs = ((InternalEObject)jabberTransport).eInverseRemove(this, InstantmessengerPackage.JABBER_TRANSPORT__JABBER_NETWORK, JabberTransport.class, msgs);
			if (newJabberTransport != null)
				msgs = ((InternalEObject)newJabberTransport).eInverseAdd(this, InstantmessengerPackage.JABBER_TRANSPORT__JABBER_NETWORK, JabberTransport.class, msgs);
			msgs = basicSetJabberTransport(newJabberTransport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstantmessengerPackage.JABBER_NETWORK__JABBER_TRANSPORT, newJabberTransport, newJabberTransport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantMessengerConfiguration getConfig() {
		if (eContainerFeatureID != InstantmessengerPackage.JABBER_NETWORK__CONFIG) return null;
		return (InstantMessengerConfiguration)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfig(InstantMessengerConfiguration newConfig, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConfig, InstantmessengerPackage.JABBER_NETWORK__CONFIG, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfig(InstantMessengerConfiguration newConfig) {
		if (newConfig != eInternalContainer() || (eContainerFeatureID != InstantmessengerPackage.JABBER_NETWORK__CONFIG && newConfig != null)) {
			if (EcoreUtil.isAncestor(this, newConfig))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConfig != null)
				msgs = ((InternalEObject)newConfig).eInverseAdd(this, InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__JABBER_NETWORK, InstantMessengerConfiguration.class, msgs);
			msgs = basicSetConfig(newConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstantmessengerPackage.JABBER_NETWORK__CONFIG, newConfig, newConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstantmessengerPackage.JABBER_NETWORK__JABBER_TRANSPORT:
				if (jabberTransport != null)
					msgs = ((InternalEObject)jabberTransport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstantmessengerPackage.JABBER_NETWORK__JABBER_TRANSPORT, null, msgs);
				return basicSetJabberTransport((JabberTransport)otherEnd, msgs);
			case InstantmessengerPackage.JABBER_NETWORK__CONFIG:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConfig((InstantMessengerConfiguration)otherEnd, msgs);
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
			case InstantmessengerPackage.JABBER_NETWORK__JABBER_TRANSPORT:
				return basicSetJabberTransport(null, msgs);
			case InstantmessengerPackage.JABBER_NETWORK__CONFIG:
				return basicSetConfig(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case InstantmessengerPackage.JABBER_NETWORK__CONFIG:
				return eInternalContainer().eInverseRemove(this, InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__JABBER_NETWORK, InstantMessengerConfiguration.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstantmessengerPackage.JABBER_NETWORK__JABBER_TRANSPORT:
				return getJabberTransport();
			case InstantmessengerPackage.JABBER_NETWORK__CONFIG:
				return getConfig();
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
			case InstantmessengerPackage.JABBER_NETWORK__JABBER_TRANSPORT:
				setJabberTransport((JabberTransport)newValue);
				return;
			case InstantmessengerPackage.JABBER_NETWORK__CONFIG:
				setConfig((InstantMessengerConfiguration)newValue);
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
			case InstantmessengerPackage.JABBER_NETWORK__JABBER_TRANSPORT:
				setJabberTransport((JabberTransport)null);
				return;
			case InstantmessengerPackage.JABBER_NETWORK__CONFIG:
				setConfig((InstantMessengerConfiguration)null);
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
			case InstantmessengerPackage.JABBER_NETWORK__JABBER_TRANSPORT:
				return jabberTransport != null;
			case InstantmessengerPackage.JABBER_NETWORK__CONFIG:
				return getConfig() != null;
		}
		return super.eIsSet(featureID);
	}

} //JabberNetworkImpl