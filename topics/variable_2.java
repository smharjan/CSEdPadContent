/*
@author(Lasang Tamang)
@topic(variables)
@title(MyVariable)
@goalDescription(Decalre variables and assign values.)
@source()
*/
public class MyVariable {
  public static void main(String[] args) {
   //Step 1: declares variables  and assign values
   /**
    @comment(the variable name of type string is declared and initalized to value of "Will Smith")
     */
    String name = "Will Smith";
    /**
    @comment(the variable age and noOfChild of type int is declared and initalized to value of 30 and 3 respetively)
    /**
    @comment(Note that it is also possible to declare these integrs separately like int age = 30 and int noOfChild=3")
     */
    int age = 30, noOfChild = 3;
    /**
    @comment(the variable bankDeposit of type double is declared and initalized to value of 125.43)
     */
    double bankDeposit = 125.43;
    
   //Step 2: print the value of variables
   /**
    @comment(print the  value of variable name)
     */
    System.out.println("My name is" + name);
     /**
    @comment(print the  value of variable age and noOfChild)
     */
    System.out.println("I am "+ age +" years and i have "+ noOfChild +" children"); 
     /**
    @comment(print the  value of variable bankDeposit)
     */ 
    System.out.println("I have bank deposit of only $" + bankDeposit);
  }
}