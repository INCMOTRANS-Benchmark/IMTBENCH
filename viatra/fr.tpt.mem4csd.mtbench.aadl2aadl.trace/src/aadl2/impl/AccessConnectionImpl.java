/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.AccessCategory;
import aadl2.AccessConnection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.AccessConnectionImpl#getAccessCategory <em>Access Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessConnectionImpl extends ConnectionImpl implements AccessConnection {
	/**
	 * The default value of the '{@link #getAccessCategory() <em>Access Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessCategory()
	 * @generated
	 * @ordered
	 */
	protected static final AccessCategory ACCESS_CATEGORY_EDEFAULT = AccessCategory.BUS;

	/**
	 * The cached value of the '{@link #getAccessCategory() <em>Access Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessCategory()
	 * @generated
	 * @ordered
	 */
	protected AccessCategory accessCategory = ACCESS_CATEGORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getAccessConnection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessCategory getAccessCategory() {
		return accessCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessCategory(AccessCategory newAccessCategory) {
		AccessCategory oldAccessCategory = accessCategory;
		accessCategory = newAccessCategory == null ? ACCESS_CATEGORY_EDEFAULT : newAccessCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.ACCESS_CONNECTION__ACCESS_CATEGORY, oldAccessCategory, accessCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.ACCESS_CONNECTION__ACCESS_CATEGORY:
				return getAccessCategory();
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
			case Aadl2Package.ACCESS_CONNECTION__ACCESS_CATEGORY:
				setAccessCategory((AccessCategory)newValue);
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
			case Aadl2Package.ACCESS_CONNECTION__ACCESS_CATEGORY:
				setAccessCategory(ACCESS_CATEGORY_EDEFAULT);
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
			case Aadl2Package.ACCESS_CONNECTION__ACCESS_CATEGORY:
				return accessCategory != ACCESS_CATEGORY_EDEFAULT;
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
		result.append(" (accessCategory: ");
		result.append(accessCategory);
		result.append(')');
		return result.toString();
	}

} //AccessConnectionImpl
