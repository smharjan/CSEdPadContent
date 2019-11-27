/***
@author(Jeevan Chapagain)
@topic(Exception Handling)
@title(Exception2.java)
@goalDescrption(JAVA program to handle string out of bounds exception)
***/
 
Public class Main {
 public static void main(String[] args) {
   //code inside try block runs if it is true
   try {
         //Step 1 : Initialize a variable with null value
           String x = null;
         //Step 2 : Print out the char at index 0 which produces error since our variable is null
           System.out.println(x.charAt(0));
       }
    
       // Step 3: catch keyword will handle the exception since we are using  null pointer we use NullPointerException
       catch(NullPointerException e) {
         //Step 4: Print the exception
           System.out.println("NullPointerException..");
       }
 }
}

