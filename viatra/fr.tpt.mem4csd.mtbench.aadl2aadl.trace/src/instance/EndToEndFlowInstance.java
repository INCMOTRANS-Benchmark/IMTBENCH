/**
 */
package instance;

import aadl2.EndToEndFlow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End To End Flow Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instance.EndToEndFlowInstance#getFlowElement <em>Flow Element</em>}</li>
 *   <li>{@link instance.EndToEndFlowInstance#getInMode <em>In Mode</em>}</li>
 *   <li>{@link instance.EndToEndFlowInstance#getInSystemOperationMode <em>In System Operation Mode</em>}</li>
 *   <li>{@link instance.EndToEndFlowInstance#getEndToEndFlow <em>End To End Flow</em>}</li>
 * </ul>
 *
 * @see instance.InstancePackage#getEndToEndFlowInstance()
 * @model
 * @generated
 */
public interface EndToEndFlowInstance extends FlowElementInstance {
	/**
	 * Returns the value of the '<em><b>Flow Element</b></em>' reference list.
	 * The list contents are of type {@link instance.FlowElementInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Element</em>' reference list.
	 * @see instance.InstancePackage#getEndToEndFlowInstance_FlowElement()
	 * @model
	 * @generated
	 */
	EList<FlowElementInstance> getFlowElement();

	/**
	 * Returns the value of the '<em><b>In Mode</b></em>' reference list.
	 * The list contents are of type {@link instance.ModeInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Mode</em>' reference list.
	 * @see instance.InstancePackage#getEndToEndFlowInstance_InMode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ModeInstance> getInMode();

	/**
	 * Returns the value of the '<em><b>In System Operation Mode</b></em>' reference list.
	 * The list contents are of type {@link instance.SystemOperationMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In System Operation Mode</em>' reference list.
	 * @see instance.InstancePackage#getEndToEndFlowInstance_InSystemOperationMode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SystemOperationMode> getInSystemOperationMode();

	/**
	 * Returns the value of the '<em><b>End To End Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End To End Flow</em>' reference.
	 * @see #setEndToEndFlow(EndToEndFlow)
	 * @see instance.InstancePackage#getEndToEndFlowInstance_EndToEndFlow()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EndToEndFlow getEndToEndFlow();

	/**
	 * Sets the value of the '{@link instance.EndToEndFlowInstance#getEndToEndFlow <em>End To End Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End To End Flow</em>' reference.
	 * @see #getEndToEndFlow()
	 * @generated
	 */
	void setEndToEndFlow(EndToEndFlow value);

} // EndToEndFlowInstance
