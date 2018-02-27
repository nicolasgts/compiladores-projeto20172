/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type qualifier list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.type_qualifier_list#getType_qualifier <em>Type qualifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.type_qualifier_list#getType_qualifier_list_linha <em>Type qualifier list linha</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettype_qualifier_list()
 * @model
 * @generated
 */
public interface type_qualifier_list extends direct_abstract_declarator_complement
{
  /**
   * Returns the value of the '<em><b>Type qualifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type qualifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type qualifier</em>' containment reference.
   * @see #setType_qualifier(type_qualifier)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettype_qualifier_list_Type_qualifier()
   * @model containment="true"
   * @generated
   */
  type_qualifier getType_qualifier();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.type_qualifier_list#getType_qualifier <em>Type qualifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type qualifier</em>' containment reference.
   * @see #getType_qualifier()
   * @generated
   */
  void setType_qualifier(type_qualifier value);

  /**
   * Returns the value of the '<em><b>Type qualifier list linha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type qualifier list linha</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type qualifier list linha</em>' containment reference.
   * @see #setType_qualifier_list_linha(type_qualifier_list_linha)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettype_qualifier_list_Type_qualifier_list_linha()
   * @model containment="true"
   * @generated
   */
  type_qualifier_list_linha getType_qualifier_list_linha();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.type_qualifier_list#getType_qualifier_list_linha <em>Type qualifier list linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type qualifier list linha</em>' containment reference.
   * @see #getType_qualifier_list_linha()
   * @generated
   */
  void setType_qualifier_list_linha(type_qualifier_list_linha value);

} // type_qualifier_list