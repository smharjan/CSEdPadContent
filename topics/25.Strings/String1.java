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
    logical_step_1: Declare a  variable mars
    question_1: What is the value of the variable mars  ?
    answer_1: the value of the variable mars is I love Computer
    */
    

      String mars = "I love computer";
    /*stm_comment: declare a variable called mars of 
    type string and assign some value to it and allocate memory for it*/
      


    /*
    logical_step_1: Converting the variable mars to uppercase..
    logical_step_details : The variable mars is being converted to uppercase letters using the method toUpperCase.
    question_1: What is the output  mars.toUpperCase() ?
    answer_1: the output of  mars.toUpperCase() is I LOVE COMPUTER
    */

      System.out.println(mars.toUpperCase());
      /*stm_comment: converting the string variable to upper case using toUpperCase method and printing out the result.*/



     /*
    logical_step_2: Converting the variable mars to lowercase.
    logical_step_details : The variable mars is being converted to lowercase letters using the method toLowerCase.
    question_1: What is the output  mars.toLowerCase() ?
    answer_1: the output of  mars.toLowerCase() is i love computer
    */

      System.out.println(mars.toLowerCase());   
      /*stm_comment: converting the string variable to lower case using toLowerCase method and printing out the result.*/


  }
}

