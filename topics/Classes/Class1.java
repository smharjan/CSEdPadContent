/***
 	author: Suraj Maharjan
 	topics: Classes and Objects
 	goalDescription: This program creates two objects of Class1
 	output: Prints the value of the Integer variale x which is 5 
***/

public class Class1 {

	/*
    logical_step_1: Declare an integer variable x
    question_1: What is the value of the variable x?
    answer_1: The value of the variable x is 5
    */

	int x = 5;

	/*stm_comment: Main method */
  	public static void main(String[] args) {
  		
	  	/*
	  	logical_step_2: Create an object of Class1, we need to specify the class name, followed by the object name, and use the keyword new
    	question_2: What is the purpose of newObj1?
    	answer_2: newObj1 has a state and behavior of Class1
    	question_3: What is the purpose of newObj2?
    	answer_3: newObj2 has a state and behavior of Class1
    	*/

    	/*stm_comment: Create object newObj1 of Class1 */
	    Class1 newObj1 = new Class1();

	    /*stm_comment: Create object newObj1 of Class1 */
	    Class1 newObj2 = new Class1();

	    /*
		logical_step_3: Call a variable of Class1 and print it
		question_4: What variable newObj1 calls?
		answer_4: newObj1 calls variable x and prints 5
		question_5: What variable newObj2 calls?
		answer_5: newObj2 calls variable x and prints 5
	    */

	    /*stm_comment: newObj1 calls a variable x and prints the value of x as 5 */
	    System.out.println(newObj1.x);

	    /*stm_comment: newObj2 calls a variable x and prints the value of x as 5 */
	    System.out.println(newObj2.x);
  	}
}