/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.instantmessenger.impl;

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
 * An implementation of the model object '<em><b>Jabber Transport</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.ac.vub.uml2cs.instantmessenger.impl.JabberTransportImpl#getJabberNetwork <em>Jabber Network</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class JabberTransportImpl extends EObjectImpl implements JabberTransport {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(C) 2007, 2008, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JabberTransportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InstantmessengerPackage.Literals.JABBER_TRANSPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JabberNetwork getJabberNetwork() {
		if (eContainerFeatureID != InstantmessengerPackage.JABBER_TRANSPORT__JABBER_NETWORK) return null;
		return (JabberNetwork)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJabberNetwork(JabberNetwork newJabberNetwork, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newJabberNetwork, InstantmessengerPackage.JABBER_TRANSPORT__JABBER_NETWORK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJabberNetwork(JabberNetwork newJabberNetwork) {
		if (newJabberNetwork != eInternalContainer() || (eContainerFeatureID != InstantmessengerPackage.JABBER_TRANSPORT__JABBER_NETWORK && newJabberNetwork != null)) {
			if (EcoreUtil.isAncestor(this, newJabberNetwork))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newJabberNetwork != null)
				msgs = ((InternalEObject)newJabberNetwork).eInverseAdd(this, InstantmessengerPackage.JABBER_NETWORK__JABBER_TRANSPORT, JabberNetwork.class, msgs);
			msgs = basicSetJabberNetwork(newJabberNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstantmessengerPackage.JABBER_TRANSPORT__JABBER_NETWORK, newJabberNetwork, newJabberNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstantmessengerPackage.JABBER_TRANSPORT__JABBER_NETWORK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetJabberNetwork((JabberNetwork)otherEnd, msgs);
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
			case InstantmessengerPackage.JABBER_TRANSPORT__JABBER_NETWORK:
				return basicSetJabberNetwork(null, msgs);
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
			case InstantmessengerPackage.JABBER_TRANSPORT__JABBER_NETWORK:
				return eInternalContainer().eInverseRemove(this, InstantmessengerPackage.JABBER_NETWORK__JABBER_TRANSPORT, JabberNetwork.class, msgs);
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
			case InstantmessengerPackage.JABBER_TRANSPORT__JABBER_NETWORK:
				return getJabberNetwork();
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
			case InstantmessengerPackage.JABBER_TRANSPORT__JABBER_NETWORK:
				setJabberNetwork((JabberNetwork)newValue);
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
			case InstantmessengerPackage.JABBER_TRANSPORT__JABBER_NETWORK:
				setJabberNetwork((JabberNetwork)null);
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
			case InstantmessengerPackage.JABBER_TRANSPORT__JABBER_NETWORK:
				return getJabberNetwork() != null;
		}
		return super.eIsSet(featureID);
	}

} //JabberTransportImpl