/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.BasicPropertyAssociation;
import aadl2.RecordValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.RecordValueImpl#getOwnedFieldValue <em>Owned Field Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordValueImpl extends PropertyValueImpl implements RecordValue {
	/**
	 * The cached value of the '{@link #getOwnedFieldValue() <em>Owned Field Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFieldValue()
	 * @generated
	 * @ordered
	 */
	protected EList<BasicPropertyAssociation> ownedFieldValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getRecordValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BasicPropertyAssociation> getOwnedFieldValue() {
		if (ownedFieldValue == null) {
			ownedFieldValue = new EObjectContainmentEList<BasicPropertyAssociation>(BasicPropertyAssociation.class, this, Aadl2Package.RECORD_VALUE__OWNED_FIELD_VALUE);
		}
		return ownedFieldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.RECORD_VALUE__OWNED_FIELD_VALUE:
				return ((InternalEList<?>)getOwnedFieldValue()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.RECORD_VALUE__OWNED_FIELD_VALUE:
				return getOwnedFieldValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Aadl2Package.RECORD_VALUE__OWNED_FIELD_VALUE:
				getOwnedFieldValue().clear();
				getOwnedFieldValue().addAll((Collection<? extends BasicPropertyAssociation>)newValue);
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
			case Aadl2Package.RECORD_VALUE__OWNED_FIELD_VALUE:
				getOwnedFieldValue().clear();
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
			case Aadl2Package.RECORD_VALUE__OWNED_FIELD_VALUE:
				return ownedFieldValue != null && !ownedFieldValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RecordValueImpl
