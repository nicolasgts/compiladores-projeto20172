/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>translation unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>translation unit</em>'.
   * @generated
   */
  translation_unit createtranslation_unit();

  /**
   * Returns a new object of class '<em>external declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>external declaration</em>'.
   * @generated
   */
  external_declaration createexternal_declaration();

  /**
   * Returns a new object of class '<em>declaration specifiers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>declaration specifiers</em>'.
   * @generated
   */
  declaration_specifiers createdeclaration_specifiers();

  /**
   * Returns a new object of class '<em>alignment specifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>alignment specifier</em>'.
   * @generated
   */
  alignment_specifier createalignment_specifier();

  /**
   * Returns a new object of class '<em>type qualifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>type qualifier</em>'.
   * @generated
   */
  type_qualifier createtype_qualifier();

  /**
   * Returns a new object of class '<em>type specifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>type specifier</em>'.
   * @generated
   */
  type_specifier createtype_specifier();

  /**
   * Returns a new object of class '<em>enum specifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>enum specifier</em>'.
   * @generated
   */
  enum_specifier createenum_specifier();

  /**
   * Returns a new object of class '<em>enumerator list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>enumerator list</em>'.
   * @generated
   */
  enumerator_list createenumerator_list();

  /**
   * Returns a new object of class '<em>enumerator list linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>enumerator list linha</em>'.
   * @generated
   */
  enumerator_list_linha createenumerator_list_linha();

  /**
   * Returns a new object of class '<em>enumerator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>enumerator</em>'.
   * @generated
   */
  enumerator createenumerator();

  /**
   * Returns a new object of class '<em>atomic type specifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>atomic type specifier</em>'.
   * @generated
   */
  atomic_type_specifier createatomic_type_specifier();

  /**
   * Returns a new object of class '<em>struct or union specifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>struct or union specifier</em>'.
   * @generated
   */
  struct_or_union_specifier createstruct_or_union_specifier();

  /**
   * Returns a new object of class '<em>struct or union specifier complement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>struct or union specifier complement</em>'.
   * @generated
   */
  struct_or_union_specifier_complement createstruct_or_union_specifier_complement();

  /**
   * Returns a new object of class '<em>struct declaration list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>struct declaration list</em>'.
   * @generated
   */
  struct_declaration_list createstruct_declaration_list();

  /**
   * Returns a new object of class '<em>struct declaration list linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>struct declaration list linha</em>'.
   * @generated
   */
  struct_declaration_list_linha createstruct_declaration_list_linha();

  /**
   * Returns a new object of class '<em>struct declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>struct declaration</em>'.
   * @generated
   */
  struct_declaration createstruct_declaration();

  /**
   * Returns a new object of class '<em>struct declarator list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>struct declarator list</em>'.
   * @generated
   */
  struct_declarator_list createstruct_declarator_list();

  /**
   * Returns a new object of class '<em>struct declarator list linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>struct declarator list linha</em>'.
   * @generated
   */
  struct_declarator_list_linha createstruct_declarator_list_linha();

  /**
   * Returns a new object of class '<em>struct declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>struct declarator</em>'.
   * @generated
   */
  struct_declarator createstruct_declarator();

  /**
   * Returns a new object of class '<em>specifier qualifier list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>specifier qualifier list</em>'.
   * @generated
   */
  specifier_qualifier_list createspecifier_qualifier_list();

  /**
   * Returns a new object of class '<em>declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>declaration</em>'.
   * @generated
   */
  declaration createdeclaration();

  /**
   * Returns a new object of class '<em>function definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>function definition</em>'.
   * @generated
   */
  function_definition createfunction_definition();

  /**
   * Returns a new object of class '<em>declaration list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>declaration list</em>'.
   * @generated
   */
  declaration_list createdeclaration_list();

  /**
   * Returns a new object of class '<em>declaration list linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>declaration list linha</em>'.
   * @generated
   */
  declaration_list_linha createdeclaration_list_linha();

  /**
   * Returns a new object of class '<em>declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>declarator</em>'.
   * @generated
   */
  declarator createdeclarator();

  /**
   * Returns a new object of class '<em>pointer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>pointer</em>'.
   * @generated
   */
  pointer createpointer();

  /**
   * Returns a new object of class '<em>type qualifier list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>type qualifier list</em>'.
   * @generated
   */
  type_qualifier_list createtype_qualifier_list();

  /**
   * Returns a new object of class '<em>type qualifier list linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>type qualifier list linha</em>'.
   * @generated
   */
  type_qualifier_list_linha createtype_qualifier_list_linha();

  /**
   * Returns a new object of class '<em>direct declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>direct declarator</em>'.
   * @generated
   */
  direct_declarator createdirect_declarator();

  /**
   * Returns a new object of class '<em>direct declarator linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>direct declarator linha</em>'.
   * @generated
   */
  direct_declarator_linha createdirect_declarator_linha();

  /**
   * Returns a new object of class '<em>direct declarator complemento</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>direct declarator complemento</em>'.
   * @generated
   */
  direct_declarator_complemento createdirect_declarator_complemento();

  /**
   * Returns a new object of class '<em>parameter type list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>parameter type list</em>'.
   * @generated
   */
  parameter_type_list createparameter_type_list();

  /**
   * Returns a new object of class '<em>parameter lista</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>parameter lista</em>'.
   * @generated
   */
  parameter_lista createparameter_lista();

  /**
   * Returns a new object of class '<em>parameter list linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>parameter list linha</em>'.
   * @generated
   */
  parameter_list_linha createparameter_list_linha();

  /**
   * Returns a new object of class '<em>parameter declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>parameter declaration</em>'.
   * @generated
   */
  parameter_declaration createparameter_declaration();

  /**
   * Returns a new object of class '<em>abstract declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>abstract declarator</em>'.
   * @generated
   */
  abstract_declarator createabstract_declarator();

  /**
   * Returns a new object of class '<em>direct abstract declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>direct abstract declarator</em>'.
   * @generated
   */
  direct_abstract_declarator createdirect_abstract_declarator();

  /**
   * Returns a new object of class '<em>initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>initializer</em>'.
   * @generated
   */
  initializer createinitializer();

  /**
   * Returns a new object of class '<em>direct abstract declarator linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>direct abstract declarator linha</em>'.
   * @generated
   */
  direct_abstract_declarator_linha createdirect_abstract_declarator_linha();

  /**
   * Returns a new object of class '<em>direct abstract declarator complement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>direct abstract declarator complement</em>'.
   * @generated
   */
  direct_abstract_declarator_complement createdirect_abstract_declarator_complement();

  /**
   * Returns a new object of class '<em>identifier list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>identifier list</em>'.
   * @generated
   */
  identifier_list createidentifier_list();

  /**
   * Returns a new object of class '<em>identifier list linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>identifier list linha</em>'.
   * @generated
   */
  identifier_list_linha createidentifier_list_linha();

  /**
   * Returns a new object of class '<em>translation unit linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>translation unit linha</em>'.
   * @generated
   */
  translation_unit_linha createtranslation_unit_linha();

  /**
   * Returns a new object of class '<em>primary expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>primary expression</em>'.
   * @generated
   */
  primary_expression createprimary_expression();

  /**
   * Returns a new object of class '<em>enumeration constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>enumeration constant</em>'.
   * @generated
   */
  enumeration_constant createenumeration_constant();

  /**
   * Returns a new object of class '<em>generic selection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>generic selection</em>'.
   * @generated
   */
  generic_selection creategeneric_selection();

  /**
   * Returns a new object of class '<em>generic assoc list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>generic assoc list</em>'.
   * @generated
   */
  generic_assoc_list creategeneric_assoc_list();

  /**
   * Returns a new object of class '<em>generic assoc list linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>generic assoc list linha</em>'.
   * @generated
   */
  generic_assoc_list_linha creategeneric_assoc_list_linha();

  /**
   * Returns a new object of class '<em>generic association</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>generic association</em>'.
   * @generated
   */
  generic_association creategeneric_association();

  /**
   * Returns a new object of class '<em>postfix expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>postfix expression</em>'.
   * @generated
   */
  postfix_expression createpostfix_expression();

  /**
   * Returns a new object of class '<em>postfix expression linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>postfix expression linha</em>'.
   * @generated
   */
  postfix_expression_linha createpostfix_expression_linha();

  /**
   * Returns a new object of class '<em>initializer list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>initializer list</em>'.
   * @generated
   */
  initializer_list createinitializer_list();

  /**
   * Returns a new object of class '<em>initializer list linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>initializer list linha</em>'.
   * @generated
   */
  initializer_list_linha createinitializer_list_linha();

  /**
   * Returns a new object of class '<em>initializer list complement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>initializer list complement</em>'.
   * @generated
   */
  initializer_list_complement createinitializer_list_complement();

  /**
   * Returns a new object of class '<em>designation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>designation</em>'.
   * @generated
   */
  designation createdesignation();

  /**
   * Returns a new object of class '<em>designator list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>designator list</em>'.
   * @generated
   */
  designator_list createdesignator_list();

  /**
   * Returns a new object of class '<em>designator list linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>designator list linha</em>'.
   * @generated
   */
  designator_list_linha createdesignator_list_linha();

  /**
   * Returns a new object of class '<em>designator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>designator</em>'.
   * @generated
   */
  designator createdesignator();

  /**
   * Returns a new object of class '<em>static assert declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>static assert declaration</em>'.
   * @generated
   */
  static_assert_declaration createstatic_assert_declaration();

  /**
   * Returns a new object of class '<em>postfix expression complement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>postfix expression complement</em>'.
   * @generated
   */
  postfix_expression_complement createpostfix_expression_complement();

  /**
   * Returns a new object of class '<em>argument expression list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>argument expression list</em>'.
   * @generated
   */
  argument_expression_list createargument_expression_list();

  /**
   * Returns a new object of class '<em>argument expression list linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>argument expression list linha</em>'.
   * @generated
   */
  argument_expression_list_linha createargument_expression_list_linha();

  /**
   * Returns a new object of class '<em>unary expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>unary expression</em>'.
   * @generated
   */
  unary_expression createunary_expression();

  /**
   * Returns a new object of class '<em>cast expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>cast expression</em>'.
   * @generated
   */
  cast_expression createcast_expression();

  /**
   * Returns a new object of class '<em>multiplicative expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>multiplicative expression</em>'.
   * @generated
   */
  multiplicative_expression createmultiplicative_expression();

  /**
   * Returns a new object of class '<em>multiplicative expression linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>multiplicative expression linha</em>'.
   * @generated
   */
  multiplicative_expression_linha createmultiplicative_expression_linha();

  /**
   * Returns a new object of class '<em>multiplicative expression complement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>multiplicative expression complement</em>'.
   * @generated
   */
  multiplicative_expression_complement createmultiplicative_expression_complement();

  /**
   * Returns a new object of class '<em>additive expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>additive expression</em>'.
   * @generated
   */
  additive_expression createadditive_expression();

  /**
   * Returns a new object of class '<em>additive expression linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>additive expression linha</em>'.
   * @generated
   */
  additive_expression_linha createadditive_expression_linha();

  /**
   * Returns a new object of class '<em>additive expression complement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>additive expression complement</em>'.
   * @generated
   */
  additive_expression_complement createadditive_expression_complement();

  /**
   * Returns a new object of class '<em>shift expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>shift expression</em>'.
   * @generated
   */
  shift_expression createshift_expression();

  /**
   * Returns a new object of class '<em>shift expression linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>shift expression linha</em>'.
   * @generated
   */
  shift_expression_linha createshift_expression_linha();

  /**
   * Returns a new object of class '<em>shift expression complement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>shift expression complement</em>'.
   * @generated
   */
  shift_expression_complement createshift_expression_complement();

  /**
   * Returns a new object of class '<em>relational expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>relational expression</em>'.
   * @generated
   */
  relational_expression createrelational_expression();

  /**
   * Returns a new object of class '<em>relational expression linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>relational expression linha</em>'.
   * @generated
   */
  relational_expression_linha createrelational_expression_linha();

  /**
   * Returns a new object of class '<em>relational expression complement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>relational expression complement</em>'.
   * @generated
   */
  relational_expression_complement createrelational_expression_complement();

  /**
   * Returns a new object of class '<em>equality expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>equality expression</em>'.
   * @generated
   */
  equality_expression createequality_expression();

  /**
   * Returns a new object of class '<em>equality expression linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>equality expression linha</em>'.
   * @generated
   */
  equality_expression_linha createequality_expression_linha();

  /**
   * Returns a new object of class '<em>equality expression complement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>equality expression complement</em>'.
   * @generated
   */
  equality_expression_complement createequality_expression_complement();

  /**
   * Returns a new object of class '<em>statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>statement</em>'.
   * @generated
   */
  statement createstatement();

  /**
   * Returns a new object of class '<em>jump statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>jump statement</em>'.
   * @generated
   */
  jump_statement createjump_statement();

  /**
   * Returns a new object of class '<em>iteration statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>iteration statement</em>'.
   * @generated
   */
  iteration_statement createiteration_statement();

  /**
   * Returns a new object of class '<em>selection statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>selection statement</em>'.
   * @generated
   */
  selection_statement createselection_statement();

  /**
   * Returns a new object of class '<em>labeled statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>labeled statement</em>'.
   * @generated
   */
  labeled_statement createlabeled_statement();

  /**
   * Returns a new object of class '<em>compound statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>compound statement</em>'.
   * @generated
   */
  compound_statement createcompound_statement();

  /**
   * Returns a new object of class '<em>block item list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>block item list</em>'.
   * @generated
   */
  block_item_list createblock_item_list();

  /**
   * Returns a new object of class '<em>block item list linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>block item list linha</em>'.
   * @generated
   */
  block_item_list_linha createblock_item_list_linha();

  /**
   * Returns a new object of class '<em>block item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>block item</em>'.
   * @generated
   */
  block_item createblock_item();

  /**
   * Returns a new object of class '<em>expression statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expression statement</em>'.
   * @generated
   */
  expression_statement createexpression_statement();

  /**
   * Returns a new object of class '<em>and expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>and expression</em>'.
   * @generated
   */
  and_expression createand_expression();

  /**
   * Returns a new object of class '<em>and expression linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>and expression linha</em>'.
   * @generated
   */
  and_expression_linha createand_expression_linha();

  /**
   * Returns a new object of class '<em>exclusive or expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>exclusive or expression</em>'.
   * @generated
   */
  exclusive_or_expression createexclusive_or_expression();

  /**
   * Returns a new object of class '<em>exclusive or expression linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>exclusive or expression linha</em>'.
   * @generated
   */
  exclusive_or_expression_linha createexclusive_or_expression_linha();

  /**
   * Returns a new object of class '<em>inclusive or expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>inclusive or expression</em>'.
   * @generated
   */
  inclusive_or_expression createinclusive_or_expression();

  /**
   * Returns a new object of class '<em>inclusive or expression linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>inclusive or expression linha</em>'.
   * @generated
   */
  inclusive_or_expression_linha createinclusive_or_expression_linha();

  /**
   * Returns a new object of class '<em>logical and expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>logical and expression</em>'.
   * @generated
   */
  logical_and_expression createlogical_and_expression();

  /**
   * Returns a new object of class '<em>logical and expression linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>logical and expression linha</em>'.
   * @generated
   */
  logical_and_expression_linha createlogical_and_expression_linha();

  /**
   * Returns a new object of class '<em>logical or expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>logical or expression</em>'.
   * @generated
   */
  logical_or_expression createlogical_or_expression();

  /**
   * Returns a new object of class '<em>logical or expression linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>logical or expression linha</em>'.
   * @generated
   */
  logical_or_expression_linha createlogical_or_expression_linha();

  /**
   * Returns a new object of class '<em>conditional expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>conditional expression</em>'.
   * @generated
   */
  conditional_expression createconditional_expression();

  /**
   * Returns a new object of class '<em>conditional expression linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>conditional expression linha</em>'.
   * @generated
   */
  conditional_expression_linha createconditional_expression_linha();

  /**
   * Returns a new object of class '<em>assignment expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>assignment expression</em>'.
   * @generated
   */
  assignment_expression createassignment_expression();

  /**
   * Returns a new object of class '<em>type name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>type name</em>'.
   * @generated
   */
  type_name createtype_name();

  /**
   * Returns a new object of class '<em>expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expression</em>'.
   * @generated
   */
  expression createexpression();

  /**
   * Returns a new object of class '<em>expression linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expression linha</em>'.
   * @generated
   */
  expression_linha createexpression_linha();

  /**
   * Returns a new object of class '<em>constant expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>constant expression</em>'.
   * @generated
   */
  constant_expression createconstant_expression();

  /**
   * Returns a new object of class '<em>init declarator list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>init declarator list</em>'.
   * @generated
   */
  init_declarator_list createinit_declarator_list();

  /**
   * Returns a new object of class '<em>init declarator list linha</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>init declarator list linha</em>'.
   * @generated
   */
  init_declarator_list_linha createinit_declarator_list_linha();

  /**
   * Returns a new object of class '<em>init declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>init declarator</em>'.
   * @generated
   */
  init_declarator createinit_declarator();

  /**
   * Returns a new object of class '<em>string dsl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>string dsl</em>'.
   * @generated
   */
  string_dsl createstring_dsl();

  /**
   * Returns a new object of class '<em>constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>constant</em>'.
   * @generated
   */
  constant createconstant();

  /**
   * Returns a new object of class '<em>Enumerator List Linha Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumerator List Linha Action</em>'.
   * @generated
   */
  EnumeratorListLinhaAction createEnumeratorListLinhaAction();

  /**
   * Returns a new object of class '<em>Struct Or Union Specifier Complement Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Or Union Specifier Complement Action</em>'.
   * @generated
   */
  StructOrUnionSpecifierComplementAction createStructOrUnionSpecifierComplementAction();

  /**
   * Returns a new object of class '<em>Struct Declaration List Linha Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Declaration List Linha Action</em>'.
   * @generated
   */
  StructDeclarationListLinhaAction createStructDeclarationListLinhaAction();

  /**
   * Returns a new object of class '<em>Struct Declarator List Linha Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Declarator List Linha Action</em>'.
   * @generated
   */
  StructDeclaratorListLinhaAction createStructDeclaratorListLinhaAction();

  /**
   * Returns a new object of class '<em>Declaration List Linha Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaration List Linha Action</em>'.
   * @generated
   */
  DeclarationListLinhaAction createDeclarationListLinhaAction();

  /**
   * Returns a new object of class '<em>Type Qualifier List Linha Ation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Qualifier List Linha Ation</em>'.
   * @generated
   */
  TypeQualifierListLinhaAtion createTypeQualifierListLinhaAtion();

  /**
   * Returns a new object of class '<em>Direct Abstract Declarrator Linha Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Direct Abstract Declarrator Linha Action</em>'.
   * @generated
   */
  DirectAbstractDeclarratorLinhaAction createDirectAbstractDeclarratorLinhaAction();

  /**
   * Returns a new object of class '<em>Identifier List Linha Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Identifier List Linha Action</em>'.
   * @generated
   */
  IdentifierListLinhaAction createIdentifierListLinhaAction();

  /**
   * Returns a new object of class '<em>Tranlation Unit Linha Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tranlation Unit Linha Action</em>'.
   * @generated
   */
  TranlationUnitLinhaAction createTranlationUnitLinhaAction();

  /**
   * Returns a new object of class '<em>Generic Assoc List Linha Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic Assoc List Linha Action</em>'.
   * @generated
   */
  GenericAssocListLinhaAction createGenericAssocListLinhaAction();

  /**
   * Returns a new object of class '<em>Postfix Expression Linha Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Postfix Expression Linha Action</em>'.
   * @generated
   */
  PostfixExpressionLinhaAction createPostfixExpressionLinhaAction();

  /**
   * Returns a new object of class '<em>Initializer List Linha Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Initializer List Linha Action</em>'.
   * @generated
   */
  InitializerListLinhaAction createInitializerListLinhaAction();

  /**
   * Returns a new object of class '<em>Designator List Linha Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Designator List Linha Action</em>'.
   * @generated
   */
  DesignatorListLinhaAction createDesignatorListLinhaAction();

  /**
   * Returns a new object of class '<em>Post Fix Empry Params</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Post Fix Empry Params</em>'.
   * @generated
   */
  PostFixEmpryParams createPostFixEmpryParams();

  /**
   * Returns a new object of class '<em>Argument Expression List Linha Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument Expression List Linha Action</em>'.
   * @generated
   */
  ArgumentExpressionListLinhaAction createArgumentExpressionListLinhaAction();

  /**
   * Returns a new object of class '<em>Plus Plus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus Plus</em>'.
   * @generated
   */
  PlusPlus createPlusPlus();

  /**
   * Returns a new object of class '<em>Init Decclarator List Linha Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Init Decclarator List Linha Action</em>'.
   * @generated
   */
  InitDecclaratorListLinhaAction createInitDecclaratorListLinhaAction();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory
