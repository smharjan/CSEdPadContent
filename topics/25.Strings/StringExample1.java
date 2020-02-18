/**
 @author (Jeevan Chapagain)
 @topic (Strings)
 @title (StringExample1)
 @goalDescription (demonstrate working of String concatenation in java)
 @source ()
 @output (David Beckham)

**/

class StringExample1 {

  public static void main(String[] args) {
  	/*
	question_1: what variables are declared?
	answer_1: an string variable s1 is declared.
	question_2: what does the following code block do?
	answer: It declares a string variable and assigns a value to it.
  	*/
   String s1 = "David";  

   /*
	question_1: what variables are declared?
	answer_2: an string variable s2 is declared.
	question_2: what does the following code block do?
	answer_1: It declares a string variable and assigns a value to it.
  	*/

   String s2 = "Beckham";  

   /*
	question_1: what variables are declared?
	answer_1: an string variable s3 is declared.
	question_2: what does the following code block do?
	answer_2: The keyword concat will concat the variable s1 with variable s2 together such that two strings are linked together i.e. concatenated 
	together such that it forms a new string.
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