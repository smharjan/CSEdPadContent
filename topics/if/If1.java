/***
author:Jeevan Chapagain
topic:If Statement
title:If1.java
goalDescrption: To check which number is greater using the if statement. 
output: Num_1 is greater than Num_2
***/



public class Compare{
	public static void main(String[] args){

	/*
	logical_step_1: Decalare variables needed to store numbers for comparison.
	logical_step_details: Declare variables num_1 and num_2 of integer data type.
	question_1: What does the following code block do?
	answer_1: Declares variable needed to store two different numbers for the comparison.
	question_2: What variables are declared?
	answer_2: Variable num_1 and num_2 are declared.

	*/

		int num_1 = 17;
		/* stm_comment: declare and integer type variable called num_1 to store the first number */

		int num_2 = 11;
		/* stm_comment: declare and integer type variable called num_1 to store the first number */



	/*
	logical_step_2: Compare two variables using the if statement.
	logical_step_details: Compare the previously created two variables using the if operation to check which one is greater.
	question_1: What does the following code block do?
	answer_1: It compares variable num_1 with num_2 using the if statement and prints out what is the comparison.
	question_2: How do you compare the above two variables?
	answer_2: Two variables can be compared using if statement as if num_1 > num_2.
	 */

		if ( num_1 > num_2){
		/*stm_comment: compare variable num_1 with num_2 using the if statement*/

			System.out.println("Num_1 is greater then Num_2")
		/*stm_comment: print out the result of the comparison.*/
		}

	}
}