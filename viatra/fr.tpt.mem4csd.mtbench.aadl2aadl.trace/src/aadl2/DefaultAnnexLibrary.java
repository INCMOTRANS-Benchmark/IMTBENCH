/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Annex Library</b></em>'.
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
 *   <li>{@link aadl2.DefaultAnnexLibrary#getSourceText <em>Source Text</em>}</li>
 *   <li>{@link aadl2.DefaultAnnexLibrary#getParsedAnnexLibrary <em>Parsed Annex Library</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getDefaultAnnexLibrary()
 * @model
 * @generated
 */
public interface DefaultAnnexLibrary extends AnnexLibrary {
	/**
	 * Returns the value of the '<em><b>Source Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Extensibility.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Text</em>' attribute.
	 * @see #setSourceText(String)
	 * @see aadl2.Aadl2Package#getDefaultAnnexLibrary_SourceText()
	 * @model dataType="aadl2.String" required="true" ordered="false"
	 * @generated
	 */
	String getSourceText();

	/**
	 * Sets the value of the '{@link aadl2.DefaultAnnexLibrary#getSourceText <em>Source Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Text</em>' attribute.
	 * @see #getSourceText()
	 * @generated
	 */
	void setSourceText(String value);

	/**
	 * Returns the value of the '<em><b>Parsed Annex Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Extensibility.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parsed Annex Library</em>' containment reference.
	 * @see #setParsedAnnexLibrary(AnnexLibrary)
	 * @see aadl2.Aadl2Package#getDefaultAnnexLibrary_ParsedAnnexLibrary()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	AnnexLibrary getParsedAnnexLibrary();

	/**
	 * Sets the value of the '{@link aadl2.DefaultAnnexLibrary#getParsedAnnexLibrary <em>Parsed Annex Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parsed Annex Library</em>' containment reference.
	 * @see #getParsedAnnexLibrary()
	 * @generated
	 */
	void setParsedAnnexLibrary(AnnexLibrary value);

} // DefaultAnnexLibrary
