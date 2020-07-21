/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.FeatureGroupPrototype;
import aadl2.FeatureGroupType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Group Prototype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.FeatureGroupPrototypeImpl#getConstrainingFeatureGroupType <em>Constraining Feature Group Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureGroupPrototypeImpl extends PrototypeImpl implements FeatureGroupPrototype {
	/**
	 * The cached value of the '{@link #getConstrainingFeatureGroupType() <em>Constraining Feature Group Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainingFeatureGroupType()
	 * @generated
	 * @ordered
	 */
	protected FeatureGroupType constrainingFeatureGroupType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureGroupPrototypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getFeatureGroupPrototype();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureGroupType getConstrainingFeatureGroupType() {
		if (constrainingFeatureGroupType != null && constrainingFeatureGroupType.eIsProxy()) {
			InternalEObject oldConstrainingFeatureGroupType = (InternalEObject)constrainingFeatureGroupType;
			constrainingFeatureGroupType = (FeatureGroupType)eResolveProxy(oldConstrainingFeatureGroupType);
			if (constrainingFeatureGroupType != oldConstrainingFeatureGroupType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.FEATURE_GROUP_PROTOTYPE__CONSTRAINING_FEATURE_GROUP_TYPE, oldConstrainingFeatureGroupType, constrainingFeatureGroupType));
			}
		}
		return constrainingFeatureGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroupType basicGetConstrainingFeatureGroupType() {
		return constrainingFeatureGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstrainingFeatureGroupType(FeatureGroupType newConstrainingFeatureGroupType) {
		FeatureGroupType oldConstrainingFeatureGroupType = constrainingFeatureGroupType;
		constrainingFeatureGroupType = newConstrainingFeatureGroupType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.FEATURE_GROUP_PROTOTYPE__CONSTRAINING_FEATURE_GROUP_TYPE, oldConstrainingFeatureGroupType, constrainingFeatureGroupType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.FEATURE_GROUP_PROTOTYPE__CONSTRAINING_FEATURE_GROUP_TYPE:
				if (resolve) return getConstrainingFeatureGroupType();
				return basicGetConstrainingFeatureGroupType();
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
			case Aadl2Package.FEATURE_GROUP_PROTOTYPE__CONSTRAINING_FEATURE_GROUP_TYPE:
				setConstrainingFeatureGroupType((FeatureGroupType)newValue);
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
			case Aadl2Package.FEATURE_GROUP_PROTOTYPE__CONSTRAINING_FEATURE_GROUP_TYPE:
				setConstrainingFeatureGroupType((FeatureGroupType)null);
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
			case Aadl2Package.FEATURE_GROUP_PROTOTYPE__CONSTRAINING_FEATURE_GROUP_TYPE:
				return constrainingFeatureGroupType != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureGroupPrototypeImpl
