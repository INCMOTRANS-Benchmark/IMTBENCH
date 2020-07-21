/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Type</b></em>'.
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
 *   <li>{@link aadl2.NumberType#getOwnedUnitsType <em>Owned Units Type</em>}</li>
 *   <li>{@link aadl2.NumberType#getReferencedUnitsType <em>Referenced Units Type</em>}</li>
 *   <li>{@link aadl2.NumberType#getRange <em>Range</em>}</li>
 *   <li>{@link aadl2.NumberType#getUnitsType <em>Units Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getNumberType()
 * @model abstract="true"
 * @generated
 */
public interface NumberType extends NonListType {
	/**
	 * Returns the value of the '<em><b>Owned Units Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Units Type</em>' containment reference.
	 * @see #setOwnedUnitsType(UnitsType)
	 * @see aadl2.Aadl2Package#getNumberType_OwnedUnitsType()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	UnitsType getOwnedUnitsType();

	/**
	 * Sets the value of the '{@link aadl2.NumberType#getOwnedUnitsType <em>Owned Units Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Units Type</em>' containment reference.
	 * @see #getOwnedUnitsType()
	 * @generated
	 */
	void setOwnedUnitsType(UnitsType value);

	/**
	 * Returns the value of the '<em><b>Referenced Units Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Units Type</em>' reference.
	 * @see #setReferencedUnitsType(UnitsType)
	 * @see aadl2.Aadl2Package#getNumberType_ReferencedUnitsType()
	 * @model ordered="false"
	 * @generated
	 */
	UnitsType getReferencedUnitsType();

	/**
	 * Sets the value of the '{@link aadl2.NumberType#getReferencedUnitsType <em>Referenced Units Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Units Type</em>' reference.
	 * @see #getReferencedUnitsType()
	 * @generated
	 */
	void setReferencedUnitsType(UnitsType value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(NumericRange)
	 * @see aadl2.Aadl2Package#getNumberType_Range()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NumericRange getRange();

	/**
	 * Sets the value of the '{@link aadl2.NumberType#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(NumericRange value);

	/**
	 * Returns the value of the '<em><b>Units Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Units Type</em>' reference.
	 * @see aadl2.Aadl2Package#getNumberType_UnitsType()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	UnitsType getUnitsType();

} // NumberType
