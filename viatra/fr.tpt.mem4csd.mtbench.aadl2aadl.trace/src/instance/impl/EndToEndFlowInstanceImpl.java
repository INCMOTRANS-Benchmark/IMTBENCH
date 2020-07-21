/**
 */
package instance.impl;

import aadl2.EndToEndFlow;

import instance.EndToEndFlowInstance;
import instance.FlowElementInstance;
import instance.InstancePackage;
import instance.ModeInstance;
import instance.SystemOperationMode;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End To End Flow Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link instance.impl.EndToEndFlowInstanceImpl#getFlowElement <em>Flow Element</em>}</li>
 *   <li>{@link instance.impl.EndToEndFlowInstanceImpl#getInMode <em>In Mode</em>}</li>
 *   <li>{@link instance.impl.EndToEndFlowInstanceImpl#getInSystemOperationMode <em>In System Operation Mode</em>}</li>
 *   <li>{@link instance.impl.EndToEndFlowInstanceImpl#getEndToEndFlow <em>End To End Flow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndToEndFlowInstanceImpl extends FlowElementInstanceImpl implements EndToEndFlowInstance {
	/**
	 * The cached value of the '{@link #getFlowElement() <em>Flow Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowElement()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowElementInstance> flowElement;

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
	 * The cached value of the '{@link #getInSystemOperationMode() <em>In System Operation Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInSystemOperationMode()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemOperationMode> inSystemOperationMode;

	/**
	 * The cached value of the '{@link #getEndToEndFlow() <em>End To End Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndToEndFlow()
	 * @generated
	 * @ordered
	 */
	protected EndToEndFlow endToEndFlow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndToEndFlowInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.END_TO_END_FLOW_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlowElementInstance> getFlowElement() {
		if (flowElement == null) {
			flowElement = new EObjectResolvingEList<FlowElementInstance>(FlowElementInstance.class, this, InstancePackage.END_TO_END_FLOW_INSTANCE__FLOW_ELEMENT);
		}
		return flowElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModeInstance> getInMode() {
		if (inMode == null) {
			inMode = new EObjectResolvingEList<ModeInstance>(ModeInstance.class, this, InstancePackage.END_TO_END_FLOW_INSTANCE__IN_MODE);
		}
		return inMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemOperationMode> getInSystemOperationMode() {
		if (inSystemOperationMode == null) {
			inSystemOperationMode = new EObjectResolvingEList<SystemOperationMode>(SystemOperationMode.class, this, InstancePackage.END_TO_END_FLOW_INSTANCE__IN_SYSTEM_OPERATION_MODE);
		}
		return inSystemOperationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndToEndFlow getEndToEndFlow() {
		if (endToEndFlow != null && endToEndFlow.eIsProxy()) {
			InternalEObject oldEndToEndFlow = (InternalEObject)endToEndFlow;
			endToEndFlow = (EndToEndFlow)eResolveProxy(oldEndToEndFlow);
			if (endToEndFlow != oldEndToEndFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.END_TO_END_FLOW_INSTANCE__END_TO_END_FLOW, oldEndToEndFlow, endToEndFlow));
			}
		}
		return endToEndFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndToEndFlow basicGetEndToEndFlow() {
		return endToEndFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndToEndFlow(EndToEndFlow newEndToEndFlow) {
		EndToEndFlow oldEndToEndFlow = endToEndFlow;
		endToEndFlow = newEndToEndFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.END_TO_END_FLOW_INSTANCE__END_TO_END_FLOW, oldEndToEndFlow, endToEndFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.END_TO_END_FLOW_INSTANCE__FLOW_ELEMENT:
				return getFlowElement();
			case InstancePackage.END_TO_END_FLOW_INSTANCE__IN_MODE:
				return getInMode();
			case InstancePackage.END_TO_END_FLOW_INSTANCE__IN_SYSTEM_OPERATION_MODE:
				return getInSystemOperationMode();
			case InstancePackage.END_TO_END_FLOW_INSTANCE__END_TO_END_FLOW:
				if (resolve) return getEndToEndFlow();
				return basicGetEndToEndFlow();
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
			case InstancePackage.END_TO_END_FLOW_INSTANCE__FLOW_ELEMENT:
				getFlowElement().clear();
				getFlowElement().addAll((Collection<? extends FlowElementInstance>)newValue);
				return;
			case InstancePackage.END_TO_END_FLOW_INSTANCE__IN_MODE:
				getInMode().clear();
				getInMode().addAll((Collection<? extends ModeInstance>)newValue);
				return;
			case InstancePackage.END_TO_END_FLOW_INSTANCE__IN_SYSTEM_OPERATION_MODE:
				getInSystemOperationMode().clear();
				getInSystemOperationMode().addAll((Collection<? extends SystemOperationMode>)newValue);
				return;
			case InstancePackage.END_TO_END_FLOW_INSTANCE__END_TO_END_FLOW:
				setEndToEndFlow((EndToEndFlow)newValue);
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
			case InstancePackage.END_TO_END_FLOW_INSTANCE__FLOW_ELEMENT:
				getFlowElement().clear();
				return;
			case InstancePackage.END_TO_END_FLOW_INSTANCE__IN_MODE:
				getInMode().clear();
				return;
			case InstancePackage.END_TO_END_FLOW_INSTANCE__IN_SYSTEM_OPERATION_MODE:
				getInSystemOperationMode().clear();
				return;
			case InstancePackage.END_TO_END_FLOW_INSTANCE__END_TO_END_FLOW:
				setEndToEndFlow((EndToEndFlow)null);
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
			case InstancePackage.END_TO_END_FLOW_INSTANCE__FLOW_ELEMENT:
				return flowElement != null && !flowElement.isEmpty();
			case InstancePackage.END_TO_END_FLOW_INSTANCE__IN_MODE:
				return inMode != null && !inMode.isEmpty();
			case InstancePackage.END_TO_END_FLOW_INSTANCE__IN_SYSTEM_OPERATION_MODE:
				return inSystemOperationMode != null && !inSystemOperationMode.isEmpty();
			case InstancePackage.END_TO_END_FLOW_INSTANCE__END_TO_END_FLOW:
				return endToEndFlow != null;
		}
		return super.eIsSet(featureID);
	}

} //EndToEndFlowInstanceImpl
