/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realization</b></em>'.
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
 *   <li>{@link aadl2.Realization#getImplemented <em>Implemented</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getRealization()
 * @model
 * @generated
 */
public interface Realization extends Generalization {
	/**
	 * Returns the value of the '<em><b>Implemented</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implemented</em>' reference.
	 * @see #setImplemented(ComponentType)
	 * @see aadl2.Aadl2Package#getRealization_Implemented()
	 * @model required="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	ComponentType getImplemented();

	/**
	 * Sets the value of the '{@link aadl2.Realization#getImplemented <em>Implemented</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implemented</em>' reference.
	 * @see #getImplemented()
	 * @generated
	 */
	void setImplemented(ComponentType value);

} // Realization
