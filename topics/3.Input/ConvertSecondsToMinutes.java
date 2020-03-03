/**
 * author: Kamil Akhuseyinoglu
 * topics: Input, Arithmetic expressions
 * subtopics: Usage of Scanner.nextInt and arithmetic operations such as division and modulus.
 * title: Seconds to Minutes Conversion
 * goalDescription: Construct a program that calculates the minutes and remaining seconds from the user input for seconds and prints to the console. 
 *                  For example, 500 seconds contains 8 minutes and 20 seconds.
 * source: http://pawscomp2.sis.pitt.edu/pcex/pcex_v2/index.html?lang=JAVA&set=arithmetic.time_conversion
 * input: 500
 * output: 500 second(s) is 8 minutes and 20 seconds
 */

/**
 * logical_step_1: Import Scanner class.
 * logical_step_details: Scanner class is required to read the seconds input from the user.
 * question_1: How to import another class to this program?
 * answer_1: Using the import keyword.
 */

 /**
  * stm_comment: In Java, the import keyword is used to make classes available and accessible to the current program.
  *              By importing java.util.Scanner from the java.util package, Scanner class can be used in the program by just typing Scanner, without specifying fully qualified package names i.e. java.util.Scanner.
  *              Imports are use outside the before the class declaration.
  */
import java.util.Scanner;

public class ConvertSecondsToMinutes {

    public static void main(String[] args) {
        /**
         * logical_step_2: Use Scanner to read user input from the keyboard
         * logical_step_details: Scanner class is used to get the seconds input from the user.
         * question_1: Which class is used to read user input?
         * answer_1: Scanner class
         * question_2: What makes Scanner to read from the keyboard input?
         * answer_2: System.in tells Scanner to read from the keyboard input.
         * question_3: How to get an integer value from the keyboard input if the new Scanner is stored in scan variable?
         * answer_3: Using scan.nextInt() method, the program waits and reads an integer input from keyboard. 
         */
        /**
         * stm_comment: A Scanner object is created and assigned to a variable called scan. Scanner object is required to read the input value from the user.
         *              Note that Scanner is declared by only using the name Scanner and not its full name java.util.Scanner since it is already imported using the import keyword.
         *              System.in represents the standard input stream, which by default is the keyboard. It tells the java compiler that the input will be provided through keyboard.
         *              
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer for seconds: ");
        /**
         * stm_comment: We read the seconds entered by the user through the keyboard by calling the nextInt() method because the user will enter an integer input.
         *              This lines makes the program to halt and waits the user to enter the input from the keyboard.
         *              Note that if the user enters a non-integer number, this line will throw an exception stating that an integer value is expected. 
         */
        int seconds = scan.nextInt();
        /**
         * stm_comment: The scanner objects are closed using close method. This method is called when the program will not use the scanner object anymore to read a new input value.
         */
        scan.close();
        
        /**
         * logical_step_4: Calculate the minutes and remaining seconds from the seconds taken from the user input.
         * logical_step_details: To calcualate the minutes and remaining seconds, division and modulus operators used.
         * question_1: How to find the minutes in seconds?
         * answer_1: Dividing seconds by 60.
         * question_2: How to find the remaining seconds after the minutes? For example 65 seconds is 1 minute and 5 seconds left after removing the 1 minute.
         * answer_2: Need to use modulus operator to calculate the remainder from the division by 60.
         */
        int minutes = seconds / 60;
        
        /**
         * stm_comment: % is a modulus or remainder arithmetic operator. % calculates the remainder of a division.
         *              seconds%60 returns the remainder of the division seconds/60.
         */
        int remainingSeconds = seconds % 60;
        
        /**
         * logical_step_5: Print the minutes and remaining seconds to the console.
         */
		System.out.println(seconds + " seconds is " + minutes +    " minutes and " + remainingSeconds + " seconds."); 
    }

}