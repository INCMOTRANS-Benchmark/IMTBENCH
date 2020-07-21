/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ListType;
import aadl2.PropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ListTypeImpl#getOwnedElementType <em>Owned Element Type</em>}</li>
 *   <li>{@link aadl2.impl.ListTypeImpl#getReferencedElementType <em>Referenced Element Type</em>}</li>
 *   <li>{@link aadl2.impl.ListTypeImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListTypeImpl extends PropertyTypeImpl implements ListType {
	/**
	 * The cached value of the '{@link #getOwnedElementType() <em>Owned Element Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElementType()
	 * @generated
	 * @ordered
	 */
	protected PropertyType ownedElementType;

	/**
	 * The cached value of the '{@link #getReferencedElementType() <em>Referenced Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedElementType()
	 * @generated
	 * @ordered
	 */
	protected PropertyType referencedElementType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getListType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyType getOwnedElementType() {
		return ownedElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedElementType(PropertyType newOwnedElementType, NotificationChain msgs) {
		PropertyType oldOwnedElementType = ownedElementType;
		ownedElementType = newOwnedElementType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.LIST_TYPE__OWNED_ELEMENT_TYPE, oldOwnedElementType, newOwnedElementType);
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
	public void setOwnedElementType(PropertyType newOwnedElementType) {
		if (newOwnedElementType != ownedElementType) {
			NotificationChain msgs = null;
			if (ownedElementType != null)
				msgs = ((InternalEObject)ownedElementType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.LIST_TYPE__OWNED_ELEMENT_TYPE, null, msgs);
			if (newOwnedElementType != null)
				msgs = ((InternalEObject)newOwnedElementType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.LIST_TYPE__OWNED_ELEMENT_TYPE, null, msgs);
			msgs = basicSetOwnedElementType(newOwnedElementType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.LIST_TYPE__OWNED_ELEMENT_TYPE, newOwnedElementType, newOwnedElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyType getReferencedElementType() {
		if (referencedElementType != null && referencedElementType.eIsProxy()) {
			InternalEObject oldReferencedElementType = (InternalEObject)referencedElementType;
			referencedElementType = (PropertyType)eResolveProxy(oldReferencedElementType);
			if (referencedElementType != oldReferencedElementType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.LIST_TYPE__REFERENCED_ELEMENT_TYPE, oldReferencedElementType, referencedElementType));
			}
		}
		return referencedElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType basicGetReferencedElementType() {
		return referencedElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedElementType(PropertyType newReferencedElementType) {
		PropertyType oldReferencedElementType = referencedElementType;
		referencedElementType = newReferencedElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.LIST_TYPE__REFERENCED_ELEMENT_TYPE, oldReferencedElementType, referencedElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyType getElementType() {
		PropertyType elementType = basicGetElementType();
		return elementType != null && elementType.eIsProxy() ? (PropertyType)eResolveProxy((InternalEObject)elementType) : elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType basicGetElementType() {
		// TODO: implement this method to return the 'Element Type' reference
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
			case Aadl2Package.LIST_TYPE__OWNED_ELEMENT_TYPE:
				return basicSetOwnedElementType(null, msgs);
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
			case Aadl2Package.LIST_TYPE__OWNED_ELEMENT_TYPE:
				return getOwnedElementType();
			case Aadl2Package.LIST_TYPE__REFERENCED_ELEMENT_TYPE:
				if (resolve) return getReferencedElementType();
				return basicGetReferencedElementType();
			case Aadl2Package.LIST_TYPE__ELEMENT_TYPE:
				if (resolve) return getElementType();
				return basicGetElementType();
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
			case Aadl2Package.LIST_TYPE__OWNED_ELEMENT_TYPE:
				setOwnedElementType((PropertyType)newValue);
				return;
			case Aadl2Package.LIST_TYPE__REFERENCED_ELEMENT_TYPE:
				setReferencedElementType((PropertyType)newValue);
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
			case Aadl2Package.LIST_TYPE__OWNED_ELEMENT_TYPE:
				setOwnedElementType((PropertyType)null);
				return;
			case Aadl2Package.LIST_TYPE__REFERENCED_ELEMENT_TYPE:
				setReferencedElementType((PropertyType)null);
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
			case Aadl2Package.LIST_TYPE__OWNED_ELEMENT_TYPE:
				return ownedElementType != null;
			case Aadl2Package.LIST_TYPE__REFERENCED_ELEMENT_TYPE:
				return referencedElementType != null;
			case Aadl2Package.LIST_TYPE__ELEMENT_TYPE:
				return basicGetElementType() != null;
		}
		return super.eIsSet(featureID);
	}

} //ListTypeImpl
