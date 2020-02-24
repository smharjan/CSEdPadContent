/***
author(Jeevan Chapagain)
topic(String )
title(String2.java)
goalDescrption(JAVA program to illustrate how strings are declared and calculate length of string using length method of string)
source()
output: String length of s1 is 26
    String lenght of s2 is 30

 
***/
 
 
 class EgString {
   public static void main(String[] args)
   {
      /*
    logical_step_1: Declare a  string s1 
    question_1: What is the value of the  s1  ?
    answer_1: the value of the s1 is The University of Memphis
    question_2: What will be the output of the program if you initialise the value of variable s1 to Hello?
    answer_2: The program will output the string length of Hello.
    */
    String s1="The University of Memphis"; 
    /*stm_comment: declare a variable called s1 of 
    type string*/

    String s2="Department of Computer Science"; 


    /*
    logical_step_2: Printing out the length of the string s1.
    logical_step_details : The length of the variable s1 is being calculated in here using the method length which
    returns the total number of characters present in the string by counting each character.
    question_1: What is the value of  s1.length() ?
    answer_1: the value of s1.length() is 26
    question_2: What will be the output of the program if you initialise the value of variable s1 to Hello?
    answer_2: the value of s1.length() will be 5s.
    */

    System.out.println("string length of s1 is: "+s1.length()); 
    /*stm_comment: printing out the length of the string stored in variable s1 using the method length.*/




    System.out.println("string length of s2  is: "+s2.length());
   }
}