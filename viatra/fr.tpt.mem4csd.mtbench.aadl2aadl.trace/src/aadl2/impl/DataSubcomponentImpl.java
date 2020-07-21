/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.DataSubcomponent;
import aadl2.DataSubcomponentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.DataSubcomponentImpl#getDataSubcomponentType <em>Data Subcomponent Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSubcomponentImpl extends SubcomponentImpl implements DataSubcomponent {
	/**
	 * The cached value of the '{@link #getDataSubcomponentType() <em>Data Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSubcomponentType()
	 * @generated
	 * @ordered
	 */
	protected DataSubcomponentType dataSubcomponentType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSubcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getDataSubcomponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSubcomponentType getDataSubcomponentType() {
		if (dataSubcomponentType != null && dataSubcomponentType.eIsProxy()) {
			InternalEObject oldDataSubcomponentType = (InternalEObject)dataSubcomponentType;
			dataSubcomponentType = (DataSubcomponentType)eResolveProxy(oldDataSubcomponentType);
			if (dataSubcomponentType != oldDataSubcomponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.DATA_SUBCOMPONENT__DATA_SUBCOMPONENT_TYPE, oldDataSubcomponentType, dataSubcomponentType));
			}
		}
		return dataSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSubcomponentType basicGetDataSubcomponentType() {
		return dataSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSubcomponentType(DataSubcomponentType newDataSubcomponentType) {
		DataSubcomponentType oldDataSubcomponentType = dataSubcomponentType;
		dataSubcomponentType = newDataSubcomponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.DATA_SUBCOMPONENT__DATA_SUBCOMPONENT_TYPE, oldDataSubcomponentType, dataSubcomponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.DATA_SUBCOMPONENT__DATA_SUBCOMPONENT_TYPE:
				if (resolve) return getDataSubcomponentType();
				return basicGetDataSubcomponentType();
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
			case Aadl2Package.DATA_SUBCOMPONENT__DATA_SUBCOMPONENT_TYPE:
				setDataSubcomponentType((DataSubcomponentType)newValue);
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
			case Aadl2Package.DATA_SUBCOMPONENT__DATA_SUBCOMPONENT_TYPE:
				setDataSubcomponentType((DataSubcomponentType)null);
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
			case Aadl2Package.DATA_SUBCOMPONENT__DATA_SUBCOMPONENT_TYPE:
				return dataSubcomponentType != null;
		}
		return super.eIsSet(featureID);
	}

} //DataSubcomponentImpl
