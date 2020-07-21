/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLProperties::Types.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.EnumerationType#getOwnedLiteral <em>Owned Literal</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getEnumerationType()
 * @model
 * @generated
 */
public interface EnumerationType extends Namespace, NonListType {
	/**
	 * Returns the value of the '<em><b>Owned Literal</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Literal</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getEnumerationType_OwnedLiteral()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<EnumerationLiteral> getOwnedLiteral();

} // EnumerationType
