/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prototype Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Templates.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.PrototypeBinding#getFormal <em>Formal</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getPrototypeBinding()
 * @model abstract="true"
 * @generated
 */
public interface PrototypeBinding extends Element {
	/**
	 * Returns the value of the '<em><b>Formal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formal</em>' reference.
	 * @see #setFormal(Prototype)
	 * @see aadl2.Aadl2Package#getPrototypeBinding_Formal()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Prototype getFormal();

	/**
	 * Sets the value of the '{@link aadl2.PrototypeBinding#getFormal <em>Formal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal</em>' reference.
	 * @see #getFormal()
	 * @generated
	 */
	void setFormal(Prototype value);

} // PrototypeBinding
