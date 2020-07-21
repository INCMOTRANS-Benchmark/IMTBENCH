/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::NoneSupport.</p>
 * <p>From package AADLConstructs::Components.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.ComponentClassifier#getOwnedMode <em>Owned Mode</em>}</li>
 *   <li>{@link aadl2.ComponentClassifier#getOwnedModeTransition <em>Owned Mode Transition</em>}</li>
 *   <li>{@link aadl2.ComponentClassifier#isDerivedModes <em>Derived Modes</em>}</li>
 *   <li>{@link aadl2.ComponentClassifier#isNoFlows <em>No Flows</em>}</li>
 *   <li>{@link aadl2.ComponentClassifier#isNoModes <em>No Modes</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getComponentClassifier()
 * @model abstract="true"
 * @generated
 */
public interface ComponentClassifier extends Classifier, SubcomponentType, FeatureClassifier {
	/**
	 * Returns the value of the '<em><b>Owned Mode</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.Mode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Mode</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getComponentClassifier_OwnedMode()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Mode> getOwnedMode();

	/**
	 * Returns the value of the '<em><b>Owned Mode Transition</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.ModeTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Mode Transition</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getComponentClassifier_OwnedModeTransition()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ModeTransition> getOwnedModeTransition();

	/**
	 * Returns the value of the '<em><b>Derived Modes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived Modes</em>' attribute.
	 * @see #setDerivedModes(boolean)
	 * @see aadl2.Aadl2Package#getComponentClassifier_DerivedModes()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDerivedModes();

	/**
	 * Sets the value of the '{@link aadl2.ComponentClassifier#isDerivedModes <em>Derived Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived Modes</em>' attribute.
	 * @see #isDerivedModes()
	 * @generated
	 */
	void setDerivedModes(boolean value);

	/**
	 * Returns the value of the '<em><b>No Flows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::NoneSupport.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Flows</em>' attribute.
	 * @see #setNoFlows(boolean)
	 * @see aadl2.Aadl2Package#getComponentClassifier_NoFlows()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoFlows();

	/**
	 * Sets the value of the '{@link aadl2.ComponentClassifier#isNoFlows <em>No Flows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Flows</em>' attribute.
	 * @see #isNoFlows()
	 * @generated
	 */
	void setNoFlows(boolean value);

	/**
	 * Returns the value of the '<em><b>No Modes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::NoneSupport.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Modes</em>' attribute.
	 * @see #setNoModes(boolean)
	 * @see aadl2.Aadl2Package#getComponentClassifier_NoModes()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoModes();

	/**
	 * Sets the value of the '{@link aadl2.ComponentClassifier#isNoModes <em>No Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Modes</em>' attribute.
	 * @see #isNoModes()
	 * @generated
	 */
	void setNoModes(boolean value);

} // ComponentClassifier
