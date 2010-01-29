/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.transformations.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import be.ac.vub.uml2cs.transformations.Applet;
import be.ac.vub.uml2cs.transformations.Mapping;
import be.ac.vub.uml2cs.transformations.SaveModelType;
import be.ac.vub.uml2cs.transformations.TransformationConfig;
import be.ac.vub.uml2cs.transformations.TransformationsPackage;
import be.ac.vub.uml2cs.transformations.UML2Observer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.ac.vub.uml2cs.transformations.impl.TransformationConfigImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link be.ac.vub.uml2cs.transformations.impl.TransformationConfigImpl#getSaveModels <em>Save Models</em>}</li>
 *   <li>{@link be.ac.vub.uml2cs.transformations.impl.TransformationConfigImpl#getObserver <em>Observer</em>}</li>
 *   <li>{@link be.ac.vub.uml2cs.transformations.impl.TransformationConfigImpl#getApplet <em>Applet</em>}</li>
 *   <li>{@link be.ac.vub.uml2cs.transformations.impl.TransformationConfigImpl#getTargetProject <em>Target Project</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationConfigImpl extends EObjectImpl implements TransformationConfig {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(C) 2007-2009, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected Mapping mapping;

	/**
	 * The default value of the '{@link #getSaveModels() <em>Save Models</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveModels()
	 * @generated
	 * @ordered
	 */
	protected static final SaveModelType SAVE_MODELS_EDEFAULT = SaveModelType.NONE_LITERAL;

	/**
	 * The cached value of the '{@link #getSaveModels() <em>Save Models</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveModels()
	 * @generated
	 * @ordered
	 */
	protected SaveModelType saveModels = SAVE_MODELS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObserver() <em>Observer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObserver()
	 * @generated
	 * @ordered
	 */
	protected UML2Observer observer;

	/**
	 * The cached value of the '{@link #getApplet() <em>Applet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplet()
	 * @generated
	 * @ordered
	 */
	protected Applet applet;

	/**
	 * The default value of the '{@link #getTargetProject() <em>Target Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetProject()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_PROJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetProject() <em>Target Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetProject()
	 * @generated
	 * @ordered
	 */
	protected String targetProject = TARGET_PROJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransformationsPackage.Literals.TRANSFORMATION_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping getMapping() {
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapping(Mapping newMapping, NotificationChain msgs) {
		Mapping oldMapping = mapping;
		mapping = newMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformationsPackage.TRANSFORMATION_CONFIG__MAPPING, oldMapping, newMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping(Mapping newMapping) {
		if (newMapping != mapping) {
			NotificationChain msgs = null;
			if (mapping != null)
				msgs = ((InternalEObject)mapping).eInverseRemove(this, TransformationsPackage.MAPPING__CONFIG, Mapping.class, msgs);
			if (newMapping != null)
				msgs = ((InternalEObject)newMapping).eInverseAdd(this, TransformationsPackage.MAPPING__CONFIG, Mapping.class, msgs);
			msgs = basicSetMapping(newMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationsPackage.TRANSFORMATION_CONFIG__MAPPING, newMapping, newMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaveModelType getSaveModels() {
		return saveModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSaveModels(SaveModelType newSaveModels) {
		SaveModelType oldSaveModels = saveModels;
		saveModels = newSaveModels == null ? SAVE_MODELS_EDEFAULT : newSaveModels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationsPackage.TRANSFORMATION_CONFIG__SAVE_MODELS, oldSaveModels, saveModels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2Observer getObserver() {
		return observer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObserver(UML2Observer newObserver, NotificationChain msgs) {
		UML2Observer oldObserver = observer;
		observer = newObserver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformationsPackage.TRANSFORMATION_CONFIG__OBSERVER, oldObserver, newObserver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObserver(UML2Observer newObserver) {
		if (newObserver != observer) {
			NotificationChain msgs = null;
			if (observer != null)
				msgs = ((InternalEObject)observer).eInverseRemove(this, TransformationsPackage.UML2_OBSERVER__CONFIG, UML2Observer.class, msgs);
			if (newObserver != null)
				msgs = ((InternalEObject)newObserver).eInverseAdd(this, TransformationsPackage.UML2_OBSERVER__CONFIG, UML2Observer.class, msgs);
			msgs = basicSetObserver(newObserver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationsPackage.TRANSFORMATION_CONFIG__OBSERVER, newObserver, newObserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Applet getApplet() {
		return applet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplet(Applet newApplet, NotificationChain msgs) {
		Applet oldApplet = applet;
		applet = newApplet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformationsPackage.TRANSFORMATION_CONFIG__APPLET, oldApplet, newApplet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplet(Applet newApplet) {
		if (newApplet != applet) {
			NotificationChain msgs = null;
			if (applet != null)
				msgs = ((InternalEObject)applet).eInverseRemove(this, TransformationsPackage.APPLET__CONFIG, Applet.class, msgs);
			if (newApplet != null)
				msgs = ((InternalEObject)newApplet).eInverseAdd(this, TransformationsPackage.APPLET__CONFIG, Applet.class, msgs);
			msgs = basicSetApplet(newApplet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationsPackage.TRANSFORMATION_CONFIG__APPLET, newApplet, newApplet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetProject() {
		return targetProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetProject(String newTargetProject) {
		String oldTargetProject = targetProject;
		targetProject = newTargetProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationsPackage.TRANSFORMATION_CONFIG__TARGET_PROJECT, oldTargetProject, targetProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TransformationsPackage.TRANSFORMATION_CONFIG__MAPPING:
				if (mapping != null)
					msgs = ((InternalEObject)mapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransformationsPackage.TRANSFORMATION_CONFIG__MAPPING, null, msgs);
				return basicSetMapping((Mapping)otherEnd, msgs);
			case TransformationsPackage.TRANSFORMATION_CONFIG__OBSERVER:
				if (observer != null)
					msgs = ((InternalEObject)observer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransformationsPackage.TRANSFORMATION_CONFIG__OBSERVER, null, msgs);
				return basicSetObserver((UML2Observer)otherEnd, msgs);
			case TransformationsPackage.TRANSFORMATION_CONFIG__APPLET:
				if (applet != null)
					msgs = ((InternalEObject)applet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransformationsPackage.TRANSFORMATION_CONFIG__APPLET, null, msgs);
				return basicSetApplet((Applet)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TransformationsPackage.TRANSFORMATION_CONFIG__MAPPING:
				return basicSetMapping(null, msgs);
			case TransformationsPackage.TRANSFORMATION_CONFIG__OBSERVER:
				return basicSetObserver(null, msgs);
			case TransformationsPackage.TRANSFORMATION_CONFIG__APPLET:
				return basicSetApplet(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TransformationsPackage.TRANSFORMATION_CONFIG__MAPPING:
				return getMapping();
			case TransformationsPackage.TRANSFORMATION_CONFIG__SAVE_MODELS:
				return getSaveModels();
			case TransformationsPackage.TRANSFORMATION_CONFIG__OBSERVER:
				return getObserver();
			case TransformationsPackage.TRANSFORMATION_CONFIG__APPLET:
				return getApplet();
			case TransformationsPackage.TRANSFORMATION_CONFIG__TARGET_PROJECT:
				return getTargetProject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TransformationsPackage.TRANSFORMATION_CONFIG__MAPPING:
				setMapping((Mapping)newValue);
				return;
			case TransformationsPackage.TRANSFORMATION_CONFIG__SAVE_MODELS:
				setSaveModels((SaveModelType)newValue);
				return;
			case TransformationsPackage.TRANSFORMATION_CONFIG__OBSERVER:
				setObserver((UML2Observer)newValue);
				return;
			case TransformationsPackage.TRANSFORMATION_CONFIG__APPLET:
				setApplet((Applet)newValue);
				return;
			case TransformationsPackage.TRANSFORMATION_CONFIG__TARGET_PROJECT:
				setTargetProject((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TransformationsPackage.TRANSFORMATION_CONFIG__MAPPING:
				setMapping((Mapping)null);
				return;
			case TransformationsPackage.TRANSFORMATION_CONFIG__SAVE_MODELS:
				setSaveModels(SAVE_MODELS_EDEFAULT);
				return;
			case TransformationsPackage.TRANSFORMATION_CONFIG__OBSERVER:
				setObserver((UML2Observer)null);
				return;
			case TransformationsPackage.TRANSFORMATION_CONFIG__APPLET:
				setApplet((Applet)null);
				return;
			case TransformationsPackage.TRANSFORMATION_CONFIG__TARGET_PROJECT:
				setTargetProject(TARGET_PROJECT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TransformationsPackage.TRANSFORMATION_CONFIG__MAPPING:
				return mapping != null;
			case TransformationsPackage.TRANSFORMATION_CONFIG__SAVE_MODELS:
				return saveModels != SAVE_MODELS_EDEFAULT;
			case TransformationsPackage.TRANSFORMATION_CONFIG__OBSERVER:
				return observer != null;
			case TransformationsPackage.TRANSFORMATION_CONFIG__APPLET:
				return applet != null;
			case TransformationsPackage.TRANSFORMATION_CONFIG__TARGET_PROJECT:
				return TARGET_PROJECT_EDEFAULT == null ? targetProject != null : !TARGET_PROJECT_EDEFAULT.equals(targetProject);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (saveModels: ");
		result.append(saveModels);
		result.append(", targetProject: ");
		result.append(targetProject);
		result.append(')');
		return result.toString();
	}

} //TransformationConfigImpl