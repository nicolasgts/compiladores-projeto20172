/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>generic selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.generic_selection#get_generic <em>generic</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.generic_selection#getAssignment_expression <em>Assignment expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.generic_selection#getGeneric_assoc_list <em>Generic assoc list</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getgeneric_selection()
 * @model
 * @generated
 */
public interface generic_selection extends EObject
{
  /**
   * Returns the value of the '<em><b>generic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>generic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>generic</em>' attribute.
   * @see #set_generic(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getgeneric_selection__generic()
   * @model
   * @generated
   */
  String get_generic();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.generic_selection#get_generic <em>generic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>generic</em>' attribute.
   * @see #get_generic()
   * @generated
   */
  void set_generic(String value);

  /**
   * Returns the value of the '<em><b>Assignment expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignment expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment expression</em>' containment reference.
   * @see #setAssignment_expression(assignment_expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getgeneric_selection_Assignment_expression()
   * @model containment="true"
   * @generated
   */
  assignment_expression getAssignment_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.generic_selection#getAssignment_expression <em>Assignment expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment expression</em>' containment reference.
   * @see #getAssignment_expression()
   * @generated
   */
  void setAssignment_expression(assignment_expression value);

  /**
   * Returns the value of the '<em><b>Generic assoc list</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.generic_assoc_list}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generic assoc list</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic assoc list</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getgeneric_selection_Generic_assoc_list()
   * @model containment="true"
   * @generated
   */
  EList<generic_assoc_list> getGeneric_assoc_list();

} // generic_selection
