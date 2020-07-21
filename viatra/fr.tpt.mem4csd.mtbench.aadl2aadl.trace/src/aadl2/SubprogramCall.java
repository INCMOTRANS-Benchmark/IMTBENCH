/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Calls.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.SubprogramCall#getCalledSubprogram <em>Called Subprogram</em>}</li>
 *   <li>{@link aadl2.SubprogramCall#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getSubprogramCall()
 * @model
 * @generated
 */
public interface SubprogramCall extends BehavioralFeature, Context {
	/**
	 * Returns the value of the '<em><b>Called Subprogram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Calls.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Called Subprogram</em>' reference.
	 * @see #setCalledSubprogram(CalledSubprogram)
	 * @see aadl2.Aadl2Package#getSubprogramCall_CalledSubprogram()
	 * @model ordered="false"
	 * @generated
	 */
	CalledSubprogram getCalledSubprogram();

	/**
	 * Sets the value of the '{@link aadl2.SubprogramCall#getCalledSubprogram <em>Called Subprogram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Subprogram</em>' reference.
	 * @see #getCalledSubprogram()
	 * @generated
	 */
	void setCalledSubprogram(CalledSubprogram value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Calls.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(CallContext)
	 * @see aadl2.Aadl2Package#getSubprogramCall_Context()
	 * @model ordered="false"
	 * @generated
	 */
	CallContext getContext();

	/**
	 * Sets the value of the '{@link aadl2.SubprogramCall#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(CallContext value);

} // SubprogramCall
