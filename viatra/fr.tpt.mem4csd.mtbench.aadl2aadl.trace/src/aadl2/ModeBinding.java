/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Modes.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.ModeBinding#getParentMode <em>Parent Mode</em>}</li>
 *   <li>{@link aadl2.ModeBinding#getDerivedMode <em>Derived Mode</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getModeBinding()
 * @model
 * @generated
 */
public interface ModeBinding extends Element {
	/**
	 * Returns the value of the '<em><b>Parent Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Modes.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Mode</em>' reference.
	 * @see #setParentMode(Mode)
	 * @see aadl2.Aadl2Package#getModeBinding_ParentMode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Mode getParentMode();

	/**
	 * Sets the value of the '{@link aadl2.ModeBinding#getParentMode <em>Parent Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Mode</em>' reference.
	 * @see #getParentMode()
	 * @generated
	 */
	void setParentMode(Mode value);

	/**
	 * Returns the value of the '<em><b>Derived Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Modes.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived Mode</em>' reference.
	 * @see #setDerivedMode(Mode)
	 * @see aadl2.Aadl2Package#getModeBinding_DerivedMode()
	 * @model ordered="false"
	 * @generated
	 */
	Mode getDerivedMode();

	/**
	 * Sets the value of the '{@link aadl2.ModeBinding#getDerivedMode <em>Derived Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived Mode</em>' reference.
	 * @see #getDerivedMode()
	 * @generated
	 */
	void setDerivedMode(Mode value);

} // ModeBinding
