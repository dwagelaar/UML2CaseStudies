/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.transformations.provider;

import be.ac.vub.uml2cs.transformations.util.TransformationsAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformationsItemProviderAdapterFactory extends TransformationsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(C) 2007, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link be.ac.vub.uml2cs.transformations.TransformationConfig} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationConfigItemProvider transformationConfigItemProvider;

	/**
	 * This creates an adapter for a {@link be.ac.vub.uml2cs.transformations.TransformationConfig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransformationConfigAdapter() {
		if (transformationConfigItemProvider == null) {
			transformationConfigItemProvider = new TransformationConfigItemProvider(this);
		}

		return transformationConfigItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link be.ac.vub.uml2cs.transformations.JavaMapping} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaMappingItemProvider javaMappingItemProvider;

	/**
	 * This creates an adapter for a {@link be.ac.vub.uml2cs.transformations.JavaMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJavaMappingAdapter() {
		if (javaMappingItemProvider == null) {
			javaMappingItemProvider = new JavaMappingItemProvider(this);
		}

		return javaMappingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link be.ac.vub.uml2cs.transformations.Java1DataTypes} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Java1DataTypesItemProvider java1DataTypesItemProvider;

	/**
	 * This creates an adapter for a {@link be.ac.vub.uml2cs.transformations.Java1DataTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJava1DataTypesAdapter() {
		if (java1DataTypesItemProvider == null) {
			java1DataTypesItemProvider = new Java1DataTypesItemProvider(this);
		}

		return java1DataTypesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link be.ac.vub.uml2cs.transformations.Java2DataTypes} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Java2DataTypesItemProvider java2DataTypesItemProvider;

	/**
	 * This creates an adapter for a {@link be.ac.vub.uml2cs.transformations.Java2DataTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJava2DataTypesAdapter() {
		if (java2DataTypesItemProvider == null) {
			java2DataTypesItemProvider = new Java2DataTypesItemProvider(this);
		}

		return java2DataTypesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link be.ac.vub.uml2cs.transformations.UML2Observer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UML2ObserverItemProvider uml2ObserverItemProvider;

	/**
	 * This creates an adapter for a {@link be.ac.vub.uml2cs.transformations.UML2Observer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUML2ObserverAdapter() {
		if (uml2ObserverItemProvider == null) {
			uml2ObserverItemProvider = new UML2ObserverItemProvider(this);
		}

		return uml2ObserverItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link be.ac.vub.uml2cs.transformations.UML2JavaObserver} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UML2JavaObserverItemProvider uml2JavaObserverItemProvider;

	/**
	 * This creates an adapter for a {@link be.ac.vub.uml2cs.transformations.UML2JavaObserver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUML2JavaObserverAdapter() {
		if (uml2JavaObserverItemProvider == null) {
			uml2JavaObserverItemProvider = new UML2JavaObserverItemProvider(this);
		}

		return uml2JavaObserverItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link be.ac.vub.uml2cs.transformations.UML2Applet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UML2AppletItemProvider uml2AppletItemProvider;

	/**
	 * This creates an adapter for a {@link be.ac.vub.uml2cs.transformations.UML2Applet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUML2AppletAdapter() {
		if (uml2AppletItemProvider == null) {
			uml2AppletItemProvider = new UML2AppletItemProvider(this);
		}

		return uml2AppletItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link be.ac.vub.uml2cs.transformations.UML2MIDlet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UML2MIDletItemProvider uml2MIDletItemProvider;

	/**
	 * This creates an adapter for a {@link be.ac.vub.uml2cs.transformations.UML2MIDlet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUML2MIDletAdapter() {
		if (uml2MIDletItemProvider == null) {
			uml2MIDletItemProvider = new UML2MIDletItemProvider(this);
		}

		return uml2MIDletItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (transformationConfigItemProvider != null) transformationConfigItemProvider.dispose();
		if (javaMappingItemProvider != null) javaMappingItemProvider.dispose();
		if (java1DataTypesItemProvider != null) java1DataTypesItemProvider.dispose();
		if (java2DataTypesItemProvider != null) java2DataTypesItemProvider.dispose();
		if (uml2ObserverItemProvider != null) uml2ObserverItemProvider.dispose();
		if (uml2JavaObserverItemProvider != null) uml2JavaObserverItemProvider.dispose();
		if (uml2AppletItemProvider != null) uml2AppletItemProvider.dispose();
		if (uml2MIDletItemProvider != null) uml2MIDletItemProvider.dispose();
	}

}
