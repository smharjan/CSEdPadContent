
/**
 @author(Hasan Mashrique)
 @topic(Constants)
 @title(PIconstant)
 @goalDescription(Construct a program that creates a constant variable to hold number Pi and print it to the console. 
)
 @source()
*/
public class Constant {

    public static void main(String args[]) {
    
     // NEED TO ADD QUESTIONS as a story, ALSO LOGICAL STEPS
     
        /**
    @comment (We declare a double variable which stores the value of PI. We store it as final since in java constants are declared as final.)
    */
        final double PI =3.1416;  
    
     /**
    @comment (We print out the PI value.)
    */     
        System.out.println(PI);
    
    //But the following line would result in a syntax error.
    //PI = 100;
         

    }

}
