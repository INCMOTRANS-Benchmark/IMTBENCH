/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Components::Subprogram.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.SubprogramSubcomponent#getSubprogramSubcomponentType <em>Subprogram Subcomponent Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getSubprogramSubcomponent()
 * @model
 * @generated
 */
public interface SubprogramSubcomponent extends Subcomponent, AccessConnectionEnd, Subprogram {
	/**
	 * Returns the value of the '<em><b>Subprogram Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Subprogram.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subprogram Subcomponent Type</em>' reference.
	 * @see #setSubprogramSubcomponentType(SubprogramSubcomponentType)
	 * @see aadl2.Aadl2Package#getSubprogramSubcomponent_SubprogramSubcomponentType()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	SubprogramSubcomponentType getSubprogramSubcomponentType();

	/**
	 * Sets the value of the '{@link aadl2.SubprogramSubcomponent#getSubprogramSubcomponentType <em>Subprogram Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subprogram Subcomponent Type</em>' reference.
	 * @see #getSubprogramSubcomponentType()
	 * @generated
	 */
	void setSubprogramSubcomponentType(SubprogramSubcomponentType value);

} // SubprogramSubcomponent
