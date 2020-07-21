/**
 */
package instance.provider;


import instance.ComponentInstance;
import instance.InstanceFactory;
import instance.InstancePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link instance.ComponentInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentInstanceItemProvider extends ConnectionInstanceEndItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addCategoryPropertyDescriptor(object);
			addInModePropertyDescriptor(object);
			addSubcomponentPropertyDescriptor(object);
			addIndexPropertyDescriptor(object);
			addClassifierPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInstance_category_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInstance_category_feature", "_UI_ComponentInstance_type"),
				 InstancePackage.Literals.COMPONENT_INSTANCE__CATEGORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the In Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInstance_inMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInstance_inMode_feature", "_UI_ComponentInstance_type"),
				 InstancePackage.Literals.COMPONENT_INSTANCE__IN_MODE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subcomponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubcomponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInstance_subcomponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInstance_subcomponent_feature", "_UI_ComponentInstance_type"),
				 InstancePackage.Literals.COMPONENT_INSTANCE__SUBCOMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInstance_index_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInstance_index_feature", "_UI_ComponentInstance_type"),
				 InstancePackage.Literals.COMPONENT_INSTANCE__INDEX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Classifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInstance_classifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInstance_classifier_feature", "_UI_ComponentInstance_type"),
				 InstancePackage.Literals.COMPONENT_INSTANCE__CLASSIFIER,
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
			childrenFeatures.add(InstancePackage.Literals.COMPONENT_INSTANCE__FEATURE_INSTANCE);
			childrenFeatures.add(InstancePackage.Literals.COMPONENT_INSTANCE__COMPONENT_INSTANCE);
			childrenFeatures.add(InstancePackage.Literals.COMPONENT_INSTANCE__MODE_INSTANCE);
			childrenFeatures.add(InstancePackage.Literals.COMPONENT_INSTANCE__MODE_TRANSITION_INSTANCE);
			childrenFeatures.add(InstancePackage.Literals.COMPONENT_INSTANCE__FLOW_SPECIFICATION);
			childrenFeatures.add(InstancePackage.Literals.COMPONENT_INSTANCE__END_TO_END_FLOW);
			childrenFeatures.add(InstancePackage.Literals.COMPONENT_INSTANCE__CONNECTION_INSTANCE);
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
	 * This returns ComponentInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentInstance"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComponentInstance)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ComponentInstance_type") :
			getString("_UI_ComponentInstance_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentInstance.class)) {
			case InstancePackage.COMPONENT_INSTANCE__CATEGORY:
			case InstancePackage.COMPONENT_INSTANCE__INDEX:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case InstancePackage.COMPONENT_INSTANCE__FEATURE_INSTANCE:
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_INSTANCE:
			case InstancePackage.COMPONENT_INSTANCE__MODE_INSTANCE:
			case InstancePackage.COMPONENT_INSTANCE__MODE_TRANSITION_INSTANCE:
			case InstancePackage.COMPONENT_INSTANCE__FLOW_SPECIFICATION:
			case InstancePackage.COMPONENT_INSTANCE__END_TO_END_FLOW:
			case InstancePackage.COMPONENT_INSTANCE__CONNECTION_INSTANCE:
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
				(InstancePackage.Literals.COMPONENT_INSTANCE__FEATURE_INSTANCE,
				 InstanceFactory.eINSTANCE.createFeatureInstance()));

		newChildDescriptors.add
			(createChildParameter
				(InstancePackage.Literals.COMPONENT_INSTANCE__COMPONENT_INSTANCE,
				 InstanceFactory.eINSTANCE.createComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(InstancePackage.Literals.COMPONENT_INSTANCE__COMPONENT_INSTANCE,
				 InstanceFactory.eINSTANCE.createSystemInstance()));

		newChildDescriptors.add
			(createChildParameter
				(InstancePackage.Literals.COMPONENT_INSTANCE__MODE_INSTANCE,
				 InstanceFactory.eINSTANCE.createModeInstance()));

		newChildDescriptors.add
			(createChildParameter
				(InstancePackage.Literals.COMPONENT_INSTANCE__MODE_TRANSITION_INSTANCE,
				 InstanceFactory.eINSTANCE.createModeTransitionInstance()));

		newChildDescriptors.add
			(createChildParameter
				(InstancePackage.Literals.COMPONENT_INSTANCE__FLOW_SPECIFICATION,
				 InstanceFactory.eINSTANCE.createFlowSpecificationInstance()));

		newChildDescriptors.add
			(createChildParameter
				(InstancePackage.Literals.COMPONENT_INSTANCE__END_TO_END_FLOW,
				 InstanceFactory.eINSTANCE.createEndToEndFlowInstance()));

		newChildDescriptors.add
			(createChildParameter
				(InstancePackage.Literals.COMPONENT_INSTANCE__CONNECTION_INSTANCE,
				 InstanceFactory.eINSTANCE.createConnectionInstance()));
	}

}
