/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.transformations.provider;


import be.ac.vub.uml2cs.transformations.SaveModelType;
import be.ac.vub.uml2cs.transformations.TransformationConfig;
import be.ac.vub.uml2cs.transformations.TransformationsFactory;
import be.ac.vub.uml2cs.transformations.TransformationsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link be.ac.vub.uml2cs.transformations.TransformationConfig} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformationConfigItemProvider
	extends ItemProviderAdapter
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(C) 2007, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationConfigItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSaveModelsPropertyDescriptor(object);
			addTargetProjectPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Save Models feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSaveModelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TransformationConfig_saveModels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TransformationConfig_saveModels_feature", "_UI_TransformationConfig_type"),
				 TransformationsPackage.Literals.TRANSFORMATION_CONFIG__SAVE_MODELS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Project feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetProjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TransformationConfig_targetProject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TransformationConfig_targetProject_feature", "_UI_TransformationConfig_type"),
				 TransformationsPackage.Literals.TRANSFORMATION_CONFIG__TARGET_PROJECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TransformationsPackage.Literals.TRANSFORMATION_CONFIG__MAPPING);
			childrenFeatures.add(TransformationsPackage.Literals.TRANSFORMATION_CONFIG__OBSERVER);
			childrenFeatures.add(TransformationsPackage.Literals.TRANSFORMATION_CONFIG__APPLET);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TransformationConfig.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TransformationConfig"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((TransformationConfig)object).getTargetProject();
		return label == null || label.length() == 0 ?
			getString("_UI_TransformationConfig_type") :
			getString("_UI_TransformationConfig_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TransformationConfig.class)) {
			case TransformationsPackage.TRANSFORMATION_CONFIG__SAVE_MODELS:
			case TransformationsPackage.TRANSFORMATION_CONFIG__TARGET_PROJECT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TransformationsPackage.TRANSFORMATION_CONFIG__MAPPING:
			case TransformationsPackage.TRANSFORMATION_CONFIG__OBSERVER:
			case TransformationsPackage.TRANSFORMATION_CONFIG__APPLET:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TransformationsPackage.Literals.TRANSFORMATION_CONFIG__MAPPING,
				 TransformationsFactory.eINSTANCE.createJavaMapping()));

		newChildDescriptors.add
			(createChildParameter
				(TransformationsPackage.Literals.TRANSFORMATION_CONFIG__OBSERVER,
				 TransformationsFactory.eINSTANCE.createUML2Observer()));

		newChildDescriptors.add
			(createChildParameter
				(TransformationsPackage.Literals.TRANSFORMATION_CONFIG__OBSERVER,
				 TransformationsFactory.eINSTANCE.createUML2JavaObserver()));

		newChildDescriptors.add
			(createChildParameter
				(TransformationsPackage.Literals.TRANSFORMATION_CONFIG__APPLET,
				 TransformationsFactory.eINSTANCE.createUML2Applet()));

		newChildDescriptors.add
			(createChildParameter
				(TransformationsPackage.Literals.TRANSFORMATION_CONFIG__APPLET,
				 TransformationsFactory.eINSTANCE.createUML2MIDlet()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return TransformationsEditPlugin.INSTANCE;
	}

}
