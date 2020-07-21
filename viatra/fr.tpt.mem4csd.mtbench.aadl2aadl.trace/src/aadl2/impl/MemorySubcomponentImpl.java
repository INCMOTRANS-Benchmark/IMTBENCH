/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.MemorySubcomponent;
import aadl2.MemorySubcomponentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.MemorySubcomponentImpl#getMemorySubcomponentType <em>Memory Subcomponent Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemorySubcomponentImpl extends SubcomponentImpl implements MemorySubcomponent {
	/**
	 * The cached value of the '{@link #getMemorySubcomponentType() <em>Memory Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySubcomponentType()
	 * @generated
	 * @ordered
	 */
	protected MemorySubcomponentType memorySubcomponentType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemorySubcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getMemorySubcomponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemorySubcomponentType getMemorySubcomponentType() {
		if (memorySubcomponentType != null && memorySubcomponentType.eIsProxy()) {
			InternalEObject oldMemorySubcomponentType = (InternalEObject)memorySubcomponentType;
			memorySubcomponentType = (MemorySubcomponentType)eResolveProxy(oldMemorySubcomponentType);
			if (memorySubcomponentType != oldMemorySubcomponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.MEMORY_SUBCOMPONENT__MEMORY_SUBCOMPONENT_TYPE, oldMemorySubcomponentType, memorySubcomponentType));
			}
		}
		return memorySubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemorySubcomponentType basicGetMemorySubcomponentType() {
		return memorySubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemorySubcomponentType(MemorySubcomponentType newMemorySubcomponentType) {
		MemorySubcomponentType oldMemorySubcomponentType = memorySubcomponentType;
		memorySubcomponentType = newMemorySubcomponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.MEMORY_SUBCOMPONENT__MEMORY_SUBCOMPONENT_TYPE, oldMemorySubcomponentType, memorySubcomponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.MEMORY_SUBCOMPONENT__MEMORY_SUBCOMPONENT_TYPE:
				if (resolve) return getMemorySubcomponentType();
				return basicGetMemorySubcomponentType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Aadl2Package.MEMORY_SUBCOMPONENT__MEMORY_SUBCOMPONENT_TYPE:
				setMemorySubcomponentType((MemorySubcomponentType)newValue);
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
			case Aadl2Package.MEMORY_SUBCOMPONENT__MEMORY_SUBCOMPONENT_TYPE:
				setMemorySubcomponentType((MemorySubcomponentType)null);
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
			case Aadl2Package.MEMORY_SUBCOMPONENT__MEMORY_SUBCOMPONENT_TYPE:
				return memorySubcomponentType != null;
		}
		return super.eIsSet(featureID);
	}

} //MemorySubcomponentImpl
