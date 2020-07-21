/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.BusSubcomponent;
import aadl2.BusSubcomponentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.BusSubcomponentImpl#getBusSubcomponentType <em>Bus Subcomponent Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusSubcomponentImpl extends SubcomponentImpl implements BusSubcomponent {
	/**
	 * The cached value of the '{@link #getBusSubcomponentType() <em>Bus Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusSubcomponentType()
	 * @generated
	 * @ordered
	 */
	protected BusSubcomponentType busSubcomponentType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusSubcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getBusSubcomponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusSubcomponentType getBusSubcomponentType() {
		if (busSubcomponentType != null && busSubcomponentType.eIsProxy()) {
			InternalEObject oldBusSubcomponentType = (InternalEObject)busSubcomponentType;
			busSubcomponentType = (BusSubcomponentType)eResolveProxy(oldBusSubcomponentType);
			if (busSubcomponentType != oldBusSubcomponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.BUS_SUBCOMPONENT__BUS_SUBCOMPONENT_TYPE, oldBusSubcomponentType, busSubcomponentType));
			}
		}
		return busSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusSubcomponentType basicGetBusSubcomponentType() {
		return busSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBusSubcomponentType(BusSubcomponentType newBusSubcomponentType) {
		BusSubcomponentType oldBusSubcomponentType = busSubcomponentType;
		busSubcomponentType = newBusSubcomponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.BUS_SUBCOMPONENT__BUS_SUBCOMPONENT_TYPE, oldBusSubcomponentType, busSubcomponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.BUS_SUBCOMPONENT__BUS_SUBCOMPONENT_TYPE:
				if (resolve) return getBusSubcomponentType();
				return basicGetBusSubcomponentType();
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
			case Aadl2Package.BUS_SUBCOMPONENT__BUS_SUBCOMPONENT_TYPE:
				setBusSubcomponentType((BusSubcomponentType)newValue);
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
			case Aadl2Package.BUS_SUBCOMPONENT__BUS_SUBCOMPONENT_TYPE:
				setBusSubcomponentType((BusSubcomponentType)null);
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
			case Aadl2Package.BUS_SUBCOMPONENT__BUS_SUBCOMPONENT_TYPE:
				return busSubcomponentType != null;
		}
		return super.eIsSet(featureID);
	}

} //BusSubcomponentImpl
