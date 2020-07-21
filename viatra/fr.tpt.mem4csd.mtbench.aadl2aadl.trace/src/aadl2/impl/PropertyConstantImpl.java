/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.PropertyConstant;
import aadl2.PropertyExpression;
import aadl2.PropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.PropertyConstantImpl#getReferencedPropertyType <em>Referenced Property Type</em>}</li>
 *   <li>{@link aadl2.impl.PropertyConstantImpl#getOwnedPropertyType <em>Owned Property Type</em>}</li>
 *   <li>{@link aadl2.impl.PropertyConstantImpl#getConstantValue <em>Constant Value</em>}</li>
 *   <li>{@link aadl2.impl.PropertyConstantImpl#getPropertyType <em>Property Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyConstantImpl extends TypedElementImpl implements PropertyConstant {
	/**
	 * The cached value of the '{@link #getReferencedPropertyType() <em>Referenced Property Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedPropertyType()
	 * @generated
	 * @ordered
	 */
	protected PropertyType referencedPropertyType;

	/**
	 * The cached value of the '{@link #getOwnedPropertyType() <em>Owned Property Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyType()
	 * @generated
	 * @ordered
	 */
	protected PropertyType ownedPropertyType;

	/**
	 * The cached value of the '{@link #getConstantValue() <em>Constant Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantValue()
	 * @generated
	 * @ordered
	 */
	protected PropertyExpression constantValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getPropertyConstant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyType getReferencedPropertyType() {
		if (referencedPropertyType != null && referencedPropertyType.eIsProxy()) {
			InternalEObject oldReferencedPropertyType = (InternalEObject)referencedPropertyType;
			referencedPropertyType = (PropertyType)eResolveProxy(oldReferencedPropertyType);
			if (referencedPropertyType != oldReferencedPropertyType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.PROPERTY_CONSTANT__REFERENCED_PROPERTY_TYPE, oldReferencedPropertyType, referencedPropertyType));
			}
		}
		return referencedPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType basicGetReferencedPropertyType() {
		return referencedPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedPropertyType(PropertyType newReferencedPropertyType) {
		PropertyType oldReferencedPropertyType = referencedPropertyType;
		referencedPropertyType = newReferencedPropertyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.PROPERTY_CONSTANT__REFERENCED_PROPERTY_TYPE, oldReferencedPropertyType, referencedPropertyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyType getOwnedPropertyType() {
		return ownedPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPropertyType(PropertyType newOwnedPropertyType, NotificationChain msgs) {
		PropertyType oldOwnedPropertyType = ownedPropertyType;
		ownedPropertyType = newOwnedPropertyType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.PROPERTY_CONSTANT__OWNED_PROPERTY_TYPE, oldOwnedPropertyType, newOwnedPropertyType);
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
	public void setOwnedPropertyType(PropertyType newOwnedPropertyType) {
		if (newOwnedPropertyType != ownedPropertyType) {
			NotificationChain msgs = null;
			if (ownedPropertyType != null)
				msgs = ((InternalEObject)ownedPropertyType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.PROPERTY_CONSTANT__OWNED_PROPERTY_TYPE, null, msgs);
			if (newOwnedPropertyType != null)
				msgs = ((InternalEObject)newOwnedPropertyType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.PROPERTY_CONSTANT__OWNED_PROPERTY_TYPE, null, msgs);
			msgs = basicSetOwnedPropertyType(newOwnedPropertyType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.PROPERTY_CONSTANT__OWNED_PROPERTY_TYPE, newOwnedPropertyType, newOwnedPropertyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyExpression getConstantValue() {
		return constantValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstantValue(PropertyExpression newConstantValue, NotificationChain msgs) {
		PropertyExpression oldConstantValue = constantValue;
		constantValue = newConstantValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.PROPERTY_CONSTANT__CONSTANT_VALUE, oldConstantValue, newConstantValue);
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
	public void setConstantValue(PropertyExpression newConstantValue) {
		if (newConstantValue != constantValue) {
			NotificationChain msgs = null;
			if (constantValue != null)
				msgs = ((InternalEObject)constantValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.PROPERTY_CONSTANT__CONSTANT_VALUE, null, msgs);
			if (newConstantValue != null)
				msgs = ((InternalEObject)newConstantValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.PROPERTY_CONSTANT__CONSTANT_VALUE, null, msgs);
			msgs = basicSetConstantValue(newConstantValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.PROPERTY_CONSTANT__CONSTANT_VALUE, newConstantValue, newConstantValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyType getPropertyType() {
		PropertyType propertyType = basicGetPropertyType();
		return propertyType != null && propertyType.eIsProxy() ? (PropertyType)eResolveProxy((InternalEObject)propertyType) : propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType basicGetPropertyType() {
		// TODO: implement this method to return the 'Property Type' reference
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
			case Aadl2Package.PROPERTY_CONSTANT__OWNED_PROPERTY_TYPE:
				return basicSetOwnedPropertyType(null, msgs);
			case Aadl2Package.PROPERTY_CONSTANT__CONSTANT_VALUE:
				return basicSetConstantValue(null, msgs);
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
			case Aadl2Package.PROPERTY_CONSTANT__REFERENCED_PROPERTY_TYPE:
				if (resolve) return getReferencedPropertyType();
				return basicGetReferencedPropertyType();
			case Aadl2Package.PROPERTY_CONSTANT__OWNED_PROPERTY_TYPE:
				return getOwnedPropertyType();
			case Aadl2Package.PROPERTY_CONSTANT__CONSTANT_VALUE:
				return getConstantValue();
			case Aadl2Package.PROPERTY_CONSTANT__PROPERTY_TYPE:
				if (resolve) return getPropertyType();
				return basicGetPropertyType();
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
			case Aadl2Package.PROPERTY_CONSTANT__REFERENCED_PROPERTY_TYPE:
				setReferencedPropertyType((PropertyType)newValue);
				return;
			case Aadl2Package.PROPERTY_CONSTANT__OWNED_PROPERTY_TYPE:
				setOwnedPropertyType((PropertyType)newValue);
				return;
			case Aadl2Package.PROPERTY_CONSTANT__CONSTANT_VALUE:
				setConstantValue((PropertyExpression)newValue);
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
			case Aadl2Package.PROPERTY_CONSTANT__REFERENCED_PROPERTY_TYPE:
				setReferencedPropertyType((PropertyType)null);
				return;
			case Aadl2Package.PROPERTY_CONSTANT__OWNED_PROPERTY_TYPE:
				setOwnedPropertyType((PropertyType)null);
				return;
			case Aadl2Package.PROPERTY_CONSTANT__CONSTANT_VALUE:
				setConstantValue((PropertyExpression)null);
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
			case Aadl2Package.PROPERTY_CONSTANT__REFERENCED_PROPERTY_TYPE:
				return referencedPropertyType != null;
			case Aadl2Package.PROPERTY_CONSTANT__OWNED_PROPERTY_TYPE:
				return ownedPropertyType != null;
			case Aadl2Package.PROPERTY_CONSTANT__CONSTANT_VALUE:
				return constantValue != null;
			case Aadl2Package.PROPERTY_CONSTANT__PROPERTY_TYPE:
				return basicGetPropertyType() != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertyConstantImpl
