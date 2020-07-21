/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ArraySize;
import aadl2.ArraySizeProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ArraySizeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link aadl2.impl.ArraySizeImpl#getSizeProperty <em>Size Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArraySizeImpl extends ElementImpl implements ArraySize {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final long SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected long size = SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSizeProperty() <em>Size Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeProperty()
	 * @generated
	 * @ordered
	 */
	protected ArraySizeProperty sizeProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArraySizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getArraySize();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(long newSize) {
		long oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.ARRAY_SIZE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArraySizeProperty getSizeProperty() {
		if (sizeProperty != null && sizeProperty.eIsProxy()) {
			InternalEObject oldSizeProperty = (InternalEObject)sizeProperty;
			sizeProperty = (ArraySizeProperty)eResolveProxy(oldSizeProperty);
			if (sizeProperty != oldSizeProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.ARRAY_SIZE__SIZE_PROPERTY, oldSizeProperty, sizeProperty));
			}
		}
		return sizeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArraySizeProperty basicGetSizeProperty() {
		return sizeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeProperty(ArraySizeProperty newSizeProperty) {
		ArraySizeProperty oldSizeProperty = sizeProperty;
		sizeProperty = newSizeProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.ARRAY_SIZE__SIZE_PROPERTY, oldSizeProperty, sizeProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.ARRAY_SIZE__SIZE:
				return getSize();
			case Aadl2Package.ARRAY_SIZE__SIZE_PROPERTY:
				if (resolve) return getSizeProperty();
				return basicGetSizeProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Aadl2Package.ARRAY_SIZE__SIZE:
				setSize((Long)newValue);
				return;
			case Aadl2Package.ARRAY_SIZE__SIZE_PROPERTY:
				setSizeProperty((ArraySizeProperty)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Aadl2Package.ARRAY_SIZE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case Aadl2Package.ARRAY_SIZE__SIZE_PROPERTY:
				setSizeProperty((ArraySizeProperty)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Aadl2Package.ARRAY_SIZE__SIZE:
				return size != SIZE_EDEFAULT;
			case Aadl2Package.ARRAY_SIZE__SIZE_PROPERTY:
				return sizeProperty != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //ArraySizeImpl
