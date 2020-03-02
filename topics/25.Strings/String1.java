/**
author:Jeevan Chapagain
topic: String
title:String1.java
goalDescrption: This programs converts the given string into upper case and lower case using the string method toUpperCase() and toLowerCase().
output I LOVE COMPUTER
       i love computer
 
*/
 
 
 class ExString {
   public static void main(String[] args)
   {

    /*
    logical_step_1: Use string method to convert the given string into upper case and lower case.
    logical_step_details: Declarae a variable s which is used to store a string "I love computer".
    question_1: What does the following code block do?
    answer_1: Declares a variable of string data type to store string.
    question_2: What variables are declared?
    answer_2: The variable String s is declared.

  */
    

      String s = "I love computer";
    /*stm_comment: declare a variable s of data type String and assign some string value to it.*/
      


    /*
    logical_step_1: Converting the variable s to uppercase..
    logical_step_details : The variable s is being converted to uppercase letters using the method toUpperCase.
    question_1: What does the following code block do?
    answer_1: It converts all the characters of the variable s in the Uppercase.
    question_2: How is the string converted to uppercase?
    answer_2: The string is converted to uppercase using the methods toUpperCase.
    */

      System.out.println(s.toUpperCase());
      /*stm_comment: converting the string variable to upper case using toUpperCase method and printing out the result.*/



     /*
    logical_step_2: Converting the variable s to lowercase.
    logical_step_details : The variable s is being converted to lowercase letters using the method toLowerCase.
    question_1: What does the following code block do ?
    answer_1: It converts all the characters of the variable s in the lowerercase.
    question_2: How is the string converted to lowercase?
    answer_2: The string is converted to lowercase using the method toLowerCase.
    */

      System.out.println(s.toLowerCase());   
      /*stm_comment: converting the string variable to lower case using toLowerCase method and printing out the result.*/


  }
}
