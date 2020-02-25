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
	  	logical_step_2: Create an object of MyClass, we need to specify the class name, followed by the object name, and use the keyword new
		question_2: What is the purpose of newObj1?
		answer_2: newObj1 has a state and behavior of MyClass
	    */

	    MyClass newObj1 = new MyClass();
	    System.out.println(newObj1.x);

	    /*
	  	logical_step_3: Call a static method from MyClass which needs class name in from of the static method name, i.e; here MyClass.staticMethod() calls the static method of MyClass
		question_3: What is the purpose of this?
		answer_3: It calls the static method of MyClass
	    */

	    /*stm_comment: Call the static method from MyClass */
		MyClass.staticMethod();

		/*
	  	logical_step_4: Create an object of MyClass, we need to specify the class name, followed by the object name, and use the keyword new
		question_4: What is the purpose of 2?
		answer_4: newObj2 has a state and behavior of MyClass and calls the publicMethod
		*/

		/*stm_comment: Create object newObj of MyClass */
	    MyClass newObj2 = new MyClass(); 

	    /*stm_comment: Call the public method */
	    newObj2.publicMethod(); 
  	}
}