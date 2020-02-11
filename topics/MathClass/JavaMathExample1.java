/*
author: Zeyad Alshaikh
topics: Math class
subtopics: using Math.max, Math.sqrt, Math.pow, Math.log, Math.log10, Math.log1p,Math.exp and Math.expm1
goalDescription: This program demonstrates how to use Math class.
source: https://www.javatpoint.com/java-math
output:Maximum number of x and y is: 28.0
Power of x and y is: 614656.0
Logarithm of x is: 3.332204510175204
log10 of x is: 1.4471580313422192
log1p of x is: 3.367295829986474
exp of x is: 1.446257064291475E12
expm1 of x is: 1.446257064290475E12
*/

public class JavaMathExample1
{
    public static void main(String[] args)
    {
        double x = 28;
        double y = 4;

        /*@stm_comment: Math.max(x,y) return the maximum of x and y */
        System.out.println("Maximum number of x and y is: " +Math.max(x,y));

        /*@stm_comment: Math.sqrt(y) returns the square root of y* /
        System.out.println("Square root of y is: " + Math.sqrt(y));

        /*@stm_comment: Math.pow(x, y) returns the power of x to y */
        System.out.println("Power of x and y is: " + Math.pow(x,y));

        /*@stm_comment: Math.log(x) returns the natural logarithm of x */
        System.out.println("Logarithm of x is: " + Math.log(x));

        /*@stm_comment: Math.log10(x) returns the base 10 logarithm of x */
        System.out.println("log10 of x is: " + Math.log10(x));

        /*@stm_comment: Math.log1p(x) returns the natural logarithm of 1+x */
        System.out.println("log1p of x is: " +Math.log1p(x));

        /*@stm_comment: Math.exp(x) returns e (the base of the natural logarithms) to the power of x */
        System.out.println("exp of a is: " +Math.exp(x));

        /*@stm_comment: Math.expm1(x) returns e (the base of the natural logarithms) to the power of (x-1) */
        System.out.println("expm1 of x is: " +Math.expm1(x));
    }
}
