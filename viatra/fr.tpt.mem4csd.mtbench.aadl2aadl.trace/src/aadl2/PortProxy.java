/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Special Features.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.PortProxy#getDirection <em>Direction</em>}</li>
 *   <li>{@link aadl2.PortProxy#getDataClassifier <em>Data Classifier</em>}</li>
 *   <li>{@link aadl2.PortProxy#isIn <em>In</em>}</li>
 *   <li>{@link aadl2.PortProxy#isOut <em>Out</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getPortProxy()
 * @model
 * @generated
 */
public interface PortProxy extends ProcessorFeature, FeatureConnectionEnd, PortConnectionEnd, TriggerPort {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link aadl2.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Special Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see aadl2.DirectionType
	 * @see aadl2.Aadl2Package#getPortProxy_Direction()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	DirectionType getDirection();

	/**
	 * Returns the value of the '<em><b>Data Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Special Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Classifier</em>' reference.
	 * @see #setDataClassifier(DataClassifier)
	 * @see aadl2.Aadl2Package#getPortProxy_DataClassifier()
	 * @model ordered="false"
	 * @generated
	 */
	DataClassifier getDataClassifier();

	/**
	 * Sets the value of the '{@link aadl2.PortProxy#getDataClassifier <em>Data Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Classifier</em>' reference.
	 * @see #getDataClassifier()
	 * @generated
	 */
	void setDataClassifier(DataClassifier value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Special Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In</em>' attribute.
	 * @see #setIn(boolean)
	 * @see aadl2.Aadl2Package#getPortProxy_In()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIn();

	/**
	 * Sets the value of the '{@link aadl2.PortProxy#isIn <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' attribute.
	 * @see #isIn()
	 * @generated
	 */
	void setIn(boolean value);

	/**
	 * Returns the value of the '<em><b>Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Special Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Out</em>' attribute.
	 * @see #setOut(boolean)
	 * @see aadl2.Aadl2Package#getPortProxy_Out()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isOut();

	/**
	 * Sets the value of the '{@link aadl2.PortProxy#isOut <em>Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out</em>' attribute.
	 * @see #isOut()
	 * @generated
	 */
	void setOut(boolean value);

} // PortProxy
