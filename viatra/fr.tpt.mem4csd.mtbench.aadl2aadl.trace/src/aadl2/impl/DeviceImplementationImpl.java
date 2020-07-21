/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.BusSubcomponent;
import aadl2.DataSubcomponent;
import aadl2.DeviceImplementation;
import aadl2.VirtualBusSubcomponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.DeviceImplementationImpl#getOwnedBusSubcomponent <em>Owned Bus Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.DeviceImplementationImpl#getOwnedDataSubcomponent <em>Owned Data Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.DeviceImplementationImpl#getOwnedVirtualBusSubcomponent <em>Owned Virtual Bus Subcomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImplementationImpl extends ComponentImplementationImpl implements DeviceImplementation {
	/**
	 * The cached value of the '{@link #getOwnedBusSubcomponent() <em>Owned Bus Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBusSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<BusSubcomponent> ownedBusSubcomponent;

	/**
	 * The cached value of the '{@link #getOwnedDataSubcomponent() <em>Owned Data Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDataSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSubcomponent> ownedDataSubcomponent;

	/**
	 * The cached value of the '{@link #getOwnedVirtualBusSubcomponent() <em>Owned Virtual Bus Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedVirtualBusSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualBusSubcomponent> ownedVirtualBusSubcomponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getDeviceImplementation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BusSubcomponent> getOwnedBusSubcomponent() {
		if (ownedBusSubcomponent == null) {
			ownedBusSubcomponent = new EObjectContainmentEList<BusSubcomponent>(BusSubcomponent.class, this, Aadl2Package.DEVICE_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT);
		}
		return ownedBusSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSubcomponent> getOwnedDataSubcomponent() {
		if (ownedDataSubcomponent == null) {
			ownedDataSubcomponent = new EObjectContainmentEList<DataSubcomponent>(DataSubcomponent.class, this, Aadl2Package.DEVICE_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT);
		}
		return ownedDataSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VirtualBusSubcomponent> getOwnedVirtualBusSubcomponent() {
		if (ownedVirtualBusSubcomponent == null) {
			ownedVirtualBusSubcomponent = new EObjectContainmentEList<VirtualBusSubcomponent>(VirtualBusSubcomponent.class, this, Aadl2Package.DEVICE_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT);
		}
		return ownedVirtualBusSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.DEVICE_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedBusSubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.DEVICE_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedDataSubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.DEVICE_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedVirtualBusSubcomponent()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.DEVICE_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				return getOwnedBusSubcomponent();
			case Aadl2Package.DEVICE_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				return getOwnedDataSubcomponent();
			case Aadl2Package.DEVICE_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT:
				return getOwnedVirtualBusSubcomponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Aadl2Package.DEVICE_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				getOwnedBusSubcomponent().clear();
				getOwnedBusSubcomponent().addAll((Collection<? extends BusSubcomponent>)newValue);
				return;
			case Aadl2Package.DEVICE_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				getOwnedDataSubcomponent().clear();
				getOwnedDataSubcomponent().addAll((Collection<? extends DataSubcomponent>)newValue);
				return;
			case Aadl2Package.DEVICE_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT:
				getOwnedVirtualBusSubcomponent().clear();
				getOwnedVirtualBusSubcomponent().addAll((Collection<? extends VirtualBusSubcomponent>)newValue);
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
			case Aadl2Package.DEVICE_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				getOwnedBusSubcomponent().clear();
				return;
			case Aadl2Package.DEVICE_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				getOwnedDataSubcomponent().clear();
				return;
			case Aadl2Package.DEVICE_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT:
				getOwnedVirtualBusSubcomponent().clear();
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
			case Aadl2Package.DEVICE_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				return ownedBusSubcomponent != null && !ownedBusSubcomponent.isEmpty();
			case Aadl2Package.DEVICE_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				return ownedDataSubcomponent != null && !ownedDataSubcomponent.isEmpty();
			case Aadl2Package.DEVICE_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT:
				return ownedVirtualBusSubcomponent != null && !ownedVirtualBusSubcomponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceImplementationImpl
