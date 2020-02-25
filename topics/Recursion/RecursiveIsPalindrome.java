/**
author : Jordan Barria-Pineda
topics : Recursion
subtopics: recursive method calling, recursion base case
goalDescription: This program checks a string is palindrome or not (first half of the string is the same as the second half). 
source: Arizona State University online book https://www2.cs.arizona.edu/~mercer/Book/PrinterFriendly/19Tall.pdf
output: Yes
**/

public class RecursiveIsPalindrome(){

    public static void main(String args[]){ 
        String str = "geeg"; 
  
        if (isPalindrome(str)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
    
     public boolean isPalindrome(String str) {
            /*
            logical_step_1: the recursion base case that returns true when there is only one or none characters left, where the function always return true
            question_1: what type of case for recursive algorithms is this if statement representing?
            answer_1: one of the base cases
             */
             if (str.length() <= 1) {
                 //stm_comment: Base case when this method knows to return true.
                 return true;
             }
             else{
                /*
                logical_step_2: the recursion base case that returns false when the first and last characters do not match
                question_1: what type of case for recursive algorithms is this if statement representing?
                answer_1: one of base cases
                */
                 if (str.charAt(0) != str.charAt(str.length() - 1)) {
                     //stmt_code: Base case when this method knows to return false because the first and last characters do not match.
                     return false;
                 }
                 /*
                logical_step_3: the recursive call case that calls the isPalindrome function, with a shorter version of the string
                question_1: what type of case for recursive algorithms is this if statement representing?
                answer_1: the recursive call case
                */
                 else{
                     //stmt_comment: The first and last characters are equal so check if the shorter string--a simpler version of this problem--is a palindrome.
                     return isPalindrome(str.substring(1, str.length() - 1));
                }
            }
        }
    }
}
