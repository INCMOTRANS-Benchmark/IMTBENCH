/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.DeviceSubcomponent;
import aadl2.DeviceSubcomponentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.DeviceSubcomponentImpl#getDeviceSubcomponentType <em>Device Subcomponent Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceSubcomponentImpl extends SubcomponentImpl implements DeviceSubcomponent {
	/**
	 * The cached value of the '{@link #getDeviceSubcomponentType() <em>Device Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceSubcomponentType()
	 * @generated
	 * @ordered
	 */
	protected DeviceSubcomponentType deviceSubcomponentType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceSubcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getDeviceSubcomponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceSubcomponentType getDeviceSubcomponentType() {
		if (deviceSubcomponentType != null && deviceSubcomponentType.eIsProxy()) {
			InternalEObject oldDeviceSubcomponentType = (InternalEObject)deviceSubcomponentType;
			deviceSubcomponentType = (DeviceSubcomponentType)eResolveProxy(oldDeviceSubcomponentType);
			if (deviceSubcomponentType != oldDeviceSubcomponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.DEVICE_SUBCOMPONENT__DEVICE_SUBCOMPONENT_TYPE, oldDeviceSubcomponentType, deviceSubcomponentType));
			}
		}
		return deviceSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceSubcomponentType basicGetDeviceSubcomponentType() {
		return deviceSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceSubcomponentType(DeviceSubcomponentType newDeviceSubcomponentType) {
		DeviceSubcomponentType oldDeviceSubcomponentType = deviceSubcomponentType;
		deviceSubcomponentType = newDeviceSubcomponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.DEVICE_SUBCOMPONENT__DEVICE_SUBCOMPONENT_TYPE, oldDeviceSubcomponentType, deviceSubcomponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.DEVICE_SUBCOMPONENT__DEVICE_SUBCOMPONENT_TYPE:
				if (resolve) return getDeviceSubcomponentType();
				return basicGetDeviceSubcomponentType();
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
			case Aadl2Package.DEVICE_SUBCOMPONENT__DEVICE_SUBCOMPONENT_TYPE:
				setDeviceSubcomponentType((DeviceSubcomponentType)newValue);
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
			case Aadl2Package.DEVICE_SUBCOMPONENT__DEVICE_SUBCOMPONENT_TYPE:
				setDeviceSubcomponentType((DeviceSubcomponentType)null);
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
			case Aadl2Package.DEVICE_SUBCOMPONENT__DEVICE_SUBCOMPONENT_TYPE:
				return deviceSubcomponentType != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceSubcomponentImpl
