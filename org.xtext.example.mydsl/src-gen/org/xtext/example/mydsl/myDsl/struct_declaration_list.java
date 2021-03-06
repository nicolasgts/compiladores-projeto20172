/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>struct declaration list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.struct_declaration_list#getStruct_declaration <em>Struct declaration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.struct_declaration_list#getStruct_declaration_list_linha <em>Struct declaration list linha</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getstruct_declaration_list()
 * @model
 * @generated
 */
public interface struct_declaration_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Struct declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct declaration</em>' containment reference.
   * @see #setStruct_declaration(struct_declaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getstruct_declaration_list_Struct_declaration()
   * @model containment="true"
   * @generated
   */
  struct_declaration getStruct_declaration();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.struct_declaration_list#getStruct_declaration <em>Struct declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct declaration</em>' containment reference.
   * @see #getStruct_declaration()
   * @generated
   */
  void setStruct_declaration(struct_declaration value);

  /**
   * Returns the value of the '<em><b>Struct declaration list linha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct declaration list linha</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct declaration list linha</em>' containment reference.
   * @see #setStruct_declaration_list_linha(struct_declaration_list_linha)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getstruct_declaration_list_Struct_declaration_list_linha()
   * @model containment="true"
   * @generated
   */
  struct_declaration_list_linha getStruct_declaration_list_linha();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.struct_declaration_list#getStruct_declaration_list_linha <em>Struct declaration list linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct declaration list linha</em>' containment reference.
   * @see #getStruct_declaration_list_linha()
   * @generated
   */
  void setStruct_declaration_list_linha(struct_declaration_list_linha value);

} // struct_declaration_list
