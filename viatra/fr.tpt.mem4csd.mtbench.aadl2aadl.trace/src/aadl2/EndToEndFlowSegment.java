/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End To End Flow Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Flows.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.EndToEndFlowSegment#getFlowElement <em>Flow Element</em>}</li>
 *   <li>{@link aadl2.EndToEndFlowSegment#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getEndToEndFlowSegment()
 * @model
 * @generated
 */
public interface EndToEndFlowSegment extends Element {
	/**
	 * Returns the value of the '<em><b>Flow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Flows.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flow Element</em>' reference.
	 * @see #setFlowElement(EndToEndFlowElement)
	 * @see aadl2.Aadl2Package#getEndToEndFlowSegment_FlowElement()
	 * @model required="true"
	 * @generated
	 */
	EndToEndFlowElement getFlowElement();

	/**
	 * Sets the value of the '{@link aadl2.EndToEndFlowSegment#getFlowElement <em>Flow Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Element</em>' reference.
	 * @see #getFlowElement()
	 * @generated
	 */
	void setFlowElement(EndToEndFlowElement value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Flows.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Context)
	 * @see aadl2.Aadl2Package#getEndToEndFlowSegment_Context()
	 * @model ordered="false"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link aadl2.EndToEndFlowSegment#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

} // EndToEndFlowSegment
