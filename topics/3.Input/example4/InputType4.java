/***
   author: Suraj Maharjan
   topics: Input Type
   subtopics: string, character, long
   goalDescription: This program takes user inputs where there are different input types 
   output: Prints the user inputs
***/

/*stm_comment: import Scanner java library to get the user inputs*/
import java.util.Scanner; 

public class InputType4 
{ 

    /*stm_comment: Main method */                    
    public static void main(String[] args) 
    { 

        /*
        logical_step_1: Create a new Scanner object to get the input from the user 
        question_1: What is purpose creating the objecy "myObj" of Scanner?
        answer_1: myObj will help in getting the user inputs
        */

        /*stm_comment: Create new object "myObj" of Scanner*/        
        Scanner myObj = new Scanner(System.in); 

        /*
        logical_step_2: Prompt user to input their name, gender and mobileNo 
        question_2: Why prompt user for input?
        answer_2: To get the user inputs to provide in their name, gender and mobileNo
        question_3: What type of variable is name?
        answer_3: name is a String
        question_4: What type of variable is gender?
        answer_4: gender is a character
        question_5: What type of variable is mobileNo?
        answer_5:  mobileNo is a double
        */

        /*stm_comment: Prompt user for inputs*/
        System.out.println("Enter name, gender and mobileNo");

        /*stm_comment: get user input for name */
        String name = myObj.nextLine();

        /*stm_comment: get user input for gender but just takes a single character or letter */  
        char gender = myObj.next().charAt(0); 

        /*stm_comment: get user input for mobileNo */
        long mobileNo = myObj.nextLong();  

        /*stm_comment: Print the user input for name */ 
        System.out.println("Name: "+name); 

        /*stm_comment: Print the user input for gender */
        System.out.println("Gender: "+gender);

        /*stm_comment: Print the user input for mobileNo */
        System.out.println("Mobile Number: "+mobileNo);  
    } 
} 
