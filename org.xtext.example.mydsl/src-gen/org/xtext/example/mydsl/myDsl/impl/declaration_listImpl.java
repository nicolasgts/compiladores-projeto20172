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
import org.xtext.example.mydsl.myDsl.declaration;
import org.xtext.example.mydsl.myDsl.declaration_list;
import org.xtext.example.mydsl.myDsl.declaration_list_linha;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>declaration list</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.declaration_listImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.declaration_listImpl#getDeclaration_list_linha <em>Declaration list linha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class declaration_listImpl extends MinimalEObjectImpl.Container implements declaration_list
{
  /**
   * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration()
   * @generated
   * @ordered
   */
  protected declaration declaration;

  /**
   * The cached value of the '{@link #getDeclaration_list_linha() <em>Declaration list linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration_list_linha()
   * @generated
   * @ordered
   */
  protected declaration_list_linha declaration_list_linha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected declaration_listImpl()
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
    return MyDslPackage.Literals.DECLARATION_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration getDeclaration()
  {
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaration(declaration newDeclaration, NotificationChain msgs)
  {
    declaration oldDeclaration = declaration;
    declaration = newDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION_LIST__DECLARATION, oldDeclaration, newDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaration(declaration newDeclaration)
  {
    if (newDeclaration != declaration)
    {
      NotificationChain msgs = null;
      if (declaration != null)
        msgs = ((InternalEObject)declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION_LIST__DECLARATION, null, msgs);
      if (newDeclaration != null)
        msgs = ((InternalEObject)newDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION_LIST__DECLARATION, null, msgs);
      msgs = basicSetDeclaration(newDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION_LIST__DECLARATION, newDeclaration, newDeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration_list_linha getDeclaration_list_linha()
  {
    return declaration_list_linha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaration_list_linha(declaration_list_linha newDeclaration_list_linha, NotificationChain msgs)
  {
    declaration_list_linha oldDeclaration_list_linha = declaration_list_linha;
    declaration_list_linha = newDeclaration_list_linha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION_LIST__DECLARATION_LIST_LINHA, oldDeclaration_list_linha, newDeclaration_list_linha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaration_list_linha(declaration_list_linha newDeclaration_list_linha)
  {
    if (newDeclaration_list_linha != declaration_list_linha)
    {
      NotificationChain msgs = null;
      if (declaration_list_linha != null)
        msgs = ((InternalEObject)declaration_list_linha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION_LIST__DECLARATION_LIST_LINHA, null, msgs);
      if (newDeclaration_list_linha != null)
        msgs = ((InternalEObject)newDeclaration_list_linha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION_LIST__DECLARATION_LIST_LINHA, null, msgs);
      msgs = basicSetDeclaration_list_linha(newDeclaration_list_linha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION_LIST__DECLARATION_LIST_LINHA, newDeclaration_list_linha, newDeclaration_list_linha));
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
      case MyDslPackage.DECLARATION_LIST__DECLARATION:
        return basicSetDeclaration(null, msgs);
      case MyDslPackage.DECLARATION_LIST__DECLARATION_LIST_LINHA:
        return basicSetDeclaration_list_linha(null, msgs);
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
      case MyDslPackage.DECLARATION_LIST__DECLARATION:
        return getDeclaration();
      case MyDslPackage.DECLARATION_LIST__DECLARATION_LIST_LINHA:
        return getDeclaration_list_linha();
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
      case MyDslPackage.DECLARATION_LIST__DECLARATION:
        setDeclaration((declaration)newValue);
        return;
      case MyDslPackage.DECLARATION_LIST__DECLARATION_LIST_LINHA:
        setDeclaration_list_linha((declaration_list_linha)newValue);
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
      case MyDslPackage.DECLARATION_LIST__DECLARATION:
        setDeclaration((declaration)null);
        return;
      case MyDslPackage.DECLARATION_LIST__DECLARATION_LIST_LINHA:
        setDeclaration_list_linha((declaration_list_linha)null);
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
      case MyDslPackage.DECLARATION_LIST__DECLARATION:
        return declaration != null;
      case MyDslPackage.DECLARATION_LIST__DECLARATION_LIST_LINHA:
        return declaration_list_linha != null;
    }
    return super.eIsSet(featureID);
  }

} //declaration_listImpl
