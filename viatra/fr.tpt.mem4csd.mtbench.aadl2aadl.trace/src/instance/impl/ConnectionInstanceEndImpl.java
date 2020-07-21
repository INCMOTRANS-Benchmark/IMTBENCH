/**
 */
package instance.impl;

import instance.ConnectionInstance;
import instance.ConnectionInstanceEnd;
import instance.InstancePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Instance End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link instance.impl.ConnectionInstanceEndImpl#getSrcConnectionInstance <em>Src Connection Instance</em>}</li>
 *   <li>{@link instance.impl.ConnectionInstanceEndImpl#getDstConnectionInstance <em>Dst Connection Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConnectionInstanceEndImpl extends InstanceObjectImpl implements ConnectionInstanceEnd {
	/**
	 * The cached value of the '{@link #getSrcConnectionInstance() <em>Src Connection Instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcConnectionInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionInstance> srcConnectionInstance;

	/**
	 * The cached value of the '{@link #getDstConnectionInstance() <em>Dst Connection Instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDstConnectionInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionInstance> dstConnectionInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionInstanceEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.CONNECTION_INSTANCE_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionInstance> getSrcConnectionInstance() {
		if (srcConnectionInstance == null) {
			srcConnectionInstance = new EObjectWithInverseEList<ConnectionInstance>(ConnectionInstance.class, this, InstancePackage.CONNECTION_INSTANCE_END__SRC_CONNECTION_INSTANCE, InstancePackage.CONNECTION_INSTANCE__SOURCE);
		}
		return srcConnectionInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionInstance> getDstConnectionInstance() {
		if (dstConnectionInstance == null) {
			dstConnectionInstance = new EObjectWithInverseEList<ConnectionInstance>(ConnectionInstance.class, this, InstancePackage.CONNECTION_INSTANCE_END__DST_CONNECTION_INSTANCE, InstancePackage.CONNECTION_INSTANCE__DESTINATION);
		}
		return dstConnectionInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.CONNECTION_INSTANCE_END__SRC_CONNECTION_INSTANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSrcConnectionInstance()).basicAdd(otherEnd, msgs);
			case InstancePackage.CONNECTION_INSTANCE_END__DST_CONNECTION_INSTANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDstConnectionInstance()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.CONNECTION_INSTANCE_END__SRC_CONNECTION_INSTANCE:
				return ((InternalEList<?>)getSrcConnectionInstance()).basicRemove(otherEnd, msgs);
			case InstancePackage.CONNECTION_INSTANCE_END__DST_CONNECTION_INSTANCE:
				return ((InternalEList<?>)getDstConnectionInstance()).basicRemove(otherEnd, msgs);
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
			case InstancePackage.CONNECTION_INSTANCE_END__SRC_CONNECTION_INSTANCE:
				return getSrcConnectionInstance();
			case InstancePackage.CONNECTION_INSTANCE_END__DST_CONNECTION_INSTANCE:
				return getDstConnectionInstance();
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
			case InstancePackage.CONNECTION_INSTANCE_END__SRC_CONNECTION_INSTANCE:
				getSrcConnectionInstance().clear();
				getSrcConnectionInstance().addAll((Collection<? extends ConnectionInstance>)newValue);
				return;
			case InstancePackage.CONNECTION_INSTANCE_END__DST_CONNECTION_INSTANCE:
				getDstConnectionInstance().clear();
				getDstConnectionInstance().addAll((Collection<? extends ConnectionInstance>)newValue);
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
			case InstancePackage.CONNECTION_INSTANCE_END__SRC_CONNECTION_INSTANCE:
				getSrcConnectionInstance().clear();
				return;
			case InstancePackage.CONNECTION_INSTANCE_END__DST_CONNECTION_INSTANCE:
				getDstConnectionInstance().clear();
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
			case InstancePackage.CONNECTION_INSTANCE_END__SRC_CONNECTION_INSTANCE:
				return srcConnectionInstance != null && !srcConnectionInstance.isEmpty();
			case InstancePackage.CONNECTION_INSTANCE_END__DST_CONNECTION_INSTANCE:
				return dstConnectionInstance != null && !dstConnectionInstance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectionInstanceEndImpl
