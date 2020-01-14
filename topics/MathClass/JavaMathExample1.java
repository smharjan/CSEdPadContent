/*
@author(Zeyad Alshaikh)
@topic(Math class)
@title(JavaMathExample1.java)
@goalDescription(Demonstrate the use of Math class)
@source(https://www.javatpoint.com/java-math)
*/

public class JavaMathExample1
{
    public static void main(String[] args)
    {
        double x = 28;
        double y = 4;

        /**
         @comment( return the maximum of two numbers)
         */
        System.out.println("Maximum number of x and y is: " +Math.max(x, y));

        /**
 @comment( return the square root of y )
 */
        System.out.println("Square root of y is: " + Math.sqrt(y));

        /**
 @comment(returns 28 power of 4 i.e. 28*28*28*28 )
 */
        System.out.println("Power of x and y is: " + Math.pow(x, y));

        /**
 @comment( return the logarithm of given value)
 */
        System.out.println("Logarithm of x is: " + Math.log(x));
        System.out.println("Logarithm of y is: " + Math.log(y));

        /**
 @comment( return the logarithm of given value when base is 10)
 */
        System.out.println("log10 of x is: " + Math.log10(x));
        System.out.println("log10 of y is: " + Math.log10(y));

        /**
 @comment( return the log of x + 1 )
 */
        System.out.println("log1p of x is: " +Math.log1p(x));

        /**
 @comment( return a power of 2   )
 */
        System.out.println("exp of a is: " +Math.exp(x));

        /**
 @comment( return (a power of 2)-1 )
 */
        System.out.println("expm1 of a is: " +Math.expm1(x));
    }
}
