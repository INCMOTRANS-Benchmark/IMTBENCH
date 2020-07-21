/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Components::Thread.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.ThreadType#getOwnedDataPort <em>Owned Data Port</em>}</li>
 *   <li>{@link aadl2.ThreadType#getOwnedEventDataPort <em>Owned Event Data Port</em>}</li>
 *   <li>{@link aadl2.ThreadType#getOwnedEventPort <em>Owned Event Port</em>}</li>
 *   <li>{@link aadl2.ThreadType#getOwnedDataAccess <em>Owned Data Access</em>}</li>
 *   <li>{@link aadl2.ThreadType#getOwnedSubprogramAccess <em>Owned Subprogram Access</em>}</li>
 *   <li>{@link aadl2.ThreadType#getOwnedSubprogramGroupAccess <em>Owned Subprogram Group Access</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getThreadType()
 * @model
 * @generated
 */
public interface ThreadType extends ComponentType, ThreadClassifier {
	/**
	 * Returns the value of the '<em><b>Owned Data Port</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.DataPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Thread.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Data Port</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getThreadType_OwnedDataPort()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<DataPort> getOwnedDataPort();

	/**
	 * Returns the value of the '<em><b>Owned Event Data Port</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.EventDataPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Thread.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Event Data Port</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getThreadType_OwnedEventDataPort()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<EventDataPort> getOwnedEventDataPort();

	/**
	 * Returns the value of the '<em><b>Owned Event Port</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.EventPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Thread.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Event Port</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getThreadType_OwnedEventPort()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<EventPort> getOwnedEventPort();

	/**
	 * Returns the value of the '<em><b>Owned Data Access</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.DataAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Thread.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Data Access</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getThreadType_OwnedDataAccess()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<DataAccess> getOwnedDataAccess();

	/**
	 * Returns the value of the '<em><b>Owned Subprogram Access</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.SubprogramAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Thread.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subprogram Access</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getThreadType_OwnedSubprogramAccess()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SubprogramAccess> getOwnedSubprogramAccess();

	/**
	 * Returns the value of the '<em><b>Owned Subprogram Group Access</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.SubprogramGroupAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Thread.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subprogram Group Access</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getThreadType_OwnedSubprogramGroupAccess()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SubprogramGroupAccess> getOwnedSubprogramGroupAccess();

} // ThreadType
