/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javapedagogy;

/**
 * @author(Hasan Mashrique)
 * @topic(DoWhile) @title(PrintValuesInArray_DoWhile) @goalDescription(Iterate
 *                 through an array and print values greater than 10.) @source()
 */
public class DoWhile_2 {

    public static void main(String[] args) {

        /*
         * logical_step_1: Declare variables that stores the numbers of 4 students.
         * logical_step_details: Declare an array that will store the grades of 4
         * students. The numbers are also stored in the declaration of the array.
         * question_1: What does the following code block do? 
         * answer_1: Declare an array that stores numbers of 4 students. 
         * question_2: What variables are declared?
         * answer_2: An integer array numbers and a variable i are declared to iterate through the array. 
         * question_3: How is the array size defined? 
         * answer_3: The size of the array is not explicitly defined since the array is declared with
         * the elements in it. So the array length is automatically set.
         */

        /*
         * stm_comment: declare an array variable called myNumber of type integer and
         * size 11 and allocate memory for it
         */
        int numbers[] = { 2, 11, 45, 9 };

        int i = 0;

        /*
         * logical_step_2: Iterates through the array numbers and finds out students who
         * passed (passing marks 10).
         *  logical_step_details: Each students number in the
         * numbers array is iterated. In each iteration, it is checked if the student
         * number is greater than the passing mark ( here 10). If so the number is printed. 
         * question_1: What does the following code block do?
         * answer_1: the do while code block checks each numbers array element and prints value greater than 10. 
         * question_2: What is the start and stopping condition for loop?
         * answer_2: the loop starts with i=0 initialized at the top and stops when i is
         * one less than the array length. question_3: What does the code inside for loop doing? 
         * answer_3: At each iteration of the loop, it first checks if the
         * array value is greater than 10. If so it prints the value in the output.
         */

        /*
         * stm_comment:Start of the do while loop which iterates through the array and
         * prints values greater than 10.
         */
        do { // stm_comment: checks if the array value is greater than 10.
            if (numbers[i] > 10) {
                // stm_comment: prints array values if >10.
                System.out.println(numbers[i]);
            }

            i++;
        } while (i < numbers.length); // stm_comment: iteration continues till i<4. So it will iterate through 0,1,2,3
                                      // in the array.

    }
}
