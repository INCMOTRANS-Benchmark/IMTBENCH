/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Arrays.</p>
 * <p>From package AADLProperties::Arrays.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.ArraySize#getSize <em>Size</em>}</li>
 *   <li>{@link aadl2.ArraySize#getSizeProperty <em>Size Property</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getArraySize()
 * @model
 * @generated
 */
public interface ArraySize extends Element {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Arrays.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(long)
	 * @see aadl2.Aadl2Package#getArraySize_Size()
	 * @model dataType="aadl2.Integer" required="true" ordered="false"
	 * @generated
	 */
	long getSize();

	/**
	 * Sets the value of the '{@link aadl2.ArraySize#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(long value);

	/**
	 * Returns the value of the '<em><b>Size Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Arrays.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size Property</em>' reference.
	 * @see #setSizeProperty(ArraySizeProperty)
	 * @see aadl2.Aadl2Package#getArraySize_SizeProperty()
	 * @model ordered="false"
	 * @generated
	 */
	ArraySizeProperty getSizeProperty();

	/**
	 * Sets the value of the '{@link aadl2.ArraySize#getSizeProperty <em>Size Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Property</em>' reference.
	 * @see #getSizeProperty()
	 * @generated
	 */
	void setSizeProperty(ArraySizeProperty value);

} // ArraySize
