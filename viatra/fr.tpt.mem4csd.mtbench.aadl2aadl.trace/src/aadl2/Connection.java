/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
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
 *   <li>{@link aadl2.Connection#getDestination <em>Destination</em>}</li>
 *   <li>{@link aadl2.Connection#getSource <em>Source</em>}</li>
 *   <li>{@link aadl2.Connection#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link aadl2.Connection#getRefined <em>Refined</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getConnection()
 * @model abstract="true"
 * @generated
 */
public interface Connection extends StructuralFeature, ModalPath, FlowElement {
	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Connections.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(ConnectedElement)
	 * @see aadl2.Aadl2Package#getConnection_Destination()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ConnectedElement getDestination();

	/**
	 * Sets the value of the '{@link aadl2.Connection#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(ConnectedElement value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Connections.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(ConnectedElement)
	 * @see aadl2.Aadl2Package#getConnection_Source()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ConnectedElement getSource();

	/**
	 * Sets the value of the '{@link aadl2.Connection#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ConnectedElement value);

	/**
	 * Returns the value of the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Connections.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bidirectional</em>' attribute.
	 * @see #setBidirectional(boolean)
	 * @see aadl2.Aadl2Package#getConnection_Bidirectional()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isBidirectional();

	/**
	 * Sets the value of the '{@link aadl2.Connection#isBidirectional <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bidirectional</em>' attribute.
	 * @see #isBidirectional()
	 * @generated
	 */
	void setBidirectional(boolean value);

	/**
	 * Returns the value of the '<em><b>Refined</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Connections.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refined</em>' reference.
	 * @see #setRefined(Connection)
	 * @see aadl2.Aadl2Package#getConnection_Refined()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Connection getRefined();

	/**
	 * Sets the value of the '{@link aadl2.Connection#getRefined <em>Refined</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined</em>' reference.
	 * @see #getRefined()
	 * @generated
	 */
	void setRefined(Connection value);

} // Connection
