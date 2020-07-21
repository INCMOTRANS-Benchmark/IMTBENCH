/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refinable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLInfrastructure.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.RefinableElement#getRefinementContext <em>Refinement Context</em>}</li>
 *   <li>{@link aadl2.RefinableElement#getRefinedElement <em>Refined Element</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getRefinableElement()
 * @model abstract="true"
 * @generated
 */
public interface RefinableElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Refinement Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the contexts that this element may be redefined from.
	 * A refinable element can be refined by another element. Refinement is limited to classifier features, which can be refined by a classifier feature of the same name in an extended classifier. A refining element can add detail to an incomplete declaration.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refinement Context</em>' reference.
	 * @see aadl2.Aadl2Package#getRefinableElement_RefinementContext()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Classifier getRefinementContext();

	/**
	 * Returns the value of the '<em><b>Refined Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The refinable element that is being refined by this element.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refined Element</em>' reference.
	 * @see aadl2.Aadl2Package#getRefinableElement_RefinedElement()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 * @generated
	 */
	RefinableElement getRefinedElement();

} // RefinableElement
