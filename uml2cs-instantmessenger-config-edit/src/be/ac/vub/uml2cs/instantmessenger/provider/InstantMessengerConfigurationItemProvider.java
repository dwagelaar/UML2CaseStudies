/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.instantmessenger.provider;


import be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration;
import be.ac.vub.uml2cs.instantmessenger.InstantmessengerFactory;
import be.ac.vub.uml2cs.instantmessenger.InstantmessengerPackage;

import be.ac.vub.uml2cs.transformations.provider.TransformationConfigItemProvider;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InstantMessengerConfigurationItemProvider
	extends TransformationConfigItemProvider
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
	public InstantMessengerConfigurationItemProvider(AdapterFactory adapterFactory) {
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

			addDeploymentTargetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Deployment Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeploymentTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InstantMessengerConfiguration_deploymentTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InstantMessengerConfiguration_deploymentTarget_feature", "_UI_InstantMessengerConfiguration_type"),
				 InstantmessengerPackage.Literals.INSTANT_MESSENGER_CONFIGURATION__DEPLOYMENT_TARGET,
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
			childrenFeatures.add(InstantmessengerPackage.Literals.INSTANT_MESSENGER_CONFIGURATION__LOCAL_NETWORK);
			childrenFeatures.add(InstantmessengerPackage.Literals.INSTANT_MESSENGER_CONFIGURATION__JABBER_NETWORK);
			childrenFeatures.add(InstantmessengerPackage.Literals.INSTANT_MESSENGER_CONFIGURATION__USER_INTERFACE);
			childrenFeatures.add(InstantmessengerPackage.Literals.INSTANT_MESSENGER_CONFIGURATION__PACKAGING);
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
	 * This returns InstantMessengerConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InstantMessengerConfiguration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((InstantMessengerConfiguration)object).getBuildPath();
		return label == null || label.length() == 0 ?
			getString("_UI_InstantMessengerConfiguration_type") :
			getString("_UI_InstantMessengerConfiguration_type") + " " + label;
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

		switch (notification.getFeatureID(InstantMessengerConfiguration.class)) {
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__DEPLOYMENT_TARGET:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__LOCAL_NETWORK:
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__JABBER_NETWORK:
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__USER_INTERFACE:
			case InstantmessengerPackage.INSTANT_MESSENGER_CONFIGURATION__PACKAGING:
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
				(InstantmessengerPackage.Literals.INSTANT_MESSENGER_CONFIGURATION__LOCAL_NETWORK,
				 InstantmessengerFactory.eINSTANCE.createLocalNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(InstantmessengerPackage.Literals.INSTANT_MESSENGER_CONFIGURATION__JABBER_NETWORK,
				 InstantmessengerFactory.eINSTANCE.createJabberNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(InstantmessengerPackage.Literals.INSTANT_MESSENGER_CONFIGURATION__USER_INTERFACE,
				 InstantmessengerFactory.eINSTANCE.createAWTUserInterface()));

		newChildDescriptors.add
			(createChildParameter
				(InstantmessengerPackage.Literals.INSTANT_MESSENGER_CONFIGURATION__USER_INTERFACE,
				 InstantmessengerFactory.eINSTANCE.createSwingUserInterface()));

		newChildDescriptors.add
			(createChildParameter
				(InstantmessengerPackage.Literals.INSTANT_MESSENGER_CONFIGURATION__USER_INTERFACE,
				 InstantmessengerFactory.eINSTANCE.createLCDUIUserInterface()));

		newChildDescriptors.add
			(createChildParameter
				(InstantmessengerPackage.Literals.INSTANT_MESSENGER_CONFIGURATION__PACKAGING,
				 InstantmessengerFactory.eINSTANCE.createWebAppletPackaging()));

		newChildDescriptors.add
			(createChildParameter
				(InstantmessengerPackage.Literals.INSTANT_MESSENGER_CONFIGURATION__PACKAGING,
				 InstantmessengerFactory.eINSTANCE.createIpkgAppletPackaging()));

		newChildDescriptors.add
			(createChildParameter
				(InstantmessengerPackage.Literals.INSTANT_MESSENGER_CONFIGURATION__PACKAGING,
				 InstantmessengerFactory.eINSTANCE.createMIDletPackaging()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return InstantMessengerEditPlugin.INSTANCE;
	}

}
