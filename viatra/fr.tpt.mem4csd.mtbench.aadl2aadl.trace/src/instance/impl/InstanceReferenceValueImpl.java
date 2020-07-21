/**
 */
package instance.impl;

import aadl2.impl.PropertyValueImpl;

import instance.InstanceObject;
import instance.InstancePackage;
import instance.InstanceReferenceValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link instance.impl.InstanceReferenceValueImpl#getReferencedInstanceObject <em>Referenced Instance Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceReferenceValueImpl extends PropertyValueImpl implements InstanceReferenceValue {
	/**
	 * The cached value of the '{@link #getReferencedInstanceObject() <em>Referenced Instance Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedInstanceObject()
	 * @generated
	 * @ordered
	 */
	protected InstanceObject referencedInstanceObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceReferenceValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.INSTANCE_REFERENCE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceObject getReferencedInstanceObject() {
		if (referencedInstanceObject != null && referencedInstanceObject.eIsProxy()) {
			InternalEObject oldReferencedInstanceObject = (InternalEObject)referencedInstanceObject;
			referencedInstanceObject = (InstanceObject)eResolveProxy(oldReferencedInstanceObject);
			if (referencedInstanceObject != oldReferencedInstanceObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.INSTANCE_REFERENCE_VALUE__REFERENCED_INSTANCE_OBJECT, oldReferencedInstanceObject, referencedInstanceObject));
			}
		}
		return referencedInstanceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceObject basicGetReferencedInstanceObject() {
		return referencedInstanceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedInstanceObject(InstanceObject newReferencedInstanceObject) {
		InstanceObject oldReferencedInstanceObject = referencedInstanceObject;
		referencedInstanceObject = newReferencedInstanceObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.INSTANCE_REFERENCE_VALUE__REFERENCED_INSTANCE_OBJECT, oldReferencedInstanceObject, referencedInstanceObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.INSTANCE_REFERENCE_VALUE__REFERENCED_INSTANCE_OBJECT:
				if (resolve) return getReferencedInstanceObject();
				return basicGetReferencedInstanceObject();
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
			case InstancePackage.INSTANCE_REFERENCE_VALUE__REFERENCED_INSTANCE_OBJECT:
				setReferencedInstanceObject((InstanceObject)newValue);
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
			case InstancePackage.INSTANCE_REFERENCE_VALUE__REFERENCED_INSTANCE_OBJECT:
				setReferencedInstanceObject((InstanceObject)null);
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
			case InstancePackage.INSTANCE_REFERENCE_VALUE__REFERENCED_INSTANCE_OBJECT:
				return referencedInstanceObject != null;
		}
		return super.eIsSet(featureID);
	}

} //InstanceReferenceValueImpl
