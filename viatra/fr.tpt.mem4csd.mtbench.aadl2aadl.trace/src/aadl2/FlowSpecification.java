/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Specification</b></em>'.
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
 *   <li>{@link aadl2.FlowSpecification#getRefined <em>Refined</em>}</li>
 *   <li>{@link aadl2.FlowSpecification#getKind <em>Kind</em>}</li>
 *   <li>{@link aadl2.FlowSpecification#getOutEnd <em>Out End</em>}</li>
 *   <li>{@link aadl2.FlowSpecification#getInEnd <em>In End</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getFlowSpecification()
 * @model
 * @generated
 */
public interface FlowSpecification extends FlowFeature, ModalPath, FlowElement {
	/**
	 * Returns the value of the '<em><b>Refined</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Flows.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refined</em>' reference.
	 * @see #setRefined(FlowSpecification)
	 * @see aadl2.Aadl2Package#getFlowSpecification_Refined()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	FlowSpecification getRefined();

	/**
	 * Sets the value of the '{@link aadl2.FlowSpecification#getRefined <em>Refined</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined</em>' reference.
	 * @see #getRefined()
	 * @generated
	 */
	void setRefined(FlowSpecification value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link aadl2.FlowKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Flows.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see aadl2.FlowKind
	 * @see #setKind(FlowKind)
	 * @see aadl2.Aadl2Package#getFlowSpecification_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FlowKind getKind();

	/**
	 * Sets the value of the '{@link aadl2.FlowSpecification#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see aadl2.FlowKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(FlowKind value);

	/**
	 * Returns the value of the '<em><b>Out End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Flows.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Out End</em>' containment reference.
	 * @see #setOutEnd(FlowEnd)
	 * @see aadl2.Aadl2Package#getFlowSpecification_OutEnd()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	FlowEnd getOutEnd();

	/**
	 * Sets the value of the '{@link aadl2.FlowSpecification#getOutEnd <em>Out End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out End</em>' containment reference.
	 * @see #getOutEnd()
	 * @generated
	 */
	void setOutEnd(FlowEnd value);

	/**
	 * Returns the value of the '<em><b>In End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Flows.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In End</em>' containment reference.
	 * @see #setInEnd(FlowEnd)
	 * @see aadl2.Aadl2Package#getFlowSpecification_InEnd()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	FlowEnd getInEnd();

	/**
	 * Sets the value of the '{@link aadl2.FlowSpecification#getInEnd <em>In End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In End</em>' containment reference.
	 * @see #getInEnd()
	 * @generated
	 */
	void setInEnd(FlowEnd value);

} // FlowSpecification
