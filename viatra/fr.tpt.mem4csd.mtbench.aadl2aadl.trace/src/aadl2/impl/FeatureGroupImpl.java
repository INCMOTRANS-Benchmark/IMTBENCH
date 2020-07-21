/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.FeatureGroup;
import aadl2.FeatureGroupPrototype;
import aadl2.FeatureGroupType;
import aadl2.FeatureType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.FeatureGroupImpl#isInverse <em>Inverse</em>}</li>
 *   <li>{@link aadl2.impl.FeatureGroupImpl#getFeatureType <em>Feature Type</em>}</li>
 *   <li>{@link aadl2.impl.FeatureGroupImpl#getFeatureGroupType <em>Feature Group Type</em>}</li>
 *   <li>{@link aadl2.impl.FeatureGroupImpl#getFeatureGroupPrototype <em>Feature Group Prototype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureGroupImpl extends DirectedFeatureImpl implements FeatureGroup {
	/**
	 * The default value of the '{@link #isInverse() <em>Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVERSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInverse() <em>Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverse()
	 * @generated
	 * @ordered
	 */
	protected boolean inverse = INVERSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatureType() <em>Feature Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureType()
	 * @generated
	 * @ordered
	 */
	protected FeatureType featureType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getFeatureGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInverse() {
		return inverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInverse(boolean newInverse) {
		boolean oldInverse = inverse;
		inverse = newInverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.FEATURE_GROUP__INVERSE, oldInverse, inverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureType getFeatureType() {
		if (featureType != null && featureType.eIsProxy()) {
			InternalEObject oldFeatureType = (InternalEObject)featureType;
			featureType = (FeatureType)eResolveProxy(oldFeatureType);
			if (featureType != oldFeatureType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.FEATURE_GROUP__FEATURE_TYPE, oldFeatureType, featureType));
			}
		}
		return featureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureType basicGetFeatureType() {
		return featureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureType(FeatureType newFeatureType) {
		FeatureType oldFeatureType = featureType;
		featureType = newFeatureType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.FEATURE_GROUP__FEATURE_TYPE, oldFeatureType, featureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureGroupType getFeatureGroupType() {
		FeatureGroupType featureGroupType = basicGetFeatureGroupType();
		return featureGroupType != null && featureGroupType.eIsProxy() ? (FeatureGroupType)eResolveProxy((InternalEObject)featureGroupType) : featureGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroupType basicGetFeatureGroupType() {
		// TODO: implement this method to return the 'Feature Group Type' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureGroupPrototype getFeatureGroupPrototype() {
		FeatureGroupPrototype featureGroupPrototype = basicGetFeatureGroupPrototype();
		return featureGroupPrototype != null && featureGroupPrototype.eIsProxy() ? (FeatureGroupPrototype)eResolveProxy((InternalEObject)featureGroupPrototype) : featureGroupPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroupPrototype basicGetFeatureGroupPrototype() {
		// TODO: implement this method to return the 'Feature Group Prototype' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.FEATURE_GROUP__INVERSE:
				return isInverse();
			case Aadl2Package.FEATURE_GROUP__FEATURE_TYPE:
				if (resolve) return getFeatureType();
				return basicGetFeatureType();
			case Aadl2Package.FEATURE_GROUP__FEATURE_GROUP_TYPE:
				if (resolve) return getFeatureGroupType();
				return basicGetFeatureGroupType();
			case Aadl2Package.FEATURE_GROUP__FEATURE_GROUP_PROTOTYPE:
				if (resolve) return getFeatureGroupPrototype();
				return basicGetFeatureGroupPrototype();
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
			case Aadl2Package.FEATURE_GROUP__INVERSE:
				setInverse((Boolean)newValue);
				return;
			case Aadl2Package.FEATURE_GROUP__FEATURE_TYPE:
				setFeatureType((FeatureType)newValue);
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
			case Aadl2Package.FEATURE_GROUP__INVERSE:
				setInverse(INVERSE_EDEFAULT);
				return;
			case Aadl2Package.FEATURE_GROUP__FEATURE_TYPE:
				setFeatureType((FeatureType)null);
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
			case Aadl2Package.FEATURE_GROUP__INVERSE:
				return inverse != INVERSE_EDEFAULT;
			case Aadl2Package.FEATURE_GROUP__FEATURE_TYPE:
				return featureType != null;
			case Aadl2Package.FEATURE_GROUP__FEATURE_GROUP_TYPE:
				return basicGetFeatureGroupType() != null;
			case Aadl2Package.FEATURE_GROUP__FEATURE_GROUP_PROTOTYPE:
				return basicGetFeatureGroupPrototype() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (inverse: ");
		result.append(inverse);
		result.append(')');
		return result.toString();
	}

} //FeatureGroupImpl
