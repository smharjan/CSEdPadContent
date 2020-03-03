/**
 author: Zeyad Alshaikh
 topics: Inheritance
 subtopics: Using Inheritance
 goalDescription: Demonisterate the inheritance concept by creating a superclass Animal and subclass Cat.
 source: https://www.javatpoint.com/inheritance-in-java
 output: meowing...
eating...
*/


class Animal
{

  /*
     logical_step_1: Declare a function that prints eating....
     logical_step_details: Declare a function name eat where this function print eating... to the screen.
     question_1: What does the following code block do?
     answer_1: print eating... to the screen
   */
  void eat ()
  {
    /*stmt_comment: Printing eating... */
    System.out.println ("eating...");
  }
}

/*
logical_step_2: Declare a subclass name Cat inherited from Animal.
logical_step_details: The Cat class extends the Animal class to inherite the features and functions.
question_1: What does the following code block do?
answer_1: Declare a subclass name Cat inherited from Animal.
question_2: What does class Cat inherited from Animal?
answer_2: The function eat.
*/
/*stmt_comment: Declare a class name Cat that inherite from Animal */
class Cat extends Animal
{

  /*
     logical_step_1: Declare a function that prints meowing....
     logical_step_details: Declare a function name meow where this function print meowing... to the screen.
     question_1: What does the following code block do?
     answer_1: print meowing... to the screen
   */
  void meow ()
  {
    /*stmt_comment: Printing eating... */
    System.out.println ("meowing...");
  }
}

class InheritanceExample2
{
  public static void main (String args[])
  {

    /*
       logical_step_1: Declare an object c from the class Cat and initialize it by calling the default constructor. Then it call meow and eat functions.
       logical_step_details: Declare an object c from the class Cat and initialize it by calling the default constructor.
       question_1: What does the following code block do?
       answer_1: Create an object from the class Cat and call meow and eat function.
       question_2: what is the output of the following block?
       answer_2:meowing...
       eating...
     */

    /*stmt_comment: Declare an object c from the class Cat */
    Cat c = new Cat ();
    /*stmt_comment: Call the function meow from the class Cat */
      c.meow ();
    /*stmt_comment: Call the function eat from the class Animal */
      c.eat ();

  }
}
