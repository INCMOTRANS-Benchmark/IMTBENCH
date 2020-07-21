/**
 */
package instance;

import aadl2.PropertyValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instance.InstanceReferenceValue#getReferencedInstanceObject <em>Referenced Instance Object</em>}</li>
 * </ul>
 *
 * @see instance.InstancePackage#getInstanceReferenceValue()
 * @model
 * @generated
 */
public interface InstanceReferenceValue extends PropertyValue {
	/**
	 * Returns the value of the '<em><b>Referenced Instance Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Instance Object</em>' reference.
	 * @see #setReferencedInstanceObject(InstanceObject)
	 * @see instance.InstancePackage#getInstanceReferenceValue_ReferencedInstanceObject()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InstanceObject getReferencedInstanceObject();

	/**
	 * Sets the value of the '{@link instance.InstanceReferenceValue#getReferencedInstanceObject <em>Referenced Instance Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Instance Object</em>' reference.
	 * @see #getReferencedInstanceObject()
	 * @generated
	 */
	void setReferencedInstanceObject(InstanceObject value);

} // InstanceReferenceValue
