/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ComponentClassifier;
import aadl2.Mode;
import aadl2.ModeTransition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ComponentClassifierImpl#getOwnedMode <em>Owned Mode</em>}</li>
 *   <li>{@link aadl2.impl.ComponentClassifierImpl#getOwnedModeTransition <em>Owned Mode Transition</em>}</li>
 *   <li>{@link aadl2.impl.ComponentClassifierImpl#isDerivedModes <em>Derived Modes</em>}</li>
 *   <li>{@link aadl2.impl.ComponentClassifierImpl#isNoFlows <em>No Flows</em>}</li>
 *   <li>{@link aadl2.impl.ComponentClassifierImpl#isNoModes <em>No Modes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentClassifierImpl extends ClassifierImpl implements ComponentClassifier {
	/**
	 * The cached value of the '{@link #getOwnedMode() <em>Owned Mode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMode()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> ownedMode;

	/**
	 * The cached value of the '{@link #getOwnedModeTransition() <em>Owned Mode Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedModeTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeTransition> ownedModeTransition;

	/**
	 * The default value of the '{@link #isDerivedModes() <em>Derived Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerivedModes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DERIVED_MODES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDerivedModes() <em>Derived Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerivedModes()
	 * @generated
	 * @ordered
	 */
	protected boolean derivedModes = DERIVED_MODES_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoFlows() <em>No Flows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoFlows()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_FLOWS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoFlows() <em>No Flows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoFlows()
	 * @generated
	 * @ordered
	 */
	protected boolean noFlows = NO_FLOWS_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoModes() <em>No Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoModes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_MODES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoModes() <em>No Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoModes()
	 * @generated
	 * @ordered
	 */
	protected boolean noModes = NO_MODES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getComponentClassifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mode> getOwnedMode() {
		if (ownedMode == null) {
			ownedMode = new EObjectContainmentEList<Mode>(Mode.class, this, Aadl2Package.COMPONENT_CLASSIFIER__OWNED_MODE);
		}
		return ownedMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModeTransition> getOwnedModeTransition() {
		if (ownedModeTransition == null) {
			ownedModeTransition = new EObjectContainmentEList<ModeTransition>(ModeTransition.class, this, Aadl2Package.COMPONENT_CLASSIFIER__OWNED_MODE_TRANSITION);
		}
		return ownedModeTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDerivedModes() {
		return derivedModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDerivedModes(boolean newDerivedModes) {
		boolean oldDerivedModes = derivedModes;
		derivedModes = newDerivedModes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.COMPONENT_CLASSIFIER__DERIVED_MODES, oldDerivedModes, derivedModes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNoFlows() {
		return noFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoFlows(boolean newNoFlows) {
		boolean oldNoFlows = noFlows;
		noFlows = newNoFlows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.COMPONENT_CLASSIFIER__NO_FLOWS, oldNoFlows, noFlows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNoModes() {
		return noModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoModes(boolean newNoModes) {
		boolean oldNoModes = noModes;
		noModes = newNoModes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.COMPONENT_CLASSIFIER__NO_MODES, oldNoModes, noModes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.COMPONENT_CLASSIFIER__OWNED_MODE:
				return ((InternalEList<?>)getOwnedMode()).basicRemove(otherEnd, msgs);
			case Aadl2Package.COMPONENT_CLASSIFIER__OWNED_MODE_TRANSITION:
				return ((InternalEList<?>)getOwnedModeTransition()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.COMPONENT_CLASSIFIER__OWNED_MODE:
				return getOwnedMode();
			case Aadl2Package.COMPONENT_CLASSIFIER__OWNED_MODE_TRANSITION:
				return getOwnedModeTransition();
			case Aadl2Package.COMPONENT_CLASSIFIER__DERIVED_MODES:
				return isDerivedModes();
			case Aadl2Package.COMPONENT_CLASSIFIER__NO_FLOWS:
				return isNoFlows();
			case Aadl2Package.COMPONENT_CLASSIFIER__NO_MODES:
				return isNoModes();
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
			case Aadl2Package.COMPONENT_CLASSIFIER__OWNED_MODE:
				getOwnedMode().clear();
				getOwnedMode().addAll((Collection<? extends Mode>)newValue);
				return;
			case Aadl2Package.COMPONENT_CLASSIFIER__OWNED_MODE_TRANSITION:
				getOwnedModeTransition().clear();
				getOwnedModeTransition().addAll((Collection<? extends ModeTransition>)newValue);
				return;
			case Aadl2Package.COMPONENT_CLASSIFIER__DERIVED_MODES:
				setDerivedModes((Boolean)newValue);
				return;
			case Aadl2Package.COMPONENT_CLASSIFIER__NO_FLOWS:
				setNoFlows((Boolean)newValue);
				return;
			case Aadl2Package.COMPONENT_CLASSIFIER__NO_MODES:
				setNoModes((Boolean)newValue);
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
			case Aadl2Package.COMPONENT_CLASSIFIER__OWNED_MODE:
				getOwnedMode().clear();
				return;
			case Aadl2Package.COMPONENT_CLASSIFIER__OWNED_MODE_TRANSITION:
				getOwnedModeTransition().clear();
				return;
			case Aadl2Package.COMPONENT_CLASSIFIER__DERIVED_MODES:
				setDerivedModes(DERIVED_MODES_EDEFAULT);
				return;
			case Aadl2Package.COMPONENT_CLASSIFIER__NO_FLOWS:
				setNoFlows(NO_FLOWS_EDEFAULT);
				return;
			case Aadl2Package.COMPONENT_CLASSIFIER__NO_MODES:
				setNoModes(NO_MODES_EDEFAULT);
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
			case Aadl2Package.COMPONENT_CLASSIFIER__OWNED_MODE:
				return ownedMode != null && !ownedMode.isEmpty();
			case Aadl2Package.COMPONENT_CLASSIFIER__OWNED_MODE_TRANSITION:
				return ownedModeTransition != null && !ownedModeTransition.isEmpty();
			case Aadl2Package.COMPONENT_CLASSIFIER__DERIVED_MODES:
				return derivedModes != DERIVED_MODES_EDEFAULT;
			case Aadl2Package.COMPONENT_CLASSIFIER__NO_FLOWS:
				return noFlows != NO_FLOWS_EDEFAULT;
			case Aadl2Package.COMPONENT_CLASSIFIER__NO_MODES:
				return noModes != NO_MODES_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (derivedModes: ");
		result.append(derivedModes);
		result.append(", noFlows: ");
		result.append(noFlows);
		result.append(", noModes: ");
		result.append(noModes);
		result.append(')');
		return result.toString();
	}

} //ComponentClassifierImpl
