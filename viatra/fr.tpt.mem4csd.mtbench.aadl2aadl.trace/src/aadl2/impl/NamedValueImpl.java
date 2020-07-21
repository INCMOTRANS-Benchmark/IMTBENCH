/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.AbstractNamedValue;
import aadl2.NamedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.NamedValueImpl#getNamedValue <em>Named Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedValueImpl extends PropertyValueImpl implements NamedValue {
	/**
	 * The cached value of the '{@link #getNamedValue() <em>Named Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedValue()
	 * @generated
	 * @ordered
	 */
	protected AbstractNamedValue namedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getNamedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractNamedValue getNamedValue() {
		if (namedValue != null && namedValue.eIsProxy()) {
			InternalEObject oldNamedValue = (InternalEObject)namedValue;
			namedValue = (AbstractNamedValue)eResolveProxy(oldNamedValue);
			if (namedValue != oldNamedValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.NAMED_VALUE__NAMED_VALUE, oldNamedValue, namedValue));
			}
		}
		return namedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNamedValue basicGetNamedValue() {
		return namedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamedValue(AbstractNamedValue newNamedValue) {
		AbstractNamedValue oldNamedValue = namedValue;
		namedValue = newNamedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.NAMED_VALUE__NAMED_VALUE, oldNamedValue, namedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.NAMED_VALUE__NAMED_VALUE:
				if (resolve) return getNamedValue();
				return basicGetNamedValue();
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
			case Aadl2Package.NAMED_VALUE__NAMED_VALUE:
				setNamedValue((AbstractNamedValue)newValue);
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
			case Aadl2Package.NAMED_VALUE__NAMED_VALUE:
				setNamedValue((AbstractNamedValue)null);
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
			case Aadl2Package.NAMED_VALUE__NAMED_VALUE:
				return namedValue != null;
		}
		return super.eIsSet(featureID);
	}

} //NamedValueImpl
