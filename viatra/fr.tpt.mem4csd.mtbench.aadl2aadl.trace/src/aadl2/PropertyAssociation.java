/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLProperties::Associations.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.PropertyAssociation#getProperty <em>Property</em>}</li>
 *   <li>{@link aadl2.PropertyAssociation#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link aadl2.PropertyAssociation#getInBinding <em>In Binding</em>}</li>
 *   <li>{@link aadl2.PropertyAssociation#isAppend <em>Append</em>}</li>
 *   <li>{@link aadl2.PropertyAssociation#isConstant <em>Constant</em>}</li>
 *   <li>{@link aadl2.PropertyAssociation#getOwnedValue <em>Owned Value</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getPropertyAssociation()
 * @model
 * @generated
 */
public interface PropertyAssociation extends Element {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Associations.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see aadl2.Aadl2Package#getPropertyAssociation_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link aadl2.PropertyAssociation#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.ContainedNamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Associations.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applies To</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getPropertyAssociation_AppliesTo()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ContainedNamedElement> getAppliesTo();

	/**
	 * Returns the value of the '<em><b>In Binding</b></em>' reference list.
	 * The list contents are of type {@link aadl2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Associations.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Binding</em>' reference list.
	 * @see aadl2.Aadl2Package#getPropertyAssociation_InBinding()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Classifier> getInBinding();

	/**
	 * Returns the value of the '<em><b>Append</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Associations.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Append</em>' attribute.
	 * @see #setAppend(boolean)
	 * @see aadl2.Aadl2Package#getPropertyAssociation_Append()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isAppend();

	/**
	 * Sets the value of the '{@link aadl2.PropertyAssociation#isAppend <em>Append</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Append</em>' attribute.
	 * @see #isAppend()
	 * @generated
	 */
	void setAppend(boolean value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Associations.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(boolean)
	 * @see aadl2.Aadl2Package#getPropertyAssociation_Constant()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isConstant();

	/**
	 * Sets the value of the '{@link aadl2.PropertyAssociation#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #isConstant()
	 * @generated
	 */
	void setConstant(boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Value</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.ModalPropertyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Associations.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Value</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getPropertyAssociation_OwnedValue()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ModalPropertyValue> getOwnedValue();

} // PropertyAssociation
