/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Containment Path Element</b></em>'.
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
 *   <li>{@link aadl2.ContainmentPathElement#getArrayRange <em>Array Range</em>}</li>
 *   <li>{@link aadl2.ContainmentPathElement#getNamedElement <em>Named Element</em>}</li>
 *   <li>{@link aadl2.ContainmentPathElement#getAnnexName <em>Annex Name</em>}</li>
 *   <li>{@link aadl2.ContainmentPathElement#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getContainmentPathElement()
 * @model
 * @generated
 */
public interface ContainmentPathElement extends Element {
	/**
	 * Returns the value of the '<em><b>Array Range</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.ArrayRange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Associations.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Array Range</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getContainmentPathElement_ArrayRange()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArrayRange> getArrayRange();

	/**
	 * Returns the value of the '<em><b>Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Associations.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Named Element</em>' reference.
	 * @see #setNamedElement(NamedElement)
	 * @see aadl2.Aadl2Package#getContainmentPathElement_NamedElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NamedElement getNamedElement();

	/**
	 * Sets the value of the '{@link aadl2.ContainmentPathElement#getNamedElement <em>Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Named Element</em>' reference.
	 * @see #getNamedElement()
	 * @generated
	 */
	void setNamedElement(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Annex Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Associations.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annex Name</em>' attribute.
	 * @see #setAnnexName(String)
	 * @see aadl2.Aadl2Package#getContainmentPathElement_AnnexName()
	 * @model dataType="aadl2.String" ordered="false"
	 * @generated
	 */
	String getAnnexName();

	/**
	 * Sets the value of the '{@link aadl2.ContainmentPathElement#getAnnexName <em>Annex Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annex Name</em>' attribute.
	 * @see #getAnnexName()
	 * @generated
	 */
	void setAnnexName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Associations.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(ContainmentPathElement)
	 * @see aadl2.Aadl2Package#getContainmentPathElement_Path()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ContainmentPathElement getPath();

	/**
	 * Sets the value of the '{@link aadl2.ContainmentPathElement#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(ContainmentPathElement value);

} // ContainmentPathElement
