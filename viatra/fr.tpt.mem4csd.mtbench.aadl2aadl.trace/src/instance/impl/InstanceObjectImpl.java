/**
 */
package instance.impl;

import aadl2.impl.NamedElementImpl;

import instance.AnnexInstance;
import instance.InstanceObject;
import instance.InstancePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link instance.impl.InstanceObjectImpl#getAnnexInstance <em>Annex Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InstanceObjectImpl extends NamedElementImpl implements InstanceObject {
	/**
	 * The cached value of the '{@link #getAnnexInstance() <em>Annex Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnexInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnexInstance> annexInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.INSTANCE_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnexInstance> getAnnexInstance() {
		if (annexInstance == null) {
			annexInstance = new EObjectContainmentEList<AnnexInstance>(AnnexInstance.class, this, InstancePackage.INSTANCE_OBJECT__ANNEX_INSTANCE);
		}
		return annexInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.INSTANCE_OBJECT__ANNEX_INSTANCE:
				return ((InternalEList<?>)getAnnexInstance()).basicRemove(otherEnd, msgs);
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
			case InstancePackage.INSTANCE_OBJECT__ANNEX_INSTANCE:
				return getAnnexInstance();
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
			case InstancePackage.INSTANCE_OBJECT__ANNEX_INSTANCE:
				getAnnexInstance().clear();
				getAnnexInstance().addAll((Collection<? extends AnnexInstance>)newValue);
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
			case InstancePackage.INSTANCE_OBJECT__ANNEX_INSTANCE:
				getAnnexInstance().clear();
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
			case InstancePackage.INSTANCE_OBJECT__ANNEX_INSTANCE:
				return annexInstance != null && !annexInstance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstanceObjectImpl
