/**
 author: Priti Oli
 topic: For Loops
 title: JMultiply
 subTopic: getting familiar with for-loop in java
 goalDescription: this program outputs the multiplication table of 6
 source: 
 output:  the sum is:   6 * 1 = 6 
 6 * 2 = 12 
 6 * 3 = 18 
 6 * 4 = 24 
 6 * 5 = 30 
 6 * 6 = 36 
 6 * 7 = 42 
 6 * 8 = 48 
 6 * 9 = 54 
 6 * 10 = 60 
 
 */
 
public class JMultiply {
    public static void main(String args[]){
      		/*
		logical_step_1: Declare a variable var 
		question_1: What is the value of the variable var  ?
		answer_1: the value of the variable var is 6
		question_2: What will be the output of the program if you initialise the value ot variable to 9 (replace 'int var=6;' with 'int var=9;')
		answer_2: The program will output the multiplication table for 9
		*/
        int var=6;
            		/*
		logical_step_2: Declare a for loop by initialising the value of the iterator i to 1 
		question_1: What is the initial value of the iterator i?
		answer_1: the initial value of the iterator is 1
		question_2: What is the output when the value of i=3
		answer_2: The output will be '6 * 3 = 18 '
		*/
        for(int i=1;i<=10;i++){
           System.out.println(" "+var+" * "+i+" = "+var*i+" "); 
        }
        
    }

}
