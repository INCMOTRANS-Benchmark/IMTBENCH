/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.SubprogramGroupSubcomponent;
import aadl2.SubprogramGroupSubcomponentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Group Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.SubprogramGroupSubcomponentImpl#getSubprogramGroupSubcomponentType <em>Subprogram Group Subcomponent Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramGroupSubcomponentImpl extends SubcomponentImpl implements SubprogramGroupSubcomponent {
	/**
	 * The cached value of the '{@link #getSubprogramGroupSubcomponentType() <em>Subprogram Group Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubprogramGroupSubcomponentType()
	 * @generated
	 * @ordered
	 */
	protected SubprogramGroupSubcomponentType subprogramGroupSubcomponentType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprogramGroupSubcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getSubprogramGroupSubcomponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubprogramGroupSubcomponentType getSubprogramGroupSubcomponentType() {
		if (subprogramGroupSubcomponentType != null && subprogramGroupSubcomponentType.eIsProxy()) {
			InternalEObject oldSubprogramGroupSubcomponentType = (InternalEObject)subprogramGroupSubcomponentType;
			subprogramGroupSubcomponentType = (SubprogramGroupSubcomponentType)eResolveProxy(oldSubprogramGroupSubcomponentType);
			if (subprogramGroupSubcomponentType != oldSubprogramGroupSubcomponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.SUBPROGRAM_GROUP_SUBCOMPONENT__SUBPROGRAM_GROUP_SUBCOMPONENT_TYPE, oldSubprogramGroupSubcomponentType, subprogramGroupSubcomponentType));
			}
		}
		return subprogramGroupSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramGroupSubcomponentType basicGetSubprogramGroupSubcomponentType() {
		return subprogramGroupSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubprogramGroupSubcomponentType(SubprogramGroupSubcomponentType newSubprogramGroupSubcomponentType) {
		SubprogramGroupSubcomponentType oldSubprogramGroupSubcomponentType = subprogramGroupSubcomponentType;
		subprogramGroupSubcomponentType = newSubprogramGroupSubcomponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.SUBPROGRAM_GROUP_SUBCOMPONENT__SUBPROGRAM_GROUP_SUBCOMPONENT_TYPE, oldSubprogramGroupSubcomponentType, subprogramGroupSubcomponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.SUBPROGRAM_GROUP_SUBCOMPONENT__SUBPROGRAM_GROUP_SUBCOMPONENT_TYPE:
				if (resolve) return getSubprogramGroupSubcomponentType();
				return basicGetSubprogramGroupSubcomponentType();
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
			case Aadl2Package.SUBPROGRAM_GROUP_SUBCOMPONENT__SUBPROGRAM_GROUP_SUBCOMPONENT_TYPE:
				setSubprogramGroupSubcomponentType((SubprogramGroupSubcomponentType)newValue);
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
			case Aadl2Package.SUBPROGRAM_GROUP_SUBCOMPONENT__SUBPROGRAM_GROUP_SUBCOMPONENT_TYPE:
				setSubprogramGroupSubcomponentType((SubprogramGroupSubcomponentType)null);
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
			case Aadl2Package.SUBPROGRAM_GROUP_SUBCOMPONENT__SUBPROGRAM_GROUP_SUBCOMPONENT_TYPE:
				return subprogramGroupSubcomponentType != null;
		}
		return super.eIsSet(featureID);
	}

} //SubprogramGroupSubcomponentImpl
