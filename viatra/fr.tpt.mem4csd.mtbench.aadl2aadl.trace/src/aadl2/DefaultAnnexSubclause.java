/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Annex Subclause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Extensibility.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.DefaultAnnexSubclause#getSourceText <em>Source Text</em>}</li>
 *   <li>{@link aadl2.DefaultAnnexSubclause#getParsedAnnexSubclause <em>Parsed Annex Subclause</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getDefaultAnnexSubclause()
 * @model
 * @generated
 */
public interface DefaultAnnexSubclause extends AnnexSubclause {
	/**
	 * Returns the value of the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Extensibility.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Text</em>' attribute.
	 * @see #setSourceText(String)
	 * @see aadl2.Aadl2Package#getDefaultAnnexSubclause_SourceText()
	 * @model dataType="aadl2.String" required="true" ordered="false"
	 * @generated
	 */
	String getSourceText();

	/**
	 * Sets the value of the '{@link aadl2.DefaultAnnexSubclause#getSourceText <em>Source Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Text</em>' attribute.
	 * @see #getSourceText()
	 * @generated
	 */
	void setSourceText(String value);

	/**
	 * Returns the value of the '<em><b>Parsed Annex Subclause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Extensibility.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parsed Annex Subclause</em>' containment reference.
	 * @see #setParsedAnnexSubclause(AnnexSubclause)
	 * @see aadl2.Aadl2Package#getDefaultAnnexSubclause_ParsedAnnexSubclause()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	AnnexSubclause getParsedAnnexSubclause();

	/**
	 * Sets the value of the '{@link aadl2.DefaultAnnexSubclause#getParsedAnnexSubclause <em>Parsed Annex Subclause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parsed Annex Subclause</em>' containment reference.
	 * @see #getParsedAnnexSubclause()
	 * @generated
	 */
	void setParsedAnnexSubclause(AnnexSubclause value);

} // DefaultAnnexSubclause
