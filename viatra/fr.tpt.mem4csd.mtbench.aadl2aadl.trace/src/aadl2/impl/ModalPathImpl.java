/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ModalPath;
import aadl2.Mode;
import aadl2.ModeFeature;
import aadl2.ModeTransition;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modal Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ModalPathImpl#getInModeOrTransition <em>In Mode Or Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModalPathImpl extends ModalElementImpl implements ModalPath {
	/**
	 * The cached value of the '{@link #getInModeOrTransition() <em>In Mode Or Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInModeOrTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeFeature> inModeOrTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModalPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getModalPath();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModeFeature> getInModeOrTransition() {
		if (inModeOrTransition == null) {
			inModeOrTransition = new EObjectResolvingEList<ModeFeature>(ModeFeature.class, this, Aadl2Package.MODAL_PATH__IN_MODE_OR_TRANSITION);
		}
		return inModeOrTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mode> getInModes() {
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
	public EList<ModeTransition> getInModeTransitions() {
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
	public EList<ModeTransition> getAllInModeTransitions() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.MODAL_PATH__IN_MODE_OR_TRANSITION:
				return getInModeOrTransition();
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
			case Aadl2Package.MODAL_PATH__IN_MODE_OR_TRANSITION:
				getInModeOrTransition().clear();
				getInModeOrTransition().addAll((Collection<? extends ModeFeature>)newValue);
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
			case Aadl2Package.MODAL_PATH__IN_MODE_OR_TRANSITION:
				getInModeOrTransition().clear();
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
			case Aadl2Package.MODAL_PATH__IN_MODE_OR_TRANSITION:
				return inModeOrTransition != null && !inModeOrTransition.isEmpty();
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
			case Aadl2Package.MODAL_PATH___GET_IN_MODES:
				return getInModes();
			case Aadl2Package.MODAL_PATH___GET_IN_MODE_TRANSITIONS:
				return getInModeTransitions();
			case Aadl2Package.MODAL_PATH___GET_ALL_IN_MODE_TRANSITIONS:
				return getAllInModeTransitions();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ModalPathImpl
