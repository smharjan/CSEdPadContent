/***
author:Jeevan Chapagain
topic:String 
title:String2.java
goalDescrption:JAVA program to illustrate how strings are declared and calculate length of string using length method of string)
source()
output: String length of s1 is 26
        String length of s2 is 30

 
***/
 
 
 class EgString {
   public static void main(String[] args)
   {
      /*
    logical_step_1: Declare  variables of string datatype to calculate length of the characters in each string.
    logical_step_details: Declare a variables s1 and s2 of string data type and assign some value to it. String must be surrounded by double quotes.
    question_1: What does the following code block do?
    answer_1: Declares two variables needed to store two different strings
    question_2: What variables are declared?
    answer_2: The variables s1 and s2 are delared.

    */
    String s1="The University of Memphis"; 
    /*stm_comment: declare a variable called s1 of 
    type string*/

    String s2="Department of Computer Science"; 
    /*stm_comment: declare a variable called s2 of 
    type string*/



    /*
    logical_step_2: Printing out the length of the string s1 and s2.
    logical_step_details : The length of the variables are being calculated in here using the method length which
    returns the total number of characters present in the string by counting each character.
    question_1: What does the following code block do?
    answer_1: Count the  number of characters present in variable s1 and s2.
    question_2: How is the length of the string calculated?
    answer_2: Length of the string is calculated using the method length.
    */

    System.out.println("string length of s1 is: "+s1.length()); 
    /*stm_comment: printing out the length of the string stored in variable s1 using the method length.*/




    System.out.println("string length of s2  is: "+s2.length());
    /*stm_comment: printing out the length of the string stored in variable s2 using the method length.*/

   }
}