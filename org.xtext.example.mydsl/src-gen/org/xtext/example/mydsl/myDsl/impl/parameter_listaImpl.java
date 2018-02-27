/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.parameter_declaration;
import org.xtext.example.mydsl.myDsl.parameter_lista;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>parameter lista</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.parameter_listaImpl#getParameter_declarations <em>Parameter declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class parameter_listaImpl extends MinimalEObjectImpl.Container implements parameter_lista
{
  /**
   * The cached value of the '{@link #getParameter_declarations() <em>Parameter declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter_declarations()
   * @generated
   * @ordered
   */
  protected EList<parameter_declaration> parameter_declarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected parameter_listaImpl()
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
    return MyDslPackage.Literals.PARAMETER_LISTA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<parameter_declaration> getParameter_declarations()
  {
    if (parameter_declarations == null)
    {
      parameter_declarations = new EObjectContainmentEList<parameter_declaration>(parameter_declaration.class, this, MyDslPackage.PARAMETER_LISTA__PARAMETER_DECLARATIONS);
    }
    return parameter_declarations;
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
      case MyDslPackage.PARAMETER_LISTA__PARAMETER_DECLARATIONS:
        return ((InternalEList<?>)getParameter_declarations()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.PARAMETER_LISTA__PARAMETER_DECLARATIONS:
        return getParameter_declarations();
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
      case MyDslPackage.PARAMETER_LISTA__PARAMETER_DECLARATIONS:
        getParameter_declarations().clear();
        getParameter_declarations().addAll((Collection<? extends parameter_declaration>)newValue);
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
      case MyDslPackage.PARAMETER_LISTA__PARAMETER_DECLARATIONS:
        getParameter_declarations().clear();
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
      case MyDslPackage.PARAMETER_LISTA__PARAMETER_DECLARATIONS:
        return parameter_declarations != null && !parameter_declarations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //parameter_listaImpl