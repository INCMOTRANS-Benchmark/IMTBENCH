/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.BusSubcomponent;
import aadl2.MemorySubcomponent;
import aadl2.ProcessorImplementation;
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
 * An implementation of the model object '<em><b>Processor Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ProcessorImplementationImpl#getOwnedBusSubcomponent <em>Owned Bus Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.ProcessorImplementationImpl#getOwnedMemorySubcomponent <em>Owned Memory Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.ProcessorImplementationImpl#getOwnedVirtualBusSubcomponent <em>Owned Virtual Bus Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.ProcessorImplementationImpl#getOwnedVirtualProcessorSubcomponent <em>Owned Virtual Processor Subcomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessorImplementationImpl extends ComponentImplementationImpl implements ProcessorImplementation {
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
	 * The cached value of the '{@link #getOwnedMemorySubcomponent() <em>Owned Memory Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMemorySubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<MemorySubcomponent> ownedMemorySubcomponent;

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
	protected ProcessorImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getProcessorImplementation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BusSubcomponent> getOwnedBusSubcomponent() {
		if (ownedBusSubcomponent == null) {
			ownedBusSubcomponent = new EObjectContainmentEList<BusSubcomponent>(BusSubcomponent.class, this, Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT);
		}
		return ownedBusSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MemorySubcomponent> getOwnedMemorySubcomponent() {
		if (ownedMemorySubcomponent == null) {
			ownedMemorySubcomponent = new EObjectContainmentEList<MemorySubcomponent>(MemorySubcomponent.class, this, Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT);
		}
		return ownedMemorySubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VirtualBusSubcomponent> getOwnedVirtualBusSubcomponent() {
		if (ownedVirtualBusSubcomponent == null) {
			ownedVirtualBusSubcomponent = new EObjectContainmentEList<VirtualBusSubcomponent>(VirtualBusSubcomponent.class, this, Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT);
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
			ownedVirtualProcessorSubcomponent = new EObjectContainmentEList<VirtualProcessorSubcomponent>(VirtualProcessorSubcomponent.class, this, Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_VIRTUAL_PROCESSOR_SUBCOMPONENT);
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
			case Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedBusSubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedMemorySubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedVirtualBusSubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_VIRTUAL_PROCESSOR_SUBCOMPONENT:
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
			case Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				return getOwnedBusSubcomponent();
			case Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT:
				return getOwnedMemorySubcomponent();
			case Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT:
				return getOwnedVirtualBusSubcomponent();
			case Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_VIRTUAL_PROCESSOR_SUBCOMPONENT:
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
			case Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				getOwnedBusSubcomponent().clear();
				getOwnedBusSubcomponent().addAll((Collection<? extends BusSubcomponent>)newValue);
				return;
			case Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT:
				getOwnedMemorySubcomponent().clear();
				getOwnedMemorySubcomponent().addAll((Collection<? extends MemorySubcomponent>)newValue);
				return;
			case Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT:
				getOwnedVirtualBusSubcomponent().clear();
				getOwnedVirtualBusSubcomponent().addAll((Collection<? extends VirtualBusSubcomponent>)newValue);
				return;
			case Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_VIRTUAL_PROCESSOR_SUBCOMPONENT:
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
			case Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				getOwnedBusSubcomponent().clear();
				return;
			case Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT:
				getOwnedMemorySubcomponent().clear();
				return;
			case Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT:
				getOwnedVirtualBusSubcomponent().clear();
				return;
			case Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_VIRTUAL_PROCESSOR_SUBCOMPONENT:
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
			case Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				return ownedBusSubcomponent != null && !ownedBusSubcomponent.isEmpty();
			case Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT:
				return ownedMemorySubcomponent != null && !ownedMemorySubcomponent.isEmpty();
			case Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT:
				return ownedVirtualBusSubcomponent != null && !ownedVirtualBusSubcomponent.isEmpty();
			case Aadl2Package.PROCESSOR_IMPLEMENTATION__OWNED_VIRTUAL_PROCESSOR_SUBCOMPONENT:
				return ownedVirtualProcessorSubcomponent != null && !ownedVirtualProcessorSubcomponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessorImplementationImpl
