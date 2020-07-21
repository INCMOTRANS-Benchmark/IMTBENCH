/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.Context;
import aadl2.EndToEndFlowElement;
import aadl2.EndToEndFlowSegment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End To End Flow Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.EndToEndFlowSegmentImpl#getFlowElement <em>Flow Element</em>}</li>
 *   <li>{@link aadl2.impl.EndToEndFlowSegmentImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndToEndFlowSegmentImpl extends ElementImpl implements EndToEndFlowSegment {
	/**
	 * The cached value of the '{@link #getFlowElement() <em>Flow Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowElement()
	 * @generated
	 * @ordered
	 */
	protected EndToEndFlowElement flowElement;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Context context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndToEndFlowSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getEndToEndFlowSegment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndToEndFlowElement getFlowElement() {
		if (flowElement != null && flowElement.eIsProxy()) {
			InternalEObject oldFlowElement = (InternalEObject)flowElement;
			flowElement = (EndToEndFlowElement)eResolveProxy(oldFlowElement);
			if (flowElement != oldFlowElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.END_TO_END_FLOW_SEGMENT__FLOW_ELEMENT, oldFlowElement, flowElement));
			}
		}
		return flowElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndToEndFlowElement basicGetFlowElement() {
		return flowElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlowElement(EndToEndFlowElement newFlowElement) {
		EndToEndFlowElement oldFlowElement = flowElement;
		flowElement = newFlowElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.END_TO_END_FLOW_SEGMENT__FLOW_ELEMENT, oldFlowElement, flowElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (Context)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.END_TO_END_FLOW_SEGMENT__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(Context newContext) {
		Context oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.END_TO_END_FLOW_SEGMENT__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.END_TO_END_FLOW_SEGMENT__FLOW_ELEMENT:
				if (resolve) return getFlowElement();
				return basicGetFlowElement();
			case Aadl2Package.END_TO_END_FLOW_SEGMENT__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Aadl2Package.END_TO_END_FLOW_SEGMENT__FLOW_ELEMENT:
				setFlowElement((EndToEndFlowElement)newValue);
				return;
			case Aadl2Package.END_TO_END_FLOW_SEGMENT__CONTEXT:
				setContext((Context)newValue);
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
			case Aadl2Package.END_TO_END_FLOW_SEGMENT__FLOW_ELEMENT:
				setFlowElement((EndToEndFlowElement)null);
				return;
			case Aadl2Package.END_TO_END_FLOW_SEGMENT__CONTEXT:
				setContext((Context)null);
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
			case Aadl2Package.END_TO_END_FLOW_SEGMENT__FLOW_ELEMENT:
				return flowElement != null;
			case Aadl2Package.END_TO_END_FLOW_SEGMENT__CONTEXT:
				return context != null;
		}
		return super.eIsSet(featureID);
	}

} //EndToEndFlowSegmentImpl
