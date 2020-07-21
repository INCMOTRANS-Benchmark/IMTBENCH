/**
 */
package fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl;

import fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTrace;
import fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTraceSpec;
import fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2aadlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.instance.SystemInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aadl2 Aadl Trace Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl.Aadl2AadlTraceSpecImpl#getLeftSystem <em>Left System</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl.Aadl2AadlTraceSpecImpl#getRightSystem <em>Right System</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl.Aadl2AadlTraceSpecImpl#getTraces <em>Traces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Aadl2AadlTraceSpecImpl extends MinimalEObjectImpl.Container implements Aadl2AadlTraceSpec {
	/**
	 * The cached value of the '{@link #getLeftSystem() <em>Left System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftSystem()
	 * @generated
	 * @ordered
	 */
	protected SystemInstance leftSystem;

	/**
	 * The cached value of the '{@link #getRightSystem() <em>Right System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightSystem()
	 * @generated
	 * @ordered
	 */
	protected SystemInstance rightSystem;

	/**
	 * The cached value of the '{@link #getTraces() <em>Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<Aadl2AadlTrace> traces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Aadl2AadlTraceSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2aadlPackage.Literals.AADL2_AADL_TRACE_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemInstance getLeftSystem() {
		if (leftSystem != null && leftSystem.eIsProxy()) {
			InternalEObject oldLeftSystem = (InternalEObject)leftSystem;
			leftSystem = (SystemInstance)eResolveProxy(oldLeftSystem);
			if (leftSystem != oldLeftSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2aadlPackage.AADL2_AADL_TRACE_SPEC__LEFT_SYSTEM, oldLeftSystem, leftSystem));
			}
		}
		return leftSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemInstance basicGetLeftSystem() {
		return leftSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeftSystem(SystemInstance newLeftSystem) {
		SystemInstance oldLeftSystem = leftSystem;
		leftSystem = newLeftSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2aadlPackage.AADL2_AADL_TRACE_SPEC__LEFT_SYSTEM, oldLeftSystem, leftSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemInstance getRightSystem() {
		if (rightSystem != null && rightSystem.eIsProxy()) {
			InternalEObject oldRightSystem = (InternalEObject)rightSystem;
			rightSystem = (SystemInstance)eResolveProxy(oldRightSystem);
			if (rightSystem != oldRightSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2aadlPackage.AADL2_AADL_TRACE_SPEC__RIGHT_SYSTEM, oldRightSystem, rightSystem));
			}
		}
		return rightSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemInstance basicGetRightSystem() {
		return rightSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRightSystem(SystemInstance newRightSystem) {
		SystemInstance oldRightSystem = rightSystem;
		rightSystem = newRightSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2aadlPackage.AADL2_AADL_TRACE_SPEC__RIGHT_SYSTEM, oldRightSystem, rightSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Aadl2AadlTrace> getTraces() {
		if (traces == null) {
			traces = new EObjectContainmentEList<Aadl2AadlTrace>(Aadl2AadlTrace.class, this, Aadl2aadlPackage.AADL2_AADL_TRACE_SPEC__TRACES);
		}
		return traces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2aadlPackage.AADL2_AADL_TRACE_SPEC__TRACES:
				return ((InternalEList<?>)getTraces()).basicRemove(otherEnd, msgs);
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
			case Aadl2aadlPackage.AADL2_AADL_TRACE_SPEC__LEFT_SYSTEM:
				if (resolve) return getLeftSystem();
				return basicGetLeftSystem();
			case Aadl2aadlPackage.AADL2_AADL_TRACE_SPEC__RIGHT_SYSTEM:
				if (resolve) return getRightSystem();
				return basicGetRightSystem();
			case Aadl2aadlPackage.AADL2_AADL_TRACE_SPEC__TRACES:
				return getTraces();
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
			case Aadl2aadlPackage.AADL2_AADL_TRACE_SPEC__LEFT_SYSTEM:
				setLeftSystem((SystemInstance)newValue);
				return;
			case Aadl2aadlPackage.AADL2_AADL_TRACE_SPEC__RIGHT_SYSTEM:
				setRightSystem((SystemInstance)newValue);
				return;
			case Aadl2aadlPackage.AADL2_AADL_TRACE_SPEC__TRACES:
				getTraces().clear();
				getTraces().addAll((Collection<? extends Aadl2AadlTrace>)newValue);
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
			case Aadl2aadlPackage.AADL2_AADL_TRACE_SPEC__LEFT_SYSTEM:
				setLeftSystem((SystemInstance)null);
				return;
			case Aadl2aadlPackage.AADL2_AADL_TRACE_SPEC__RIGHT_SYSTEM:
				setRightSystem((SystemInstance)null);
				return;
			case Aadl2aadlPackage.AADL2_AADL_TRACE_SPEC__TRACES:
				getTraces().clear();
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
			case Aadl2aadlPackage.AADL2_AADL_TRACE_SPEC__LEFT_SYSTEM:
				return leftSystem != null;
			case Aadl2aadlPackage.AADL2_AADL_TRACE_SPEC__RIGHT_SYSTEM:
				return rightSystem != null;
			case Aadl2aadlPackage.AADL2_AADL_TRACE_SPEC__TRACES:
				return traces != null && !traces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Aadl2AadlTraceSpecImpl
