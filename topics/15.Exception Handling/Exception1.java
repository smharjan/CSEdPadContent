/***
author:Jeevan Chapagain
topic:Exception Handling
title:Exception1.java
goalDescrption: JAVA program to handle arithmetic exception
output: Arithemetic Exception Error. Can't divide a number by 0
***/
 
Public class Arithmetic{
 public static void main(String[] args) {
   /*
   logical_step1: Declare a try and catch statement to catch the exception occured during the execution of a program. Within the try block we create two variables
   and divide one variable by another and store the result in new variable.
   logical_step_details: Declare try and catch statement such that  the code inside try block will be executed and if any error is
   occured it will be handled by the catch block.
   question_1: what does the following code block do?
   answer_1: Within a try block, performs a division operation.
   */ 
   try {
  /*stm_comment: Tries executing code, providing opportunity to catch and handle errors*/

  /*
   logical_step2: Declare variables need to store value for the division and declare anoter variable for the storing of the result.
   logical_step_details: Declare variables x and y with some value such that we can perform division of x by y and store the result in variable z.
   question_1: what does the following code block do?
   answer_1:: Assigns some some value to variable x and y and store the result of their division in vairable z and print out the result.
   question_2: what variables are declared?
   answer_2: variables x,y and z are declared.
   */
           
           int x = 5, y = 0;
    /*stm_comment: create variable x and y and assign some values to it.*/

           
           int z = x / y;  
    /*stm_comment: divide the variable x by y and store its result in new variable z. */
           System.out.println ("Result = " + z);
    /*stm_comment : printing out the result of the division */
       }



       /*
     logical_step_3: Catch exceptions thrown by the previous division operation, printing out the name of the exception.
     logical_step_details: The catch block will catch any exceptions thrown by the code executed in the try block and says what exception is occured.
     question_1: what does the following code block do?
     answer_1: Catch Airthmetic Exception thrown by the previous division operation in try block. 
     */
       catch(ArithmeticException e) {
      /*stm_comment: Airthmetic Exception is thrown when we try to divide a number by zero.
         */
           System.out.println ("Arithemetic Exception Error. Can't divide a number by 0");
      /*stm_comment: Printing out what exception occured during the execution of the program */
       }
 }

}

