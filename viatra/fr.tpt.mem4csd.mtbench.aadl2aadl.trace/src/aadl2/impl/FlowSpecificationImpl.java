/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.EndToEndFlowElement;
import aadl2.FlowElement;
import aadl2.FlowEnd;
import aadl2.FlowKind;
import aadl2.FlowSpecification;
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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.FlowSpecificationImpl#getInMode <em>In Mode</em>}</li>
 *   <li>{@link aadl2.impl.FlowSpecificationImpl#getInModeOrTransition <em>In Mode Or Transition</em>}</li>
 *   <li>{@link aadl2.impl.FlowSpecificationImpl#getRefined <em>Refined</em>}</li>
 *   <li>{@link aadl2.impl.FlowSpecificationImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link aadl2.impl.FlowSpecificationImpl#getOutEnd <em>Out End</em>}</li>
 *   <li>{@link aadl2.impl.FlowSpecificationImpl#getInEnd <em>In End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowSpecificationImpl extends FlowFeatureImpl implements FlowSpecification {
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
	protected FlowSpecification refined;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final FlowKind KIND_EDEFAULT = FlowKind.SOURCE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected FlowKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutEnd() <em>Out End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutEnd()
	 * @generated
	 * @ordered
	 */
	protected FlowEnd outEnd;

	/**
	 * The cached value of the '{@link #getInEnd() <em>In End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInEnd()
	 * @generated
	 * @ordered
	 */
	protected FlowEnd inEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getFlowSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mode> getInMode() {
		if (inMode == null) {
			inMode = new EObjectResolvingEList<Mode>(Mode.class, this, Aadl2Package.FLOW_SPECIFICATION__IN_MODE);
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
			inModeOrTransition = new EObjectResolvingEList<ModeFeature>(ModeFeature.class, this, Aadl2Package.FLOW_SPECIFICATION__IN_MODE_OR_TRANSITION);
		}
		return inModeOrTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowSpecification getRefined() {
		if (refined != null && refined.eIsProxy()) {
			InternalEObject oldRefined = (InternalEObject)refined;
			refined = (FlowSpecification)eResolveProxy(oldRefined);
			if (refined != oldRefined) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.FLOW_SPECIFICATION__REFINED, oldRefined, refined));
			}
		}
		return refined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowSpecification basicGetRefined() {
		return refined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefined(FlowSpecification newRefined) {
		FlowSpecification oldRefined = refined;
		refined = newRefined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.FLOW_SPECIFICATION__REFINED, oldRefined, refined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(FlowKind newKind) {
		FlowKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.FLOW_SPECIFICATION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowEnd getOutEnd() {
		return outEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutEnd(FlowEnd newOutEnd, NotificationChain msgs) {
		FlowEnd oldOutEnd = outEnd;
		outEnd = newOutEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.FLOW_SPECIFICATION__OUT_END, oldOutEnd, newOutEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutEnd(FlowEnd newOutEnd) {
		if (newOutEnd != outEnd) {
			NotificationChain msgs = null;
			if (outEnd != null)
				msgs = ((InternalEObject)outEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.FLOW_SPECIFICATION__OUT_END, null, msgs);
			if (newOutEnd != null)
				msgs = ((InternalEObject)newOutEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.FLOW_SPECIFICATION__OUT_END, null, msgs);
			msgs = basicSetOutEnd(newOutEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.FLOW_SPECIFICATION__OUT_END, newOutEnd, newOutEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowEnd getInEnd() {
		return inEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInEnd(FlowEnd newInEnd, NotificationChain msgs) {
		FlowEnd oldInEnd = inEnd;
		inEnd = newInEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.FLOW_SPECIFICATION__IN_END, oldInEnd, newInEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInEnd(FlowEnd newInEnd) {
		if (newInEnd != inEnd) {
			NotificationChain msgs = null;
			if (inEnd != null)
				msgs = ((InternalEObject)inEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.FLOW_SPECIFICATION__IN_END, null, msgs);
			if (newInEnd != null)
				msgs = ((InternalEObject)newInEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.FLOW_SPECIFICATION__IN_END, null, msgs);
			msgs = basicSetInEnd(newInEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.FLOW_SPECIFICATION__IN_END, newInEnd, newInEnd));
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
			case Aadl2Package.FLOW_SPECIFICATION__OUT_END:
				return basicSetOutEnd(null, msgs);
			case Aadl2Package.FLOW_SPECIFICATION__IN_END:
				return basicSetInEnd(null, msgs);
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
			case Aadl2Package.FLOW_SPECIFICATION__IN_MODE:
				return getInMode();
			case Aadl2Package.FLOW_SPECIFICATION__IN_MODE_OR_TRANSITION:
				return getInModeOrTransition();
			case Aadl2Package.FLOW_SPECIFICATION__REFINED:
				if (resolve) return getRefined();
				return basicGetRefined();
			case Aadl2Package.FLOW_SPECIFICATION__KIND:
				return getKind();
			case Aadl2Package.FLOW_SPECIFICATION__OUT_END:
				return getOutEnd();
			case Aadl2Package.FLOW_SPECIFICATION__IN_END:
				return getInEnd();
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
			case Aadl2Package.FLOW_SPECIFICATION__IN_MODE:
				getInMode().clear();
				getInMode().addAll((Collection<? extends Mode>)newValue);
				return;
			case Aadl2Package.FLOW_SPECIFICATION__IN_MODE_OR_TRANSITION:
				getInModeOrTransition().clear();
				getInModeOrTransition().addAll((Collection<? extends ModeFeature>)newValue);
				return;
			case Aadl2Package.FLOW_SPECIFICATION__REFINED:
				setRefined((FlowSpecification)newValue);
				return;
			case Aadl2Package.FLOW_SPECIFICATION__KIND:
				setKind((FlowKind)newValue);
				return;
			case Aadl2Package.FLOW_SPECIFICATION__OUT_END:
				setOutEnd((FlowEnd)newValue);
				return;
			case Aadl2Package.FLOW_SPECIFICATION__IN_END:
				setInEnd((FlowEnd)newValue);
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
			case Aadl2Package.FLOW_SPECIFICATION__IN_MODE:
				getInMode().clear();
				return;
			case Aadl2Package.FLOW_SPECIFICATION__IN_MODE_OR_TRANSITION:
				getInModeOrTransition().clear();
				return;
			case Aadl2Package.FLOW_SPECIFICATION__REFINED:
				setRefined((FlowSpecification)null);
				return;
			case Aadl2Package.FLOW_SPECIFICATION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case Aadl2Package.FLOW_SPECIFICATION__OUT_END:
				setOutEnd((FlowEnd)null);
				return;
			case Aadl2Package.FLOW_SPECIFICATION__IN_END:
				setInEnd((FlowEnd)null);
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
			case Aadl2Package.FLOW_SPECIFICATION__IN_MODE:
				return inMode != null && !inMode.isEmpty();
			case Aadl2Package.FLOW_SPECIFICATION__IN_MODE_OR_TRANSITION:
				return inModeOrTransition != null && !inModeOrTransition.isEmpty();
			case Aadl2Package.FLOW_SPECIFICATION__REFINED:
				return refined != null;
			case Aadl2Package.FLOW_SPECIFICATION__KIND:
				return kind != KIND_EDEFAULT;
			case Aadl2Package.FLOW_SPECIFICATION__OUT_END:
				return outEnd != null;
			case Aadl2Package.FLOW_SPECIFICATION__IN_END:
				return inEnd != null;
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
				case Aadl2Package.FLOW_SPECIFICATION__IN_MODE: return Aadl2Package.MODAL_ELEMENT__IN_MODE;
				default: return -1;
			}
		}
		if (baseClass == ModalPath.class) {
			switch (derivedFeatureID) {
				case Aadl2Package.FLOW_SPECIFICATION__IN_MODE_OR_TRANSITION: return Aadl2Package.MODAL_PATH__IN_MODE_OR_TRANSITION;
				default: return -1;
			}
		}
		if (baseClass == EndToEndFlowElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FlowElement.class) {
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
				case Aadl2Package.MODAL_ELEMENT__IN_MODE: return Aadl2Package.FLOW_SPECIFICATION__IN_MODE;
				default: return -1;
			}
		}
		if (baseClass == ModalPath.class) {
			switch (baseFeatureID) {
				case Aadl2Package.MODAL_PATH__IN_MODE_OR_TRANSITION: return Aadl2Package.FLOW_SPECIFICATION__IN_MODE_OR_TRANSITION;
				default: return -1;
			}
		}
		if (baseClass == EndToEndFlowElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FlowElement.class) {
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
				case Aadl2Package.MODAL_ELEMENT___GET_ALL_IN_MODES: return Aadl2Package.FLOW_SPECIFICATION___GET_ALL_IN_MODES;
				default: return -1;
			}
		}
		if (baseClass == ModalPath.class) {
			switch (baseOperationID) {
				case Aadl2Package.MODAL_PATH___GET_IN_MODES: return Aadl2Package.FLOW_SPECIFICATION___GET_IN_MODES;
				case Aadl2Package.MODAL_PATH___GET_IN_MODE_TRANSITIONS: return Aadl2Package.FLOW_SPECIFICATION___GET_IN_MODE_TRANSITIONS;
				case Aadl2Package.MODAL_PATH___GET_ALL_IN_MODE_TRANSITIONS: return Aadl2Package.FLOW_SPECIFICATION___GET_ALL_IN_MODE_TRANSITIONS;
				default: return -1;
			}
		}
		if (baseClass == EndToEndFlowElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == FlowElement.class) {
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
			case Aadl2Package.FLOW_SPECIFICATION___GET_IN_MODES:
				return getInModes();
			case Aadl2Package.FLOW_SPECIFICATION___GET_IN_MODE_TRANSITIONS:
				return getInModeTransitions();
			case Aadl2Package.FLOW_SPECIFICATION___GET_ALL_IN_MODE_TRANSITIONS:
				return getAllInModeTransitions();
			case Aadl2Package.FLOW_SPECIFICATION___GET_ALL_IN_MODES:
				return getAllInModes();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //FlowSpecificationImpl
