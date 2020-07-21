/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Data Source</b></em>'.
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
 *   <li>{@link aadl2.EventDataSource#getDataClassifier <em>Data Classifier</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getEventDataSource()
 * @model
 * @generated
 */
public interface EventDataSource extends InternalFeature {
	/**
	 * Returns the value of the '<em><b>Data Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Special Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Classifier</em>' reference.
	 * @see #setDataClassifier(DataClassifier)
	 * @see aadl2.Aadl2Package#getEventDataSource_DataClassifier()
	 * @model ordered="false"
	 * @generated
	 */
	DataClassifier getDataClassifier();

	/**
	 * Sets the value of the '{@link aadl2.EventDataSource#getDataClassifier <em>Data Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Classifier</em>' reference.
	 * @see #getDataClassifier()
	 * @generated
	 */
	void setDataClassifier(DataClassifier value);

} // EventDataSource
