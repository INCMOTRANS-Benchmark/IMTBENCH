/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.VirtualBusImplementation;
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
 * An implementation of the model object '<em><b>Virtual Bus Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.VirtualBusImplementationImpl#getOwnedVirtualBusSubcomponent <em>Owned Virtual Bus Subcomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualBusImplementationImpl extends ComponentImplementationImpl implements VirtualBusImplementation {
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
	protected VirtualBusImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getVirtualBusImplementation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VirtualBusSubcomponent> getOwnedVirtualBusSubcomponent() {
		if (ownedVirtualBusSubcomponent == null) {
			ownedVirtualBusSubcomponent = new EObjectContainmentEList<VirtualBusSubcomponent>(VirtualBusSubcomponent.class, this, Aadl2Package.VIRTUAL_BUS_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT);
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
			case Aadl2Package.VIRTUAL_BUS_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT:
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
			case Aadl2Package.VIRTUAL_BUS_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT:
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
			case Aadl2Package.VIRTUAL_BUS_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT:
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
			case Aadl2Package.VIRTUAL_BUS_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT:
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
			case Aadl2Package.VIRTUAL_BUS_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT:
				return ownedVirtualBusSubcomponent != null && !ownedVirtualBusSubcomponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VirtualBusImplementationImpl
