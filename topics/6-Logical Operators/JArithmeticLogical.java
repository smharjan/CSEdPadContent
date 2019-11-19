/**
 @author(Priti Oli)
 @topic(Logical Operator)
 @title(JArithmeticLogical)
 @goalDescription(Construct a program that demonstrates the checks whenther a given year is leap year or not
 by performing some logical operations)
 @source()
 */
public class JArithmeticLogical {
 public static void main(String[] args) {

  // step 1: integer values are assigned to variables a , b and c
  int a = 7, b = 2, c = 4;
  //step 2: store the result in the variable result
  boolean result;
  /* a comparison is made between a and b . a>b results to true if a is greater to than a.
    similary b>c results to true if b is greater than c. the variable result is set to true if  a is greater than b and
     b is greater than c **/
  result = (a > b) && (b > c);
 /* the result of the variable 'result' is displayed on the screen**/
  System.out.println(result);

  /* a comparison is made between a and b . a>b results to true if a is greater to than a.
    similary b>c results to true if b is greater than c. the variable result is set to true if  a is greater than b or
     b is greater than c **/
  result = (a > b) || (b > c);
   /* the result of the variable 'result' is displayed on the screen**/
  System.out.println(result);
 }

}
