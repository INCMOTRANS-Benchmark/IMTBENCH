/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type Rename</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Packaging.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.ComponentTypeRename#getCategory <em>Category</em>}</li>
 *   <li>{@link aadl2.ComponentTypeRename#getRenamedComponentType <em>Renamed Component Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getComponentTypeRename()
 * @model
 * @generated
 */
public interface ComponentTypeRename extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link aadl2.ComponentCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Packaging.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see aadl2.ComponentCategory
	 * @see #setCategory(ComponentCategory)
	 * @see aadl2.Aadl2Package#getComponentTypeRename_Category()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComponentCategory getCategory();

	/**
	 * Sets the value of the '{@link aadl2.ComponentTypeRename#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see aadl2.ComponentCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(ComponentCategory value);

	/**
	 * Returns the value of the '<em><b>Renamed Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Packaging.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Renamed Component Type</em>' reference.
	 * @see #setRenamedComponentType(ComponentType)
	 * @see aadl2.Aadl2Package#getComponentTypeRename_RenamedComponentType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComponentType getRenamedComponentType();

	/**
	 * Sets the value of the '{@link aadl2.ComponentTypeRename#getRenamedComponentType <em>Renamed Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Renamed Component Type</em>' reference.
	 * @see #getRenamedComponentType()
	 * @generated
	 */
	void setRenamedComponentType(ComponentType value);

} // ComponentTypeRename
