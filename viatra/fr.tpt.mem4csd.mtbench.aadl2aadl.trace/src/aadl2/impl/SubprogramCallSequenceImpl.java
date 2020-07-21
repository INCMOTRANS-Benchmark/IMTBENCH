/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ModalElement;
import aadl2.Mode;
import aadl2.SubprogramCall;
import aadl2.SubprogramCallSequence;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Call Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.SubprogramCallSequenceImpl#getInMode <em>In Mode</em>}</li>
 *   <li>{@link aadl2.impl.SubprogramCallSequenceImpl#getOwnedSubprogramCall <em>Owned Subprogram Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramCallSequenceImpl extends BehavioralFeatureImpl implements SubprogramCallSequence {
	/**
	 * The cached value of the '{@link #getInMode() <em>In Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInMode()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> inMode;

	/**
	 * The cached value of the '{@link #getOwnedSubprogramCall() <em>Owned Subprogram Call</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSubprogramCall()
	 * @generated
	 * @ordered
	 */
	protected EList<SubprogramCall> ownedSubprogramCall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprogramCallSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getSubprogramCallSequence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mode> getInMode() {
		if (inMode == null) {
			inMode = new EObjectResolvingEList<Mode>(Mode.class, this, Aadl2Package.SUBPROGRAM_CALL_SEQUENCE__IN_MODE);
		}
		return inMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubprogramCall> getOwnedSubprogramCall() {
		if (ownedSubprogramCall == null) {
			ownedSubprogramCall = new EObjectContainmentEList<SubprogramCall>(SubprogramCall.class, this, Aadl2Package.SUBPROGRAM_CALL_SEQUENCE__OWNED_SUBPROGRAM_CALL);
		}
		return ownedSubprogramCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mode> getAllInModes() {
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
			case Aadl2Package.SUBPROGRAM_CALL_SEQUENCE__OWNED_SUBPROGRAM_CALL:
				return ((InternalEList<?>)getOwnedSubprogramCall()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.SUBPROGRAM_CALL_SEQUENCE__IN_MODE:
				return getInMode();
			case Aadl2Package.SUBPROGRAM_CALL_SEQUENCE__OWNED_SUBPROGRAM_CALL:
				return getOwnedSubprogramCall();
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
			case Aadl2Package.SUBPROGRAM_CALL_SEQUENCE__IN_MODE:
				getInMode().clear();
				getInMode().addAll((Collection<? extends Mode>)newValue);
				return;
			case Aadl2Package.SUBPROGRAM_CALL_SEQUENCE__OWNED_SUBPROGRAM_CALL:
				getOwnedSubprogramCall().clear();
				getOwnedSubprogramCall().addAll((Collection<? extends SubprogramCall>)newValue);
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
			case Aadl2Package.SUBPROGRAM_CALL_SEQUENCE__IN_MODE:
				getInMode().clear();
				return;
			case Aadl2Package.SUBPROGRAM_CALL_SEQUENCE__OWNED_SUBPROGRAM_CALL:
				getOwnedSubprogramCall().clear();
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
			case Aadl2Package.SUBPROGRAM_CALL_SEQUENCE__IN_MODE:
				return inMode != null && !inMode.isEmpty();
			case Aadl2Package.SUBPROGRAM_CALL_SEQUENCE__OWNED_SUBPROGRAM_CALL:
				return ownedSubprogramCall != null && !ownedSubprogramCall.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ModalElement.class) {
			switch (derivedFeatureID) {
				case Aadl2Package.SUBPROGRAM_CALL_SEQUENCE__IN_MODE: return Aadl2Package.MODAL_ELEMENT__IN_MODE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ModalElement.class) {
			switch (baseFeatureID) {
				case Aadl2Package.MODAL_ELEMENT__IN_MODE: return Aadl2Package.SUBPROGRAM_CALL_SEQUENCE__IN_MODE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ModalElement.class) {
			switch (baseOperationID) {
				case Aadl2Package.MODAL_ELEMENT___GET_ALL_IN_MODES: return Aadl2Package.SUBPROGRAM_CALL_SEQUENCE___GET_ALL_IN_MODES;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Aadl2Package.SUBPROGRAM_CALL_SEQUENCE___GET_ALL_IN_MODES:
				return getAllInModes();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SubprogramCallSequenceImpl
