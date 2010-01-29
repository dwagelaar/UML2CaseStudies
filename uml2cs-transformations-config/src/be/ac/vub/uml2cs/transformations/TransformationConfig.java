/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.transformations;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Root node for a transformation configuration model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.uml2cs.transformations.TransformationConfig#getMapping <em>Mapping</em>}</li>
 *   <li>{@link be.ac.vub.uml2cs.transformations.TransformationConfig#getSaveModels <em>Save Models</em>}</li>
 *   <li>{@link be.ac.vub.uml2cs.transformations.TransformationConfig#getObserver <em>Observer</em>}</li>
 *   <li>{@link be.ac.vub.uml2cs.transformations.TransformationConfig#getApplet <em>Applet</em>}</li>
 *   <li>{@link be.ac.vub.uml2cs.transformations.TransformationConfig#getTargetProject <em>Target Project</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.uml2cs.transformations.TransformationsPackage#getTransformationConfig()
 * @model
 * @generated
 */
public interface TransformationConfig extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "(C) 2007-2009, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.uml2cs.transformations.Mapping#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Programming language mapping to use
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference.
	 * @see #setMapping(Mapping)
	 * @see be.ac.vub.uml2cs.transformations.TransformationsPackage#getTransformationConfig_Mapping()
	 * @see be.ac.vub.uml2cs.transformations.Mapping#getConfig
	 * @model opposite="config" containment="true" required="true"
	 * @generated
	 */
	Mapping getMapping();

	/**
	 * Sets the value of the '{@link be.ac.vub.uml2cs.transformations.TransformationConfig#getMapping <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' containment reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(Mapping value);

	/**
	 * Returns the value of the '<em><b>Save Models</b></em>' attribute.
	 * The literals are from the enumeration {@link be.ac.vub.uml2cs.transformations.SaveModelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Save Models</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Select whether to save all intermediate models, save only the last model or don't save models
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Save Models</em>' attribute.
	 * @see be.ac.vub.uml2cs.transformations.SaveModelType
	 * @see #setSaveModels(SaveModelType)
	 * @see be.ac.vub.uml2cs.transformations.TransformationsPackage#getTransformationConfig_SaveModels()
	 * @model required="true"
	 * @generated
	 */
	SaveModelType getSaveModels();

	/**
	 * Sets the value of the '{@link be.ac.vub.uml2cs.transformations.TransformationConfig#getSaveModels <em>Save Models</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Save Models</em>' attribute.
	 * @see be.ac.vub.uml2cs.transformations.SaveModelType
	 * @see #getSaveModels()
	 * @generated
	 */
	void setSaveModels(SaveModelType value);

	/**
	 * Returns the value of the '<em><b>Observer</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.uml2cs.transformations.UML2Observer#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Variant of UML2Observer transformation to use
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observer</em>' containment reference.
	 * @see #setObserver(UML2Observer)
	 * @see be.ac.vub.uml2cs.transformations.TransformationsPackage#getTransformationConfig_Observer()
	 * @see be.ac.vub.uml2cs.transformations.UML2Observer#getConfig
	 * @model opposite="config" containment="true" required="true"
	 * @generated
	 */
	UML2Observer getObserver();

	/**
	 * Sets the value of the '{@link be.ac.vub.uml2cs.transformations.TransformationConfig#getObserver <em>Observer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observer</em>' containment reference.
	 * @see #getObserver()
	 * @generated
	 */
	void setObserver(UML2Observer value);

	/**
	 * Returns the value of the '<em><b>Applet</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link be.ac.vub.uml2cs.transformations.Applet#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Variant of UML2Applet transformation to use
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applet</em>' containment reference.
	 * @see #setApplet(Applet)
	 * @see be.ac.vub.uml2cs.transformations.TransformationsPackage#getTransformationConfig_Applet()
	 * @see be.ac.vub.uml2cs.transformations.Applet#getConfig
	 * @model opposite="config" containment="true" required="true"
	 * @generated
	 */
	Applet getApplet();

	/**
	 * Sets the value of the '{@link be.ac.vub.uml2cs.transformations.TransformationConfig#getApplet <em>Applet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applet</em>' containment reference.
	 * @see #getApplet()
	 * @generated
	 */
	void setApplet(Applet value);

	/**
	 * Returns the value of the '<em><b>Target Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target Eclipse project in which build files and code will be generated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Project</em>' attribute.
	 * @see #setTargetProject(String)
	 * @see be.ac.vub.uml2cs.transformations.TransformationsPackage#getTransformationConfig_TargetProject()
	 * @model required="true"
	 * @generated
	 */
	String getTargetProject();

	/**
	 * Sets the value of the '{@link be.ac.vub.uml2cs.transformations.TransformationConfig#getTargetProject <em>Target Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Project</em>' attribute.
	 * @see #getTargetProject()
	 * @generated
	 */
	void setTargetProject(String value);

} // TransformationConfig