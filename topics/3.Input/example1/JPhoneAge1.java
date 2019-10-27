/**
@author(Kamil Akhuseyinoglu)
@topic(inputs)
@title()
@goalDescription(Construct a program that determines whether it is time to buy a new phone based on the inputs that it receives from the user. A new phone should be bought if the phone breaks or the phone is at least 3 years old.)
@source()
*/
import java.util.Scanner;
public class JPhoneAge1 {
  public static void main(String[] args){
    //Step 1: Read the user inputs
    /**
    @comment()
     */
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the phone age in years:");
    int phoneAge = scan.nextInt();
    System.out.println("Enter whether the phone is broken (true or false):");
    boolean isBroken = scan.nextBoolean();    
    scan.close();
    //Step 2: Write the boolean expression to determine whether it is time to buy a new phone
    boolean needPhone = isBroken || phoneAge >= 3;
    System.out.println(needPhone);
  }
}
