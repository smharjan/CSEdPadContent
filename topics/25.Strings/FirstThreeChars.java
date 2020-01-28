/***
@author(Jordan Barria-Pineda)
@topic(Strings)
@title(FirstThreeChars.java)
@goalDescrption(JAVA program to extract the three first characters from input entered by the user)
 ***/

import java.util.Scanner;

public class FirstThreeChars {
    public static void main(String[] args){
        // Step 1: Create a scanner to read from keyboard
        Scanner keyboard = new Scanner (System.in);
        
        // Step 2: Prompt user for typing text input
        System.out.print("Enter any string: ");

        // Step 3: Store user input in a String variable
        String input = keyboard.nextLine();
        
        // Step 4: Define variable firstThreeChars to store the first X characters of the user input
        String firstThreeChars = "";
        
        // Step 5: Assign firstThreeChars the characters subset starting from position 0 until position 2
        firstXChars = input.substring(0,3);
        
        // Step 6: Prints to the console the three first characters of the user input
        System.out.println("First 3 characters: "+firstThreeChars);
  }
}
