/**
 author: Priti Oli
 topic: For Loops
 title: CountDown
 subTopic: getting familiar with for loop
 goalDescription: this program builds a counter in for loop that counts from 10 to 1 in decreasing manner
 source: 
 output: counter = 10
         counter = 9
         counter = 8
         counter = 7
         counter = 6
         counter = 5
         counter = 4
         counter = 3
         counter = 2
         counter = 1
 
 */
 
public class CountDown {
    public static void main(String[] args) {
		/*
		logical_step_1: Dispay the value of counter from 10 to 1 
		logical_step_details: Declare a for loop by initialising the value of the variable counter to be 10 
		and decrement the value of variable counter in each iteration and display the value of variable counter 
		in each iteration.
		question_1: What does the following block of code do?
		answer_1: the code block declares a for loop by initialising the value of the variable counter to be 10 
		and decrement the value of variable counter in each iteration and display the value of variable counter 
		in each iteration.
		question_2: What is the initial value of the variable counter?
		answer_2 the initial value of the variable counter is 10
		question_3: What is the value of the variable counter after the for loop ends?
		answer_3: The value of the variable counter is 0 when the loop ends
		question_4: What will be the output of the program if the line ' for(int counter=10;counter>0;counter--)
		{' is replaced by 'for(int counter=10;counter<0;counter--){'  ?
		answer_4: the program will not display any output as the loop doesn't execute 
		*/
  
       for(int counter=10;counter>0;counter--){
	/*stm_comment: display the value of the variable counter in each iteration */
           System.out.println("counter = " + counter);
       }
    }
}
