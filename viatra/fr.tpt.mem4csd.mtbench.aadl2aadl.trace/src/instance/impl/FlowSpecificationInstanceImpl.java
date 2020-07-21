/**
 */
package instance.impl;

import aadl2.FlowSpecification;

import instance.FeatureInstance;
import instance.FlowSpecificationInstance;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Specification Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link instance.impl.FlowSpecificationInstanceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link instance.impl.FlowSpecificationInstanceImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link instance.impl.FlowSpecificationInstanceImpl#getFlowSpecification <em>Flow Specification</em>}</li>
 *   <li>{@link instance.impl.FlowSpecificationInstanceImpl#getInMode <em>In Mode</em>}</li>
 *   <li>{@link instance.impl.FlowSpecificationInstanceImpl#getInModeTransition <em>In Mode Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowSpecificationInstanceImpl extends FlowElementInstanceImpl implements FlowSpecificationInstance {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected FeatureInstance source;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected FeatureInstance destination;

	/**
	 * The cached value of the '{@link #getFlowSpecification() <em>Flow Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowSpecification()
	 * @generated
	 * @ordered
	 */
	protected FlowSpecification flowSpecification;

	/**
	 * The cached value of the '{@link #getInMode() <em>In Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInMode()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeInstance> inMode;

	/**
	 * The cached value of the '{@link #getInModeTransition() <em>In Mode Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInModeTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeTransitionInstance> inModeTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowSpecificationInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.FLOW_SPECIFICATION_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureInstance getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(FeatureInstance newSource, NotificationChain msgs) {
		FeatureInstance oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.FLOW_SPECIFICATION_INSTANCE__SOURCE, oldSource, newSource);
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
	public void setSource(FeatureInstance newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, InstancePackage.FEATURE_INSTANCE__SRC_FLOW_SPEC, FeatureInstance.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, InstancePackage.FEATURE_INSTANCE__SRC_FLOW_SPEC, FeatureInstance.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.FLOW_SPECIFICATION_INSTANCE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureInstance getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(FeatureInstance newDestination, NotificationChain msgs) {
		FeatureInstance oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.FLOW_SPECIFICATION_INSTANCE__DESTINATION, oldDestination, newDestination);
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
	public void setDestination(FeatureInstance newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, InstancePackage.FEATURE_INSTANCE__DST_FLOW_SPEC, FeatureInstance.class, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, InstancePackage.FEATURE_INSTANCE__DST_FLOW_SPEC, FeatureInstance.class, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.FLOW_SPECIFICATION_INSTANCE__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowSpecification getFlowSpecification() {
		if (flowSpecification != null && flowSpecification.eIsProxy()) {
			InternalEObject oldFlowSpecification = (InternalEObject)flowSpecification;
			flowSpecification = (FlowSpecification)eResolveProxy(oldFlowSpecification);
			if (flowSpecification != oldFlowSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.FLOW_SPECIFICATION_INSTANCE__FLOW_SPECIFICATION, oldFlowSpecification, flowSpecification));
			}
		}
		return flowSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowSpecification basicGetFlowSpecification() {
		return flowSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlowSpecification(FlowSpecification newFlowSpecification) {
		FlowSpecification oldFlowSpecification = flowSpecification;
		flowSpecification = newFlowSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.FLOW_SPECIFICATION_INSTANCE__FLOW_SPECIFICATION, oldFlowSpecification, flowSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModeInstance> getInMode() {
		if (inMode == null) {
			inMode = new EObjectResolvingEList<ModeInstance>(ModeInstance.class, this, InstancePackage.FLOW_SPECIFICATION_INSTANCE__IN_MODE);
		}
		return inMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModeTransitionInstance> getInModeTransition() {
		if (inModeTransition == null) {
			inModeTransition = new EObjectResolvingEList<ModeTransitionInstance>(ModeTransitionInstance.class, this, InstancePackage.FLOW_SPECIFICATION_INSTANCE__IN_MODE_TRANSITION);
		}
		return inModeTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, InstancePackage.FEATURE_INSTANCE__SRC_FLOW_SPEC, FeatureInstance.class, msgs);
				return basicSetSource((FeatureInstance)otherEnd, msgs);
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__DESTINATION:
				if (destination != null)
					msgs = ((InternalEObject)destination).eInverseRemove(this, InstancePackage.FEATURE_INSTANCE__DST_FLOW_SPEC, FeatureInstance.class, msgs);
				return basicSetDestination((FeatureInstance)otherEnd, msgs);
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
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__SOURCE:
				return basicSetSource(null, msgs);
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__DESTINATION:
				return basicSetDestination(null, msgs);
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
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__SOURCE:
				return getSource();
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__DESTINATION:
				return getDestination();
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__FLOW_SPECIFICATION:
				if (resolve) return getFlowSpecification();
				return basicGetFlowSpecification();
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__IN_MODE:
				return getInMode();
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__IN_MODE_TRANSITION:
				return getInModeTransition();
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
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__SOURCE:
				setSource((FeatureInstance)newValue);
				return;
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__DESTINATION:
				setDestination((FeatureInstance)newValue);
				return;
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__FLOW_SPECIFICATION:
				setFlowSpecification((FlowSpecification)newValue);
				return;
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__IN_MODE:
				getInMode().clear();
				getInMode().addAll((Collection<? extends ModeInstance>)newValue);
				return;
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__IN_MODE_TRANSITION:
				getInModeTransition().clear();
				getInModeTransition().addAll((Collection<? extends ModeTransitionInstance>)newValue);
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
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__SOURCE:
				setSource((FeatureInstance)null);
				return;
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__DESTINATION:
				setDestination((FeatureInstance)null);
				return;
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__FLOW_SPECIFICATION:
				setFlowSpecification((FlowSpecification)null);
				return;
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__IN_MODE:
				getInMode().clear();
				return;
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__IN_MODE_TRANSITION:
				getInModeTransition().clear();
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
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__SOURCE:
				return source != null;
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__DESTINATION:
				return destination != null;
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__FLOW_SPECIFICATION:
				return flowSpecification != null;
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__IN_MODE:
				return inMode != null && !inMode.isEmpty();
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE__IN_MODE_TRANSITION:
				return inModeTransition != null && !inModeTransition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlowSpecificationInstanceImpl
