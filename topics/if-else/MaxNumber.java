/**
 author: Priti Oli
 topic: If-else
 title: MaxNumber
 subTopic: getting familiar with if-else
 goalDescription: this finds the largest number among three numbers
 source: 
 output: 50 is the largest Number
 
 */
 
public class MaxNumber{

  public static void main(String[] args) {
      
      /*stm_comment: store 3 numbers in 3 variable */
      int num1 = 40, num2 = 50, num3 = 10;

		/*
		logical_step_1: compute the largest number among the three numbers using if-else condition, airthmetic and logical operators
		question_1: What is the initial value of the variable counter?
		answer_1: the initial value of the variable counter is 10
		question_2: What will be the output of the program if num3 = 20
		answer_2: 50 is the largest Number
		question_3: What will be the output of the program if num3 = 90
		answer_3: 90 is the largest Number
		*/
      if( num1 >= num2 && num1 >= num3)
          System.out.println(num1+" is the largest Number");

      else if (num2 >= num1 && num2 >= num3)
          System.out.println(num2+" is the largest Number");

      else
          System.out.println(num3+" is the largest Number");
  }
}
