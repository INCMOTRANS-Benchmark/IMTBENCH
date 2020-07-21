/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.DataImplementation;
import aadl2.DataSubcomponent;
import aadl2.SubprogramSubcomponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.DataImplementationImpl#getOwnedDataSubcomponent <em>Owned Data Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.DataImplementationImpl#getOwnedSubprogramSubcomponent <em>Owned Subprogram Subcomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataImplementationImpl extends ComponentImplementationImpl implements DataImplementation {
	/**
	 * The cached value of the '{@link #getOwnedDataSubcomponent() <em>Owned Data Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDataSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSubcomponent> ownedDataSubcomponent;

	/**
	 * The cached value of the '{@link #getOwnedSubprogramSubcomponent() <em>Owned Subprogram Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSubprogramSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<SubprogramSubcomponent> ownedSubprogramSubcomponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getDataImplementation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSubcomponent> getOwnedDataSubcomponent() {
		if (ownedDataSubcomponent == null) {
			ownedDataSubcomponent = new EObjectContainmentEList<DataSubcomponent>(DataSubcomponent.class, this, Aadl2Package.DATA_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT);
		}
		return ownedDataSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubprogramSubcomponent> getOwnedSubprogramSubcomponent() {
		if (ownedSubprogramSubcomponent == null) {
			ownedSubprogramSubcomponent = new EObjectContainmentEList<SubprogramSubcomponent>(SubprogramSubcomponent.class, this, Aadl2Package.DATA_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT);
		}
		return ownedSubprogramSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.DATA_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedDataSubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.DATA_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedSubprogramSubcomponent()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.DATA_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				return getOwnedDataSubcomponent();
			case Aadl2Package.DATA_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				return getOwnedSubprogramSubcomponent();
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
			case Aadl2Package.DATA_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				getOwnedDataSubcomponent().clear();
				getOwnedDataSubcomponent().addAll((Collection<? extends DataSubcomponent>)newValue);
				return;
			case Aadl2Package.DATA_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				getOwnedSubprogramSubcomponent().clear();
				getOwnedSubprogramSubcomponent().addAll((Collection<? extends SubprogramSubcomponent>)newValue);
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
			case Aadl2Package.DATA_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				getOwnedDataSubcomponent().clear();
				return;
			case Aadl2Package.DATA_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				getOwnedSubprogramSubcomponent().clear();
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
			case Aadl2Package.DATA_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				return ownedDataSubcomponent != null && !ownedDataSubcomponent.isEmpty();
			case Aadl2Package.DATA_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				return ownedSubprogramSubcomponent != null && !ownedSubprogramSubcomponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataImplementationImpl
