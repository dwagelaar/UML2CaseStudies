/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.transformations.impl;

import be.ac.vub.uml2cs.transformations.JavaDataTypes;
import be.ac.vub.uml2cs.transformations.JavaMapping;
import be.ac.vub.uml2cs.transformations.TransformationsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.ac.vub.uml2cs.transformations.impl.JavaMappingImpl#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaMappingImpl extends MappingImpl implements JavaMapping {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(C) 2007, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected JavaDataTypes dataTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TransformationsPackage.Literals.JAVA_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaDataTypes getDataTypes() {
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTypes(JavaDataTypes newDataTypes, NotificationChain msgs) {
		JavaDataTypes oldDataTypes = dataTypes;
		dataTypes = newDataTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformationsPackage.JAVA_MAPPING__DATA_TYPES, oldDataTypes, newDataTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTypes(JavaDataTypes newDataTypes) {
		if (newDataTypes != dataTypes) {
			NotificationChain msgs = null;
			if (dataTypes != null)
				msgs = ((InternalEObject)dataTypes).eInverseRemove(this, TransformationsPackage.JAVA_DATA_TYPES__MAPPING, JavaDataTypes.class, msgs);
			if (newDataTypes != null)
				msgs = ((InternalEObject)newDataTypes).eInverseAdd(this, TransformationsPackage.JAVA_DATA_TYPES__MAPPING, JavaDataTypes.class, msgs);
			msgs = basicSetDataTypes(newDataTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationsPackage.JAVA_MAPPING__DATA_TYPES, newDataTypes, newDataTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TransformationsPackage.JAVA_MAPPING__DATA_TYPES:
				if (dataTypes != null)
					msgs = ((InternalEObject)dataTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransformationsPackage.JAVA_MAPPING__DATA_TYPES, null, msgs);
				return basicSetDataTypes((JavaDataTypes)otherEnd, msgs);
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
			case TransformationsPackage.JAVA_MAPPING__DATA_TYPES:
				return basicSetDataTypes(null, msgs);
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
			case TransformationsPackage.JAVA_MAPPING__DATA_TYPES:
				return getDataTypes();
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
			case TransformationsPackage.JAVA_MAPPING__DATA_TYPES:
				setDataTypes((JavaDataTypes)newValue);
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
			case TransformationsPackage.JAVA_MAPPING__DATA_TYPES:
				setDataTypes((JavaDataTypes)null);
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
			case TransformationsPackage.JAVA_MAPPING__DATA_TYPES:
				return dataTypes != null;
		}
		return super.eIsSet(featureID);
	}

} //JavaMappingImpl