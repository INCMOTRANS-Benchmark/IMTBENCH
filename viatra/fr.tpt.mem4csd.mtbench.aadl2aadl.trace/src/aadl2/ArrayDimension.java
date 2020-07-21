/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Arrays.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.ArrayDimension#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getArrayDimension()
 * @model
 * @generated
 */
public interface ArrayDimension extends Element {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Arrays.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(ArraySize)
	 * @see aadl2.Aadl2Package#getArrayDimension_Size()
	 * @model containment="true"
	 * @generated
	 */
	ArraySize getSize();

	/**
	 * Sets the value of the '{@link aadl2.ArrayDimension#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(ArraySize value);

} // ArrayDimension
