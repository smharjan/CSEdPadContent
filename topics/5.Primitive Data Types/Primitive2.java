/**
author(Jeevan Chapagain)
topic(Primitive Data Types )
title(Primitive2.java)
goalDescrption(JAVA program to illustrate use of primitive data types)
 @source (https://www.w3schools.com/java/java_data_types.asp)

output false
	   3.14
	   I love playing.
 
*/


public class BooleanDemo {
	public static void main(String[] args) {
		/*
		logical_step_1: Decalaring primitive data type.
		question_1: what are the data types used in this code?
		answer_1: boolean, float and String are the data types used here.
		*/

		 boolean isGood = false; 
		 /*stm_comment:  boolena data type is declared using boolean keyword which only takes value of true or false*/



		 float num = 3.14f;
		 /*stm_comment:  float data type is declared using float keyword where value should end with 'f' and this data type can store fractional
		 number*/
 



		 String myString = "I love playing."; 
		 /*stm_comment:  string data type is declared using string keyword which stores a sequence of characters and must be surrounded by
		 double quotes.*/


		System.out.println(isGood);
		/*stm_comment: printing out the result of boolean data type. */



		System.out.println(num);


		System.out.println(myString);
	}
}


