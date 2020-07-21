/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLProperties::Definitions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.Property#isInherit <em>Inherit</em>}</li>
 *   <li>{@link aadl2.Property#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link aadl2.Property#getAppliesToMetaclass <em>Applies To Metaclass</em>}</li>
 *   <li>{@link aadl2.Property#getAppliesToClassifier <em>Applies To Classifier</em>}</li>
 *   <li>{@link aadl2.Property#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link aadl2.Property#isEmptyListDefault <em>Empty List Default</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getProperty()
 * @model
 * @generated
 */
public interface Property extends BasicProperty, AbstractNamedValue {
	/**
	 * Returns the value of the '<em><b>Inherit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Definitions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherit</em>' attribute.
	 * @see #setInherit(boolean)
	 * @see aadl2.Aadl2Package#getProperty_Inherit()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isInherit();

	/**
	 * Sets the value of the '{@link aadl2.Property#isInherit <em>Inherit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherit</em>' attribute.
	 * @see #isInherit()
	 * @generated
	 */
	void setInherit(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Definitions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(PropertyExpression)
	 * @see aadl2.Aadl2Package#getProperty_DefaultValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PropertyExpression getDefaultValue();

	/**
	 * Sets the value of the '{@link aadl2.Property#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(PropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Applies To Metaclass</b></em>' reference list.
	 * The list contents are of type {@link aadl2.MetaclassReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Definitions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applies To Metaclass</em>' reference list.
	 * @see aadl2.Aadl2Package#getProperty_AppliesToMetaclass()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<MetaclassReference> getAppliesToMetaclass();

	/**
	 * Returns the value of the '<em><b>Applies To Classifier</b></em>' reference list.
	 * The list contents are of type {@link aadl2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Definitions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applies To Classifier</em>' reference list.
	 * @see aadl2.Aadl2Package#getProperty_AppliesToClassifier()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Classifier> getAppliesToClassifier();

	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.PropertyOwner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Definitions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applies To</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getProperty_AppliesTo()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PropertyOwner> getAppliesTo();

	/**
	 * Returns the value of the '<em><b>Empty List Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Definitions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Empty List Default</em>' attribute.
	 * @see #setEmptyListDefault(boolean)
	 * @see aadl2.Aadl2Package#getProperty_EmptyListDefault()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isEmptyListDefault();

	/**
	 * Sets the value of the '{@link aadl2.Property#isEmptyListDefault <em>Empty List Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empty List Default</em>' attribute.
	 * @see #isEmptyListDefault()
	 * @generated
	 */
	void setEmptyListDefault(boolean value);

} // Property
