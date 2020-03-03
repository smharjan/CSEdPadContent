/**
 author: Zeyad Alshaikh
 topics: Math class
 subtopics: using Math.PI
 goalDescription: Construct a program that finds the area and circumference of circle.
 source:https://beginnersbook.com/2014/01/java-program-to-calculate-area-and-circumference-of-circle/
 output: The area of circle is: 28.274333882308138
The circumference of the circle is:18.84955592153876
*/
public class MathExample2{

 public static void main (String[]args)
  {

    /*
       logical_step_1: Declare double variable called radius and assign 3 as a value.
       logical_step_details: Declare double variable called radius and assign 3 as a value.
       question_1: What does the following code block do?
       answer_1: Declare double variable called radius and assign 3 as a value.
       question_2: What the value of radius?
       answer_2: 3
     */
    double radius = 3;

    /*
       logical_step_2: Calculate the area of the circle and the circumference.
       logical_step_details: First declare double variable called area and assign the result from the formula Math.PI * (radius * radius) to it.
       Then declare another double variable named circumference and assing the result from the formula Math.PI * 2*radius to it.
       question_1: What does the following code block do?
       answer_1:First declare double variable called area and assign the result from the formula Math.PI * (radius * radius) to it.
       Then declare another double variable named circumference and assing the result from the formula Math.PI * 2*radius to it.
       question_2: what are the values of area and circumference?
       answer_2: 28.27 and  18.84
     */
    double area = Math.PI * (radius * radius);

    double circumference = Math.PI * 2 * radius;
    /*
       logical_step_3: Print the area and circumference of the circle.
       logical_step_details: First, it prints the calculated area and in new line it print the calculate circumference.
       question_1: What does the following code block do?
       answer_1: First, it prints the calculated area and in new line it print the calculate circumference.
       question_2: What is the output of the following block?
       answer_2: The area of circle is: 28.274333882308138
       The circumference of the circle is:18.84955592153876
     */
      System.out.println ("The area of circle is: " + area);
      System.out.println ("The circumference of the circle is:" +
			  circumference);


  }

}
