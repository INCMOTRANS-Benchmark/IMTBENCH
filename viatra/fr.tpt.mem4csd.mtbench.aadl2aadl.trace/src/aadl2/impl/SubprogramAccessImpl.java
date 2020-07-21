/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.SubprogramAccess;
import aadl2.SubprogramSubcomponentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.SubprogramAccessImpl#getSubprogramFeatureClassifier <em>Subprogram Feature Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramAccessImpl extends AccessImpl implements SubprogramAccess {
	/**
	 * The cached value of the '{@link #getSubprogramFeatureClassifier() <em>Subprogram Feature Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubprogramFeatureClassifier()
	 * @generated
	 * @ordered
	 */
	protected SubprogramSubcomponentType subprogramFeatureClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprogramAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getSubprogramAccess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubprogramSubcomponentType getSubprogramFeatureClassifier() {
		if (subprogramFeatureClassifier != null && subprogramFeatureClassifier.eIsProxy()) {
			InternalEObject oldSubprogramFeatureClassifier = (InternalEObject)subprogramFeatureClassifier;
			subprogramFeatureClassifier = (SubprogramSubcomponentType)eResolveProxy(oldSubprogramFeatureClassifier);
			if (subprogramFeatureClassifier != oldSubprogramFeatureClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.SUBPROGRAM_ACCESS__SUBPROGRAM_FEATURE_CLASSIFIER, oldSubprogramFeatureClassifier, subprogramFeatureClassifier));
			}
		}
		return subprogramFeatureClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramSubcomponentType basicGetSubprogramFeatureClassifier() {
		return subprogramFeatureClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubprogramFeatureClassifier(SubprogramSubcomponentType newSubprogramFeatureClassifier) {
		SubprogramSubcomponentType oldSubprogramFeatureClassifier = subprogramFeatureClassifier;
		subprogramFeatureClassifier = newSubprogramFeatureClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.SUBPROGRAM_ACCESS__SUBPROGRAM_FEATURE_CLASSIFIER, oldSubprogramFeatureClassifier, subprogramFeatureClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.SUBPROGRAM_ACCESS__SUBPROGRAM_FEATURE_CLASSIFIER:
				if (resolve) return getSubprogramFeatureClassifier();
				return basicGetSubprogramFeatureClassifier();
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
			case Aadl2Package.SUBPROGRAM_ACCESS__SUBPROGRAM_FEATURE_CLASSIFIER:
				setSubprogramFeatureClassifier((SubprogramSubcomponentType)newValue);
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
			case Aadl2Package.SUBPROGRAM_ACCESS__SUBPROGRAM_FEATURE_CLASSIFIER:
				setSubprogramFeatureClassifier((SubprogramSubcomponentType)null);
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
			case Aadl2Package.SUBPROGRAM_ACCESS__SUBPROGRAM_FEATURE_CLASSIFIER:
				return subprogramFeatureClassifier != null;
		}
		return super.eIsSet(featureID);
	}

} //SubprogramAccessImpl
