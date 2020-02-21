//package javapedagogy;

/**
 @author : Hasan Mashrique
 @topics : DoWhile
 @subtopics: declaring variables, Assigning variable value, printing variable using DoWhile loop.
 @goalDescription:This program demonstrates how to declare a variable, assign a value to it and print its value using DoWhile
 @source: Here we keep the URL if there exist any source 
 @output : 8,9,10
*/

public class DoWhile {

    public static void main(String[] args) {

        /*
        logical_step_1: Declare variable and assign an initial value to check how many candy a child can have. 
        logical_step_details: First we declare a integer variable and a value to it. We also declare another variable to check how many more 
        candy a child can have.
        question_1: what variables are declared?
        answer_1: an integer variable i to set how many candies is eaten and a count variable to check how many more it can have.
        question_2: what does the following code block do?
        answer_2: It declares two integer variables and assigns values to them. One for candies already eaten and another for how many more 
        one can eat (limit is 12).
        
        */

       /*@stm_comment: declare integer variables 'i' and 'count' assign values to them.  */
        int i = 8; 
        int count = 0;
        
       /*
        question_1: what does the code do inside the do while loop?
        answer_1: It prints the value of i and increments its value by one every time.
        question_2: When does the do while loop terminate?
        answer_2: After each iteration, the loop checks for the terminating condition in the while 
        bracket and terminates the loop if the condition does not match anymore.
        question_3: what does the following code block do?
        answer_3: It prints the value of 'i', increments its value by one until the terminating condition occurs.
        
        */  

        do {
            /*@stm_comment: increments value of i */
            i++;
            /*@stm_comment: counts hoy mane more it can eat */
            count++;
            
            
        } while (i <= 12); /*@stm_comment: if i is >10 , it will still print once since the condition is checked after the while execution once.*/
        
        System.out.println("Candies left to eat: " + (count-1));
    }

}
