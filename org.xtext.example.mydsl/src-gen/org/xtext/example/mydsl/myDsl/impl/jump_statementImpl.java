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
import org.xtext.example.mydsl.myDsl.expression;
import org.xtext.example.mydsl.myDsl.jump_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>jump statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.jump_statementImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.jump_statementImpl#getBreak <em>Break</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.jump_statementImpl#getReturn_vazio <em>Return vazio</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.jump_statementImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.jump_statementImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class jump_statementImpl extends MinimalEObjectImpl.Container implements jump_statement
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
   * The default value of the '{@link #getBreak() <em>Break</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBreak()
   * @generated
   * @ordered
   */
  protected static final String BREAK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBreak() <em>Break</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBreak()
   * @generated
   * @ordered
   */
  protected String break_ = BREAK_EDEFAULT;

  /**
   * The default value of the '{@link #getReturn_vazio() <em>Return vazio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturn_vazio()
   * @generated
   * @ordered
   */
  protected static final String RETURN_VAZIO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReturn_vazio() <em>Return vazio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturn_vazio()
   * @generated
   * @ordered
   */
  protected String return_vazio = RETURN_VAZIO_EDEFAULT;

  /**
   * The default value of the '{@link #getReturn() <em>Return</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturn()
   * @generated
   * @ordered
   */
  protected static final String RETURN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReturn() <em>Return</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturn()
   * @generated
   * @ordered
   */
  protected String return_ = RETURN_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected expression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected jump_statementImpl()
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
    return MyDslPackage.Literals.JUMP_STATEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.JUMP_STATEMENT__IDENTIFIER, oldIdentifier, identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBreak()
  {
    return break_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBreak(String newBreak)
  {
    String oldBreak = break_;
    break_ = newBreak;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.JUMP_STATEMENT__BREAK, oldBreak, break_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReturn_vazio()
  {
    return return_vazio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturn_vazio(String newReturn_vazio)
  {
    String oldReturn_vazio = return_vazio;
    return_vazio = newReturn_vazio;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.JUMP_STATEMENT__RETURN_VAZIO, oldReturn_vazio, return_vazio));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReturn()
  {
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturn(String newReturn)
  {
    String oldReturn = return_;
    return_ = newReturn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.JUMP_STATEMENT__RETURN, oldReturn, return_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(expression newExpression, NotificationChain msgs)
  {
    expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.JUMP_STATEMENT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.JUMP_STATEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.JUMP_STATEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.JUMP_STATEMENT__EXPRESSION, newExpression, newExpression));
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
      case MyDslPackage.JUMP_STATEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case MyDslPackage.JUMP_STATEMENT__IDENTIFIER:
        return getIdentifier();
      case MyDslPackage.JUMP_STATEMENT__BREAK:
        return getBreak();
      case MyDslPackage.JUMP_STATEMENT__RETURN_VAZIO:
        return getReturn_vazio();
      case MyDslPackage.JUMP_STATEMENT__RETURN:
        return getReturn();
      case MyDslPackage.JUMP_STATEMENT__EXPRESSION:
        return getExpression();
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
      case MyDslPackage.JUMP_STATEMENT__IDENTIFIER:
        setIdentifier((String)newValue);
        return;
      case MyDslPackage.JUMP_STATEMENT__BREAK:
        setBreak((String)newValue);
        return;
      case MyDslPackage.JUMP_STATEMENT__RETURN_VAZIO:
        setReturn_vazio((String)newValue);
        return;
      case MyDslPackage.JUMP_STATEMENT__RETURN:
        setReturn((String)newValue);
        return;
      case MyDslPackage.JUMP_STATEMENT__EXPRESSION:
        setExpression((expression)newValue);
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
      case MyDslPackage.JUMP_STATEMENT__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case MyDslPackage.JUMP_STATEMENT__BREAK:
        setBreak(BREAK_EDEFAULT);
        return;
      case MyDslPackage.JUMP_STATEMENT__RETURN_VAZIO:
        setReturn_vazio(RETURN_VAZIO_EDEFAULT);
        return;
      case MyDslPackage.JUMP_STATEMENT__RETURN:
        setReturn(RETURN_EDEFAULT);
        return;
      case MyDslPackage.JUMP_STATEMENT__EXPRESSION:
        setExpression((expression)null);
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
      case MyDslPackage.JUMP_STATEMENT__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case MyDslPackage.JUMP_STATEMENT__BREAK:
        return BREAK_EDEFAULT == null ? break_ != null : !BREAK_EDEFAULT.equals(break_);
      case MyDslPackage.JUMP_STATEMENT__RETURN_VAZIO:
        return RETURN_VAZIO_EDEFAULT == null ? return_vazio != null : !RETURN_VAZIO_EDEFAULT.equals(return_vazio);
      case MyDslPackage.JUMP_STATEMENT__RETURN:
        return RETURN_EDEFAULT == null ? return_ != null : !RETURN_EDEFAULT.equals(return_);
      case MyDslPackage.JUMP_STATEMENT__EXPRESSION:
        return expression != null;
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
    result.append(", break: ");
    result.append(break_);
    result.append(", return_vazio: ");
    result.append(return_vazio);
    result.append(", return: ");
    result.append(return_);
    result.append(')');
    return result.toString();
  }

} //jump_statementImpl
