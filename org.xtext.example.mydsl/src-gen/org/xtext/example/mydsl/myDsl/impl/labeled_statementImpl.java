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
import org.xtext.example.mydsl.myDsl.conditional_expression;
import org.xtext.example.mydsl.myDsl.labeled_statement;
import org.xtext.example.mydsl.myDsl.statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>labeled statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.labeled_statementImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.labeled_statementImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.labeled_statementImpl#getConditional_expression <em>Conditional expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class labeled_statementImpl extends MinimalEObjectImpl.Container implements labeled_statement
{
  /**
   * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected String identifier = IDENTIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected statement statement;

  /**
   * The cached value of the '{@link #getConditional_expression() <em>Conditional expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditional_expression()
   * @generated
   * @ordered
   */
  protected conditional_expression conditional_expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected labeled_statementImpl()
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
    return MyDslPackage.Literals.LABELED_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(String newIdentifier)
  {
    String oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LABELED_STATEMENT__IDENTIFIER, oldIdentifier, identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement getStatement()
  {
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement(statement newStatement, NotificationChain msgs)
  {
    statement oldStatement = statement;
    statement = newStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LABELED_STATEMENT__STATEMENT, oldStatement, newStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement(statement newStatement)
  {
    if (newStatement != statement)
    {
      NotificationChain msgs = null;
      if (statement != null)
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LABELED_STATEMENT__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LABELED_STATEMENT__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LABELED_STATEMENT__STATEMENT, newStatement, newStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public conditional_expression getConditional_expression()
  {
    return conditional_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditional_expression(conditional_expression newConditional_expression, NotificationChain msgs)
  {
    conditional_expression oldConditional_expression = conditional_expression;
    conditional_expression = newConditional_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LABELED_STATEMENT__CONDITIONAL_EXPRESSION, oldConditional_expression, newConditional_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditional_expression(conditional_expression newConditional_expression)
  {
    if (newConditional_expression != conditional_expression)
    {
      NotificationChain msgs = null;
      if (conditional_expression != null)
        msgs = ((InternalEObject)conditional_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LABELED_STATEMENT__CONDITIONAL_EXPRESSION, null, msgs);
      if (newConditional_expression != null)
        msgs = ((InternalEObject)newConditional_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LABELED_STATEMENT__CONDITIONAL_EXPRESSION, null, msgs);
      msgs = basicSetConditional_expression(newConditional_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LABELED_STATEMENT__CONDITIONAL_EXPRESSION, newConditional_expression, newConditional_expression));
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
      case MyDslPackage.LABELED_STATEMENT__STATEMENT:
        return basicSetStatement(null, msgs);
      case MyDslPackage.LABELED_STATEMENT__CONDITIONAL_EXPRESSION:
        return basicSetConditional_expression(null, msgs);
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
      case MyDslPackage.LABELED_STATEMENT__IDENTIFIER:
        return getIdentifier();
      case MyDslPackage.LABELED_STATEMENT__STATEMENT:
        return getStatement();
      case MyDslPackage.LABELED_STATEMENT__CONDITIONAL_EXPRESSION:
        return getConditional_expression();
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
      case MyDslPackage.LABELED_STATEMENT__IDENTIFIER:
        setIdentifier((String)newValue);
        return;
      case MyDslPackage.LABELED_STATEMENT__STATEMENT:
        setStatement((statement)newValue);
        return;
      case MyDslPackage.LABELED_STATEMENT__CONDITIONAL_EXPRESSION:
        setConditional_expression((conditional_expression)newValue);
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
      case MyDslPackage.LABELED_STATEMENT__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case MyDslPackage.LABELED_STATEMENT__STATEMENT:
        setStatement((statement)null);
        return;
      case MyDslPackage.LABELED_STATEMENT__CONDITIONAL_EXPRESSION:
        setConditional_expression((conditional_expression)null);
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
      case MyDslPackage.LABELED_STATEMENT__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case MyDslPackage.LABELED_STATEMENT__STATEMENT:
        return statement != null;
      case MyDslPackage.LABELED_STATEMENT__CONDITIONAL_EXPRESSION:
        return conditional_expression != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(')');
    return result.toString();
  }

} //labeled_statementImpl