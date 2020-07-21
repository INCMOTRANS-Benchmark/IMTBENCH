/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.BusAccess;
import aadl2.DataPort;
import aadl2.EventDataPort;
import aadl2.EventPort;
import aadl2.VirtualBusType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Bus Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.VirtualBusTypeImpl#getOwnedDataPort <em>Owned Data Port</em>}</li>
 *   <li>{@link aadl2.impl.VirtualBusTypeImpl#getOwnedEventDataPort <em>Owned Event Data Port</em>}</li>
 *   <li>{@link aadl2.impl.VirtualBusTypeImpl#getOwnedEventPort <em>Owned Event Port</em>}</li>
 *   <li>{@link aadl2.impl.VirtualBusTypeImpl#getOwnedBusAccess <em>Owned Bus Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualBusTypeImpl extends ComponentTypeImpl implements VirtualBusType {
	/**
	 * The cached value of the '{@link #getOwnedDataPort() <em>Owned Data Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDataPort()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPort> ownedDataPort;

	/**
	 * The cached value of the '{@link #getOwnedEventDataPort() <em>Owned Event Data Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEventDataPort()
	 * @generated
	 * @ordered
	 */
	protected EList<EventDataPort> ownedEventDataPort;

	/**
	 * The cached value of the '{@link #getOwnedEventPort() <em>Owned Event Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEventPort()
	 * @generated
	 * @ordered
	 */
	protected EList<EventPort> ownedEventPort;

	/**
	 * The cached value of the '{@link #getOwnedBusAccess() <em>Owned Bus Access</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBusAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<BusAccess> ownedBusAccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualBusTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getVirtualBusType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataPort> getOwnedDataPort() {
		if (ownedDataPort == null) {
			ownedDataPort = new EObjectContainmentEList<DataPort>(DataPort.class, this, Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_DATA_PORT);
		}
		return ownedDataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EventDataPort> getOwnedEventDataPort() {
		if (ownedEventDataPort == null) {
			ownedEventDataPort = new EObjectContainmentEList<EventDataPort>(EventDataPort.class, this, Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_EVENT_DATA_PORT);
		}
		return ownedEventDataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EventPort> getOwnedEventPort() {
		if (ownedEventPort == null) {
			ownedEventPort = new EObjectContainmentEList<EventPort>(EventPort.class, this, Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_EVENT_PORT);
		}
		return ownedEventPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BusAccess> getOwnedBusAccess() {
		if (ownedBusAccess == null) {
			ownedBusAccess = new EObjectContainmentEList<BusAccess>(BusAccess.class, this, Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_BUS_ACCESS);
		}
		return ownedBusAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_DATA_PORT:
				return ((InternalEList<?>)getOwnedDataPort()).basicRemove(otherEnd, msgs);
			case Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_EVENT_DATA_PORT:
				return ((InternalEList<?>)getOwnedEventDataPort()).basicRemove(otherEnd, msgs);
			case Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_EVENT_PORT:
				return ((InternalEList<?>)getOwnedEventPort()).basicRemove(otherEnd, msgs);
			case Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_BUS_ACCESS:
				return ((InternalEList<?>)getOwnedBusAccess()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_DATA_PORT:
				return getOwnedDataPort();
			case Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_EVENT_DATA_PORT:
				return getOwnedEventDataPort();
			case Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_EVENT_PORT:
				return getOwnedEventPort();
			case Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_BUS_ACCESS:
				return getOwnedBusAccess();
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
			case Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_DATA_PORT:
				getOwnedDataPort().clear();
				getOwnedDataPort().addAll((Collection<? extends DataPort>)newValue);
				return;
			case Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_EVENT_DATA_PORT:
				getOwnedEventDataPort().clear();
				getOwnedEventDataPort().addAll((Collection<? extends EventDataPort>)newValue);
				return;
			case Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_EVENT_PORT:
				getOwnedEventPort().clear();
				getOwnedEventPort().addAll((Collection<? extends EventPort>)newValue);
				return;
			case Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_BUS_ACCESS:
				getOwnedBusAccess().clear();
				getOwnedBusAccess().addAll((Collection<? extends BusAccess>)newValue);
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
			case Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_DATA_PORT:
				getOwnedDataPort().clear();
				return;
			case Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_EVENT_DATA_PORT:
				getOwnedEventDataPort().clear();
				return;
			case Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_EVENT_PORT:
				getOwnedEventPort().clear();
				return;
			case Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_BUS_ACCESS:
				getOwnedBusAccess().clear();
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
			case Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_DATA_PORT:
				return ownedDataPort != null && !ownedDataPort.isEmpty();
			case Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_EVENT_DATA_PORT:
				return ownedEventDataPort != null && !ownedEventDataPort.isEmpty();
			case Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_EVENT_PORT:
				return ownedEventPort != null && !ownedEventPort.isEmpty();
			case Aadl2Package.VIRTUAL_BUS_TYPE__OWNED_BUS_ACCESS:
				return ownedBusAccess != null && !ownedBusAccess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VirtualBusTypeImpl
