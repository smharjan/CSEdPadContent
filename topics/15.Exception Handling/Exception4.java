/*
 * author: Zak Risha
 * topics: Exception Handling
 * subtopics: Strings, parseInt, processing array, NumberFormatException
 * goalDescription: This program demonstrates how a NumberFormatException can occur.
 * output: NumberFormatException
 * 
 */ 

public class Exception4{
  public static void main(String[] args) {
    /*
     * logical_step_1: Initalize a string variable called quantity and assign string "five"
     * question_1: what does the following code block do?
     * answer_1: Declare String variable called quantity and assign string "five"
    */
    String quantity = "five";

    /*
     * logical_step_2: Within a try block, attempt to parse the String quantity into an integer. 
     * question 1: what does the following code block do?
     * answer_1: Within a try block, attempt to parse the String quantity into an integer. 
     * question_2: What is the parameter passed into parseInt method?
     * answer_2: five
     */
    /*stm_comment: Tries executing code, providing opportunity to catch and handle errors*/
    try {
      /*stm_comment: Method to convert a string into an integer */
      int num = Integer.parseInt(quantity); 
      System.out.println(num);

     /*
      * logical_step_3: Catch exceptions thrown by the previous method parseInt, prints out the name of the exception.
      * question 1: what does the following code block do?
      * answer_1: Catch NumberFormatException exceptions thrown by the parseInt method, printing out the string "NumberFormatException" 
      * question_2: Will this catch block trigger with the previous method call?
      * answer_2: Yes, as "five" is not a valid string format of a number.
      */
      /*stm_comment: This exception is thrown when trying to convert a string with an inappropriate format to one of the numeric types*/
    } catch(NumberFormatException e) { 
        System.out.println("NumberFormatException"); 
    }
  }
}