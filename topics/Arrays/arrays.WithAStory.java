/**
 author: Lasang Tamang
 topics: Arrays
 subtopics: declaring array variables, Adding element of array, processing array
 goalDescription: This program generates the numbers from 0 to 10 which represent that numbers to be printed on the t-shirts of a team of soccer which consistes of 11 players. The goalkeeper prefers number 0 which is why the numbers will be from 0 to 10 instead of 1 to 11.
 The numbers are stored together in a collection of valled called an array. This program demonstrates how to create array, intialize them and print the values of arrays
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
	 10
*/
public class BasicArrayExample3{

	public static void main(String[] args) {

		/*
		logical_step_1: Declare variables needed to store 11 numbers corresponding to 11 soccer players.
		logical_step_details: Declare a variable size which indicates the size of soccer team and thus of the array that will store these values. An array of integers to store the numbers is also declared and its size is given by the value of variable size. 
		question_1: What does the following code block do?
		answer_1: Declare variables needed to store 11 numbers corresponding to 11 soccer players.
		question_2: What variables are declared?
		answer_2: The variable integer size and array myNumber are declared.
		question_3: The value of size is 11. Now, what is the size of array mynumber ?
		answer_3: The size of the array myNumber is 11.	
		*/
		int size = 11;
		/*stm_comment: declare an array variable called myNumber of 
		type integer and size 11 and allocate memory for it*/
		int[] myNumber = new int[size]; 

		/*
		logical_step_2: Store soccer player's t-shirt numbers from 0 to 10 the array myNumber.
		logical_step_details: Each t-shirt number is stored in one element of the array myNumber. The algorithm is to iterate over each value from 0 to 10 and then storing the corresponding value in the corresponding element of the array.
		question_1: What does the following code block do?
		answer_1: Assign the values from 0 to 10 to the elements of array myNumber
		question_2: What is the start and stopping codition for loop?
		answer_2: For loop starts at i = 0 and stops when i<11.
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
		logical_step_3: Display the t-shirt numbers that were stored in the array myNumber.
		logical_step_details: The algorithm iterates using loop variable i over all values from 0 to 10 and it displays the number stored in the i-th element of the array myNumber.
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
