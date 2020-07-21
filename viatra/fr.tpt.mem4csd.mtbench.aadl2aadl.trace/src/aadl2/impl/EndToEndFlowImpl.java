/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.EndToEndFlow;
import aadl2.EndToEndFlowElement;
import aadl2.EndToEndFlowSegment;
import aadl2.ModalElement;
import aadl2.ModalPath;
import aadl2.Mode;
import aadl2.ModeFeature;
import aadl2.ModeTransition;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End To End Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.EndToEndFlowImpl#getInMode <em>In Mode</em>}</li>
 *   <li>{@link aadl2.impl.EndToEndFlowImpl#getInModeOrTransition <em>In Mode Or Transition</em>}</li>
 *   <li>{@link aadl2.impl.EndToEndFlowImpl#getRefined <em>Refined</em>}</li>
 *   <li>{@link aadl2.impl.EndToEndFlowImpl#getOwnedEndToEndFlowSegment <em>Owned End To End Flow Segment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndToEndFlowImpl extends FlowFeatureImpl implements EndToEndFlow {
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
	 * The cached value of the '{@link #getInModeOrTransition() <em>In Mode Or Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInModeOrTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeFeature> inModeOrTransition;

	/**
	 * The cached value of the '{@link #getRefined() <em>Refined</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefined()
	 * @generated
	 * @ordered
	 */
	protected EndToEndFlow refined;

	/**
	 * The cached value of the '{@link #getOwnedEndToEndFlowSegment() <em>Owned End To End Flow Segment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEndToEndFlowSegment()
	 * @generated
	 * @ordered
	 */
	protected EList<EndToEndFlowSegment> ownedEndToEndFlowSegment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndToEndFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getEndToEndFlow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mode> getInMode() {
		if (inMode == null) {
			inMode = new EObjectResolvingEList<Mode>(Mode.class, this, Aadl2Package.END_TO_END_FLOW__IN_MODE);
		}
		return inMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModeFeature> getInModeOrTransition() {
		if (inModeOrTransition == null) {
			inModeOrTransition = new EObjectResolvingEList<ModeFeature>(ModeFeature.class, this, Aadl2Package.END_TO_END_FLOW__IN_MODE_OR_TRANSITION);
		}
		return inModeOrTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndToEndFlow getRefined() {
		if (refined != null && refined.eIsProxy()) {
			InternalEObject oldRefined = (InternalEObject)refined;
			refined = (EndToEndFlow)eResolveProxy(oldRefined);
			if (refined != oldRefined) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.END_TO_END_FLOW__REFINED, oldRefined, refined));
			}
		}
		return refined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndToEndFlow basicGetRefined() {
		return refined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefined(EndToEndFlow newRefined) {
		EndToEndFlow oldRefined = refined;
		refined = newRefined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.END_TO_END_FLOW__REFINED, oldRefined, refined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EndToEndFlowSegment> getOwnedEndToEndFlowSegment() {
		if (ownedEndToEndFlowSegment == null) {
			ownedEndToEndFlowSegment = new EObjectContainmentEList<EndToEndFlowSegment>(EndToEndFlowSegment.class, this, Aadl2Package.END_TO_END_FLOW__OWNED_END_TO_END_FLOW_SEGMENT);
		}
		return ownedEndToEndFlowSegment;
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
			case Aadl2Package.END_TO_END_FLOW__OWNED_END_TO_END_FLOW_SEGMENT:
				return ((InternalEList<?>)getOwnedEndToEndFlowSegment()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.END_TO_END_FLOW__IN_MODE:
				return getInMode();
			case Aadl2Package.END_TO_END_FLOW__IN_MODE_OR_TRANSITION:
				return getInModeOrTransition();
			case Aadl2Package.END_TO_END_FLOW__REFINED:
				if (resolve) return getRefined();
				return basicGetRefined();
			case Aadl2Package.END_TO_END_FLOW__OWNED_END_TO_END_FLOW_SEGMENT:
				return getOwnedEndToEndFlowSegment();
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
			case Aadl2Package.END_TO_END_FLOW__IN_MODE:
				getInMode().clear();
				getInMode().addAll((Collection<? extends Mode>)newValue);
				return;
			case Aadl2Package.END_TO_END_FLOW__IN_MODE_OR_TRANSITION:
				getInModeOrTransition().clear();
				getInModeOrTransition().addAll((Collection<? extends ModeFeature>)newValue);
				return;
			case Aadl2Package.END_TO_END_FLOW__REFINED:
				setRefined((EndToEndFlow)newValue);
				return;
			case Aadl2Package.END_TO_END_FLOW__OWNED_END_TO_END_FLOW_SEGMENT:
				getOwnedEndToEndFlowSegment().clear();
				getOwnedEndToEndFlowSegment().addAll((Collection<? extends EndToEndFlowSegment>)newValue);
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
			case Aadl2Package.END_TO_END_FLOW__IN_MODE:
				getInMode().clear();
				return;
			case Aadl2Package.END_TO_END_FLOW__IN_MODE_OR_TRANSITION:
				getInModeOrTransition().clear();
				return;
			case Aadl2Package.END_TO_END_FLOW__REFINED:
				setRefined((EndToEndFlow)null);
				return;
			case Aadl2Package.END_TO_END_FLOW__OWNED_END_TO_END_FLOW_SEGMENT:
				getOwnedEndToEndFlowSegment().clear();
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
			case Aadl2Package.END_TO_END_FLOW__IN_MODE:
				return inMode != null && !inMode.isEmpty();
			case Aadl2Package.END_TO_END_FLOW__IN_MODE_OR_TRANSITION:
				return inModeOrTransition != null && !inModeOrTransition.isEmpty();
			case Aadl2Package.END_TO_END_FLOW__REFINED:
				return refined != null;
			case Aadl2Package.END_TO_END_FLOW__OWNED_END_TO_END_FLOW_SEGMENT:
				return ownedEndToEndFlowSegment != null && !ownedEndToEndFlowSegment.isEmpty();
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
				case Aadl2Package.END_TO_END_FLOW__IN_MODE: return Aadl2Package.MODAL_ELEMENT__IN_MODE;
				default: return -1;
			}
		}
		if (baseClass == ModalPath.class) {
			switch (derivedFeatureID) {
				case Aadl2Package.END_TO_END_FLOW__IN_MODE_OR_TRANSITION: return Aadl2Package.MODAL_PATH__IN_MODE_OR_TRANSITION;
				default: return -1;
			}
		}
		if (baseClass == EndToEndFlowElement.class) {
			switch (derivedFeatureID) {
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
				case Aadl2Package.MODAL_ELEMENT__IN_MODE: return Aadl2Package.END_TO_END_FLOW__IN_MODE;
				default: return -1;
			}
		}
		if (baseClass == ModalPath.class) {
			switch (baseFeatureID) {
				case Aadl2Package.MODAL_PATH__IN_MODE_OR_TRANSITION: return Aadl2Package.END_TO_END_FLOW__IN_MODE_OR_TRANSITION;
				default: return -1;
			}
		}
		if (baseClass == EndToEndFlowElement.class) {
			switch (baseFeatureID) {
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
				case Aadl2Package.MODAL_ELEMENT___GET_ALL_IN_MODES: return Aadl2Package.END_TO_END_FLOW___GET_ALL_IN_MODES;
				default: return -1;
			}
		}
		if (baseClass == ModalPath.class) {
			switch (baseOperationID) {
				case Aadl2Package.MODAL_PATH___GET_IN_MODES: return Aadl2Package.END_TO_END_FLOW___GET_IN_MODES;
				case Aadl2Package.MODAL_PATH___GET_IN_MODE_TRANSITIONS: return Aadl2Package.END_TO_END_FLOW___GET_IN_MODE_TRANSITIONS;
				case Aadl2Package.MODAL_PATH___GET_ALL_IN_MODE_TRANSITIONS: return Aadl2Package.END_TO_END_FLOW___GET_ALL_IN_MODE_TRANSITIONS;
				default: return -1;
			}
		}
		if (baseClass == EndToEndFlowElement.class) {
			switch (baseOperationID) {
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
			case Aadl2Package.END_TO_END_FLOW___GET_IN_MODES:
				return getInModes();
			case Aadl2Package.END_TO_END_FLOW___GET_IN_MODE_TRANSITIONS:
				return getInModeTransitions();
			case Aadl2Package.END_TO_END_FLOW___GET_ALL_IN_MODE_TRANSITIONS:
				return getAllInModeTransitions();
			case Aadl2Package.END_TO_END_FLOW___GET_ALL_IN_MODES:
				return getAllInModes();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EndToEndFlowImpl
