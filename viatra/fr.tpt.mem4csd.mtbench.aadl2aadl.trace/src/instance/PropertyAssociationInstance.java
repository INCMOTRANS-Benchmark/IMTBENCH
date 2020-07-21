/**
 */
package instance;

import aadl2.PropertyAssociation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Association Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instance.PropertyAssociationInstance#getPropertyAssociation <em>Property Association</em>}</li>
 * </ul>
 *
 * @see instance.InstancePackage#getPropertyAssociationInstance()
 * @model
 * @generated
 */
public interface PropertyAssociationInstance extends PropertyAssociation {
	/**
	 * Returns the value of the '<em><b>Property Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Association</em>' reference.
	 * @see #setPropertyAssociation(PropertyAssociation)
	 * @see instance.InstancePackage#getPropertyAssociationInstance_PropertyAssociation()
	 * @model ordered="false"
	 * @generated
	 */
	PropertyAssociation getPropertyAssociation();

	/**
	 * Sets the value of the '{@link instance.PropertyAssociationInstance#getPropertyAssociation <em>Property Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Association</em>' reference.
	 * @see #getPropertyAssociation()
	 * @generated
	 */
	void setPropertyAssociation(PropertyAssociation value);

} // PropertyAssociationInstance
