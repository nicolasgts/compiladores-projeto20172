/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.parameter_declaration;
import org.xtext.example.mydsl.myDsl.parameter_list_linha;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>parameter list linha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.parameter_list_linhaImpl#getParameter_declaration <em>Parameter declaration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.parameter_list_linhaImpl#getParameter_list_linha <em>Parameter list linha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class parameter_list_linhaImpl extends MinimalEObjectImpl.Container implements parameter_list_linha
{
  /**
   * The cached value of the '{@link #getParameter_declaration() <em>Parameter declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter_declaration()
   * @generated
   * @ordered
   */
  protected parameter_declaration parameter_declaration;

  /**
   * The cached value of the '{@link #getParameter_list_linha() <em>Parameter list linha</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter_list_linha()
   * @generated
   * @ordered
   */
  protected EList<parameter_list_linha> parameter_list_linha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected parameter_list_linhaImpl()
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
    return MyDslPackage.Literals.PARAMETER_LIST_LINHA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter_declaration getParameter_declaration()
  {
    return parameter_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameter_declaration(parameter_declaration newParameter_declaration, NotificationChain msgs)
  {
    parameter_declaration oldParameter_declaration = parameter_declaration;
    parameter_declaration = newParameter_declaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PARAMETER_LIST_LINHA__PARAMETER_DECLARATION, oldParameter_declaration, newParameter_declaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter_declaration(parameter_declaration newParameter_declaration)
  {
    if (newParameter_declaration != parameter_declaration)
    {
      NotificationChain msgs = null;
      if (parameter_declaration != null)
        msgs = ((InternalEObject)parameter_declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PARAMETER_LIST_LINHA__PARAMETER_DECLARATION, null, msgs);
      if (newParameter_declaration != null)
        msgs = ((InternalEObject)newParameter_declaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PARAMETER_LIST_LINHA__PARAMETER_DECLARATION, null, msgs);
      msgs = basicSetParameter_declaration(newParameter_declaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PARAMETER_LIST_LINHA__PARAMETER_DECLARATION, newParameter_declaration, newParameter_declaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<parameter_list_linha> getParameter_list_linha()
  {
    if (parameter_list_linha == null)
    {
      parameter_list_linha = new EObjectContainmentEList<parameter_list_linha>(parameter_list_linha.class, this, MyDslPackage.PARAMETER_LIST_LINHA__PARAMETER_LIST_LINHA);
    }
    return parameter_list_linha;
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
      case MyDslPackage.PARAMETER_LIST_LINHA__PARAMETER_DECLARATION:
        return basicSetParameter_declaration(null, msgs);
      case MyDslPackage.PARAMETER_LIST_LINHA__PARAMETER_LIST_LINHA:
        return ((InternalEList<?>)getParameter_list_linha()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.PARAMETER_LIST_LINHA__PARAMETER_DECLARATION:
        return getParameter_declaration();
      case MyDslPackage.PARAMETER_LIST_LINHA__PARAMETER_LIST_LINHA:
        return getParameter_list_linha();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.PARAMETER_LIST_LINHA__PARAMETER_DECLARATION:
        setParameter_declaration((parameter_declaration)newValue);
        return;
      case MyDslPackage.PARAMETER_LIST_LINHA__PARAMETER_LIST_LINHA:
        getParameter_list_linha().clear();
        getParameter_list_linha().addAll((Collection<? extends parameter_list_linha>)newValue);
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
      case MyDslPackage.PARAMETER_LIST_LINHA__PARAMETER_DECLARATION:
        setParameter_declaration((parameter_declaration)null);
        return;
      case MyDslPackage.PARAMETER_LIST_LINHA__PARAMETER_LIST_LINHA:
        getParameter_list_linha().clear();
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
      case MyDslPackage.PARAMETER_LIST_LINHA__PARAMETER_DECLARATION:
        return parameter_declaration != null;
      case MyDslPackage.PARAMETER_LIST_LINHA__PARAMETER_LIST_LINHA:
        return parameter_list_linha != null && !parameter_list_linha.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //parameter_list_linhaImpl
