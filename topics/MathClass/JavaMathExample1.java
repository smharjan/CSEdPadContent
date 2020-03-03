/**
 author: Zeyad Alshaikh
 topics: Math class
 subtopics: using Math.sqrt, Math.pow, Math.PI, Math.acos
 goalDescription: Construct a program that finds the length of hypotenuse in of a right triangle by using Pythagoras theorem then finds the angles of that triangle.
 source: http://javauk.blogspot.com/2013/07/java-hypotenuse-right-triangle.html
 output: The length of the hypotenuse (c) is: 10.0
Angles are A = 36.86989764584401, B = 53.13010235415598, C = 90
*/
public class MathExample1{

  public static void main (String[]args)
  {

    /*
       logical_step_1: Declare double variables called a, b, and c to represent each side of the triangle and assign a to 6 and b to 8.
       logical_step_details: First we declare double variables a and b and a value to it. We also declare another a double variable c to hold the length of hypotenuse.
       question_1: What does the following code block do?
       answer_1: Declare double variables called a, b, and c to represent each side of the triangle and assign a to 6 and b to 8.
       question_2: What variables are declared?
       answer_2: Three double variables a, b, and c  are declared.
       question_3: What are the values of each variable?
       answer_3: The value of a is 6, b is 8 and c is 0.0d
     */

    /*stmt_comment: initialize the variables a to 6, b to 8 and c to 0.0d */
    double a = 6, b = 8, c;

    /*
       logical_step_2: Calculate the length of the hypotenuse (c) by using Pythagoras theorem.
       logical_step_details: calculate the length of the hypotenuse (c) by using Math.sqrt and Math.pow functions.
       question_1:What does the following code block do?
       answer_1: Calculate the length of the hypotenuse (c) by using Pythagoras theorem where c = squar root of power 2 of a plus the power 2 of b.
       question_2: What the value of c?
       answer_2: 10
     */
    /*stmt_comment: Assing the result from Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) to c */
      c = Math.sqrt (Math.pow (a, 2) + Math.pow (b, 2));

    /*
       logical_step_3: Declare two double variables A and B and assign it the calculated value the angles of the right triangle.
       logical_step_details: First, find the angle A by applying the arc cosine to the formula (b * b + c * c - a * a) / (2 * b * c).
       Then convert to convert into degrees by multiply it by 180 and devide it by PI.
       After that, find the angle B by applying the arc cosine to the formula (a * a + c * c - b * b) / (2 * a * c) .
       Then convert to convert into degrees by multiply it by 180 and devide it by PI.
       question_1: What does the following code block do?
       answer_1: First, find the angle A by applying the arc cosine to the formula (b * b + c * c - a * a) / (2 * b * c).
       Then convert to convert into degrees by multiply it by 180 and devide it by PI.
       After that, find the angle B by applying the arc cosine to the formula (a * a + c * c - b * b) / (2 * a * c) .
       Then convert to convert into degrees by multiply it by 180 and devide it by PI.
       question_2: What the value of A?
       answer_2: 36.86
       question_3: What the value of B?
       answer_3: 53.13
     */
    /*stmt_comment: initialize the variables A to the value of Math.acos((b * b + c * c - a * a) / (2 * b * c)) */
    double A = Math.acos ((b * b + c * c - a * a) / (2 * b * c));
    /*stmt_comment: Assing the variable A to the value of (A * 180) / Math.PI */
      A = (A * 180) / Math.PI;

    /*stmt_comment: initialize the variables B to the value of Math.acos((a * a + c * c - b * b) / (2 * a * c)) */
    double B = Math.acos ((a * a + c * c - b * b) / (2 * a * c));
    /*stmt_comment: Assing the variable B to the value of (B * 180) / Math.PI */
      B = (B * 180) / Math.PI;

    /*
       logical_step_4: Print the length of the hypotenuse (c) and the angles of A and B.
       logical_step_details: First, it print the length of hypotenuse (c) then it print the angles of A and B in new line.
       question_1: question_1: What does the following code block do?
       answer_1: First, it print the length of hypotenuse (c) then print the angles of A and B in new line.
       question_2: what the ouput of the following block?
       answer_2:The length of the hypotenuse (c) is: 10.0
       Angles are A = 36.86989764584401, B = 53.13010235415598, C = 90
     */

    /*stmt_comment: Print The length of the hypotenuse (c) is: the value of the c variable */
      System.out.println ("The length of the hypotenuse (c) is: " + c);
    /*stmt_comment: Print TAngles are A =  the value of the A variable, B = the value of the B variable, C = 90 */
      System.out.println ("Angles are A = " + A + ", B = " + B + ", C = " +
			  90);

  }

}
