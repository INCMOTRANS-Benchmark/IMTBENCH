/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Type</b></em>'.
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
 *   <li>{@link aadl2.ClassifierType#getClassifierReference <em>Classifier Reference</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getClassifierType()
 * @model
 * @generated
 */
public interface ClassifierType extends NonListType {
	/**
	 * Returns the value of the '<em><b>Classifier Reference</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.MetaclassReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier Reference</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getClassifierType_ClassifierReference()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MetaclassReference> getClassifierReference();

} // ClassifierType
