/**
 author (Jeevan Chapagain)
 topic (Strings)
 @title (StringExample1)
 @goalDescription (demonstrate working of String concatenation in java)
 @source ()
 @output (David Beckham)

**/

class StringExample1 {

  public static void main(String[] args) {
     /*
    logical_step_1: Declare a  string datatype
    question_1: What is the data type of the variable s1 ?
    answer_1: the data  type of the variable s is string.
    question_2: How will you declare a string variable?
    answer_2: we can declare string variable using the keyword string whose value must be surrounded by double quotes.
    */


    String s1 = "David";  
   /*stm_comment: declare a variable of type string using the keyword String.*/
   

    String s2 = "Beckham";  

   /*
  question_1: what does the following code block do?
  answer_1: The keyword concat will concat the variable s1 with variable s2 together such that two strings are linked together i.e. concatenated 
  together such that it forms a new string. eg: David Beckham
  question_2: what will be the result of s2.concat(s1)?
  answer_2: The result of s2.concat(s1) will be Beckham David.
    */

    String s3 = s1.concat(s2); 

   /*
  
  question_1: what does the following code block do?
  answer_1: It prints the result of the variable s3 where s1 and s2 are concatenatee sucha that s3 contains a value of David 
  Beckham which will be printed.
    */
    System.out.println(s3); 
  }
}