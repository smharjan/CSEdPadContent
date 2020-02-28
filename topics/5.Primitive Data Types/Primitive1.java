/**
author(Jeevan Chapagain)
topic(Primitive Data Types )
title(Primitive1.java)
goalDescrption(JAVA program to illustrate use of primitive data types)
 @source (https://www.w3schools.com/java/java_data_types.asp)

output 34
	   100
	   15000000000
 
*/

public class ByteDemo {

	public static void main(String[] args) {

		/*
		logical_step_1: Decalaring primitive data type.
		question_1: what are the data types used in this code?
		answer_1: byte, short and float are the data types used here.
		*/

		byte num = 34;  
		/*stm_comment:  byte data type is declared using byte keyword which can store whole number from -127 to 127*/

		short maxNum = 1000;  
		/*stm_comment:  short data type is declared using short  keyword which can store whole number from -32768 to 32767*/


		long myNum  = 15000000000L; 
		/*stm_comment:  long data type is declared using long keyword  and you should end your value with L. Used when int can not store value.
		*/


		System.out.println(num);
		/*stm_comment: printing out the result of byte data type. */

    	System.out.println(maxNum);

    	System.out.println(myNum);

	}
}
 

	

 
 



	

