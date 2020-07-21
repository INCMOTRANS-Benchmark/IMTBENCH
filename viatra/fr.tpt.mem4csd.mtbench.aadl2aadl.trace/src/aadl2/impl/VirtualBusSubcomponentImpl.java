/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.VirtualBusSubcomponent;
import aadl2.VirtualBusSubcomponentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Bus Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.VirtualBusSubcomponentImpl#getVirtualBusSubcomponentType <em>Virtual Bus Subcomponent Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualBusSubcomponentImpl extends SubcomponentImpl implements VirtualBusSubcomponent {
	/**
	 * The cached value of the '{@link #getVirtualBusSubcomponentType() <em>Virtual Bus Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualBusSubcomponentType()
	 * @generated
	 * @ordered
	 */
	protected VirtualBusSubcomponentType virtualBusSubcomponentType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualBusSubcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getVirtualBusSubcomponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VirtualBusSubcomponentType getVirtualBusSubcomponentType() {
		if (virtualBusSubcomponentType != null && virtualBusSubcomponentType.eIsProxy()) {
			InternalEObject oldVirtualBusSubcomponentType = (InternalEObject)virtualBusSubcomponentType;
			virtualBusSubcomponentType = (VirtualBusSubcomponentType)eResolveProxy(oldVirtualBusSubcomponentType);
			if (virtualBusSubcomponentType != oldVirtualBusSubcomponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.VIRTUAL_BUS_SUBCOMPONENT__VIRTUAL_BUS_SUBCOMPONENT_TYPE, oldVirtualBusSubcomponentType, virtualBusSubcomponentType));
			}
		}
		return virtualBusSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualBusSubcomponentType basicGetVirtualBusSubcomponentType() {
		return virtualBusSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtualBusSubcomponentType(VirtualBusSubcomponentType newVirtualBusSubcomponentType) {
		VirtualBusSubcomponentType oldVirtualBusSubcomponentType = virtualBusSubcomponentType;
		virtualBusSubcomponentType = newVirtualBusSubcomponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.VIRTUAL_BUS_SUBCOMPONENT__VIRTUAL_BUS_SUBCOMPONENT_TYPE, oldVirtualBusSubcomponentType, virtualBusSubcomponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.VIRTUAL_BUS_SUBCOMPONENT__VIRTUAL_BUS_SUBCOMPONENT_TYPE:
				if (resolve) return getVirtualBusSubcomponentType();
				return basicGetVirtualBusSubcomponentType();
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
			case Aadl2Package.VIRTUAL_BUS_SUBCOMPONENT__VIRTUAL_BUS_SUBCOMPONENT_TYPE:
				setVirtualBusSubcomponentType((VirtualBusSubcomponentType)newValue);
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
			case Aadl2Package.VIRTUAL_BUS_SUBCOMPONENT__VIRTUAL_BUS_SUBCOMPONENT_TYPE:
				setVirtualBusSubcomponentType((VirtualBusSubcomponentType)null);
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
			case Aadl2Package.VIRTUAL_BUS_SUBCOMPONENT__VIRTUAL_BUS_SUBCOMPONENT_TYPE:
				return virtualBusSubcomponentType != null;
		}
		return super.eIsSet(featureID);
	}

} //VirtualBusSubcomponentImpl
