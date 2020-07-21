/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.MetaclassReference;
import aadl2.ReferenceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ReferenceTypeImpl#getNamedElementReference <em>Named Element Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceTypeImpl extends NonListTypeImpl implements ReferenceType {
	/**
	 * The cached value of the '{@link #getNamedElementReference() <em>Named Element Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedElementReference()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaclassReference> namedElementReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getReferenceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetaclassReference> getNamedElementReference() {
		if (namedElementReference == null) {
			namedElementReference = new EObjectContainmentEList<MetaclassReference>(MetaclassReference.class, this, Aadl2Package.REFERENCE_TYPE__NAMED_ELEMENT_REFERENCE);
		}
		return namedElementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.REFERENCE_TYPE__NAMED_ELEMENT_REFERENCE:
				return ((InternalEList<?>)getNamedElementReference()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.REFERENCE_TYPE__NAMED_ELEMENT_REFERENCE:
				return getNamedElementReference();
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
			case Aadl2Package.REFERENCE_TYPE__NAMED_ELEMENT_REFERENCE:
				getNamedElementReference().clear();
				getNamedElementReference().addAll((Collection<? extends MetaclassReference>)newValue);
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
			case Aadl2Package.REFERENCE_TYPE__NAMED_ELEMENT_REFERENCE:
				getNamedElementReference().clear();
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
			case Aadl2Package.REFERENCE_TYPE__NAMED_ELEMENT_REFERENCE:
				return namedElementReference != null && !namedElementReference.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReferenceTypeImpl
