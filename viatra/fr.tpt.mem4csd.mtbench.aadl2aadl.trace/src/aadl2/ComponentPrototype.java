/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Prototype</b></em>'.
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
 *   <li>{@link aadl2.ComponentPrototype#isArray <em>Array</em>}</li>
 *   <li>{@link aadl2.ComponentPrototype#getConstrainingClassifier <em>Constraining Classifier</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getComponentPrototype()
 * @model abstract="true"
 * @generated
 */
public interface ComponentPrototype extends Prototype, SubcomponentType, FeatureClassifier {
	/**
	 * Returns the value of the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Array</em>' attribute.
	 * @see #setArray(boolean)
	 * @see aadl2.Aadl2Package#getComponentPrototype_Array()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isArray();

	/**
	 * Sets the value of the '{@link aadl2.ComponentPrototype#isArray <em>Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' attribute.
	 * @see #isArray()
	 * @generated
	 */
	void setArray(boolean value);

	/**
	 * Returns the value of the '<em><b>Constraining Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraining Classifier</em>' reference.
	 * @see #setConstrainingClassifier(ComponentClassifier)
	 * @see aadl2.Aadl2Package#getComponentPrototype_ConstrainingClassifier()
	 * @model ordered="false"
	 * @generated
	 */
	ComponentClassifier getConstrainingClassifier();

	/**
	 * Sets the value of the '{@link aadl2.ComponentPrototype#getConstrainingClassifier <em>Constraining Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraining Classifier</em>' reference.
	 * @see #getConstrainingClassifier()
	 * @generated
	 */
	void setConstrainingClassifier(ComponentClassifier value);

} // ComponentPrototype
