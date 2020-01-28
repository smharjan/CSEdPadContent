/***
@author(Jordan Barria-Pineda)
@topic(Strings)
@title(FirstXChars.java)
@goalDescrption(JAVA program to extract the X first characters from input entered by the user. X is also defined by the user through standard input)
 ***/

import java.util.Scanner;

public class FirstXChars {
    public static void main(String[] args){
        // Step 1: Create a scanner to read from keyboard
        Scanner keyboard = new Scanner (System.in);
        
        // Step 2: Prompt user for typing text input
        System.out.print("Enter any string (e.g your name): ");

        // Step 3: Store user input in a String variable
        String input = keyboard.nextLine();
        
        // Step 4: Prompt user for defining the value of X (number of first characters that will be extracted from the input)
        System.out.print("Enter the number of first characters you want to extract: ");
        
        // Step 5: Store user input in a int variable
        int x = keyboard.nextInt();
    
        // Step 6: Define variable firstXChars to store the first X characters of the user input
        String firstXChars = "";
        
        // Step 7: Assign firstXChars the input substring starting from position 0 until position X
        firstXChars = input.substring(0,X);
        
        // Step 8: Prints to the console the X first characters of the user input
        System.out.println("First " + x + " characters: "+firstXChars);
  }
}
[/blocked] 
