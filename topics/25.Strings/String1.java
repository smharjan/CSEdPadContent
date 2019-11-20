/***
@author(Jeevan Chapagain)
@topic(String )
@title(String1.java)
@goalDescrption(JAVA program to illustrate how strings are declared)
 
***/
 
 
 class ExString {
   public static void main(String[] args)
   {
       // Step1: Declare String without using new operator
       String s = "University of Memphis";
        // Step2: Prints the String.
       System.out.println("String s = " + s);
        // Step3: Declare String using new operator
       String s1 = new String("University of Memphis");
        // Step4: Prints the String.
       System.out.println("String s1 = " + s1);
   }
}

