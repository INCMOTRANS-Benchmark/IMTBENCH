/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Templates.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.AccessSpecification#getKind <em>Kind</em>}</li>
 *   <li>{@link aadl2.AccessSpecification#getCategory <em>Category</em>}</li>
 *   <li>{@link aadl2.AccessSpecification#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link aadl2.AccessSpecification#getComponentPrototype <em>Component Prototype</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getAccessSpecification()
 * @model
 * @generated
 */
public interface AccessSpecification extends FeaturePrototypeActual {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link aadl2.AccessType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see aadl2.AccessType
	 * @see #setKind(AccessType)
	 * @see aadl2.Aadl2Package#getAccessSpecification_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AccessType getKind();

	/**
	 * Sets the value of the '{@link aadl2.AccessSpecification#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see aadl2.AccessType
	 * @see #getKind()
	 * @generated
	 */
	void setKind(AccessType value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link aadl2.AccessCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see aadl2.AccessCategory
	 * @see #setCategory(AccessCategory)
	 * @see aadl2.Aadl2Package#getAccessSpecification_Category()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AccessCategory getCategory();

	/**
	 * Sets the value of the '{@link aadl2.AccessSpecification#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see aadl2.AccessCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(AccessCategory value);

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see #setClassifier(ComponentClassifier)
	 * @see aadl2.Aadl2Package#getAccessSpecification_Classifier()
	 * @model ordered="false"
	 * @generated
	 */
	ComponentClassifier getClassifier();

	/**
	 * Sets the value of the '{@link aadl2.AccessSpecification#getClassifier <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' reference.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(ComponentClassifier value);

	/**
	 * Returns the value of the '<em><b>Component Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Prototype</em>' reference.
	 * @see #setComponentPrototype(ComponentPrototype)
	 * @see aadl2.Aadl2Package#getAccessSpecification_ComponentPrototype()
	 * @model ordered="false"
	 * @generated
	 */
	ComponentPrototype getComponentPrototype();

	/**
	 * Sets the value of the '{@link aadl2.AccessSpecification#getComponentPrototype <em>Component Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Prototype</em>' reference.
	 * @see #getComponentPrototype()
	 * @generated
	 */
	void setComponentPrototype(ComponentPrototype value);

} // AccessSpecification
