/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Features.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.GroupExtension#getExtended <em>Extended</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getGroupExtension()
 * @model
 * @generated
 */
public interface GroupExtension extends Generalization {
	/**
	 * Returns the value of the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended</em>' reference.
	 * @see #setExtended(FeatureGroupType)
	 * @see aadl2.Aadl2Package#getGroupExtension_Extended()
	 * @model required="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	FeatureGroupType getExtended();

	/**
	 * Sets the value of the '{@link aadl2.GroupExtension#getExtended <em>Extended</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended</em>' reference.
	 * @see #getExtended()
	 * @generated
	 */
	void setExtended(FeatureGroupType value);

} // GroupExtension
