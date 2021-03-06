/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.DataSubcomponent;
import aadl2.SubprogramGroupImplementation;
import aadl2.SubprogramGroupSubcomponent;
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
 * An implementation of the model object '<em><b>Subprogram Group Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.SubprogramGroupImplementationImpl#getOwnedSubprogramSubcomponent <em>Owned Subprogram Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.SubprogramGroupImplementationImpl#getOwnedSubprogramGroupSubcomponent <em>Owned Subprogram Group Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.SubprogramGroupImplementationImpl#getOwnedDataSubcomponent <em>Owned Data Subcomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramGroupImplementationImpl extends ComponentImplementationImpl implements SubprogramGroupImplementation {
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
	 * The cached value of the '{@link #getOwnedSubprogramGroupSubcomponent() <em>Owned Subprogram Group Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSubprogramGroupSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<SubprogramGroupSubcomponent> ownedSubprogramGroupSubcomponent;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprogramGroupImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getSubprogramGroupImplementation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubprogramSubcomponent> getOwnedSubprogramSubcomponent() {
		if (ownedSubprogramSubcomponent == null) {
			ownedSubprogramSubcomponent = new EObjectContainmentEList<SubprogramSubcomponent>(SubprogramSubcomponent.class, this, Aadl2Package.SUBPROGRAM_GROUP_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT);
		}
		return ownedSubprogramSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubprogramGroupSubcomponent> getOwnedSubprogramGroupSubcomponent() {
		if (ownedSubprogramGroupSubcomponent == null) {
			ownedSubprogramGroupSubcomponent = new EObjectContainmentEList<SubprogramGroupSubcomponent>(SubprogramGroupSubcomponent.class, this, Aadl2Package.SUBPROGRAM_GROUP_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT);
		}
		return ownedSubprogramGroupSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSubcomponent> getOwnedDataSubcomponent() {
		if (ownedDataSubcomponent == null) {
			ownedDataSubcomponent = new EObjectContainmentEList<DataSubcomponent>(DataSubcomponent.class, this, Aadl2Package.SUBPROGRAM_GROUP_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT);
		}
		return ownedDataSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.SUBPROGRAM_GROUP_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedSubprogramSubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.SUBPROGRAM_GROUP_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedSubprogramGroupSubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.SUBPROGRAM_GROUP_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedDataSubcomponent()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.SUBPROGRAM_GROUP_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				return getOwnedSubprogramSubcomponent();
			case Aadl2Package.SUBPROGRAM_GROUP_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT:
				return getOwnedSubprogramGroupSubcomponent();
			case Aadl2Package.SUBPROGRAM_GROUP_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				return getOwnedDataSubcomponent();
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
			case Aadl2Package.SUBPROGRAM_GROUP_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				getOwnedSubprogramSubcomponent().clear();
				getOwnedSubprogramSubcomponent().addAll((Collection<? extends SubprogramSubcomponent>)newValue);
				return;
			case Aadl2Package.SUBPROGRAM_GROUP_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT:
				getOwnedSubprogramGroupSubcomponent().clear();
				getOwnedSubprogramGroupSubcomponent().addAll((Collection<? extends SubprogramGroupSubcomponent>)newValue);
				return;
			case Aadl2Package.SUBPROGRAM_GROUP_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				getOwnedDataSubcomponent().clear();
				getOwnedDataSubcomponent().addAll((Collection<? extends DataSubcomponent>)newValue);
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
			case Aadl2Package.SUBPROGRAM_GROUP_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				getOwnedSubprogramSubcomponent().clear();
				return;
			case Aadl2Package.SUBPROGRAM_GROUP_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT:
				getOwnedSubprogramGroupSubcomponent().clear();
				return;
			case Aadl2Package.SUBPROGRAM_GROUP_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				getOwnedDataSubcomponent().clear();
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
			case Aadl2Package.SUBPROGRAM_GROUP_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				return ownedSubprogramSubcomponent != null && !ownedSubprogramSubcomponent.isEmpty();
			case Aadl2Package.SUBPROGRAM_GROUP_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT:
				return ownedSubprogramGroupSubcomponent != null && !ownedSubprogramGroupSubcomponent.isEmpty();
			case Aadl2Package.SUBPROGRAM_GROUP_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				return ownedDataSubcomponent != null && !ownedDataSubcomponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubprogramGroupImplementationImpl
