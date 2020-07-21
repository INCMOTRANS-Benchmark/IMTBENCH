/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End To End Flow</b></em>'.
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
 *   <li>{@link aadl2.EndToEndFlow#getRefined <em>Refined</em>}</li>
 *   <li>{@link aadl2.EndToEndFlow#getOwnedEndToEndFlowSegment <em>Owned End To End Flow Segment</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getEndToEndFlow()
 * @model
 * @generated
 */
public interface EndToEndFlow extends FlowFeature, ModalPath, EndToEndFlowElement {
	/**
	 * Returns the value of the '<em><b>Refined</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Flows.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refined</em>' reference.
	 * @see #setRefined(EndToEndFlow)
	 * @see aadl2.Aadl2Package#getEndToEndFlow_Refined()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EndToEndFlow getRefined();

	/**
	 * Sets the value of the '{@link aadl2.EndToEndFlow#getRefined <em>Refined</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined</em>' reference.
	 * @see #getRefined()
	 * @generated
	 */
	void setRefined(EndToEndFlow value);

	/**
	 * Returns the value of the '<em><b>Owned End To End Flow Segment</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.EndToEndFlowSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Flows.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned End To End Flow Segment</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getEndToEndFlow_OwnedEndToEndFlowSegment()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EndToEndFlowSegment> getOwnedEndToEndFlowSegment();

} // EndToEndFlow
