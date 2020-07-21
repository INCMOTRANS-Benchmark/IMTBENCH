/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Components::Data.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.DataSubcomponent#getDataSubcomponentType <em>Data Subcomponent Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getDataSubcomponent()
 * @model
 * @generated
 */
public interface DataSubcomponent extends Subcomponent, AccessConnectionEnd, Data, ParameterConnectionEnd, PortConnectionEnd {
	/**
	 * Returns the value of the '<em><b>Data Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Data.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Subcomponent Type</em>' reference.
	 * @see #setDataSubcomponentType(DataSubcomponentType)
	 * @see aadl2.Aadl2Package#getDataSubcomponent_DataSubcomponentType()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	DataSubcomponentType getDataSubcomponentType();

	/**
	 * Sets the value of the '{@link aadl2.DataSubcomponent#getDataSubcomponentType <em>Data Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Subcomponent Type</em>' reference.
	 * @see #getDataSubcomponentType()
	 * @generated
	 */
	void setDataSubcomponentType(DataSubcomponentType value);

} // DataSubcomponent
