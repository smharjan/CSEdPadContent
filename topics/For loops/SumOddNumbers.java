/**
 author: Priti Oli
 topic: For Loops
 title: SumOddNumbers
 subTopic: getting familiar with the increment operator in for-loop
 goalDescription: this program sums up the odd number from 1 to 50 
 source: 
 output:  the sum is:  625
 
 */
 
public class SumOddNumbers {
    public static void main(String args[]){
      		/*
		logical_step_1: Declare a variable sum to store the sum of all the odd number
		question_1: What is the value of the variable sum initially ?
		answer_1: the initial value of the variable sum is 0
		question_2: What will happen if you do not initialise the value of the variable sum?
		answer_2: The program will throw a compile time error
		*/
        int sum=0;
            	/*
		logical_step_2: Declare a for loop by initialising the value of the iterator i to 1 
		question_1: What is the initial value of the iterator i?
		answer_1: the initial value of the iterator is 1
		question_2: What is the value of the variable sum when i=5
		answer_2: The value of the variable sum=9, when i-5
		question_3: What will be the output of the program if the value of the variable i is initialised to 0  ?
		answer_3: the program will output the sum of even number from 1 to50 instead of sum of odd number  from 1 to 50
       		question_4: What will be the output of the program if the iterator i is incremnted by 5('i+=2' is replaced by 'i+=5')  ?
		answer_4: the program will output the sum of the number divisible by 5 in the range of 1 to 50 
		*/
        for(int i=1;i<=50;i+=2){
            sum=sum+i;
        }
        System.out.println(" the sum is:  " + sum);
    }

}
