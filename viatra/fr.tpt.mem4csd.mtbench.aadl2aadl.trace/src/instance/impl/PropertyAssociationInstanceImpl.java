/**
 */
package instance.impl;

import aadl2.PropertyAssociation;

import aadl2.impl.PropertyAssociationImpl;

import instance.InstancePackage;
import instance.PropertyAssociationInstance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Association Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link instance.impl.PropertyAssociationInstanceImpl#getPropertyAssociation <em>Property Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyAssociationInstanceImpl extends PropertyAssociationImpl implements PropertyAssociationInstance {
	/**
	 * The cached value of the '{@link #getPropertyAssociation() <em>Property Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyAssociation()
	 * @generated
	 * @ordered
	 */
	protected PropertyAssociation propertyAssociation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyAssociationInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.PROPERTY_ASSOCIATION_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyAssociation getPropertyAssociation() {
		if (propertyAssociation != null && propertyAssociation.eIsProxy()) {
			InternalEObject oldPropertyAssociation = (InternalEObject)propertyAssociation;
			propertyAssociation = (PropertyAssociation)eResolveProxy(oldPropertyAssociation);
			if (propertyAssociation != oldPropertyAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.PROPERTY_ASSOCIATION_INSTANCE__PROPERTY_ASSOCIATION, oldPropertyAssociation, propertyAssociation));
			}
		}
		return propertyAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyAssociation basicGetPropertyAssociation() {
		return propertyAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyAssociation(PropertyAssociation newPropertyAssociation) {
		PropertyAssociation oldPropertyAssociation = propertyAssociation;
		propertyAssociation = newPropertyAssociation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.PROPERTY_ASSOCIATION_INSTANCE__PROPERTY_ASSOCIATION, oldPropertyAssociation, propertyAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.PROPERTY_ASSOCIATION_INSTANCE__PROPERTY_ASSOCIATION:
				if (resolve) return getPropertyAssociation();
				return basicGetPropertyAssociation();
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
			case InstancePackage.PROPERTY_ASSOCIATION_INSTANCE__PROPERTY_ASSOCIATION:
				setPropertyAssociation((PropertyAssociation)newValue);
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
			case InstancePackage.PROPERTY_ASSOCIATION_INSTANCE__PROPERTY_ASSOCIATION:
				setPropertyAssociation((PropertyAssociation)null);
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
			case InstancePackage.PROPERTY_ASSOCIATION_INSTANCE__PROPERTY_ASSOCIATION:
				return propertyAssociation != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertyAssociationInstanceImpl
