/**
 author: Priti Oli)
 topic: Logical Operator
 subTopic: using logical operator with conditional/ternary operator 
 title: Leapyear
 goalDescription: this program checks whether a year is leap year or not
 source: 
 output: It's a leap Year
 */
public class Leapyear {
    public static void main (String[] args){
        
        /*stm_comment: initialise the variable year to store the value of year */

        int year=2020;
        String leapYear;
        
        /*
		logical_step_1: use logical and conditional operators to check whether a year is leap year or not.
		logical_step_details: using modulus operator check if the variable year is divisble by 4 or 400 and not divisible
		by 100, using logical operator 'and' and 'or' , check if the conditions are satisfied using ternary operator and 
		store the result in variable leapYear.
		question_1: What is the initial value of the variable leapYear?
		answer_1: the value of the variable leapYear is 'It's a leap Year'
		question_2: What is the value of the variable leapyear if year=2021
		answer_2: The value of the variable leapyear will be 'Not a Leap year!'
		
	*/

        leapYear=(year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))?"It's a leap Year":"Not a Leap year!";
        System.out.println(leapYear);

    }

}
