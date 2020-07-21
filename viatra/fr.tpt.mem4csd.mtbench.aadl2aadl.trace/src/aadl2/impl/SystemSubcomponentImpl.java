/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.SystemSubcomponent;
import aadl2.SystemSubcomponentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.SystemSubcomponentImpl#getSystemSubcomponentType <em>System Subcomponent Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemSubcomponentImpl extends SubcomponentImpl implements SystemSubcomponent {
	/**
	 * The cached value of the '{@link #getSystemSubcomponentType() <em>System Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemSubcomponentType()
	 * @generated
	 * @ordered
	 */
	protected SystemSubcomponentType systemSubcomponentType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemSubcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getSystemSubcomponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemSubcomponentType getSystemSubcomponentType() {
		if (systemSubcomponentType != null && systemSubcomponentType.eIsProxy()) {
			InternalEObject oldSystemSubcomponentType = (InternalEObject)systemSubcomponentType;
			systemSubcomponentType = (SystemSubcomponentType)eResolveProxy(oldSystemSubcomponentType);
			if (systemSubcomponentType != oldSystemSubcomponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.SYSTEM_SUBCOMPONENT__SYSTEM_SUBCOMPONENT_TYPE, oldSystemSubcomponentType, systemSubcomponentType));
			}
		}
		return systemSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSubcomponentType basicGetSystemSubcomponentType() {
		return systemSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemSubcomponentType(SystemSubcomponentType newSystemSubcomponentType) {
		SystemSubcomponentType oldSystemSubcomponentType = systemSubcomponentType;
		systemSubcomponentType = newSystemSubcomponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.SYSTEM_SUBCOMPONENT__SYSTEM_SUBCOMPONENT_TYPE, oldSystemSubcomponentType, systemSubcomponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.SYSTEM_SUBCOMPONENT__SYSTEM_SUBCOMPONENT_TYPE:
				if (resolve) return getSystemSubcomponentType();
				return basicGetSystemSubcomponentType();
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
			case Aadl2Package.SYSTEM_SUBCOMPONENT__SYSTEM_SUBCOMPONENT_TYPE:
				setSystemSubcomponentType((SystemSubcomponentType)newValue);
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
			case Aadl2Package.SYSTEM_SUBCOMPONENT__SYSTEM_SUBCOMPONENT_TYPE:
				setSystemSubcomponentType((SystemSubcomponentType)null);
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
			case Aadl2Package.SYSTEM_SUBCOMPONENT__SYSTEM_SUBCOMPONENT_TYPE:
				return systemSubcomponentType != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemSubcomponentImpl
