/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connected Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Connections.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.ConnectedElement#getContext <em>Context</em>}</li>
 *   <li>{@link aadl2.ConnectedElement#getConnectionEnd <em>Connection End</em>}</li>
 *   <li>{@link aadl2.ConnectedElement#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getConnectedElement()
 * @model
 * @generated
 */
public interface ConnectedElement extends Element {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Connections.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Context)
	 * @see aadl2.Aadl2Package#getConnectedElement_Context()
	 * @model ordered="false"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link aadl2.ConnectedElement#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Connection End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Connections.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection End</em>' reference.
	 * @see #setConnectionEnd(ConnectionEnd)
	 * @see aadl2.Aadl2Package#getConnectedElement_ConnectionEnd()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ConnectionEnd getConnectionEnd();

	/**
	 * Sets the value of the '{@link aadl2.ConnectedElement#getConnectionEnd <em>Connection End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection End</em>' reference.
	 * @see #getConnectionEnd()
	 * @generated
	 */
	void setConnectionEnd(ConnectionEnd value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Connections.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(ConnectedElement)
	 * @see aadl2.Aadl2Package#getConnectedElement_Next()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ConnectedElement getNext();

	/**
	 * Sets the value of the '{@link aadl2.ConnectedElement#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(ConnectedElement value);

} // ConnectedElement
