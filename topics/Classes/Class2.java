/***
 	author: Suraj Maharjan
 	topics: Classes and Objects
 	goalDescription: This program calls a static and public method from Class2
 	output: Prints "Static methods can be called without creating objects" and "Public methods must be called by creating objects" 
***/

public class Class2 {

	/*
    logical_step_1: Create static and public method
    logical_step_details: Creating two type of methods that are static and public, where static method can be called without creating objects of Class2 but for the public method to be called we need to create object of Class2
    question_1: What is static method?
    answer_1: Static method can be accessed without creating an object of the class
    question_2: What is public method?
    answer_2: Public method can only be accessed with the help of objects of the class
    */

	/*stm_comment: This a Static method */
	static void staticMethod() {
		System.out.println("Static methods can be called without creating objects");
	}

	/*stm_comment: This is a Public method */
	public void publicMethod() {
		System.out.println("Public methods must be called by creating objects");
	}

	/*stm_comment: Main method */
	public static void main(String[] args) {
		
		/*stm_comment: Call the static method */
		staticMethod();

		/*
	  	logical_step_2: Create an object of Class2, we need to specify the class name, followed by the object name, and use the keyword new
    	logical_step_details: Creating a object of class i.e., Class2 and in order to create the object of that class we need the class name at front then the object name where we have created one of that class i.e., newObj. And also we need to use the keyword "new" 
    	question_3: What is the purpose of newObj?
    	answer_3: newObj has a state and behavior of Class2 and calls the publicMethod
    	*/

    	/*stm_comment: Create object newObj of Class2 */
	    Class2 newObj = new Class2(); 

	    /*stm_comment: Call the public method */
	    newObj.publicMethod(); 
	}
}
