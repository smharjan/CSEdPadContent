/**
 author: Nisrine Ait Khayi
 topics: Recursion
 subtopics: recursion,string.
 goalDescription: This program generates recursively the length of a given student first name.
 source: https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
 output:7
*/
import java.util.*; 
  
public class GFG{ 
  
    /* Function to calculate length */
    private static int recLen(String str)  
    { 
  
      logical_step_1: Pass the first name of a given student to the function recLen. Then test if the name is  empty, return 0. Else call recureively the function using a substring of the given name. 
      logical_step_details: Test if the given first name is empty. If empty the result is 0. Else call the function recLen recursively.
      question_1:How the length of "Sam" is computed?
      answer_1: recLen("Sam")=1+recLen("am")=2+recLen("m")=3
      
      /*stm_comment: compare the str value with empty string. If true, the length of the given first name is 0*/      
        if (str.equals("")) 
            return 0; 
        else
         /*stm_comment: if the given first name is not empty, call recursively the function recLen with a substring of the str variable */
            return recLen(str.substring(1)) + 1; 
    } 
  
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
      /* 
      logical_step_1: Store the given first name in a string variable str. Allocate a memory for it. Then display the length of the given first name.
      logical_step_details: The recLen function computes recursively the lenght of the given first name using the substrings of the given name.
      question_1:How the length of "John" is computed?
      answer_1: recLen("John")=1+recLen("ohn")=2+recLen("hn")=3+recLen("n")=4
      */
      
      /*stm_comment: declare a string variable called str and assign to it a value of "NISRINE"  and allocate memory for it*/       
        String str ="NISRINE"; 
     
       /*stm_comment: Finds the length of the given first name by calling the function recLen */
        System.out.println(recLen(str)); 
    } 
} 
  
 
