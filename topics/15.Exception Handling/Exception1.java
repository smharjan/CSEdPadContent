/***
@author(Jeevan Chapagain)
@topic(Exception Handling)
@title(Exception1.java)
@goalDescrption(JAVA program to handle arithmetic exception)
***/
 
Public class Arithmetic{
 public static void main(String[] args) {
   //code inside try block runs if it is true
   try {
           //Step 1 : Declare and Initialize Variable
           int x = 5, y = 0;
           //Step 2 : Initialize a new variable and calculate division
           int z = x / y;  // cannot divide by zero
           // Step 3: Print out the result
           System.out.println ("Result = " + z);
       }
       // catch keyword will handle the exception since we are calculating arithmetic expression we use ArithmeticException
       catch(ArithmeticException e) {
         //Step 4: Print the exception message
           System.out.println ("Can't divide a number by 0");
       }
 }
}

