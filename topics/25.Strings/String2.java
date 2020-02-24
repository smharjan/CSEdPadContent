/***
author(Jeevan Chapagain)
topic(String )
title(String2.java)
goalDescrption(JAVA program to illustrate how strings are declared and calculate length of string using length method of string)
source()
output: String length of s1 is 26
        String length of s2 is 30

 
***/
 
 
 class EgString {
   public static void main(String[] args)
   {
      /*
    logical_step_1: Declare a  string datatype
    question_1: What is the data type of the variable s1 ?
    answer_1: the data  type of the variable s is string.
    question_2: How will you declare a string variable?
    answer_2: we can declare string variable using the keyword string whose value must be surrounded by double quotes.

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