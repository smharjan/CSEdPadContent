/***
   author: Suraj Maharjan
   topics: Searching (Binary Search)
   goalDescription: This program uses binary search algorithm to search the index of element in the array
   output: Prints the index of an element of the array that we are searching for
***/

public class BinarySearch {
   /*stm_comment: binarySearch method takes parameters as: array, first and last index number and the element we want to search */
   public static int binarySearch(int arr[], int first, int last, int element){

      /*stm_comment: variable mid has the value of the index that is the midpoint of the array index */
      int mid = (first + last)/2;

      /*
      logical_step_1: while condition
      logical_step_details: while condition is used and operates unless the value of variable "first" is lesser or equal to the value of the variable "last" otherwise it does not enter while loop 
      question_1: Why while condition?
      answer_1: To check the value of first is lesser or equal to the last value
      question_2: Why if condition?
      answer_2: To check if the middle value of the array is lesser than the value of the element
      question_3: Why else if condition?
      answer_3: To check if the middle value of the array is equal to the value of the element
      question_4: Why else condition?
      answer_4: If the "if" and "else if" conditions are not statisfied else works at the end
      */

      /*stm_comment: while loop compares until the first index becomes greater that the last index */
      while( first <= last ){

         /*stm_comment: "if" condition checks if mid value of the array is lesser than the element */
         if ( arr[mid] < element ){

            /*stm_comment: after "if" condition has been satisfied the first variable value equals to the mid value + 1 */
            first = mid + 1;
         }

         /*stm_comment: if the "if" condition is not statisfied the "else if" condition checks if the mid value of the array is equal to the element and returns the mid value */
         else if ( arr[mid] == element ){  
            return mid;
         }

         /*stm_comment: at the end if the "if" and "else if" condition is not statisfied the "else" condition will declare the value the variable last which equals to valur of mid - 1 */
         else{

            /*stm_comment: valur of variable last equals to the value of mid - 1 */
            last = mid - 1;
         }

         /*stm_comment: value of variable mid is changed to value of variable first + the value of variable last and then which is divided by 2 */
         mid = (first + last)/2;
      }

      /*stm_comment: returns -1 */
      return -1;                    
   }
   
   /*stm_comment: Main method */                    
   public static void main(String a[]) {

      /*
      logical_step_2: Create an array of elements
      logical_step_details: Creating an array that will store elements that are sorted in ascending order and which whose array length is 6 but the indexing of an araay start with 0 so the last index of the element here is 5.
      question_5: What is an array?
      answer_5: Array is simply a data structure consisting of a collection of elements
      question_6: Why we need the length of an array?
      answers_6: Length is a final variable applicable for arrays and with the help of the length variable, we can obtain the size of the array
      */
      int[] array = { 10, 20, 30, 40, 50, 60 };

      /*stm_comment: assigns the value for the variable element */
      int element = 0;

      /*stm_comment: valur of the variable last equals to the length of the array -1 */
      int last=array.length-1;

      /*
      logical_step_3: Call the method binarySearch
      logical_step_details: Calling the binarySearch method to search for the value of the variable "element" i.e., 50, so if 50 is present in the array it will return the index of the array, it send "-1" if the searched element is not present on the array
      question_7: Why are we calling the method binarySearch?
      answer_7: The method binarySearch is already defined and follows the Bineary Search algorithm to search for the particular element in the array and which will also return the index of that searched element if present
      question_8: Why "if" and "else" condition after the call of the method binarySearch?
      answer_8: To check if the value of the index is not equal to "-1", so if the "if" condition is satisfied it prints the index as we will know that the element we searched for is present on the array, and if it is not present it simply prints out "element is not present"
      */
      int index = binarySearch(array,0,last,element);
      
      if (index != -1) {
         System.out.println(element + " present at index: " + index);
      } else {
         System.out.println(element + " is not present.");
      }
   }
}
