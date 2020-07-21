/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Literal</b></em>'.
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
 *   <li>{@link aadl2.UnitLiteral#getBaseUnit <em>Base Unit</em>}</li>
 *   <li>{@link aadl2.UnitLiteral#getFactor <em>Factor</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getUnitLiteral()
 * @model
 * @generated
 */
public interface UnitLiteral extends EnumerationLiteral {
	/**
	 * Returns the value of the '<em><b>Base Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Unit</em>' reference.
	 * @see #setBaseUnit(UnitLiteral)
	 * @see aadl2.Aadl2Package#getUnitLiteral_BaseUnit()
	 * @model ordered="false"
	 * @generated
	 */
	UnitLiteral getBaseUnit();

	/**
	 * Sets the value of the '{@link aadl2.UnitLiteral#getBaseUnit <em>Base Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Unit</em>' reference.
	 * @see #getBaseUnit()
	 * @generated
	 */
	void setBaseUnit(UnitLiteral value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Factor</em>' containment reference.
	 * @see #setFactor(NumberValue)
	 * @see aadl2.Aadl2Package#getUnitLiteral_Factor()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NumberValue getFactor();

	/**
	 * Sets the value of the '{@link aadl2.UnitLiteral#getFactor <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' containment reference.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(NumberValue value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="aadl2.Real" required="true" ordered="false" targetRequired="true" targetOrdered="false"
	 * @generated
	 */
	double getAbsoluteFactor(UnitLiteral target);

} // UnitLiteral
