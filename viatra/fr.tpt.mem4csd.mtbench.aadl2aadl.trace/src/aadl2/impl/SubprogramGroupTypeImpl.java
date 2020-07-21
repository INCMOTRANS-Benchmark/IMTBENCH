/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.SubprogramAccess;
import aadl2.SubprogramGroupAccess;
import aadl2.SubprogramGroupType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.SubprogramGroupTypeImpl#getOwnedSubprogramAccess <em>Owned Subprogram Access</em>}</li>
 *   <li>{@link aadl2.impl.SubprogramGroupTypeImpl#getOwnedSubprogramGroupAccess <em>Owned Subprogram Group Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramGroupTypeImpl extends ComponentTypeImpl implements SubprogramGroupType {
	/**
	 * The cached value of the '{@link #getOwnedSubprogramAccess() <em>Owned Subprogram Access</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSubprogramAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<SubprogramAccess> ownedSubprogramAccess;

	/**
	 * The cached value of the '{@link #getOwnedSubprogramGroupAccess() <em>Owned Subprogram Group Access</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSubprogramGroupAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<SubprogramGroupAccess> ownedSubprogramGroupAccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprogramGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getSubprogramGroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubprogramAccess> getOwnedSubprogramAccess() {
		if (ownedSubprogramAccess == null) {
			ownedSubprogramAccess = new EObjectContainmentEList<SubprogramAccess>(SubprogramAccess.class, this, Aadl2Package.SUBPROGRAM_GROUP_TYPE__OWNED_SUBPROGRAM_ACCESS);
		}
		return ownedSubprogramAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubprogramGroupAccess> getOwnedSubprogramGroupAccess() {
		if (ownedSubprogramGroupAccess == null) {
			ownedSubprogramGroupAccess = new EObjectContainmentEList<SubprogramGroupAccess>(SubprogramGroupAccess.class, this, Aadl2Package.SUBPROGRAM_GROUP_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS);
		}
		return ownedSubprogramGroupAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.SUBPROGRAM_GROUP_TYPE__OWNED_SUBPROGRAM_ACCESS:
				return ((InternalEList<?>)getOwnedSubprogramAccess()).basicRemove(otherEnd, msgs);
			case Aadl2Package.SUBPROGRAM_GROUP_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS:
				return ((InternalEList<?>)getOwnedSubprogramGroupAccess()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.SUBPROGRAM_GROUP_TYPE__OWNED_SUBPROGRAM_ACCESS:
				return getOwnedSubprogramAccess();
			case Aadl2Package.SUBPROGRAM_GROUP_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS:
				return getOwnedSubprogramGroupAccess();
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
			case Aadl2Package.SUBPROGRAM_GROUP_TYPE__OWNED_SUBPROGRAM_ACCESS:
				getOwnedSubprogramAccess().clear();
				getOwnedSubprogramAccess().addAll((Collection<? extends SubprogramAccess>)newValue);
				return;
			case Aadl2Package.SUBPROGRAM_GROUP_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS:
				getOwnedSubprogramGroupAccess().clear();
				getOwnedSubprogramGroupAccess().addAll((Collection<? extends SubprogramGroupAccess>)newValue);
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
			case Aadl2Package.SUBPROGRAM_GROUP_TYPE__OWNED_SUBPROGRAM_ACCESS:
				getOwnedSubprogramAccess().clear();
				return;
			case Aadl2Package.SUBPROGRAM_GROUP_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS:
				getOwnedSubprogramGroupAccess().clear();
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
			case Aadl2Package.SUBPROGRAM_GROUP_TYPE__OWNED_SUBPROGRAM_ACCESS:
				return ownedSubprogramAccess != null && !ownedSubprogramAccess.isEmpty();
			case Aadl2Package.SUBPROGRAM_GROUP_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS:
				return ownedSubprogramGroupAccess != null && !ownedSubprogramGroupAccess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubprogramGroupTypeImpl
