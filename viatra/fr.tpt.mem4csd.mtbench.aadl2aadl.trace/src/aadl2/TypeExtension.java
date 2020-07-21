/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Components.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.TypeExtension#getExtended <em>Extended</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getTypeExtension()
 * @model
 * @generated
 */
public interface TypeExtension extends Generalization {
	/**
	 * Returns the value of the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended</em>' reference.
	 * @see #setExtended(ComponentType)
	 * @see aadl2.Aadl2Package#getTypeExtension_Extended()
	 * @model required="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	ComponentType getExtended();

	/**
	 * Sets the value of the '{@link aadl2.TypeExtension#getExtended <em>Extended</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended</em>' reference.
	 * @see #getExtended()
	 * @generated
	 */
	void setExtended(ComponentType value);

} // TypeExtension
