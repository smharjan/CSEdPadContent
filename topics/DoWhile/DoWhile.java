package javapedagogy;

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
        question_1: what variables are declared?
        answer_1: an integer variable 'i' is declared.
        question_2: what does the following code block do?
        answer_2: It declares a integer variable and assigns a variable to it.
        
        */

       /*@stm_comment: declare an integer variable 'i' and assign value to it.  */
        int i = 8; 
        
        
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
            /*@stm_comment: prints the value of i */
            System.out.println(i); 
            i++;
        } while (i <= 10); /*@stm_comment: if i is >10 , it will still print once since the condition is checked after the while 
        execution once.*/
    }

}
