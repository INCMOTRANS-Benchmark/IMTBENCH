/**
 */
package instance.impl;

import aadl2.Mode;

import instance.InstancePackage;
import instance.ModeInstance;
import instance.ModeTransitionInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link instance.impl.ModeInstanceImpl#getSrcModeTransition <em>Src Mode Transition</em>}</li>
 *   <li>{@link instance.impl.ModeInstanceImpl#getDstModeTransition <em>Dst Mode Transition</em>}</li>
 *   <li>{@link instance.impl.ModeInstanceImpl#isInitial <em>Initial</em>}</li>
 *   <li>{@link instance.impl.ModeInstanceImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link instance.impl.ModeInstanceImpl#isDerived <em>Derived</em>}</li>
 *   <li>{@link instance.impl.ModeInstanceImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModeInstanceImpl extends InstanceObjectImpl implements ModeInstance {
	/**
	 * The cached value of the '{@link #getSrcModeTransition() <em>Src Mode Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcModeTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeTransitionInstance> srcModeTransition;

	/**
	 * The cached value of the '{@link #getDstModeTransition() <em>Dst Mode Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDstModeTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeTransitionInstance> dstModeTransition;

	/**
	 * The default value of the '{@link #isInitial() <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitial() <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitial()
	 * @generated
	 * @ordered
	 */
	protected boolean initial = INITIAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected Mode mode;

	/**
	 * The default value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean derived = DERIVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeInstance> parent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.MODE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModeTransitionInstance> getSrcModeTransition() {
		if (srcModeTransition == null) {
			srcModeTransition = new EObjectWithInverseEList<ModeTransitionInstance>(ModeTransitionInstance.class, this, InstancePackage.MODE_INSTANCE__SRC_MODE_TRANSITION, InstancePackage.MODE_TRANSITION_INSTANCE__SOURCE);
		}
		return srcModeTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModeTransitionInstance> getDstModeTransition() {
		if (dstModeTransition == null) {
			dstModeTransition = new EObjectWithInverseEList<ModeTransitionInstance>(ModeTransitionInstance.class, this, InstancePackage.MODE_INSTANCE__DST_MODE_TRANSITION, InstancePackage.MODE_TRANSITION_INSTANCE__DESTINATION);
		}
		return dstModeTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitial(boolean newInitial) {
		boolean oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.MODE_INSTANCE__INITIAL, oldInitial, initial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mode getMode() {
		if (mode != null && mode.eIsProxy()) {
			InternalEObject oldMode = (InternalEObject)mode;
			mode = (Mode)eResolveProxy(oldMode);
			if (mode != oldMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.MODE_INSTANCE__MODE, oldMode, mode));
			}
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode basicGetMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMode(Mode newMode) {
		Mode oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.MODE_INSTANCE__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDerived() {
		return derived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDerived(boolean newDerived) {
		boolean oldDerived = derived;
		derived = newDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.MODE_INSTANCE__DERIVED, oldDerived, derived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModeInstance> getParent() {
		if (parent == null) {
			parent = new EObjectResolvingEList<ModeInstance>(ModeInstance.class, this, InstancePackage.MODE_INSTANCE__PARENT);
		}
		return parent;
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
			case InstancePackage.MODE_INSTANCE__SRC_MODE_TRANSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSrcModeTransition()).basicAdd(otherEnd, msgs);
			case InstancePackage.MODE_INSTANCE__DST_MODE_TRANSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDstModeTransition()).basicAdd(otherEnd, msgs);
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
			case InstancePackage.MODE_INSTANCE__SRC_MODE_TRANSITION:
				return ((InternalEList<?>)getSrcModeTransition()).basicRemove(otherEnd, msgs);
			case InstancePackage.MODE_INSTANCE__DST_MODE_TRANSITION:
				return ((InternalEList<?>)getDstModeTransition()).basicRemove(otherEnd, msgs);
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
			case InstancePackage.MODE_INSTANCE__SRC_MODE_TRANSITION:
				return getSrcModeTransition();
			case InstancePackage.MODE_INSTANCE__DST_MODE_TRANSITION:
				return getDstModeTransition();
			case InstancePackage.MODE_INSTANCE__INITIAL:
				return isInitial();
			case InstancePackage.MODE_INSTANCE__MODE:
				if (resolve) return getMode();
				return basicGetMode();
			case InstancePackage.MODE_INSTANCE__DERIVED:
				return isDerived();
			case InstancePackage.MODE_INSTANCE__PARENT:
				return getParent();
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
			case InstancePackage.MODE_INSTANCE__SRC_MODE_TRANSITION:
				getSrcModeTransition().clear();
				getSrcModeTransition().addAll((Collection<? extends ModeTransitionInstance>)newValue);
				return;
			case InstancePackage.MODE_INSTANCE__DST_MODE_TRANSITION:
				getDstModeTransition().clear();
				getDstModeTransition().addAll((Collection<? extends ModeTransitionInstance>)newValue);
				return;
			case InstancePackage.MODE_INSTANCE__INITIAL:
				setInitial((Boolean)newValue);
				return;
			case InstancePackage.MODE_INSTANCE__MODE:
				setMode((Mode)newValue);
				return;
			case InstancePackage.MODE_INSTANCE__DERIVED:
				setDerived((Boolean)newValue);
				return;
			case InstancePackage.MODE_INSTANCE__PARENT:
				getParent().clear();
				getParent().addAll((Collection<? extends ModeInstance>)newValue);
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
			case InstancePackage.MODE_INSTANCE__SRC_MODE_TRANSITION:
				getSrcModeTransition().clear();
				return;
			case InstancePackage.MODE_INSTANCE__DST_MODE_TRANSITION:
				getDstModeTransition().clear();
				return;
			case InstancePackage.MODE_INSTANCE__INITIAL:
				setInitial(INITIAL_EDEFAULT);
				return;
			case InstancePackage.MODE_INSTANCE__MODE:
				setMode((Mode)null);
				return;
			case InstancePackage.MODE_INSTANCE__DERIVED:
				setDerived(DERIVED_EDEFAULT);
				return;
			case InstancePackage.MODE_INSTANCE__PARENT:
				getParent().clear();
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
			case InstancePackage.MODE_INSTANCE__SRC_MODE_TRANSITION:
				return srcModeTransition != null && !srcModeTransition.isEmpty();
			case InstancePackage.MODE_INSTANCE__DST_MODE_TRANSITION:
				return dstModeTransition != null && !dstModeTransition.isEmpty();
			case InstancePackage.MODE_INSTANCE__INITIAL:
				return initial != INITIAL_EDEFAULT;
			case InstancePackage.MODE_INSTANCE__MODE:
				return mode != null;
			case InstancePackage.MODE_INSTANCE__DERIVED:
				return derived != DERIVED_EDEFAULT;
			case InstancePackage.MODE_INSTANCE__PARENT:
				return parent != null && !parent.isEmpty();
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
		result.append(" (initial: ");
		result.append(initial);
		result.append(", derived: ");
		result.append(derived);
		result.append(')');
		return result.toString();
	}

} //ModeInstanceImpl
