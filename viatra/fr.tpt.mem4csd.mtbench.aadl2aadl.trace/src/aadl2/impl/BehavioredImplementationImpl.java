/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.BehavioredImplementation;
import aadl2.SubprogramCall;
import aadl2.SubprogramCallSequence;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behaviored Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.BehavioredImplementationImpl#getSubprogramCall <em>Subprogram Call</em>}</li>
 *   <li>{@link aadl2.impl.BehavioredImplementationImpl#getOwnedSubprogramCallSequence <em>Owned Subprogram Call Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BehavioredImplementationImpl extends ComponentImplementationImpl implements BehavioredImplementation {
	/**
	 * The cached value of the '{@link #getOwnedSubprogramCallSequence() <em>Owned Subprogram Call Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSubprogramCallSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<SubprogramCallSequence> ownedSubprogramCallSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehavioredImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getBehavioredImplementation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubprogramCall> getSubprogramCall() {
		// TODO: implement this method to return the 'Subprogram Call' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubprogramCallSequence> getOwnedSubprogramCallSequence() {
		if (ownedSubprogramCallSequence == null) {
			ownedSubprogramCallSequence = new EObjectContainmentEList<SubprogramCallSequence>(SubprogramCallSequence.class, this, Aadl2Package.BEHAVIORED_IMPLEMENTATION__OWNED_SUBPROGRAM_CALL_SEQUENCE);
		}
		return ownedSubprogramCallSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubprogramCall> subprogramCalls() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.BEHAVIORED_IMPLEMENTATION__OWNED_SUBPROGRAM_CALL_SEQUENCE:
				return ((InternalEList<?>)getOwnedSubprogramCallSequence()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.BEHAVIORED_IMPLEMENTATION__SUBPROGRAM_CALL:
				return getSubprogramCall();
			case Aadl2Package.BEHAVIORED_IMPLEMENTATION__OWNED_SUBPROGRAM_CALL_SEQUENCE:
				return getOwnedSubprogramCallSequence();
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
			case Aadl2Package.BEHAVIORED_IMPLEMENTATION__SUBPROGRAM_CALL:
				getSubprogramCall().clear();
				getSubprogramCall().addAll((Collection<? extends SubprogramCall>)newValue);
				return;
			case Aadl2Package.BEHAVIORED_IMPLEMENTATION__OWNED_SUBPROGRAM_CALL_SEQUENCE:
				getOwnedSubprogramCallSequence().clear();
				getOwnedSubprogramCallSequence().addAll((Collection<? extends SubprogramCallSequence>)newValue);
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
			case Aadl2Package.BEHAVIORED_IMPLEMENTATION__SUBPROGRAM_CALL:
				getSubprogramCall().clear();
				return;
			case Aadl2Package.BEHAVIORED_IMPLEMENTATION__OWNED_SUBPROGRAM_CALL_SEQUENCE:
				getOwnedSubprogramCallSequence().clear();
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
			case Aadl2Package.BEHAVIORED_IMPLEMENTATION__SUBPROGRAM_CALL:
				return !getSubprogramCall().isEmpty();
			case Aadl2Package.BEHAVIORED_IMPLEMENTATION__OWNED_SUBPROGRAM_CALL_SEQUENCE:
				return ownedSubprogramCallSequence != null && !ownedSubprogramCallSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Aadl2Package.BEHAVIORED_IMPLEMENTATION___SUBPROGRAM_CALLS:
				return subprogramCalls();
		}
		return super.eInvoke(operationID, arguments);
	}

} //BehavioredImplementationImpl
