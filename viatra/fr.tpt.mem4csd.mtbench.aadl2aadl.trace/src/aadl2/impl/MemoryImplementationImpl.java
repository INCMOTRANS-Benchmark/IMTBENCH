/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.BusSubcomponent;
import aadl2.MemoryImplementation;
import aadl2.MemorySubcomponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.MemoryImplementationImpl#getOwnedBusSubcomponent <em>Owned Bus Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.MemoryImplementationImpl#getOwnedMemorySubcomponent <em>Owned Memory Subcomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryImplementationImpl extends ComponentImplementationImpl implements MemoryImplementation {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getMemoryImplementation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BusSubcomponent> getOwnedBusSubcomponent() {
		if (ownedBusSubcomponent == null) {
			ownedBusSubcomponent = new EObjectContainmentEList<BusSubcomponent>(BusSubcomponent.class, this, Aadl2Package.MEMORY_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT);
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
			ownedMemorySubcomponent = new EObjectContainmentEList<MemorySubcomponent>(MemorySubcomponent.class, this, Aadl2Package.MEMORY_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT);
		}
		return ownedMemorySubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.MEMORY_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedBusSubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.MEMORY_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedMemorySubcomponent()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.MEMORY_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				return getOwnedBusSubcomponent();
			case Aadl2Package.MEMORY_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT:
				return getOwnedMemorySubcomponent();
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
			case Aadl2Package.MEMORY_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				getOwnedBusSubcomponent().clear();
				getOwnedBusSubcomponent().addAll((Collection<? extends BusSubcomponent>)newValue);
				return;
			case Aadl2Package.MEMORY_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT:
				getOwnedMemorySubcomponent().clear();
				getOwnedMemorySubcomponent().addAll((Collection<? extends MemorySubcomponent>)newValue);
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
			case Aadl2Package.MEMORY_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				getOwnedBusSubcomponent().clear();
				return;
			case Aadl2Package.MEMORY_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT:
				getOwnedMemorySubcomponent().clear();
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
			case Aadl2Package.MEMORY_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				return ownedBusSubcomponent != null && !ownedBusSubcomponent.isEmpty();
			case Aadl2Package.MEMORY_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT:
				return ownedMemorySubcomponent != null && !ownedMemorySubcomponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MemoryImplementationImpl
