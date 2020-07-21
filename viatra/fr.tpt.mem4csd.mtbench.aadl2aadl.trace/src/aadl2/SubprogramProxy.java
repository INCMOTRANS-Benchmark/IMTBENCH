/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Proxy</b></em>'.
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
 *   <li>{@link aadl2.SubprogramProxy#getSubprogramClassifier <em>Subprogram Classifier</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getSubprogramProxy()
 * @model
 * @generated
 */
public interface SubprogramProxy extends ProcessorFeature, AccessConnectionEnd, CalledSubprogram {
	/**
	 * Returns the value of the '<em><b>Subprogram Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Special Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subprogram Classifier</em>' reference.
	 * @see #setSubprogramClassifier(SubprogramClassifier)
	 * @see aadl2.Aadl2Package#getSubprogramProxy_SubprogramClassifier()
	 * @model ordered="false"
	 * @generated
	 */
	SubprogramClassifier getSubprogramClassifier();

	/**
	 * Sets the value of the '{@link aadl2.SubprogramProxy#getSubprogramClassifier <em>Subprogram Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subprogram Classifier</em>' reference.
	 * @see #getSubprogramClassifier()
	 * @generated
	 */
	void setSubprogramClassifier(SubprogramClassifier value);

} // SubprogramProxy
