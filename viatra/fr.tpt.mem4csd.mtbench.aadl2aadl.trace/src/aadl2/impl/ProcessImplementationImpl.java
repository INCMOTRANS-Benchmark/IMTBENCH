/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.DataSubcomponent;
import aadl2.ProcessImplementation;
import aadl2.SubprogramGroupSubcomponent;
import aadl2.SubprogramSubcomponent;
import aadl2.ThreadGroupSubcomponent;
import aadl2.ThreadSubcomponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ProcessImplementationImpl#getOwnedDataSubcomponent <em>Owned Data Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.ProcessImplementationImpl#getOwnedSubprogramSubcomponent <em>Owned Subprogram Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.ProcessImplementationImpl#getOwnedSubprogramGroupSubcomponent <em>Owned Subprogram Group Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.ProcessImplementationImpl#getOwnedThreadSubcomponent <em>Owned Thread Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.ProcessImplementationImpl#getOwnedThreadGroupSubcomponent <em>Owned Thread Group Subcomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImplementationImpl extends ComponentImplementationImpl implements ProcessImplementation {
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
	 * The cached value of the '{@link #getOwnedSubprogramGroupSubcomponent() <em>Owned Subprogram Group Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSubprogramGroupSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<SubprogramGroupSubcomponent> ownedSubprogramGroupSubcomponent;

	/**
	 * The cached value of the '{@link #getOwnedThreadSubcomponent() <em>Owned Thread Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedThreadSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ThreadSubcomponent> ownedThreadSubcomponent;

	/**
	 * The cached value of the '{@link #getOwnedThreadGroupSubcomponent() <em>Owned Thread Group Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedThreadGroupSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ThreadGroupSubcomponent> ownedThreadGroupSubcomponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getProcessImplementation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSubcomponent> getOwnedDataSubcomponent() {
		if (ownedDataSubcomponent == null) {
			ownedDataSubcomponent = new EObjectContainmentEList<DataSubcomponent>(DataSubcomponent.class, this, Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT);
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
			ownedSubprogramSubcomponent = new EObjectContainmentEList<SubprogramSubcomponent>(SubprogramSubcomponent.class, this, Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT);
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
			ownedSubprogramGroupSubcomponent = new EObjectContainmentEList<SubprogramGroupSubcomponent>(SubprogramGroupSubcomponent.class, this, Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT);
		}
		return ownedSubprogramGroupSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThreadSubcomponent> getOwnedThreadSubcomponent() {
		if (ownedThreadSubcomponent == null) {
			ownedThreadSubcomponent = new EObjectContainmentEList<ThreadSubcomponent>(ThreadSubcomponent.class, this, Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_THREAD_SUBCOMPONENT);
		}
		return ownedThreadSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThreadGroupSubcomponent> getOwnedThreadGroupSubcomponent() {
		if (ownedThreadGroupSubcomponent == null) {
			ownedThreadGroupSubcomponent = new EObjectContainmentEList<ThreadGroupSubcomponent>(ThreadGroupSubcomponent.class, this, Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_THREAD_GROUP_SUBCOMPONENT);
		}
		return ownedThreadGroupSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedDataSubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedSubprogramSubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedSubprogramGroupSubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_THREAD_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedThreadSubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_THREAD_GROUP_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedThreadGroupSubcomponent()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				return getOwnedDataSubcomponent();
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				return getOwnedSubprogramSubcomponent();
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT:
				return getOwnedSubprogramGroupSubcomponent();
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_THREAD_SUBCOMPONENT:
				return getOwnedThreadSubcomponent();
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_THREAD_GROUP_SUBCOMPONENT:
				return getOwnedThreadGroupSubcomponent();
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
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				getOwnedDataSubcomponent().clear();
				getOwnedDataSubcomponent().addAll((Collection<? extends DataSubcomponent>)newValue);
				return;
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				getOwnedSubprogramSubcomponent().clear();
				getOwnedSubprogramSubcomponent().addAll((Collection<? extends SubprogramSubcomponent>)newValue);
				return;
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT:
				getOwnedSubprogramGroupSubcomponent().clear();
				getOwnedSubprogramGroupSubcomponent().addAll((Collection<? extends SubprogramGroupSubcomponent>)newValue);
				return;
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_THREAD_SUBCOMPONENT:
				getOwnedThreadSubcomponent().clear();
				getOwnedThreadSubcomponent().addAll((Collection<? extends ThreadSubcomponent>)newValue);
				return;
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_THREAD_GROUP_SUBCOMPONENT:
				getOwnedThreadGroupSubcomponent().clear();
				getOwnedThreadGroupSubcomponent().addAll((Collection<? extends ThreadGroupSubcomponent>)newValue);
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
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				getOwnedDataSubcomponent().clear();
				return;
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				getOwnedSubprogramSubcomponent().clear();
				return;
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT:
				getOwnedSubprogramGroupSubcomponent().clear();
				return;
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_THREAD_SUBCOMPONENT:
				getOwnedThreadSubcomponent().clear();
				return;
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_THREAD_GROUP_SUBCOMPONENT:
				getOwnedThreadGroupSubcomponent().clear();
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
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				return ownedDataSubcomponent != null && !ownedDataSubcomponent.isEmpty();
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				return ownedSubprogramSubcomponent != null && !ownedSubprogramSubcomponent.isEmpty();
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT:
				return ownedSubprogramGroupSubcomponent != null && !ownedSubprogramGroupSubcomponent.isEmpty();
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_THREAD_SUBCOMPONENT:
				return ownedThreadSubcomponent != null && !ownedThreadSubcomponent.isEmpty();
			case Aadl2Package.PROCESS_IMPLEMENTATION__OWNED_THREAD_GROUP_SUBCOMPONENT:
				return ownedThreadGroupSubcomponent != null && !ownedThreadGroupSubcomponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessImplementationImpl
