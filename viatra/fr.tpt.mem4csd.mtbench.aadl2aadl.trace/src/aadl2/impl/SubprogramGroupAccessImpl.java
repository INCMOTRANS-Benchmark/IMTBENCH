/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.SubprogramGroupAccess;
import aadl2.SubprogramGroupSubcomponentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Group Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.SubprogramGroupAccessImpl#getSubprogramGroupFeatureClassifier <em>Subprogram Group Feature Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramGroupAccessImpl extends AccessImpl implements SubprogramGroupAccess {
	/**
	 * The cached value of the '{@link #getSubprogramGroupFeatureClassifier() <em>Subprogram Group Feature Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubprogramGroupFeatureClassifier()
	 * @generated
	 * @ordered
	 */
	protected SubprogramGroupSubcomponentType subprogramGroupFeatureClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprogramGroupAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getSubprogramGroupAccess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubprogramGroupSubcomponentType getSubprogramGroupFeatureClassifier() {
		if (subprogramGroupFeatureClassifier != null && subprogramGroupFeatureClassifier.eIsProxy()) {
			InternalEObject oldSubprogramGroupFeatureClassifier = (InternalEObject)subprogramGroupFeatureClassifier;
			subprogramGroupFeatureClassifier = (SubprogramGroupSubcomponentType)eResolveProxy(oldSubprogramGroupFeatureClassifier);
			if (subprogramGroupFeatureClassifier != oldSubprogramGroupFeatureClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.SUBPROGRAM_GROUP_ACCESS__SUBPROGRAM_GROUP_FEATURE_CLASSIFIER, oldSubprogramGroupFeatureClassifier, subprogramGroupFeatureClassifier));
			}
		}
		return subprogramGroupFeatureClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramGroupSubcomponentType basicGetSubprogramGroupFeatureClassifier() {
		return subprogramGroupFeatureClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubprogramGroupFeatureClassifier(SubprogramGroupSubcomponentType newSubprogramGroupFeatureClassifier) {
		SubprogramGroupSubcomponentType oldSubprogramGroupFeatureClassifier = subprogramGroupFeatureClassifier;
		subprogramGroupFeatureClassifier = newSubprogramGroupFeatureClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.SUBPROGRAM_GROUP_ACCESS__SUBPROGRAM_GROUP_FEATURE_CLASSIFIER, oldSubprogramGroupFeatureClassifier, subprogramGroupFeatureClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.SUBPROGRAM_GROUP_ACCESS__SUBPROGRAM_GROUP_FEATURE_CLASSIFIER:
				if (resolve) return getSubprogramGroupFeatureClassifier();
				return basicGetSubprogramGroupFeatureClassifier();
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
			case Aadl2Package.SUBPROGRAM_GROUP_ACCESS__SUBPROGRAM_GROUP_FEATURE_CLASSIFIER:
				setSubprogramGroupFeatureClassifier((SubprogramGroupSubcomponentType)newValue);
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
			case Aadl2Package.SUBPROGRAM_GROUP_ACCESS__SUBPROGRAM_GROUP_FEATURE_CLASSIFIER:
				setSubprogramGroupFeatureClassifier((SubprogramGroupSubcomponentType)null);
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
			case Aadl2Package.SUBPROGRAM_GROUP_ACCESS__SUBPROGRAM_GROUP_FEATURE_CLASSIFIER:
				return subprogramGroupFeatureClassifier != null;
		}
		return super.eIsSet(featureID);
	}

} //SubprogramGroupAccessImpl
