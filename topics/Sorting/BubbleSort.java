
package javapedagogy;

/**
  author: Hasan Mashrique
  topic: Sorting
  subtopic: methods, array declaration, printing array.
  goalDescription: Sort a given unsorted array using bubble sort in ascending order.
  source()
 */

public class BubbleSort {

        /*
		logical_step_4: Declare static method Sorting() which will sort a given unsorted array.
        logical_step_details: Declare a method named Sorting and give an array as its parameter because it will take an
        array and sort it.  
		question_1: What does the following code block do?
        answer_1: The code block declares a method named Sorting() which is taking an array as parameter . It will take
        this array and sort it using bubble sort algorithm.	
        */
        
    static void Sorting(int[] list) {
        int n = list.length;
        int temp = 0;
        
         /* stm_comment: for each element of the list, it compares with the rest of the values in the array 
         and swap their position when list[j - 1] > list[j].*/
         
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (list[j - 1] > list[j]) { // stm_comment: comparing each element with the next element.If the previous
                    //element is bigger then it gets swapped with each other.
                    temp = list[j - 1]; // stm_comment: swapping elements using a temp variable.
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
    
         /*
		logical_step_1: Declare an integer array that stores unsorted books with numbers items in a shelf.
        logical_step_details: Declare a integer array which takes integer values in unsorted order. the values are 
        given in the declaration of the array.  
		question_1: What does the following code block do?
		answer_1: Declare integer array that stores a list of unsorted values.
		question_2: What variables are declared?
		answer_2: The integer array and the values in it.
		question_3: What is the size of array mynumber ?
		answer_3: Since the size is not defined but values are given directly, the number of values in the array size.	
        */
        
        //stm_comment: We define the unsorted list and its values. 
        int UnsortedList[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        
        System.out.println("Array Before Bubble Sort");
        
         /*
		logical_step_2: print the unsorted array using a for...loop. 
        logical_step_details: Print the declared array by iterating through the entire array . Print each value in
        each iteration of the loop.  
		question_1: What does the following code block do?
		answer_1: It prints the declared array by using a for loop.
		question_2: How does it get the array size?
		answer_2: by calls the .length method which returns the size of the array.
		question_3: What does it print in each iteration?
		answer_3: each iteration prints one array index value starting from 0.	
        */

        //stm_comment: Print the unsorted list as given.
        for (int i = 0; i < UnsortedList.length; i++) {
            System.out.print(UnsortedList[i] + " ");
        }
        
        System.out.print('\n' + "Array after Bubble Sort" + '\n');
        
          /*
		logical_step_3: Call the Sorting method and pass the array as a parameter.
        logical_step_details: call the static Sorting method and pass the array as parameter which will sort the
        unsorted array by using bubble sort.   
		question_1: What does the following code block do?
		answer_1: It calls the Sorting methods to sort the unsorted array.
		question_2: What is sent as a parameter?
		answer_2: The unsorted array because it takes an array as parameter.	
        */


        //stm_comment: Call the  method Sorting to sort the unsorted list using bubble sort
        Sorting(UnsortedList); 
        
        //stm_comment: Print the sorted list after bubble sort.
        for (int i = 0; i < UnsortedList.length; i++) {
            System.out.print(UnsortedList[i] + " ");
        }

    }
}
