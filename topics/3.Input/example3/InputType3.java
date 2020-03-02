/***
   author: Suraj Maharjan
   topics: Input Type
   subtopics: string, integer, double, boolean
   goalDescription: This program takes user inputs where there are different input types 
   output: Prints the user inputs
***/

/*stm_comment: import Scanner java library to get the user inputs*/
import java.util.Scanner;

class InputType3 {

    /*stm_comment: Main method */                    
    public static void main(String[] args) {
        
        /*
        logical_step_1: Create a new Scanner object to get the input from the user 
        question_1: What is purpose creating the objecy "myObj" of Scanner?
        answer_1: myObj will help in getting the user inputs
        */

        /*stm_comment: Create new object "myObj" of Scanner*/
        Scanner myObj = new Scanner(System.in);

        /*
        logical_step_2: Prompt user to input their name, age and salary 
        question_2: Why prompt user for input?
        answer_2: To get the user inputs to provide in their name, age and salary
        question_3: What type of variable is name?
        answer_3: name is a String
        question_4: What type of variable is age?
        answer_4: age is an integer
        question_5: What type of variable is salary?
        answer_5: salary is a double
        */

        /*stm_comment: Prompt user for inputs*/
        System.out.println("Enter name, age and salary");
        
        /*stm_comment: get user input for name */
        String name = myObj.nextLine();

        /*stm_comment: get user input for age */
        int age = myObj.nextInt();
        
        /*stm_comment: get user input for salary */
        double salary = myObj.nextDouble();
        
        /*
        logical_step_3: Prompt user to input True or False for the given question
        question_6: What type of variable is bn?
        answer_6: bn is boolean which takes only true or false as input
        */

        /*stm_comment: Prompt user for their age and ask to enter either "True" or "False" */
        System.out.println("Are you over 18? (True or False)");
        
        /*stm_comment: get user input for bn */
        boolean bn = myObj.nextBoolean();
        
        /*stm_comment: Print the user input for name */
        System.out.println("Name: " + name);

        /*stm_comment: Print the user input for age */
        System.out.println("Age: " + age);

        /*stm_comment: Print the user input for salary */
        System.out.println("Salary: " + salary);

        /*stm_comment: Print the user input for bn */
        System.out.println("Over 18 " + bn);
      }
}
