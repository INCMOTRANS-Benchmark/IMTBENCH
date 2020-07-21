/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Implementation</b></em>'.
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
 *   <li>{@link aadl2.FlowImplementation#getKind <em>Kind</em>}</li>
 *   <li>{@link aadl2.FlowImplementation#getSpecification <em>Specification</em>}</li>
 *   <li>{@link aadl2.FlowImplementation#getOwnedFlowSegment <em>Owned Flow Segment</em>}</li>
 *   <li>{@link aadl2.FlowImplementation#getInEnd <em>In End</em>}</li>
 *   <li>{@link aadl2.FlowImplementation#getOutEnd <em>Out End</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getFlowImplementation()
 * @model
 * @generated
 */
public interface FlowImplementation extends ModalPath, ClassifierFeature, Flow {
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
	 * @see aadl2.Aadl2Package#getFlowImplementation_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FlowKind getKind();

	/**
	 * Sets the value of the '{@link aadl2.FlowImplementation#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see aadl2.FlowKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(FlowKind value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Flows.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specification</em>' reference.
	 * @see #setSpecification(FlowSpecification)
	 * @see aadl2.Aadl2Package#getFlowImplementation_Specification()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FlowSpecification getSpecification();

	/**
	 * Sets the value of the '{@link aadl2.FlowImplementation#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(FlowSpecification value);

	/**
	 * Returns the value of the '<em><b>Owned Flow Segment</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.FlowSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Flows.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Flow Segment</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getFlowImplementation_OwnedFlowSegment()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowSegment> getOwnedFlowSegment();

	/**
	 * Returns the value of the '<em><b>In End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Flows.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In End</em>' containment reference.
	 * @see #setInEnd(FlowEnd)
	 * @see aadl2.Aadl2Package#getFlowImplementation_InEnd()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	FlowEnd getInEnd();

	/**
	 * Sets the value of the '{@link aadl2.FlowImplementation#getInEnd <em>In End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In End</em>' containment reference.
	 * @see #getInEnd()
	 * @generated
	 */
	void setInEnd(FlowEnd value);

	/**
	 * Returns the value of the '<em><b>Out End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Flows.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Out End</em>' containment reference.
	 * @see #setOutEnd(FlowEnd)
	 * @see aadl2.Aadl2Package#getFlowImplementation_OutEnd()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	FlowEnd getOutEnd();

	/**
	 * Sets the value of the '{@link aadl2.FlowImplementation#getOutEnd <em>Out End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out End</em>' containment reference.
	 * @see #getOutEnd()
	 * @generated
	 */
	void setOutEnd(FlowEnd value);

} // FlowImplementation
