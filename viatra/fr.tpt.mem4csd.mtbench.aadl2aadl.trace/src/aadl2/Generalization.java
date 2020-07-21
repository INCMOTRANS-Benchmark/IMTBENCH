/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A generalization is a taxonomic relationship between a more general classifier and a more specific classifier. Each instance of the specific classifier is also an instance of the general classifier. Thus, the specific classifier indirectly has features of the more general classifier.
 * <p>From package AADLInfrastructure.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.Generalization#getGeneral <em>General</em>}</li>
 *   <li>{@link aadl2.Generalization#getSpecific <em>Specific</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getGeneralization()
 * @model abstract="true"
 * @generated
 */
public interface Generalization extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the general classifier in the Generalization relationship.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General</em>' reference.
	 * @see aadl2.Aadl2Package#getGeneralization_General()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 *        annotation="subsets"
	 * @generated
	 */
	Classifier getGeneral();

	/**
	 * Returns the value of the '<em><b>Specific</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link aadl2.Classifier#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the specializing classifier in the Generalization relationship. 
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specific</em>' reference.
	 * @see #setSpecific(Classifier)
	 * @see aadl2.Aadl2Package#getGeneralization_Specific()
	 * @see aadl2.Classifier#getGeneralization
	 * @model opposite="generalization" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Classifier getSpecific();

	/**
	 * Sets the value of the '{@link aadl2.Generalization#getSpecific <em>Specific</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific</em>' reference.
	 * @see #getSpecific()
	 * @generated
	 */
	void setSpecific(Classifier value);

} // Generalization
