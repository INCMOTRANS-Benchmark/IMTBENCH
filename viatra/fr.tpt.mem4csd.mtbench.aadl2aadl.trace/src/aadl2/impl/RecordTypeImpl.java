/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.BasicProperty;
import aadl2.RecordType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.RecordTypeImpl#getOwnedField <em>Owned Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordTypeImpl extends NamespaceImpl implements RecordType {
	/**
	 * The cached value of the '{@link #getOwnedField() <em>Owned Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedField()
	 * @generated
	 * @ordered
	 */
	protected EList<BasicProperty> ownedField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getRecordType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BasicProperty> getOwnedField() {
		if (ownedField == null) {
			ownedField = new EObjectContainmentEList<BasicProperty>(BasicProperty.class, this, Aadl2Package.RECORD_TYPE__OWNED_FIELD);
		}
		return ownedField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.RECORD_TYPE__OWNED_FIELD:
				return ((InternalEList<?>)getOwnedField()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.RECORD_TYPE__OWNED_FIELD:
				return getOwnedField();
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
			case Aadl2Package.RECORD_TYPE__OWNED_FIELD:
				getOwnedField().clear();
				getOwnedField().addAll((Collection<? extends BasicProperty>)newValue);
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
			case Aadl2Package.RECORD_TYPE__OWNED_FIELD:
				getOwnedField().clear();
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
			case Aadl2Package.RECORD_TYPE__OWNED_FIELD:
				return ownedField != null && !ownedField.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RecordTypeImpl
