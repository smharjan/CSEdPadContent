

/**
 * author: Hasan Mashrique
 * topic: Methods
 * subtopic: creating class objects, storing result in a variable, printing variable.
 * goalDescription: The program will create a method that will add two given exam numbers of a student. The program will declare a method
 that will add those numbers, create object of the class, use that object to call the method and finally show the added exam numbers by printing it. 
 * source()
 */
public class AddingNumbers {

    /*
		logical_step_1: Declare a method of the class AddingNumbers that takes two exam numbers of a student and adds them.
        logical_step_details: Declare a method which will take two exam numbers of a student as a parameter. The method
        will return a integer value which is the sum of those numbers. 
		question_1: What does the following code block do?
		answer_1: Declares a integer method which takes two integer values and adds them.
		question_2: What does the method returns?
		answer_2: It returns an integer value(addition of the two numbers).
		question_3: what are the parameters of the method  ?
		answer_3: It takes two integer values as parameters.	
		*/
    
     /*
      stm_comment: We define method sum which adds two given values as parameters
      and returns their sum.
     */
    public int sum(int value1, int value2) {
        return value1 + value2; // returns the addition of the two given integer values.
    }

    public static void main(String[] args) {

        /*
        logical_step_1: Declare an object of class AddingNumbers , call the class method and store the return value
        of the method  in a variable. 
		logical_step_details: Declare a variable size which indicates the size of soccer team and thus of the array that will store these values. An array of integers to store the numbers is also declared and its size is given by the value of variable size. 
		question_1: What does the following code block do?
        answer_1: First, it declares an object of class AddingNumbers. Then, it calls the method sum using that object and 
        stores the return value of that method all in a variable. FInally it prints the variable storing the result.
		question_2: Why an object was created?
		answer_2: In order to call the class method sum, an object of that class(AddingNumbers) needs to be initialized.
		question_3: What variables are used ?
		answer_3: Variable 'result' is used to store the return value given by method sum.	
        */
        
        /**
         * stm_comment: We create object of class AddingNumbers.
         */
        AddingNumbers addy = new AddingNumbers();
        
        //stm_comment:calling method sum which stores the sum value in an int value result.
        int result = addy.sum(4, 9); 
        
        //stm_comment: prints the value stored in integer result.
        System.out.println(result); 
    }

}
