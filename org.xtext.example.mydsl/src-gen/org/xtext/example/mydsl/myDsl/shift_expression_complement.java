/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>shift expression complement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.shift_expression_complement#getSleft <em>Sleft</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.shift_expression_complement#getAdditive_expression <em>Additive expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.shift_expression_complement#getSright <em>Sright</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getshift_expression_complement()
 * @model
 * @generated
 */
public interface shift_expression_complement extends EObject
{
  /**
   * Returns the value of the '<em><b>Sleft</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sleft</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sleft</em>' attribute.
   * @see #setSleft(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getshift_expression_complement_Sleft()
   * @model
   * @generated
   */
  String getSleft();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.shift_expression_complement#getSleft <em>Sleft</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sleft</em>' attribute.
   * @see #getSleft()
   * @generated
   */
  void setSleft(String value);

  /**
   * Returns the value of the '<em><b>Additive expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Additive expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Additive expression</em>' containment reference.
   * @see #setAdditive_expression(additive_expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getshift_expression_complement_Additive_expression()
   * @model containment="true"
   * @generated
   */
  additive_expression getAdditive_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.shift_expression_complement#getAdditive_expression <em>Additive expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Additive expression</em>' containment reference.
   * @see #getAdditive_expression()
   * @generated
   */
  void setAdditive_expression(additive_expression value);

  /**
   * Returns the value of the '<em><b>Sright</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sright</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sright</em>' attribute.
   * @see #setSright(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getshift_expression_complement_Sright()
   * @model
   * @generated
   */
  String getSright();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.shift_expression_complement#getSright <em>Sright</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sright</em>' attribute.
   * @see #getSright()
   * @generated
   */
  void setSright(String value);

} // shift_expression_complement
