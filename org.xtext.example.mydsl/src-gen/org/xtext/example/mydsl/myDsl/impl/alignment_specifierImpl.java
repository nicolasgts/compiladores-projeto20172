/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.alignment_specifier;
import org.xtext.example.mydsl.myDsl.constant_expression;
import org.xtext.example.mydsl.myDsl.type_name;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>alignment specifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.alignment_specifierImpl#getType_name <em>Type name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.alignment_specifierImpl#getConstant_expression <em>Constant expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class alignment_specifierImpl extends MinimalEObjectImpl.Container implements alignment_specifier
{
  /**
   * The cached value of the '{@link #getType_name() <em>Type name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_name()
   * @generated
   * @ordered
   */
  protected type_name type_name;

  /**
   * The cached value of the '{@link #getConstant_expression() <em>Constant expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant_expression()
   * @generated
   * @ordered
   */
  protected constant_expression constant_expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected alignment_specifierImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.ALIGNMENT_SPECIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_name getType_name()
  {
    return type_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType_name(type_name newType_name, NotificationChain msgs)
  {
    type_name oldType_name = type_name;
    type_name = newType_name;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ALIGNMENT_SPECIFIER__TYPE_NAME, oldType_name, newType_name);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_name(type_name newType_name)
  {
    if (newType_name != type_name)
    {
      NotificationChain msgs = null;
      if (type_name != null)
        msgs = ((InternalEObject)type_name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ALIGNMENT_SPECIFIER__TYPE_NAME, null, msgs);
      if (newType_name != null)
        msgs = ((InternalEObject)newType_name).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ALIGNMENT_SPECIFIER__TYPE_NAME, null, msgs);
      msgs = basicSetType_name(newType_name, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ALIGNMENT_SPECIFIER__TYPE_NAME, newType_name, newType_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant_expression getConstant_expression()
  {
    return constant_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstant_expression(constant_expression newConstant_expression, NotificationChain msgs)
  {
    constant_expression oldConstant_expression = constant_expression;
    constant_expression = newConstant_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ALIGNMENT_SPECIFIER__CONSTANT_EXPRESSION, oldConstant_expression, newConstant_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstant_expression(constant_expression newConstant_expression)
  {
    if (newConstant_expression != constant_expression)
    {
      NotificationChain msgs = null;
      if (constant_expression != null)
        msgs = ((InternalEObject)constant_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ALIGNMENT_SPECIFIER__CONSTANT_EXPRESSION, null, msgs);
      if (newConstant_expression != null)
        msgs = ((InternalEObject)newConstant_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ALIGNMENT_SPECIFIER__CONSTANT_EXPRESSION, null, msgs);
      msgs = basicSetConstant_expression(newConstant_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ALIGNMENT_SPECIFIER__CONSTANT_EXPRESSION, newConstant_expression, newConstant_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.ALIGNMENT_SPECIFIER__TYPE_NAME:
        return basicSetType_name(null, msgs);
      case MyDslPackage.ALIGNMENT_SPECIFIER__CONSTANT_EXPRESSION:
        return basicSetConstant_expression(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.ALIGNMENT_SPECIFIER__TYPE_NAME:
        return getType_name();
      case MyDslPackage.ALIGNMENT_SPECIFIER__CONSTANT_EXPRESSION:
        return getConstant_expression();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.ALIGNMENT_SPECIFIER__TYPE_NAME:
        setType_name((type_name)newValue);
        return;
      case MyDslPackage.ALIGNMENT_SPECIFIER__CONSTANT_EXPRESSION:
        setConstant_expression((constant_expression)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.ALIGNMENT_SPECIFIER__TYPE_NAME:
        setType_name((type_name)null);
        return;
      case MyDslPackage.ALIGNMENT_SPECIFIER__CONSTANT_EXPRESSION:
        setConstant_expression((constant_expression)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.ALIGNMENT_SPECIFIER__TYPE_NAME:
        return type_name != null;
      case MyDslPackage.ALIGNMENT_SPECIFIER__CONSTANT_EXPRESSION:
        return constant_expression != null;
    }
    return super.eIsSet(featureID);
  }

} //alignment_specifierImpl