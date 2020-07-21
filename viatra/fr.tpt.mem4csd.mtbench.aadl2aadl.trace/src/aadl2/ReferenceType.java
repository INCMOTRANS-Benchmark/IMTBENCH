/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Type</b></em>'.
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
 *   <li>{@link aadl2.ReferenceType#getNamedElementReference <em>Named Element Reference</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getReferenceType()
 * @model
 * @generated
 */
public interface ReferenceType extends NonListType {
	/**
	 * Returns the value of the '<em><b>Named Element Reference</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.MetaclassReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Named Element Reference</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getReferenceType_NamedElementReference()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MetaclassReference> getNamedElementReference();

} // ReferenceType
