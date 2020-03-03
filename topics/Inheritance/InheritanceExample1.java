/**
 author: Zeyad Alshaikh
 topics: Inheritance
 subtopics: Using Inheritance, method Override
 goalDescription: Demonisterate the inheritance concept by creating a superclass Bicycle with two public integer features gear and speed, and toString function.
 Then create subclass MountainBike that extends the Bicycle with public integer feature seatHeight and Override toString function.
 source: https://www.geeksforgeeks.org/inheritance-in-java/
 output: Number of gears are 3
speed of bicycle is 100
seat height is 25
*/

/*stmt_comment: Declare a class name Bicycle */
class Bicycle
{

  /*
     logical_step_1: Declare public integer features called gear and speed.
     logical_step_details: First, declare public integer feature gear. Next, declare public integer feature speed.
     question_1: What does the following code block do?
     answer_1: First, declare public integer feature gear. Next, declare public integer feature speed.
     question_2: What features are declared?
     answer_2: Public integer gear and speed.
     question_3: What is the scope of the public features?
     answer_3: The scope of the public features is anywhere.
   */

  /*stmt_comment: declare public integer feature name gear */
  public int gear;
  /*stmt_comment: declare public integer feature name speed */
  public int speed;

  /*
     logical_step_2: Declare a parameterized constructor for class Bicycle.
     logical_step_details: Declare parameterized constructor that receives two integer parameters gear and speed, and assign the variables' value to the features.
     question_1: What does the following code block do?
     answer_1: Declare parameterized constructor that receives two integer parameters gear and speed, and assign the variables' value to the features.
     question_2: What is the number and type of arguments the constructor accept?
     answer_2: The constructor accepts two integer parameters.
   */
  public Bicycle (int gear, int speed)
  {
    /*stmt_comment: Assign the value of the parameter gear to the gear feature */
    this.gear = gear;
    /*stmt_comment: Assign the value of the parameter gear to the gear feature */
    this.speed = speed;
  }

  /*
     logical_step_3: Declare a function that returns well-formatted string.
     logical_step_details: Declare a function the return a formated string that contains Number of gears are the value of gear feature and in new line speed of bicycle is the value of speed feature.
     question_1: What does the following code block do?
     answer_1: Declare a function the return a formated string that contains Number of gears are the value of gear feature and in new line speed of bicycle is the value of speed feature.
     question_2: What is the return value of this function?
     answer_2: Number of gears are the value of gear feature and in new line speed of bicycle is the value of speed feature.
   */
  public String toString ()
  {
    /*stmt_comment: return the following string: Number of gears are the value of gear feature and in new line  speed of bicycle is  the value of speed feature  */
    return ("Number of gears are " + gear
	    + "\n" + "speed of bicycle is " + speed);
  }
}

/*
logical_step_4: Declare a subclass name MountainBike inherit from Bicycle.
logical_step_details: The MountainBike extends the Bicycle class to inherite the features and functions.
question_1: What does the following code block do?
answer_1: Declare a subclass name MountainBike inherit from Bicycle.
question_2: What does class MountainBike inherited from Bicycle?
answer_2: The class MountainBike inherited the features gear and speed and all functions from Bicycle.
*/
/*stmt_comment: Declare a class name MountainBike that inherits from Bicycle */
class MountainBike extends Bicycle
{

  /*
     logical_step_5: Declare public integer feature called seatHeight.
     logical_step_details: Declare a public integer feature seatHeight.
     question_1: What does the following code block do?
     answer_1: Declare a public integer feature seatHeight.
     question_2: What are the features that MountainBike has access to?
     answer_2: gear, speed and seatHeight
   */

  /*stmt_comment: Declare public integer feature name seatHeight */
  public int seatHeight;

  /*
     logical_step_6: Declare a parameterized constructor for class MountainBike.
     logical_step_details: Declare parameterized constructor that receives three integer parameters gear and speed and seatHeight. Then it calls the constructor of Bicycle using the keyword super and assigns the value of seatHeight to the feature seatHeight.
     question_1: What does the following code block do?
     answer_1: Declare parameterized constructor that receives three integer parameters gear and speed and seatHeight. Then it calls the constructor of Bicycle using the keyword super and assigns the vale of seatHeight to the feature seatHeight.
     question_2: What is the number and type of arguments the constructor accept?
     answer_2: The constructor accepts three integer parameters.
   */
  public MountainBike (int gear, int speed, int seatHeight)
  {
    /*stmt_comment:  invoking base-class(Bicycle) constructor */
    super (gear, speed);
    /*stmt_comment: Assign the value of the parameter seatHeight to the seatHeight feature */
    this.seatHeight = seatHeight;
  }

  /*
     logical_step_7: Declare an Override function to the toString function in Bicycle class.
     logical_step_details: Declare a function the return a formated string that contains a string from toString function in Bicycle class and in a new line seat height is the value of seatHeight feature.
     question_1: What does the following code block do?
     answer_1: Declare a function the return a formated string that contains a string from toString function in Bicycle class, and in a new line seat height is the value of seatHeight feature.
     question_2: What is the return value of this function?
     answer_2: Number of gears are the value of gear feature, in new line  speed of bicycle is  the value of speed feature, then in new line seat height is the value of seatHeight.
   */
   @Override public String toString ()
  {
    /*stmt_comment: return the following string: Number of gears are the value of gear feature, in new line  speed of bicycle is  the value of speed feature then in new line seat height is the value of seatHeight */
    return (super.toString () + "\nseat height is " + seatHeight);
  }

}


public class InheritanceExample1
{
  public static void main (String args[])
  {

    /*
       logical_step_1: Declare an object mb from the class MountainBike and initialize it by calling the constructor with 3,100, and 25 as parameters. Then print the returned value from calling toString function.
       logical_step_details: Declare an object mb from the class MountainBike and initialize it by calling the constructor with 3,100, and 25 as parameters. Then print the returned value from calling toString function.
       question_1: What does the following code block do?
       answer_1: Then print the returned value from calling toString function.
       question_2: What are the values of gear, speed and seatHeight?
       answer_2: 3,100,25
       question_3: what is the output of the following block?
       answer_3: Number of gears are 3
       speed of bicycle is 100
       seat height is 25
     */

    /*stmt_comment: Declare an object mb from the class MountainBike and initialize it with the following values 3,100, and 25 */
    MountainBike mb = new MountainBike (3, 100, 25);
    /*stmt_comment:Print the returned value from toString function in MountainBike class */
      System.out.println (mb.toString ());

  }
}
