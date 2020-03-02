/**
 author: Hasan Mashrique
 topics: Do While
 subtopics: Declaring array variables, retrieving array elements by index, printing array elements
 goalDescription: Given an array student scores on a test, print the number of students whose scores achieved the cutoff for passing the test (70) and the number of students who failed the test.
 source: N/A
 output:
 # Passed: 5
 # Failed: 10
 */
public class DoWhile_2 {

    public static void main(String[] args) {

        /*
        logical_step_1: Declare an array variable (scores) that stores the scores of the students.
        
        question_1: What does the following code block do? 
        answer_1: Declare an array that stores numbers of 4 students. 
        
        question_2: What variables are declared?
        answer_2: An integer array numbers and a variable i are declared to iterate through the array. 
        
        question_3: How is the array size defined? 
        answer_3: The size of the array is not explicitly defined since the array is declared with the elements in it. So the array length is automatically set.
        */

        /*
        stm_comment: Declare an array of student scores.
        */
        int scores[] = { 41, 80, 47, 38, 59, 74, 56, 37, 85, 27, 49, 61, 25, 81, 95 };

        /*
        logical_step_2: Declare an integer variable (CUTOFF) that stores the cutoff for passing scores.
        */
        final int CUTOFF = 70;
        
        /*
        logical_step_3: Declare two counters: a loop counter (i) for iterating through the array indexes and a counter to store the running total of passing scores (pass_count).

        logical_step_details: The loop counter (i) is initialized to 0 because the first index of the scores array is 0. The passing-scores counter (pass_count) is initialized to 0 because at this point in the code no passing scores have yet been counted.
        */
        int i = 0;
        int pass_count = 0;

        /*
        logical_step_4: Iterate through the array of scores and count each passing score.
        
        logical_step_details: The do-while loop iterates such that each iteration visits a different score in the scores array. In each iteration, the code checks if the current score meets the cutoff. If it does, then the passing-score counter is incremented by 1. 
        */
        /* stm_comment: Start of the do while loop which iterates through the array and prints values greater than 10. */
        do {
            /* stm_comment: Checks if the current score (scores[i]) meets the cutoff. */
            if (scores[i] >= CUTOFF) {
                pass_count++;
            }
            i++;
        } while (i < scores.length); /* stm_comment: Iterate again as long as the i counter is a valid index in the scores array (i.e., less than the length of the array). */
        
        System.out.println("# Passed: " + pass_count);
        System.out.println("# Failed: " + (scores.length - pass_count));
    }

}
