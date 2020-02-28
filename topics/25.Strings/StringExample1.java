/**
 author: Jeevan Chapagain
 topic: Strings
 title: StringExample1)
 goalDescription: demonstrate working of String concatenation in java
 source ()
 output: David Beckham

**/

class StringExample1 {

  public static void main(String[] args) {
     /*
    logical_step_1: Declare a  variables of string datatype
    logical_step_details: Declare a variables first_name and last_name of string data type and assign some value to it. String must be surrounded by double quotes.
    question_1: What does the following code block do?
    answer_1: Declares two variables to store two different strings.
    question_2: What variables are declared?
    answer_2: Variables first_name and last_name are declared.
    */


    String first_name = "David";  
   /*stm_comment: declare a variable first_name of data type string using the keyword String.*/
   

    String last_name = "Beckham";  
    /*stm_comment: declare a variable last_name of data type string using the keyword String.*/


   /*
   logical_step_1: Concatenates variable last_name with first_name and store the result in variable full_name of string data type.
   logical_step_details: Declares a variable full_name which is used to store the result obtained after concatinating string variables first_name
   and last_name.
   question_1: What does the following code block do?
   answer_1: The keyword concat will concat the variable s1 with variable s2 together such that two strings are linked together i.e. concatenated 
   together such that it forms a new string.
   question_2: What variables are declared?
   answer_2: Variable full_name is declared.
   question_3: How are the two strings concatenated?
   answer_3: Two strings are concatenated using the method concat.

    */

    String full_name = first_name.concat(last_name); 
      /*stm_comment: concatinating string last_name with first_name and storing the vresult in string data type variable full_name.*/


    
    System.out.println(full_name); 
      /*stm_comment: printing out the result stored in string data type variable full_name.*/

  }
}