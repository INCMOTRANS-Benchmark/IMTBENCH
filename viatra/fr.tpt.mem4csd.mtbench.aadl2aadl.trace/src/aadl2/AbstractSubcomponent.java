/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Components::Abstract.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.AbstractSubcomponent#getAbstractSubcomponentType <em>Abstract Subcomponent Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getAbstractSubcomponent()
 * @model
 * @generated
 */
public interface AbstractSubcomponent extends Subcomponent, Abstract {
	/**
	 * Returns the value of the '<em><b>Abstract Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Abstract.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Subcomponent Type</em>' reference.
	 * @see #setAbstractSubcomponentType(AbstractSubcomponentType)
	 * @see aadl2.Aadl2Package#getAbstractSubcomponent_AbstractSubcomponentType()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	AbstractSubcomponentType getAbstractSubcomponentType();

	/**
	 * Sets the value of the '{@link aadl2.AbstractSubcomponent#getAbstractSubcomponentType <em>Abstract Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Subcomponent Type</em>' reference.
	 * @see #getAbstractSubcomponentType()
	 * @generated
	 */
	void setAbstractSubcomponentType(AbstractSubcomponentType value);

} // AbstractSubcomponent
