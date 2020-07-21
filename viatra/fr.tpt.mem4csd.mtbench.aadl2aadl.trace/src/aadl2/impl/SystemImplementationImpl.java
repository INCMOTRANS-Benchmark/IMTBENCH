/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.BusSubcomponent;
import aadl2.DataSubcomponent;
import aadl2.DeviceSubcomponent;
import aadl2.MemorySubcomponent;
import aadl2.ProcessSubcomponent;
import aadl2.ProcessorSubcomponent;
import aadl2.SubprogramGroupSubcomponent;
import aadl2.SubprogramSubcomponent;
import aadl2.SystemImplementation;
import aadl2.SystemSubcomponent;
import aadl2.VirtualBusSubcomponent;
import aadl2.VirtualProcessorSubcomponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.SystemImplementationImpl#getOwnedBusSubcomponent <em>Owned Bus Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.SystemImplementationImpl#getOwnedDataSubcomponent <em>Owned Data Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.SystemImplementationImpl#getOwnedDeviceSubcomponent <em>Owned Device Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.SystemImplementationImpl#getOwnedMemorySubcomponent <em>Owned Memory Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.SystemImplementationImpl#getOwnedProcessSubcomponent <em>Owned Process Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.SystemImplementationImpl#getOwnedProcessorSubcomponent <em>Owned Processor Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.SystemImplementationImpl#getOwnedSubprogramSubcomponent <em>Owned Subprogram Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.SystemImplementationImpl#getOwnedSubprogramGroupSubcomponent <em>Owned Subprogram Group Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.SystemImplementationImpl#getOwnedSystemSubcomponent <em>Owned System Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.SystemImplementationImpl#getOwnedVirtualBusSubcomponent <em>Owned Virtual Bus Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.SystemImplementationImpl#getOwnedVirtualProcessorSubcomponent <em>Owned Virtual Processor Subcomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImplementationImpl extends ComponentImplementationImpl implements SystemImplementation {
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
	 * The cached value of the '{@link #getOwnedDeviceSubcomponent() <em>Owned Device Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDeviceSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceSubcomponent> ownedDeviceSubcomponent;

	/**
	 * The cached value of the '{@link #getOwnedMemorySubcomponent() <em>Owned Memory Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMemorySubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<MemorySubcomponent> ownedMemorySubcomponent;

	/**
	 * The cached value of the '{@link #getOwnedProcessSubcomponent() <em>Owned Process Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProcessSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessSubcomponent> ownedProcessSubcomponent;

	/**
	 * The cached value of the '{@link #getOwnedProcessorSubcomponent() <em>Owned Processor Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProcessorSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessorSubcomponent> ownedProcessorSubcomponent;

	/**
	 * The cached value of the '{@link #getOwnedSubprogramSubcomponent() <em>Owned Subprogram Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSubprogramSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<SubprogramSubcomponent> ownedSubprogramSubcomponent;

	/**
	 * The cached value of the '{@link #getOwnedSubprogramGroupSubcomponent() <em>Owned Subprogram Group Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSubprogramGroupSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<SubprogramGroupSubcomponent> ownedSubprogramGroupSubcomponent;

	/**
	 * The cached value of the '{@link #getOwnedSystemSubcomponent() <em>Owned System Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystemSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemSubcomponent> ownedSystemSubcomponent;

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
	 * The cached value of the '{@link #getOwnedVirtualProcessorSubcomponent() <em>Owned Virtual Processor Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedVirtualProcessorSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualProcessorSubcomponent> ownedVirtualProcessorSubcomponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getSystemImplementation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BusSubcomponent> getOwnedBusSubcomponent() {
		if (ownedBusSubcomponent == null) {
			ownedBusSubcomponent = new EObjectContainmentEList<BusSubcomponent>(BusSubcomponent.class, this, Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT);
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
			ownedDataSubcomponent = new EObjectContainmentEList<DataSubcomponent>(DataSubcomponent.class, this, Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT);
		}
		return ownedDataSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceSubcomponent> getOwnedDeviceSubcomponent() {
		if (ownedDeviceSubcomponent == null) {
			ownedDeviceSubcomponent = new EObjectContainmentEList<DeviceSubcomponent>(DeviceSubcomponent.class, this, Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_DEVICE_SUBCOMPONENT);
		}
		return ownedDeviceSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MemorySubcomponent> getOwnedMemorySubcomponent() {
		if (ownedMemorySubcomponent == null) {
			ownedMemorySubcomponent = new EObjectContainmentEList<MemorySubcomponent>(MemorySubcomponent.class, this, Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT);
		}
		return ownedMemorySubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessSubcomponent> getOwnedProcessSubcomponent() {
		if (ownedProcessSubcomponent == null) {
			ownedProcessSubcomponent = new EObjectContainmentEList<ProcessSubcomponent>(ProcessSubcomponent.class, this, Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_PROCESS_SUBCOMPONENT);
		}
		return ownedProcessSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessorSubcomponent> getOwnedProcessorSubcomponent() {
		if (ownedProcessorSubcomponent == null) {
			ownedProcessorSubcomponent = new EObjectContainmentEList<ProcessorSubcomponent>(ProcessorSubcomponent.class, this, Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_PROCESSOR_SUBCOMPONENT);
		}
		return ownedProcessorSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubprogramSubcomponent> getOwnedSubprogramSubcomponent() {
		if (ownedSubprogramSubcomponent == null) {
			ownedSubprogramSubcomponent = new EObjectContainmentEList<SubprogramSubcomponent>(SubprogramSubcomponent.class, this, Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT);
		}
		return ownedSubprogramSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubprogramGroupSubcomponent> getOwnedSubprogramGroupSubcomponent() {
		if (ownedSubprogramGroupSubcomponent == null) {
			ownedSubprogramGroupSubcomponent = new EObjectContainmentEList<SubprogramGroupSubcomponent>(SubprogramGroupSubcomponent.class, this, Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT);
		}
		return ownedSubprogramGroupSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemSubcomponent> getOwnedSystemSubcomponent() {
		if (ownedSystemSubcomponent == null) {
			ownedSystemSubcomponent = new EObjectContainmentEList<SystemSubcomponent>(SystemSubcomponent.class, this, Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_SYSTEM_SUBCOMPONENT);
		}
		return ownedSystemSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VirtualBusSubcomponent> getOwnedVirtualBusSubcomponent() {
		if (ownedVirtualBusSubcomponent == null) {
			ownedVirtualBusSubcomponent = new EObjectContainmentEList<VirtualBusSubcomponent>(VirtualBusSubcomponent.class, this, Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT);
		}
		return ownedVirtualBusSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VirtualProcessorSubcomponent> getOwnedVirtualProcessorSubcomponent() {
		if (ownedVirtualProcessorSubcomponent == null) {
			ownedVirtualProcessorSubcomponent = new EObjectContainmentEList<VirtualProcessorSubcomponent>(VirtualProcessorSubcomponent.class, this, Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_VIRTUAL_PROCESSOR_SUBCOMPONENT);
		}
		return ownedVirtualProcessorSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedBusSubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedDataSubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_DEVICE_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedDeviceSubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedMemorySubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_PROCESS_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedProcessSubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_PROCESSOR_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedProcessorSubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedSubprogramSubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedSubprogramGroupSubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_SYSTEM_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedSystemSubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedVirtualBusSubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_VIRTUAL_PROCESSOR_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedVirtualProcessorSubcomponent()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				return getOwnedBusSubcomponent();
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				return getOwnedDataSubcomponent();
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_DEVICE_SUBCOMPONENT:
				return getOwnedDeviceSubcomponent();
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT:
				return getOwnedMemorySubcomponent();
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_PROCESS_SUBCOMPONENT:
				return getOwnedProcessSubcomponent();
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_PROCESSOR_SUBCOMPONENT:
				return getOwnedProcessorSubcomponent();
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				return getOwnedSubprogramSubcomponent();
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT:
				return getOwnedSubprogramGroupSubcomponent();
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_SYSTEM_SUBCOMPONENT:
				return getOwnedSystemSubcomponent();
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT:
				return getOwnedVirtualBusSubcomponent();
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_VIRTUAL_PROCESSOR_SUBCOMPONENT:
				return getOwnedVirtualProcessorSubcomponent();
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
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				getOwnedBusSubcomponent().clear();
				getOwnedBusSubcomponent().addAll((Collection<? extends BusSubcomponent>)newValue);
				return;
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				getOwnedDataSubcomponent().clear();
				getOwnedDataSubcomponent().addAll((Collection<? extends DataSubcomponent>)newValue);
				return;
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_DEVICE_SUBCOMPONENT:
				getOwnedDeviceSubcomponent().clear();
				getOwnedDeviceSubcomponent().addAll((Collection<? extends DeviceSubcomponent>)newValue);
				return;
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT:
				getOwnedMemorySubcomponent().clear();
				getOwnedMemorySubcomponent().addAll((Collection<? extends MemorySubcomponent>)newValue);
				return;
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_PROCESS_SUBCOMPONENT:
				getOwnedProcessSubcomponent().clear();
				getOwnedProcessSubcomponent().addAll((Collection<? extends ProcessSubcomponent>)newValue);
				return;
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_PROCESSOR_SUBCOMPONENT:
				getOwnedProcessorSubcomponent().clear();
				getOwnedProcessorSubcomponent().addAll((Collection<? extends ProcessorSubcomponent>)newValue);
				return;
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				getOwnedSubprogramSubcomponent().clear();
				getOwnedSubprogramSubcomponent().addAll((Collection<? extends SubprogramSubcomponent>)newValue);
				return;
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT:
				getOwnedSubprogramGroupSubcomponent().clear();
				getOwnedSubprogramGroupSubcomponent().addAll((Collection<? extends SubprogramGroupSubcomponent>)newValue);
				return;
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_SYSTEM_SUBCOMPONENT:
				getOwnedSystemSubcomponent().clear();
				getOwnedSystemSubcomponent().addAll((Collection<? extends SystemSubcomponent>)newValue);
				return;
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT:
				getOwnedVirtualBusSubcomponent().clear();
				getOwnedVirtualBusSubcomponent().addAll((Collection<? extends VirtualBusSubcomponent>)newValue);
				return;
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_VIRTUAL_PROCESSOR_SUBCOMPONENT:
				getOwnedVirtualProcessorSubcomponent().clear();
				getOwnedVirtualProcessorSubcomponent().addAll((Collection<? extends VirtualProcessorSubcomponent>)newValue);
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
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				getOwnedBusSubcomponent().clear();
				return;
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				getOwnedDataSubcomponent().clear();
				return;
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_DEVICE_SUBCOMPONENT:
				getOwnedDeviceSubcomponent().clear();
				return;
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT:
				getOwnedMemorySubcomponent().clear();
				return;
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_PROCESS_SUBCOMPONENT:
				getOwnedProcessSubcomponent().clear();
				return;
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_PROCESSOR_SUBCOMPONENT:
				getOwnedProcessorSubcomponent().clear();
				return;
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				getOwnedSubprogramSubcomponent().clear();
				return;
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT:
				getOwnedSubprogramGroupSubcomponent().clear();
				return;
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_SYSTEM_SUBCOMPONENT:
				getOwnedSystemSubcomponent().clear();
				return;
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT:
				getOwnedVirtualBusSubcomponent().clear();
				return;
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_VIRTUAL_PROCESSOR_SUBCOMPONENT:
				getOwnedVirtualProcessorSubcomponent().clear();
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
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				return ownedBusSubcomponent != null && !ownedBusSubcomponent.isEmpty();
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				return ownedDataSubcomponent != null && !ownedDataSubcomponent.isEmpty();
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_DEVICE_SUBCOMPONENT:
				return ownedDeviceSubcomponent != null && !ownedDeviceSubcomponent.isEmpty();
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT:
				return ownedMemorySubcomponent != null && !ownedMemorySubcomponent.isEmpty();
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_PROCESS_SUBCOMPONENT:
				return ownedProcessSubcomponent != null && !ownedProcessSubcomponent.isEmpty();
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_PROCESSOR_SUBCOMPONENT:
				return ownedProcessorSubcomponent != null && !ownedProcessorSubcomponent.isEmpty();
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				return ownedSubprogramSubcomponent != null && !ownedSubprogramSubcomponent.isEmpty();
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT:
				return ownedSubprogramGroupSubcomponent != null && !ownedSubprogramGroupSubcomponent.isEmpty();
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_SYSTEM_SUBCOMPONENT:
				return ownedSystemSubcomponent != null && !ownedSystemSubcomponent.isEmpty();
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT:
				return ownedVirtualBusSubcomponent != null && !ownedVirtualBusSubcomponent.isEmpty();
			case Aadl2Package.SYSTEM_IMPLEMENTATION__OWNED_VIRTUAL_PROCESSOR_SUBCOMPONENT:
				return ownedVirtualProcessorSubcomponent != null && !ownedVirtualProcessorSubcomponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImplementationImpl
