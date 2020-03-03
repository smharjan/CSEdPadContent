/***
 	author: Suraj Maharjan
 	topics: Classes and Objects
 	goalDescription: This program calls MyClass variables, static and public method by creating new object of MyClass
 	output: Prints the variables and methods values of MyClass
***/

class OtherClass {

	/*stm_comment: Main method */
  	public static void main(String[] args) {

	  	/*
	  	logical_step_1 Create an object of MyClass, we need to specify the class name, followed by the object name, and use the keyword new
		logical_step_details: Creating a object of class i.e., MyClass which is a separate JAVA file and in order to create the object of that class we need the class name at front then the object name where we have created one of that class i.e., newObj1. And also we need to use the keyword "new" 
		question_1: What is the purpose of newObj1?
		answer_1: newObj1 has a state and behavior of MyClass
	    */

	    MyClass newObj1 = new MyClass();
	    System.out.println(newObj1.x);

	    /*
	  	logical_step_2: Call a static method from MyClass which needs class name in from of the static method name, i.e; here MyClass.staticMethod() calls the static method of MyClass
		logical_step_details: Calls a static method from MyClass and performs the functions described inside that method
		question_2: What is the purpose of this?
		answer_2: It calls the static method of MyClass
	    */

	    /*stm_comment: Call the static method from MyClass */
		MyClass.staticMethod();

		/*
	  	logical_step_3: Create an object of MyClass, we need to specify the class name, followed by the object name, and use the keyword new
		logical_step_details: Creating a object of class i.e., MyClass and in order to create the object of that class we need the class name at front then the object name where we have created one of that class i.e., newObj2. And also we need to use the keyword "new" 
		question_3: What is the purpose of 2?
		answer_3: newObj2 has a state and behavior of MyClass and calls the publicMethod
		*/

		/*stm_comment: Create object newObj of MyClass */
	    MyClass newObj2 = new MyClass(); 

	    /*stm_comment: Call the public method */
	    newObj2.publicMethod(); 
  	}
}
