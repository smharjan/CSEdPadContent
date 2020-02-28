/**
author(Jeevan Chapagain)
topic(Primitive Data Types )
title(Primitive2.java)
goalDescrption(JAVA program to illustrate use of primitive data types)
 @source (https://www.programiz.com/java-programming/variables-primitive-data-types)

output 55
	  Q
	   -44.5.
 
**/

	public class Primitive {
		public static void main(String[] args) {
			/*
			logical_step_1: Decalaring primitive data type.
			question_1: what are the data types used in this code?
			answer_1: int, char and double are the data types used here.
			*/

			 int phone = 55; 
			 /*stm_comment:  int data type is declared using int keyword which can have values from -2^31 to 2^31-1 */



			 char grade = '\u0051';
			 /*stm_comment:  character data type is declared using char keyword.It's a 16-bit Unicode character. In unicode 
			 \u0051 means Q.*/
	 



			 double number = -44.5; 
			 /*stm_comment:  double data type is declared using double keyword which 
			 is a double-precision 64-bit floating point. It should never be used for precise values such as currency.*/


			System.out.println(phone);
			/*stm_comment: printing out the result of int data type. */



			System.out.println(grade);


			System.out.println(number);
		}
	}


