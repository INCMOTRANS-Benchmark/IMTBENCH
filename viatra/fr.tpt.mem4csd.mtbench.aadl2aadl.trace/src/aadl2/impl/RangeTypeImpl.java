/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.NumberType;
import aadl2.RangeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.RangeTypeImpl#getOwnedNumberType <em>Owned Number Type</em>}</li>
 *   <li>{@link aadl2.impl.RangeTypeImpl#getNumberType <em>Number Type</em>}</li>
 *   <li>{@link aadl2.impl.RangeTypeImpl#getReferencedNumberType <em>Referenced Number Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeTypeImpl extends NonListTypeImpl implements RangeType {
	/**
	 * The cached value of the '{@link #getOwnedNumberType() <em>Owned Number Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedNumberType()
	 * @generated
	 * @ordered
	 */
	protected NumberType ownedNumberType;

	/**
	 * The cached value of the '{@link #getReferencedNumberType() <em>Referenced Number Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedNumberType()
	 * @generated
	 * @ordered
	 */
	protected NumberType referencedNumberType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getRangeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberType getOwnedNumberType() {
		return ownedNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedNumberType(NumberType newOwnedNumberType, NotificationChain msgs) {
		NumberType oldOwnedNumberType = ownedNumberType;
		ownedNumberType = newOwnedNumberType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.RANGE_TYPE__OWNED_NUMBER_TYPE, oldOwnedNumberType, newOwnedNumberType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedNumberType(NumberType newOwnedNumberType) {
		if (newOwnedNumberType != ownedNumberType) {
			NotificationChain msgs = null;
			if (ownedNumberType != null)
				msgs = ((InternalEObject)ownedNumberType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.RANGE_TYPE__OWNED_NUMBER_TYPE, null, msgs);
			if (newOwnedNumberType != null)
				msgs = ((InternalEObject)newOwnedNumberType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.RANGE_TYPE__OWNED_NUMBER_TYPE, null, msgs);
			msgs = basicSetOwnedNumberType(newOwnedNumberType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.RANGE_TYPE__OWNED_NUMBER_TYPE, newOwnedNumberType, newOwnedNumberType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberType getNumberType() {
		NumberType numberType = basicGetNumberType();
		return numberType != null && numberType.eIsProxy() ? (NumberType)eResolveProxy((InternalEObject)numberType) : numberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberType basicGetNumberType() {
		// TODO: implement this method to return the 'Number Type' reference
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
	public NumberType getReferencedNumberType() {
		if (referencedNumberType != null && referencedNumberType.eIsProxy()) {
			InternalEObject oldReferencedNumberType = (InternalEObject)referencedNumberType;
			referencedNumberType = (NumberType)eResolveProxy(oldReferencedNumberType);
			if (referencedNumberType != oldReferencedNumberType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.RANGE_TYPE__REFERENCED_NUMBER_TYPE, oldReferencedNumberType, referencedNumberType));
			}
		}
		return referencedNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberType basicGetReferencedNumberType() {
		return referencedNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedNumberType(NumberType newReferencedNumberType) {
		NumberType oldReferencedNumberType = referencedNumberType;
		referencedNumberType = newReferencedNumberType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.RANGE_TYPE__REFERENCED_NUMBER_TYPE, oldReferencedNumberType, referencedNumberType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.RANGE_TYPE__OWNED_NUMBER_TYPE:
				return basicSetOwnedNumberType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.RANGE_TYPE__OWNED_NUMBER_TYPE:
				return getOwnedNumberType();
			case Aadl2Package.RANGE_TYPE__NUMBER_TYPE:
				if (resolve) return getNumberType();
				return basicGetNumberType();
			case Aadl2Package.RANGE_TYPE__REFERENCED_NUMBER_TYPE:
				if (resolve) return getReferencedNumberType();
				return basicGetReferencedNumberType();
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
			case Aadl2Package.RANGE_TYPE__OWNED_NUMBER_TYPE:
				setOwnedNumberType((NumberType)newValue);
				return;
			case Aadl2Package.RANGE_TYPE__REFERENCED_NUMBER_TYPE:
				setReferencedNumberType((NumberType)newValue);
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
			case Aadl2Package.RANGE_TYPE__OWNED_NUMBER_TYPE:
				setOwnedNumberType((NumberType)null);
				return;
			case Aadl2Package.RANGE_TYPE__REFERENCED_NUMBER_TYPE:
				setReferencedNumberType((NumberType)null);
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
			case Aadl2Package.RANGE_TYPE__OWNED_NUMBER_TYPE:
				return ownedNumberType != null;
			case Aadl2Package.RANGE_TYPE__NUMBER_TYPE:
				return basicGetNumberType() != null;
			case Aadl2Package.RANGE_TYPE__REFERENCED_NUMBER_TYPE:
				return referencedNumberType != null;
		}
		return super.eIsSet(featureID);
	}

} //RangeTypeImpl
