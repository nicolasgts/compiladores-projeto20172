/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>enumerator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.enumerator#getEnumeration_constant <em>Enumeration constant</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.enumerator#getConditional_expression <em>Conditional expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getenumerator()
 * @model
 * @generated
 */
public interface enumerator extends EObject
{
  /**
   * Returns the value of the '<em><b>Enumeration constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumeration constant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumeration constant</em>' containment reference.
   * @see #setEnumeration_constant(enumeration_constant)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getenumerator_Enumeration_constant()
   * @model containment="true"
   * @generated
   */
  enumeration_constant getEnumeration_constant();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.enumerator#getEnumeration_constant <em>Enumeration constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumeration constant</em>' containment reference.
   * @see #getEnumeration_constant()
   * @generated
   */
  void setEnumeration_constant(enumeration_constant value);

  /**
   * Returns the value of the '<em><b>Conditional expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditional expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditional expression</em>' containment reference.
   * @see #setConditional_expression(constant_expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getenumerator_Conditional_expression()
   * @model containment="true"
   * @generated
   */
  constant_expression getConditional_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.enumerator#getConditional_expression <em>Conditional expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditional expression</em>' containment reference.
   * @see #getConditional_expression()
   * @generated
   */
  void setConditional_expression(constant_expression value);

} // enumerator
