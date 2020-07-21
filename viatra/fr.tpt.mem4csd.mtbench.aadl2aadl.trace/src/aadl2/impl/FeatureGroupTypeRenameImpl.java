/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.FeatureGroupType;
import aadl2.FeatureGroupTypeRename;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Group Type Rename</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.FeatureGroupTypeRenameImpl#getRenamedFeatureGroupType <em>Renamed Feature Group Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureGroupTypeRenameImpl extends NamedElementImpl implements FeatureGroupTypeRename {
	/**
	 * The cached value of the '{@link #getRenamedFeatureGroupType() <em>Renamed Feature Group Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenamedFeatureGroupType()
	 * @generated
	 * @ordered
	 */
	protected FeatureGroupType renamedFeatureGroupType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureGroupTypeRenameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getFeatureGroupTypeRename();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureGroupType getRenamedFeatureGroupType() {
		if (renamedFeatureGroupType != null && renamedFeatureGroupType.eIsProxy()) {
			InternalEObject oldRenamedFeatureGroupType = (InternalEObject)renamedFeatureGroupType;
			renamedFeatureGroupType = (FeatureGroupType)eResolveProxy(oldRenamedFeatureGroupType);
			if (renamedFeatureGroupType != oldRenamedFeatureGroupType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.FEATURE_GROUP_TYPE_RENAME__RENAMED_FEATURE_GROUP_TYPE, oldRenamedFeatureGroupType, renamedFeatureGroupType));
			}
		}
		return renamedFeatureGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroupType basicGetRenamedFeatureGroupType() {
		return renamedFeatureGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRenamedFeatureGroupType(FeatureGroupType newRenamedFeatureGroupType) {
		FeatureGroupType oldRenamedFeatureGroupType = renamedFeatureGroupType;
		renamedFeatureGroupType = newRenamedFeatureGroupType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.FEATURE_GROUP_TYPE_RENAME__RENAMED_FEATURE_GROUP_TYPE, oldRenamedFeatureGroupType, renamedFeatureGroupType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.FEATURE_GROUP_TYPE_RENAME__RENAMED_FEATURE_GROUP_TYPE:
				if (resolve) return getRenamedFeatureGroupType();
				return basicGetRenamedFeatureGroupType();
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
			case Aadl2Package.FEATURE_GROUP_TYPE_RENAME__RENAMED_FEATURE_GROUP_TYPE:
				setRenamedFeatureGroupType((FeatureGroupType)newValue);
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
			case Aadl2Package.FEATURE_GROUP_TYPE_RENAME__RENAMED_FEATURE_GROUP_TYPE:
				setRenamedFeatureGroupType((FeatureGroupType)null);
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
			case Aadl2Package.FEATURE_GROUP_TYPE_RENAME__RENAMED_FEATURE_GROUP_TYPE:
				return renamedFeatureGroupType != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureGroupTypeRenameImpl
