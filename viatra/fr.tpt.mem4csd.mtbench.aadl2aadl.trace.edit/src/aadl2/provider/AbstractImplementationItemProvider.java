/**
 */
package aadl2.provider;


import aadl2.Aadl2Factory;
import aadl2.Aadl2Package;
import aadl2.AbstractImplementation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link aadl2.AbstractImplementation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractImplementationItemProvider extends BehavioredImplementationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractImplementationItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedBusSubcomponent());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedDataSubcomponent());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedDeviceSubcomponent());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedMemorySubcomponent());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedProcessSubcomponent());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedProcessorSubcomponent());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedSystemSubcomponent());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedSubprogramSubcomponent());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedSubprogramGroupSubcomponent());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedThreadSubcomponent());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedThreadGroupSubcomponent());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedVirtualBusSubcomponent());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedVirtualProcessorSubcomponent());
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
	 * This returns AbstractImplementation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AbstractImplementation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractImplementation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractImplementation_type") :
			getString("_UI_AbstractImplementation_type") + " " + label;
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

		switch (notification.getFeatureID(AbstractImplementation.class)) {
			case Aadl2Package.ABSTRACT_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
			case Aadl2Package.ABSTRACT_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
			case Aadl2Package.ABSTRACT_IMPLEMENTATION__OWNED_DEVICE_SUBCOMPONENT:
			case Aadl2Package.ABSTRACT_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT:
			case Aadl2Package.ABSTRACT_IMPLEMENTATION__OWNED_PROCESS_SUBCOMPONENT:
			case Aadl2Package.ABSTRACT_IMPLEMENTATION__OWNED_PROCESSOR_SUBCOMPONENT:
			case Aadl2Package.ABSTRACT_IMPLEMENTATION__OWNED_SYSTEM_SUBCOMPONENT:
			case Aadl2Package.ABSTRACT_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
			case Aadl2Package.ABSTRACT_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT:
			case Aadl2Package.ABSTRACT_IMPLEMENTATION__OWNED_THREAD_SUBCOMPONENT:
			case Aadl2Package.ABSTRACT_IMPLEMENTATION__OWNED_THREAD_GROUP_SUBCOMPONENT:
			case Aadl2Package.ABSTRACT_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT:
			case Aadl2Package.ABSTRACT_IMPLEMENTATION__OWNED_VIRTUAL_PROCESSOR_SUBCOMPONENT:
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
				(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedBusSubcomponent(),
				 Aadl2Factory.eINSTANCE.createBusSubcomponent()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedDataSubcomponent(),
				 Aadl2Factory.eINSTANCE.createDataSubcomponent()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedDeviceSubcomponent(),
				 Aadl2Factory.eINSTANCE.createDeviceSubcomponent()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedMemorySubcomponent(),
				 Aadl2Factory.eINSTANCE.createMemorySubcomponent()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedProcessSubcomponent(),
				 Aadl2Factory.eINSTANCE.createProcessSubcomponent()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedProcessorSubcomponent(),
				 Aadl2Factory.eINSTANCE.createProcessorSubcomponent()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedSystemSubcomponent(),
				 Aadl2Factory.eINSTANCE.createSystemSubcomponent()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedSubprogramSubcomponent(),
				 Aadl2Factory.eINSTANCE.createSubprogramSubcomponent()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedSubprogramGroupSubcomponent(),
				 Aadl2Factory.eINSTANCE.createSubprogramGroupSubcomponent()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedThreadSubcomponent(),
				 Aadl2Factory.eINSTANCE.createThreadSubcomponent()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedThreadGroupSubcomponent(),
				 Aadl2Factory.eINSTANCE.createThreadGroupSubcomponent()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedVirtualBusSubcomponent(),
				 Aadl2Factory.eINSTANCE.createVirtualBusSubcomponent()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getAbstractImplementation_OwnedVirtualProcessorSubcomponent(),
				 Aadl2Factory.eINSTANCE.createVirtualProcessorSubcomponent()));
	}

}
