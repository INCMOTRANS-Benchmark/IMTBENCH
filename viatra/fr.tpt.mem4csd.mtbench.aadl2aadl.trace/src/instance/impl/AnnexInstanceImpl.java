/**
 */
package instance.impl;

import aadl2.AnnexSubclause;

import aadl2.impl.NamedElementImpl;

import instance.AnnexInstance;
import instance.InstancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annex Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link instance.impl.AnnexInstanceImpl#getAnnexSubclause <em>Annex Subclause</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AnnexInstanceImpl extends NamedElementImpl implements AnnexInstance {
	/**
	 * The cached value of the '{@link #getAnnexSubclause() <em>Annex Subclause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnexSubclause()
	 * @generated
	 * @ordered
	 */
	protected AnnexSubclause annexSubclause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnexInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.ANNEX_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnexSubclause getAnnexSubclause() {
		if (annexSubclause != null && annexSubclause.eIsProxy()) {
			InternalEObject oldAnnexSubclause = (InternalEObject)annexSubclause;
			annexSubclause = (AnnexSubclause)eResolveProxy(oldAnnexSubclause);
			if (annexSubclause != oldAnnexSubclause) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.ANNEX_INSTANCE__ANNEX_SUBCLAUSE, oldAnnexSubclause, annexSubclause));
			}
		}
		return annexSubclause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnexSubclause basicGetAnnexSubclause() {
		return annexSubclause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnexSubclause(AnnexSubclause newAnnexSubclause) {
		AnnexSubclause oldAnnexSubclause = annexSubclause;
		annexSubclause = newAnnexSubclause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ANNEX_INSTANCE__ANNEX_SUBCLAUSE, oldAnnexSubclause, annexSubclause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.ANNEX_INSTANCE__ANNEX_SUBCLAUSE:
				if (resolve) return getAnnexSubclause();
				return basicGetAnnexSubclause();
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
			case InstancePackage.ANNEX_INSTANCE__ANNEX_SUBCLAUSE:
				setAnnexSubclause((AnnexSubclause)newValue);
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
			case InstancePackage.ANNEX_INSTANCE__ANNEX_SUBCLAUSE:
				setAnnexSubclause((AnnexSubclause)null);
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
			case InstancePackage.ANNEX_INSTANCE__ANNEX_SUBCLAUSE:
				return annexSubclause != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnexInstanceImpl
