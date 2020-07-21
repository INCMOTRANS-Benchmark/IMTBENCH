/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLProperties::Expressions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.ListValue#getOwnedListElement <em>Owned List Element</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getListValue()
 * @model
 * @generated
 */
public interface ListValue extends PropertyExpression {
	/**
	 * Returns the value of the '<em><b>Owned List Element</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.PropertyExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Expressions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned List Element</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getListValue_OwnedListElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyExpression> getOwnedListElement();

} // ListValue
