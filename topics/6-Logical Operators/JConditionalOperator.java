/**
 @author(Priti Oli)
 @topic(Logical Operator)
 @title(JConditionalOperator)
 @goalDescription(Construct a program that checks whenther a given year is leap year or not
 by performing some logical operations)
 @source()
 */
public class JConditionalOperator {
    public static void main (String[] args){
        //step 1: declare a variable to store the value of year
        int year=2020;
        //step 2: store a variable to store the string that displays whether or not a year is leap year
        String leapYear;
        //conditional operator to check leap year
        /** the condition for a year to be leap year is evaluated by using logical operator along with airthmetic operator.
         the result is evaluated using conditional operator and stored in the variable leap year*/

        leapYear=(year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))?"It's a leap Year":"Not a Leap year!";
        // step 3:display whether its a leap year or not
        /** the result is then displayed in a new line */
        System.out.println(leapYear);

    }

}
