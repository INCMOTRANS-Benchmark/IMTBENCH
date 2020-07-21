/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ArrayDimension;
import aadl2.ArrayableElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arrayable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ArrayableElementImpl#getArrayDimension <em>Array Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArrayableElementImpl extends ElementImpl implements ArrayableElement {
	/**
	 * The cached value of the '{@link #getArrayDimension() <em>Array Dimension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayDimension()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayDimension> arrayDimension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getArrayableElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayDimension> getArrayDimension() {
		if (arrayDimension == null) {
			arrayDimension = new EObjectContainmentEList<ArrayDimension>(ArrayDimension.class, this, Aadl2Package.ARRAYABLE_ELEMENT__ARRAY_DIMENSION);
		}
		return arrayDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.ARRAYABLE_ELEMENT__ARRAY_DIMENSION:
				return ((InternalEList<?>)getArrayDimension()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.ARRAYABLE_ELEMENT__ARRAY_DIMENSION:
				return getArrayDimension();
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
			case Aadl2Package.ARRAYABLE_ELEMENT__ARRAY_DIMENSION:
				getArrayDimension().clear();
				getArrayDimension().addAll((Collection<? extends ArrayDimension>)newValue);
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
			case Aadl2Package.ARRAYABLE_ELEMENT__ARRAY_DIMENSION:
				getArrayDimension().clear();
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
			case Aadl2Package.ARRAYABLE_ELEMENT__ARRAY_DIMENSION:
				return arrayDimension != null && !arrayDimension.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArrayableElementImpl
