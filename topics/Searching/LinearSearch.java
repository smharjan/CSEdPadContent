/***
   author: Suraj Maharjan
   topics: Searching (Linear Search)
   goalDescription: This program linearly searches for the index of the array element
   output: Prints the index of an element of the array that we are searching for
***/

public class LinearSearch {
   /*stm_comment: Main method */
   public static void main(String args[]){

      /*
      logical_step_1: Create and array of elements
      question_1: What is an array?
      answer_1: Array is simply a data structure consisting of a collection of elements
      question_2: Why we need the length of an array?
      answers_2: Length is a final variable applicable for arrays and with the help of the length variable, we can obtain the size of the array
      */
      int array[] = {10, 20, 25, 63, 96, 57};
      int size = array.length;

      /*stm_comment: Create variable val with the value that is to be searched in the array */
      int val = 63;

      /*
      logical_step_2: For loop to compare each element of array with the variable val
      question_3: What is the purpose of comparing each and every element of array with the variable val? 
      answer_3: To get the index of the element that we are searching for in the array
      */

      /*stm_comment: For loop initialization with integer variable i starting from value 0 up to the length of the array */
      for (int i=0 ;i< size-1; i++){

         /*stm_comment: if statement to check if the value of variable val is equal to the element present in the array */
         if(array[i]==val){

            /*stm_comment: Prints the index of the val if found present in the array */
            System.out.println("Index of the required element is :"+ i);
         }
      }
   }
}