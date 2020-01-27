/**
@author(Lasang Tamang)
@topic(variables)
@title(MyProgram)
@goalDescription(Decalre variables and assign values.)
@source()
@question("1. What is the output of the code? 2.What are the types of vairables used here? )
*/
public class MyProgram {
  public static void main(String[] args) {
   //Step 1: declares variables  and assign values
   /**
    @comment(the variable isStudent of type boolean is declared and initalized to true value)
     */
   boolean isStudent = true;
    /**
    @comment(the variable score of type float is declared and initalized to 91.99f value)
     */
   float score = 91.99f;
    /**
    @comment(the variable feedback of type string is declared and initalized to "You did excellent" value)
     */
   String feedback = "You did excellent";
    
    //Step 2: print the value of variables
     /**
    @comment(print the value of varaible isStudent)
     */
    System.out.println("Is Student? :" +isStudent);
     /**
    @comment(print the value of varaible score)
     */
    System.out.println("score : " + score);
     /**
    @comment(print the value of varaible feedback)
     */
    System.out.println("feedback : " +  feedback);
  }
}
