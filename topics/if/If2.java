/***
author:Jeevan Chapagain
topic:If Statement
title:If2.java
goalDescrption: To check whether the given number is even. 
output: Num_1 is even.
***/

public class Even{
	public static void main(String[] args){

		/*
	logical_step_1: Decalare variable needed to store number to check it is even.
	logical_step_details: Declare variables num_1 of integer data types.
	question_1: What does the following code block do?
	answer_1: Declares variable needed to store number to check whether it is even.
	question_2: What variables are declared?
	answer_2: Variable num_1 is declared.

	*/

		int num_1 = 24;
		/* stm_comment: declare and integer type variable called num_1 to store the number */

	/*
	logical_step_2: Find the remainder of the variable to check whether it is even or not.
	logical_step_details: Check the remainder of the variable num_1  is zero or not when divided by 2 to find out it is even or not and print out 
	the result.
	question_1: What does the following code block do?
	answer_1: Check the remainder of the variable is zero or not when divided by 2
	question_2: How do you check whether the number is even or not?
	answer_2: If the number has remainder 0 when divide by 2 then it is even.
	 */

		if ( num_1 % 2 == 0 ){
		/*stm_comment: check whether the remainder of the num_1 is zero or not when divided by 2 using the modulous operation. */

			System.out.println("Num_1 is even")
		/*stm_comment: print out the result the operation.*/
	}
}