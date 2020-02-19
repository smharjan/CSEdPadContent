/**
 author: Lasang Tamang
 topics: Arrays
 subtopics: declaring array variables, Adding element of array, processing array
 goalDescription: This program demonstrates how to create array, intialize them and print the values of arrays
 source: Here we keep the URL if there exist any source 
 output: 0
 	 1
	 2
	 3
	 4
	 5
	 6
	 7
	 8
	 9
*/
public class BasicArrayExample3{

	public static void main(String[] args) {

		/*
		logical_step_1: Declare array variable called myNumber of type integer of size 10 
		question_1: what does the following code block do?
		answer_1: declare array variable called myNumber of type integer of size 10 
		question_2: What variables are declared?
		answer_2: The variable integer size and array myNumber are declared.
		question_3: The value of size is 10. Now, what is the size of array mynumber ?
		answer_3: The size of the array myNumber is 10.	
		*/
		int size = 10;
		/*stm_comment: declare an array variable called myNumber of 
		type integer and size 10 and allocate memory for it*/
		int[] myNumber = new int[size]; 

		/*
		logical_step_2: Assign the values from 1 to 10 to the elements of array myNumber
		question_1: What does the following code block do?
		answer_1: Assign the values from 1 to 10 to the elements of array myNumber
		question_2: What is the start and stopping codition for loop?
		answer_2: For loop starts at i = 0 and stops when i<10.
		question_3: What does the code inside for loop doing?
		answer_3: The code assigns each value of i during iteration to array myNumber at index position i
		*/
		/*stm_comment: the size of the array is given by myNumber.length which is 10*/
		for(int i = 0; i < myNumber.length; i++) { 
			/*stm_comment: the i-th element of the array myNumber which 
			is denoted by myNumber[i] is assigned the value of i*/
			myNumber[i] = i; 
		}

		/*
		logical_step_3: Display the values in the array myNumber
		question_1: What does the following code block do?
		answer_1: Display each values of the array myNumber
		question_2: Do the for loop iterates over each value of array?
		answer_2: Yes.
		question_3: Once they iterate over each value of array myNumber, what does the it do inside for loop?
		answer_3: for each value of i, it prints the value of myNumber at index position i
		*/
		/*stm_comment: Finds the length of array myNumber and the loop 
		process or iterates over each element of the array myNumber  */
		for(int i = 0; i < myNumber.length; i++) { 
			/*stm_comment: myNumber[i] accesses the value of myNumber at index  position  i*/
			System.out.println(myNumber[i]); 
		}
	}
}
