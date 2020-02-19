/**
 author: Lasang Tamang
 topics: Variable
 subtopics: static variable, local variable
 goalDescription: This program cacluates the area of circle for given radius.
 output: Area of circle is: 50.26544
*/
public class Employee {

   /*stm_comment: PI is static variable and is initalized to  3.14159*/
   static double PI = 3.14159;

   public static void main(String args[]) {
     /*
    logical_step_1: Declare variable area and radius of type double, intialize value of variable radius to 4
    question_1: What variables are declared?
    answer_1: area,radius
    question_2: what is the data type of area and radius?
    answer_2: double
    question_3: What value has been initalzed to radius?
    answer_3: 4
    question_4: what does the following block of code do?
    answer_4: Declare variable area and radius of type double, intialize value of variable radius to 4
    */
      /*stm_comment: area is local variable for main method*/
      double area;
      /*stm_comment: raidus is local variable for main method and is intialized to 4*/
      double radius = 4;

    /*
    logical_step_2: Calcualtes the area of circle nad prints the value
    question_1: What does radius*radius*PI gives?
    answer_1: gives area of  circle
    question_2: What does following block of code do?
    answer_2: Calcualtes the area of circle and print the value
   */
    area = radius*radius*PI;
    System.out.println("Area of circle is: " + area);
   }
}
