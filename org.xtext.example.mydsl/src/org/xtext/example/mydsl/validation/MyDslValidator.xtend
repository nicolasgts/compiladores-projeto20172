/*
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.validation

import org.xtext.example.mydsl.myDsl.primary_expression
import org.eclipse.xtext.validation.Check
import org.xtext.example.mydsl.myDsl.type_specifier
import org.xtext.example.mydsl.myDsl.Model
import org.xtext.example.mydsl.myDsl.postfix_expression
import org.xtext.example.mydsl.myDsl.postfix_expression_complement
import org.xtext.example.mydsl.myDsl.translation_unit
import org.xtext.example.mydsl.myDsl.unary_expression
import org.xtext.example.mydsl.myDsl.cast_expression
import org.xtext.example.mydsl.myDsl.block_item_list
import org.xtext.example.mydsl.myDsl.jump_statement

import org.xtext.example.mydsl.myDsl.block_item_list_linha
import org.xtext.example.mydsl.myDsl.multiplicative_expression
import org.xtext.example.mydsl.myDsl.logical_or_expression
import org.xtext.example.mydsl.myDsl.inclusive_or_expression
import org.xtext.example.mydsl.myDsl.exclusive_or_expression
import org.xtext.example.mydsl.myDsl.and_expression
import org.xtext.example.mydsl.myDsl.logical_and_expression
import org.xtext.example.mydsl.myDsl.multiplicative_expression_linha	

import org.xtext.example.mydsl.myDsl.multiplicative_expression_complement
import org.xtext.example.mydsl.myDsl.additive_expression
import org.xtext.example.mydsl.myDsl.additive_expression_linha
import org.xtext.example.mydsl.myDsl.additive_expression_complement
import org.xtext.example.mydsl.myDsl.shift_expression
import org.xtext.example.mydsl.myDsl.shift_expression_linha
import org.xtext.example.mydsl.myDsl.shift_expression_complement
import org.xtext.example.mydsl.myDsl.relational_expression
import org.xtext.example.mydsl.myDsl.relational_expression_linha
import org.xtext.example.mydsl.myDsl.relational_expression_complement
import org.xtext.example.mydsl.myDsl.equality_expression
import org.xtext.example.mydsl.myDsl.equality_expression_linha
import org.xtext.example.mydsl.myDsl.equality_expression_complement
import org.xtext.example.mydsl.myDsl.additive_expression
import org.xtext.example.mydsl.myDsl.PostFixEmpryParams
import org.xtext.example.mydsl.myDsl.enum_specifier
import org.xtext.example.mydsl.myDsl.declaration
import org.xtext.example.mydsl.myDsl.primary_expression
import org.xtext.example.mydsl.myDsl.assignment_expression
import org.xtext.example.mydsl.myDsl.function_definition
import org.xtext.example.mydsl.myDsl.selection_statement
import org.xtext.example.mydsl.myDsl.MyDslPackage
import java.util.List
import java.util.ArrayList
import org.xtext.example.mydsl.myDsl.MyDslFactory
import org.xtext.example.mydsl.myDsl.impl.MyDslFactoryImpl
import javax.swing.text.Position.Bias

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class MyDslValidator extends AbstractMyDslValidator {
	
	public enum ExpRetType {
	  	NUMERIC,
	  	CHAR,
	  	STRING,
	  	BOOL
  	}
  	private var functions = <String, Function>newHashMap();
  	public static class Function{
  		public int param_number = 0;
  		public List<String> params_types = new ArrayList<String>();
  		public String retType;
  		public String name;
  }
  
 	@Check
	def restart(Model d){
		println("Clearing...")
		variables.clear();
		functions.clear();
	}
  
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	private var variables = <String,String>newHashMap();
	
	def checkDeclarationWithConstant(String leftType, primary_expression rightType){
		if(rightType.constant.f_constant == null && rightType.constant.enumz == null && rightType.constant.char == null){
			if(leftType == "char" || leftType == 'bool' || leftType == 'void'){
							error('Esse tipo n�o recebe valores num�ricos', 
					MyDslPackage.Literals.DECLARATION__DECLARATION_SPECIFIERS);
			}
		}else if(rightType.constant.f_constant != null){
			if(leftType == "char" || leftType == 'bool' || leftType == 'void' || leftType == "int"){
							error('Esse tipo n�o recebe valores num�ricos com ponto flutuante', 
					MyDslPackage.Literals.DECLARATION__INIT_DECLARATOR_LIST);
			}
		} else if (rightType.constant.char != null) {
			if (leftType != "char") {
				error("Esse tipo n�o recebe char", MyDslPackage.Literals.DECLARATION__INIT_DECLARATOR_LIST);
			}
		}
	}
	
	@Check
	def checkDeclarationTypes(declaration decl){
		var leftType =  decl.declaration_specifiers.get(0).type_specifier.type_name_str;
		var id = decl.init_declarator_list.get(0).init_declarator.declarator.direct_declarator.identifier;
		if(variables.containsKey(id)){
			error("Vari�vel j� declarada", null);
		}
		variables.put(id, leftType);	
		if(getExpType(decl.init_declarator_list.get(0).init_declarator.initializer.assignment_expression) != null){
		
			var expType = getExpType(
			decl.init_declarator_list.get(0).init_declarator.initializer.assignment_expression);
			if (expType == ExpRetType.NUMERIC) {
				if (leftType == "bool" || leftType == 'char') {
					error(
						"Tipos incompativeis para atribui��o",
						MyDslPackage.Literals.DECLARATION__INIT_DECLARATOR_LIST
					)
				}
			} else if (expType == ExpRetType.BOOL) {
				if (leftType != "bool") {
					error(
						"N�o � poss�vel atribuir retorno booleano para o tipo declarado",
						MyDslPackage.Literals.
							DECLARATION__INIT_DECLARATOR_LIST
					)
				}
			} 
		}
		var rightType = decl.init_declarator_list.get(0).init_declarator.initializer.assignment_expression.conditional_expression.
							logical_or_expression.logical_and_expression.inclusive_or_expression.exclusive_or_expression.
							and_expression.equality_expression.relational_expression.shift_expression.additive_expression.
							multiplicative_expression.cast_expression.unary_expression.postfix_expression.primary_expression
		if(rightType.constant != null){
			//Validar quando declara��o � com uma constant
			//int a = 3;
			checkDeclarationWithConstant(leftType, rightType);
		}else if (rightType.identifier != null && !rightType.identifier.trim.isEmpty()){
			if((variables.containsKey(rightType.identifier) || functions.containsKey(rightType.identifier)) && getExpType(decl.init_declarator_list.get(0).init_declarator.initializer.assignment_expression) == null){
				if(variables.containsKey(rightType.identifier)){
					//Se for um id...
					var varType = variables.get(rightType.identifier);
					if(varType != leftType){
						error("Tipos n�o compat�veis",
							MyDslPackage.Literals.DECLARATION__INIT_DECLARATOR_LIST
						)
					}
				}else if(functions.containsKey(rightType.identifier)){
					//Se for uma fun��o
					var retType = functions.get(rightType.identifier).retType;
					if(retType != leftType){
						error("Retorno de fun��o n�o compativel com tipo de variavel",
							MyDslPackage.Literals.DECLARATION__INIT_DECLARATOR_LIST
						)
					}
				}
				var rType = variables.get(rightType.identifier);
				if(leftType == 'enum' && rightType!='enum'){
					error("A variavel deve ser um enum",
						MyDslPackage.Literals.DECLARATION__INIT_DECLARATOR_LIST
					)
				}				
			}else{
			}
			//Validar quando � declara��o que inicia com um id
			// int a = b;
		}else if (rightType.expression != null){
			//Validar quando � declara��o com uma express�o
			//int a = b+c;
		}

	}
	def static getExpType(assignment_expression exp){
		var current = exp.conditional_expression;
		if(current.conditional_expression_linha != null){
			return ExpRetType.BOOL;
		}
		var current2 = current.logical_or_expression;
		if(current2.logical_or_expression_linha != null){
			return ExpRetType.BOOL;
		}
		var current3 = current2.logical_and_expression;
		if(current3.logical_and_expression_linha != null){
			return ExpRetType.BOOL;
		}
		var current4 = current3.inclusive_or_expression;
		if(current4.inclusive_or_expression_linha != null){
			return ExpRetType.BOOL;
		}
		var current5 = current4.exclusive_or_expression;
		if(current5.exclusive_or_expression_linha != null){
			return ExpRetType.BOOL;
		}
		var current6 = current5.and_expression;
		if(current6.and_expression_linha != null){
			return ExpRetType.BOOL;
		}
		var current7 = current6.equality_expression;
		if(current7.equality_expression_linha != null){
			return ExpRetType.BOOL;
		}
		var current8 = current7.relational_expression;
		if(current8.relational_expression_linha != null){
			return ExpRetType.BOOL;
		}
		var current9 = current8.shift_expression;
		if(current9.shift_expression_linha != null){
			return ExpRetType.NUMERIC;
		}
		var current10 = current9.additive_expression;
		if(current10.additive_expression_linha != null){
			println("MAIS1: " + current10.additive_expression_linha.additive_expression_complement.mais);
			println("MENOS1: " + current10.additive_expression_linha.additive_expression_complement.menos);
			return ExpRetType.NUMERIC;
		}
		var curent11 = current10.multiplicative_expression;
		if(curent11.multiplicative_expression_linha != null){
			return ExpRetType.NUMERIC;
		}
		return null;		
	}
}
