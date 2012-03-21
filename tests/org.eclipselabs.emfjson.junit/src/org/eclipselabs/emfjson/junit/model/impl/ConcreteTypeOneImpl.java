/**
 */
package org.eclipselabs.emfjson.junit.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.emfjson.junit.model.ConcreteTypeOne;
import org.eclipselabs.emfjson.junit.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Type One</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.emfjson.junit.model.impl.ConcreteTypeOneImpl#getPropTypeOne <em>Prop Type One</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcreteTypeOneImpl extends AbstractTypeImpl implements ConcreteTypeOne {
	/**
	 * The default value of the '{@link #getPropTypeOne() <em>Prop Type One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropTypeOne()
	 * @generated
	 * @ordered
	 */
	protected static final String PROP_TYPE_ONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropTypeOne() <em>Prop Type One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropTypeOne()
	 * @generated
	 * @ordered
	 */
	protected String propTypeOne = PROP_TYPE_ONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteTypeOneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CONCRETE_TYPE_ONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropTypeOne() {
		return propTypeOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropTypeOne(String newPropTypeOne) {
		String oldPropTypeOne = propTypeOne;
		propTypeOne = newPropTypeOne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONCRETE_TYPE_ONE__PROP_TYPE_ONE, oldPropTypeOne, propTypeOne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CONCRETE_TYPE_ONE__PROP_TYPE_ONE:
				return getPropTypeOne();
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
			case ModelPackage.CONCRETE_TYPE_ONE__PROP_TYPE_ONE:
				setPropTypeOne((String)newValue);
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
			case ModelPackage.CONCRETE_TYPE_ONE__PROP_TYPE_ONE:
				setPropTypeOne(PROP_TYPE_ONE_EDEFAULT);
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
			case ModelPackage.CONCRETE_TYPE_ONE__PROP_TYPE_ONE:
				return PROP_TYPE_ONE_EDEFAULT == null ? propTypeOne != null : !PROP_TYPE_ONE_EDEFAULT.equals(propTypeOne);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (propTypeOne: ");
		result.append(propTypeOne);
		result.append(')');
		return result.toString();
	}

} //ConcreteTypeOneImpl
