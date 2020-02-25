/**
author : Jordan Barria-Pineda
topics : Recursion
subtopics: recursive method calling, recursion base case
goalDescription: This program computes Fibonacci numbers using a recursive method
source: Big Java Book (3rd edition), page 603 (only difference is that original input n was 50)
**/

public static void main(String args[]) 
    { 
        String str = "geeg"; 
  
        if (isPalindrome(str)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
    
// A recursive function that check a str(s..e) is palindrome or not. 
    static boolean isPalRec(String str, int s, int e){ 
    
        /*
        logical_step_1: the recursion base case is whenever there is only one character on both sides, where the function checks if the two characters are the same or not
        question_1: what case for recursive algorithms is this if statement representing?
        answer_1: the recursive "base case"
        */
        if (s == e) 
            return true; 
 
        if ((str.charAt(s)) != (str.charAt(e))) 
            return false; 
  
        /*
        logical_step_2: the recursive calls happen whenever the string has more than 2 characters
              question_1: what case for recursive algorithms is this if statement representing?
              answer_1: the recursive calls case
        */
        /* smt_comment: If there are more than two characters, check if middle substring is also palindrome or not. 
        if (s < e + 1) 
            return isPalRec(str, s + 1, e - 1); 
  
        return true; 
    } 
