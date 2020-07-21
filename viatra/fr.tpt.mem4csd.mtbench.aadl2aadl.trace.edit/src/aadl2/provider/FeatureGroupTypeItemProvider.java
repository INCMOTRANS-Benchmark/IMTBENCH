/**
 */
package aadl2.provider;


import aadl2.Aadl2Factory;
import aadl2.Aadl2Package;
import aadl2.FeatureGroupType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link aadl2.FeatureGroupType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureGroupTypeItemProvider extends ClassifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroupTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOwnedFeaturePropertyDescriptor(object);
			addExtendedPropertyDescriptor(object);
			addInversePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Owned Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureGroupType_ownedFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureGroupType_ownedFeature_feature", "_UI_FeatureGroupType_type"),
				 Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedFeature(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extended feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureGroupType_extended_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureGroupType_extended_feature", "_UI_FeatureGroupType_type"),
				 Aadl2Package.eINSTANCE.getFeatureGroupType_Extended(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inverse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInversePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureGroupType_inverse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureGroupType_inverse_feature", "_UI_FeatureGroupType_type"),
				 Aadl2Package.eINSTANCE.getFeatureGroupType_Inverse(),
				 true,
				 false,
				 true,
				 null,
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
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedExtension());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedBusAccess());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedDataAccess());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedDataPort());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedEventDataPort());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedEventPort());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedFeatureGroup());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedParameter());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedSubprogramAccess());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedSubprogramGroupAccess());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedAbstractFeature());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FeatureGroupType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FeatureGroupType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FeatureGroupType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FeatureGroupType_type") :
			getString("_UI_FeatureGroupType_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FeatureGroupType.class)) {
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EXTENSION:
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_BUS_ACCESS:
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_DATA_ACCESS:
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_DATA_PORT:
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EVENT_DATA_PORT:
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EVENT_PORT:
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_FEATURE_GROUP:
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_PARAMETER:
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_SUBPROGRAM_ACCESS:
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS:
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_ABSTRACT_FEATURE:
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
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedExtension(),
				 Aadl2Factory.eINSTANCE.createGroupExtension()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedBusAccess(),
				 Aadl2Factory.eINSTANCE.createBusAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedDataAccess(),
				 Aadl2Factory.eINSTANCE.createDataAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedDataPort(),
				 Aadl2Factory.eINSTANCE.createDataPort()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedEventDataPort(),
				 Aadl2Factory.eINSTANCE.createEventDataPort()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedEventPort(),
				 Aadl2Factory.eINSTANCE.createEventPort()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedFeatureGroup(),
				 Aadl2Factory.eINSTANCE.createFeatureGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedParameter(),
				 Aadl2Factory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedSubprogramAccess(),
				 Aadl2Factory.eINSTANCE.createSubprogramAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedSubprogramGroupAccess(),
				 Aadl2Factory.eINSTANCE.createSubprogramGroupAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getFeatureGroupType_OwnedAbstractFeature(),
				 Aadl2Factory.eINSTANCE.createAbstractFeature()));
	}

}
