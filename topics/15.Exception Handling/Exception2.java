/***
author:Jeevan Chapagain
topic:Exception Handling
title:Exception2.java
goalDescrption: JAVA program to handle Null Pointer exception
output: NullPointerException
***/
 
Public class Main {
 public static void main(String[] args) {

  /*
   logical_step1: use try and catch block to catch the exception when we try to find the index position of a character of a null string.
   logical_step_details: Declare try and catch statement such that  the code inside try block will be executed and if any error is
   occured it will be handled by the catch block.
   question_1: what does the following code block do?
   answer_1: Within a try block, find out the index position 0 of the character stored in variable x.   */ 

   try {
  /*stm_comment: Tries executing code, providing opportunity to catch and handle errors*/

  /*
  logical_step_2: Create a variable of string data type.
  logical_step_details: Declare a variable empty of string data type with null value assigned to it.
  question_1: What does the following code block do?
  answer_1: It creates a variable  empty of string data type and assigns null value to it.
  question_2: What variable is declared?
  answer_2: Variable empty is declared.

  */

           String empty = null;
  /*stm_comment: declare a variable empty of data type String and assign null value to it.*/
  
  /*
  logical_step_3: Find index position 0 of the character present in  the string variable empty.
  logical_step_details: Search for the index position 0 of the character using charAt method.
  question_1: What does the following code block do?
  answer_1: It tries to find out the index position 0 othe character present in the string and print the result.
  question_2: How do you find the index position of the character?
  answer_2: Index position of the character can be found out using the method charAt().

  */

           System.out.println(empty.charAt(0));
      /*stm_comment: printing out the character present ar index position 0 in the variable empty.*/


       }


  /*
  logical_step_3: Catch exceptions thrown by the previous operation, printing out the name of the exception.
  logical_step_details: The catch block will catch any exceptions thrown by the code executed in the try block and says what exception is occured.
  question_1: what does the following code block do?
  answer_1: Catch Null pointer Exception thrown by the previous code of block in try block. 
  */
    
       catch(NullPointerException e) {

  /*stm_comment: NullPointer Exception is thrown when we try to access the index of a string which is null. */

           System.out.println("NullPointerException");

  /*stm_comment: Printing out what exception occured during the execution of the program */

       }
 }

}

