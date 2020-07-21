/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prototype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Templates.</p>
 * <p>From package AADLDetails::Calls.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.Prototype#getRefined <em>Refined</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getPrototype()
 * @model abstract="true"
 * @generated
 */
public interface Prototype extends StructuralFeature, CalledSubprogram {
	/**
	 * Returns the value of the '<em><b>Refined</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refined</em>' reference.
	 * @see #setRefined(Prototype)
	 * @see aadl2.Aadl2Package#getPrototype_Refined()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Prototype getRefined();

	/**
	 * Sets the value of the '{@link aadl2.Prototype#getRefined <em>Refined</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined</em>' reference.
	 * @see #getRefined()
	 * @generated
	 */
	void setRefined(Prototype value);

} // Prototype
