/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
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
 *   <li>{@link aadl2.Operation#getOp <em>Op</em>}</li>
 *   <li>{@link aadl2.Operation#getOwnedPropertyExpression <em>Owned Property Expression</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getOperation()
 * @model
 * @generated
 */
public interface Operation extends PropertyExpression {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link aadl2.OperationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Expressions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see aadl2.OperationKind
	 * @see #setOp(OperationKind)
	 * @see aadl2.Aadl2Package#getOperation_Op()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OperationKind getOp();

	/**
	 * Sets the value of the '{@link aadl2.Operation#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see aadl2.OperationKind
	 * @see #getOp()
	 * @generated
	 */
	void setOp(OperationKind value);

	/**
	 * Returns the value of the '<em><b>Owned Property Expression</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.PropertyExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Expressions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Property Expression</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getOperation_OwnedPropertyExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<PropertyExpression> getOwnedPropertyExpression();

} // Operation
