/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.NumberType;
import aadl2.NumericRange;
import aadl2.UnitsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.NumberTypeImpl#getOwnedUnitsType <em>Owned Units Type</em>}</li>
 *   <li>{@link aadl2.impl.NumberTypeImpl#getReferencedUnitsType <em>Referenced Units Type</em>}</li>
 *   <li>{@link aadl2.impl.NumberTypeImpl#getRange <em>Range</em>}</li>
 *   <li>{@link aadl2.impl.NumberTypeImpl#getUnitsType <em>Units Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NumberTypeImpl extends NonListTypeImpl implements NumberType {
	/**
	 * The cached value of the '{@link #getOwnedUnitsType() <em>Owned Units Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedUnitsType()
	 * @generated
	 * @ordered
	 */
	protected UnitsType ownedUnitsType;

	/**
	 * The cached value of the '{@link #getReferencedUnitsType() <em>Referenced Units Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedUnitsType()
	 * @generated
	 * @ordered
	 */
	protected UnitsType referencedUnitsType;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected NumericRange range;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getNumberType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsType getOwnedUnitsType() {
		return ownedUnitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedUnitsType(UnitsType newOwnedUnitsType, NotificationChain msgs) {
		UnitsType oldOwnedUnitsType = ownedUnitsType;
		ownedUnitsType = newOwnedUnitsType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.NUMBER_TYPE__OWNED_UNITS_TYPE, oldOwnedUnitsType, newOwnedUnitsType);
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
	public void setOwnedUnitsType(UnitsType newOwnedUnitsType) {
		if (newOwnedUnitsType != ownedUnitsType) {
			NotificationChain msgs = null;
			if (ownedUnitsType != null)
				msgs = ((InternalEObject)ownedUnitsType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.NUMBER_TYPE__OWNED_UNITS_TYPE, null, msgs);
			if (newOwnedUnitsType != null)
				msgs = ((InternalEObject)newOwnedUnitsType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.NUMBER_TYPE__OWNED_UNITS_TYPE, null, msgs);
			msgs = basicSetOwnedUnitsType(newOwnedUnitsType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.NUMBER_TYPE__OWNED_UNITS_TYPE, newOwnedUnitsType, newOwnedUnitsType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsType getReferencedUnitsType() {
		if (referencedUnitsType != null && referencedUnitsType.eIsProxy()) {
			InternalEObject oldReferencedUnitsType = (InternalEObject)referencedUnitsType;
			referencedUnitsType = (UnitsType)eResolveProxy(oldReferencedUnitsType);
			if (referencedUnitsType != oldReferencedUnitsType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.NUMBER_TYPE__REFERENCED_UNITS_TYPE, oldReferencedUnitsType, referencedUnitsType));
			}
		}
		return referencedUnitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsType basicGetReferencedUnitsType() {
		return referencedUnitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedUnitsType(UnitsType newReferencedUnitsType) {
		UnitsType oldReferencedUnitsType = referencedUnitsType;
		referencedUnitsType = newReferencedUnitsType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.NUMBER_TYPE__REFERENCED_UNITS_TYPE, oldReferencedUnitsType, referencedUnitsType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericRange getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(NumericRange newRange, NotificationChain msgs) {
		NumericRange oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.NUMBER_TYPE__RANGE, oldRange, newRange);
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
	public void setRange(NumericRange newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.NUMBER_TYPE__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.NUMBER_TYPE__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.NUMBER_TYPE__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsType getUnitsType() {
		UnitsType unitsType = basicGetUnitsType();
		return unitsType != null && unitsType.eIsProxy() ? (UnitsType)eResolveProxy((InternalEObject)unitsType) : unitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsType basicGetUnitsType() {
		// TODO: implement this method to return the 'Units Type' reference
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.NUMBER_TYPE__OWNED_UNITS_TYPE:
				return basicSetOwnedUnitsType(null, msgs);
			case Aadl2Package.NUMBER_TYPE__RANGE:
				return basicSetRange(null, msgs);
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
			case Aadl2Package.NUMBER_TYPE__OWNED_UNITS_TYPE:
				return getOwnedUnitsType();
			case Aadl2Package.NUMBER_TYPE__REFERENCED_UNITS_TYPE:
				if (resolve) return getReferencedUnitsType();
				return basicGetReferencedUnitsType();
			case Aadl2Package.NUMBER_TYPE__RANGE:
				return getRange();
			case Aadl2Package.NUMBER_TYPE__UNITS_TYPE:
				if (resolve) return getUnitsType();
				return basicGetUnitsType();
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
			case Aadl2Package.NUMBER_TYPE__OWNED_UNITS_TYPE:
				setOwnedUnitsType((UnitsType)newValue);
				return;
			case Aadl2Package.NUMBER_TYPE__REFERENCED_UNITS_TYPE:
				setReferencedUnitsType((UnitsType)newValue);
				return;
			case Aadl2Package.NUMBER_TYPE__RANGE:
				setRange((NumericRange)newValue);
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
			case Aadl2Package.NUMBER_TYPE__OWNED_UNITS_TYPE:
				setOwnedUnitsType((UnitsType)null);
				return;
			case Aadl2Package.NUMBER_TYPE__REFERENCED_UNITS_TYPE:
				setReferencedUnitsType((UnitsType)null);
				return;
			case Aadl2Package.NUMBER_TYPE__RANGE:
				setRange((NumericRange)null);
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
			case Aadl2Package.NUMBER_TYPE__OWNED_UNITS_TYPE:
				return ownedUnitsType != null;
			case Aadl2Package.NUMBER_TYPE__REFERENCED_UNITS_TYPE:
				return referencedUnitsType != null;
			case Aadl2Package.NUMBER_TYPE__RANGE:
				return range != null;
			case Aadl2Package.NUMBER_TYPE__UNITS_TYPE:
				return basicGetUnitsType() != null;
		}
		return super.eIsSet(featureID);
	}

} //NumberTypeImpl
