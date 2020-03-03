/***
 	author: Suraj Maharjan
 	topics: Classes and Objects
 	goalDescription: This program is about creating a class named MyClass with variable x and has static and public method
 	output: This program will have no output as its methods and attributes are going to be called from OtherClass, and this program needs only compiling
***/

public class MyClass {

	/*
    logical_step_1: Declare an integer variable x
    logical_step_details: Declaring a variable which is of type integer and which will store the value 5
    question_1: What is the value of the variable x?
    answer_1: The value of the variable x is 5
    question_2: What is static method?
    answer_2: Static method can be accessed without creating an object of the class
    question_3: What is public method?
    answer_3: Public method can only be accessed with the help of objects of the class
    */
  	int x = 5;

  	/*stm_comment: This a Static method */
	static void staticMethod() {
		System.out.println("Static methods can be called without creating objects");
	}

	/*stm_comment: This is a Public method */
	public void publicMethod() {
		System.out.println("Public methods must be called by creating objects");
	}
}
