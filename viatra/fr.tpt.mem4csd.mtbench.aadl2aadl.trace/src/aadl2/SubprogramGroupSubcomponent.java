/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Group Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Components::SubprogramGroup.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.SubprogramGroupSubcomponent#getSubprogramGroupSubcomponentType <em>Subprogram Group Subcomponent Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getSubprogramGroupSubcomponent()
 * @model
 * @generated
 */
public interface SubprogramGroupSubcomponent extends Subcomponent, AccessConnectionEnd, SubprogramGroup, CallContext {
	/**
	 * Returns the value of the '<em><b>Subprogram Group Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::SubprogramGroup.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subprogram Group Subcomponent Type</em>' reference.
	 * @see #setSubprogramGroupSubcomponentType(SubprogramGroupSubcomponentType)
	 * @see aadl2.Aadl2Package#getSubprogramGroupSubcomponent_SubprogramGroupSubcomponentType()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	SubprogramGroupSubcomponentType getSubprogramGroupSubcomponentType();

	/**
	 * Sets the value of the '{@link aadl2.SubprogramGroupSubcomponent#getSubprogramGroupSubcomponentType <em>Subprogram Group Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subprogram Group Subcomponent Type</em>' reference.
	 * @see #getSubprogramGroupSubcomponentType()
	 * @generated
	 */
	void setSubprogramGroupSubcomponentType(SubprogramGroupSubcomponentType value);

} // SubprogramGroupSubcomponent
