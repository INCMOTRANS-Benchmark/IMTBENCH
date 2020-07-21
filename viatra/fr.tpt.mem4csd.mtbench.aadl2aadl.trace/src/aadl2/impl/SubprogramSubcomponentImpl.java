/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.SubprogramSubcomponent;
import aadl2.SubprogramSubcomponentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.SubprogramSubcomponentImpl#getSubprogramSubcomponentType <em>Subprogram Subcomponent Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramSubcomponentImpl extends SubcomponentImpl implements SubprogramSubcomponent {
	/**
	 * The cached value of the '{@link #getSubprogramSubcomponentType() <em>Subprogram Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubprogramSubcomponentType()
	 * @generated
	 * @ordered
	 */
	protected SubprogramSubcomponentType subprogramSubcomponentType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprogramSubcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getSubprogramSubcomponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubprogramSubcomponentType getSubprogramSubcomponentType() {
		if (subprogramSubcomponentType != null && subprogramSubcomponentType.eIsProxy()) {
			InternalEObject oldSubprogramSubcomponentType = (InternalEObject)subprogramSubcomponentType;
			subprogramSubcomponentType = (SubprogramSubcomponentType)eResolveProxy(oldSubprogramSubcomponentType);
			if (subprogramSubcomponentType != oldSubprogramSubcomponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.SUBPROGRAM_SUBCOMPONENT__SUBPROGRAM_SUBCOMPONENT_TYPE, oldSubprogramSubcomponentType, subprogramSubcomponentType));
			}
		}
		return subprogramSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramSubcomponentType basicGetSubprogramSubcomponentType() {
		return subprogramSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubprogramSubcomponentType(SubprogramSubcomponentType newSubprogramSubcomponentType) {
		SubprogramSubcomponentType oldSubprogramSubcomponentType = subprogramSubcomponentType;
		subprogramSubcomponentType = newSubprogramSubcomponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.SUBPROGRAM_SUBCOMPONENT__SUBPROGRAM_SUBCOMPONENT_TYPE, oldSubprogramSubcomponentType, subprogramSubcomponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.SUBPROGRAM_SUBCOMPONENT__SUBPROGRAM_SUBCOMPONENT_TYPE:
				if (resolve) return getSubprogramSubcomponentType();
				return basicGetSubprogramSubcomponentType();
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
			case Aadl2Package.SUBPROGRAM_SUBCOMPONENT__SUBPROGRAM_SUBCOMPONENT_TYPE:
				setSubprogramSubcomponentType((SubprogramSubcomponentType)newValue);
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
			case Aadl2Package.SUBPROGRAM_SUBCOMPONENT__SUBPROGRAM_SUBCOMPONENT_TYPE:
				setSubprogramSubcomponentType((SubprogramSubcomponentType)null);
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
			case Aadl2Package.SUBPROGRAM_SUBCOMPONENT__SUBPROGRAM_SUBCOMPONENT_TYPE:
				return subprogramSubcomponentType != null;
		}
		return super.eIsSet(featureID);
	}

} //SubprogramSubcomponentImpl
