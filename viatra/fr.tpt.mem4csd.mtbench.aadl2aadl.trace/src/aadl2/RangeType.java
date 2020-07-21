/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLProperties::Types.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.RangeType#getOwnedNumberType <em>Owned Number Type</em>}</li>
 *   <li>{@link aadl2.RangeType#getNumberType <em>Number Type</em>}</li>
 *   <li>{@link aadl2.RangeType#getReferencedNumberType <em>Referenced Number Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getRangeType()
 * @model
 * @generated
 */
public interface RangeType extends NonListType {
	/**
	 * Returns the value of the '<em><b>Owned Number Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Number Type</em>' containment reference.
	 * @see #setOwnedNumberType(NumberType)
	 * @see aadl2.Aadl2Package#getRangeType_OwnedNumberType()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	NumberType getOwnedNumberType();

	/**
	 * Sets the value of the '{@link aadl2.RangeType#getOwnedNumberType <em>Owned Number Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Number Type</em>' containment reference.
	 * @see #getOwnedNumberType()
	 * @generated
	 */
	void setOwnedNumberType(NumberType value);

	/**
	 * Returns the value of the '<em><b>Number Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Type</em>' reference.
	 * @see aadl2.Aadl2Package#getRangeType_NumberType()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	NumberType getNumberType();

	/**
	 * Returns the value of the '<em><b>Referenced Number Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Number Type</em>' reference.
	 * @see #setReferencedNumberType(NumberType)
	 * @see aadl2.Aadl2Package#getRangeType_ReferencedNumberType()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	NumberType getReferencedNumberType();

	/**
	 * Sets the value of the '{@link aadl2.RangeType#getReferencedNumberType <em>Referenced Number Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Number Type</em>' reference.
	 * @see #getReferencedNumberType()
	 * @generated
	 */
	void setReferencedNumberType(NumberType value);

} // RangeType
