/*
@author(Zeyad Alshaikh)
@topic(Math class)
@title(JavaMathExample2.java)
@goalDescription(Demonstrate the use of Math class)
@source(https://www.javatpoint.com/java-math)
*/

public class JavaMathExample2
{
    public static void main(String[] args)
    {
        double a = 30;

        /**
 @comment( converting values to radian )
 */
        double b = Math.toRadians(a);   

        /**
 @comment( return the trigonometric sine of a )
 */
        System.out.println("Sine value of a is: " +Math.sin(a));

        /**
 @comment( return the trigonometric cosine value of a )
 */
        System.out.println("Cosine value of a is: " +Math.cos(a));

        /**
 @comment( return the trigonometric tangent value of a )
 */
        System.out.println("Tangent value of a is: " +Math.tan(a));

        /**
 @comment( return the trigonometric arc sine of a  )
 */
        System.out.println("Sine value of a is: " +Math.asin(a));

        /**
 @comment( return the trigonometric arc cosine value of a )
 */
        System.out.println("Cosine value of a is: " +Math.acos(a));

        /**
 @comment( return the trigonometric arc tangent value of a )
 */
        System.out.println("Tangent value of a is: " +Math.atan(a));

        /**
 @comment( return the hyperbolic sine of a   )
 */
        System.out.println("Sine value of a is: " +Math.sinh(a));

        /**
 @comment( return the hyperbolic cosine value of a )
 */
        System.out.println("Cosine value of a is: " +Math.cosh(a));

        /**
 @comment( return the hyperbolic tangent value of a )
 */
        System.out.println("Tangent value of a is: " +Math.tanh(a));
    }
}
