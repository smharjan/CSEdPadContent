/**
author(Jeevan Chapagain)
topic(String )
title(String1.java)
goalDescrption(JAVA program to illustrate use of string method toUpperCase() and toLOwerCase())
output I LOVE COMPUTER
        i love computer
 
*/
 
 
 class ExString {
   public static void main(String[] args)
   {

    /*
    logical_step_1: Declare a  string 
    question_1: What is the type of the variable s ?
    answer_1: the type of the variable s is string.
    question_2: How will you declare a string variable>
    answer_2: we can declare string variable using the keyword string.

  */
    

      String s = "I love computer";
    /*stm_comment: declare a string variable  with the use of keyword String*/
      


    /*
    logical_step_1: Converting the variable s to uppercase..
    logical_step_details : The variable s is being converted to uppercase letters using the method toUpperCase.
    question_1: What is the output  s.toUpperCase() ?
    answer_1: the output of  s.toUpperCase() is I LOVE COMPUTER
    */

      System.out.println(s.toUpperCase());
      /*stm_comment: converting the string variable to upper case using toUpperCase method and printing out the result.*/



     /*
    logical_step_2: Converting the variable s to lowercase.
    logical_step_details : The variable s is being converted to lowercase letters using the method toLowerCase.
    question_1: What is the output  s.toLowerCase() ?
    answer_1: the output of  s.toLowerCase() is i love computer
    */

      System.out.println(s.toLowerCase());   
      /*stm_comment: converting the string variable to lower case using toLowerCase method and printing out the result.*/


  }
}
