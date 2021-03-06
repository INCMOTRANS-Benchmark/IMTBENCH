/**
 */
package aadl2.provider;


import aadl2.Aadl2Factory;
import aadl2.Aadl2Package;
import aadl2.SubprogramType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link aadl2.SubprogramType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubprogramTypeItemProvider extends ComponentTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramTypeItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(Aadl2Package.eINSTANCE.getSubprogramType_OwnedEventDataPort());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getSubprogramType_OwnedEventPort());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getSubprogramType_OwnedParameter());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getSubprogramType_OwnedDataAccess());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getSubprogramType_OwnedSubprogramAccess());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getSubprogramType_OwnedSubprogramGroupAccess());
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
	 * This returns SubprogramType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SubprogramType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SubprogramType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SubprogramType_type") :
			getString("_UI_SubprogramType_type") + " " + label;
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

		switch (notification.getFeatureID(SubprogramType.class)) {
			case Aadl2Package.SUBPROGRAM_TYPE__OWNED_EVENT_DATA_PORT:
			case Aadl2Package.SUBPROGRAM_TYPE__OWNED_EVENT_PORT:
			case Aadl2Package.SUBPROGRAM_TYPE__OWNED_PARAMETER:
			case Aadl2Package.SUBPROGRAM_TYPE__OWNED_DATA_ACCESS:
			case Aadl2Package.SUBPROGRAM_TYPE__OWNED_SUBPROGRAM_ACCESS:
			case Aadl2Package.SUBPROGRAM_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS:
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
				(Aadl2Package.eINSTANCE.getSubprogramType_OwnedEventDataPort(),
				 Aadl2Factory.eINSTANCE.createEventDataPort()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getSubprogramType_OwnedEventPort(),
				 Aadl2Factory.eINSTANCE.createEventPort()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getSubprogramType_OwnedParameter(),
				 Aadl2Factory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getSubprogramType_OwnedDataAccess(),
				 Aadl2Factory.eINSTANCE.createDataAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getSubprogramType_OwnedSubprogramAccess(),
				 Aadl2Factory.eINSTANCE.createSubprogramAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getSubprogramType_OwnedSubprogramGroupAccess(),
				 Aadl2Factory.eINSTANCE.createSubprogramGroupAccess()));
	}

}
