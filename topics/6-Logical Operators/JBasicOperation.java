/**
 @author(Priti Oli)
 @topic(Logical Operator)
 @title(JBasicOperation)
 @goalDescription(Construct a program that demonstrates the basic logical operations)
 @source()
 */
public class JBasicOperation {

    public static void main(String args[]) {
        // step 1 : variable declaration
        /** we decalre two boolean variables a and b . a is assignment true and b is assigned false*/
        boolean a = true;
        boolean b = false;

        /** we decalre two integer variables x and y . x equals 1010 and y equals 1011*/
        int x=1010;
        int y=1011;

        //step 2: we output the result of differnt logical operation on a and b
        /** the output of boolean 'and' operation of a and b is displayed to the output stream . the ouput is true if and
         only if both a and b is true */
        System.out.println("a && b = " + (a&&b));
        /** the output of boolean 'or' operation of a and b is displayed to the output stream . the ouput is true if
         either a or b is true */
        System.out.println("a || b = " + (a||b) );
        /** this is a combination of 'and' and 'not' operation. there is negation on the result of
         'and' operation of a and b. negation operation outputs the complement for a given input */
        System.out.println("!(a && b) = " + !(a && b));
        /** this is a bitwise xor operation on the variable x and y. Each bit of x is compared to the same position's
         bit value of y, the output bit contains 0 for same bit in a given position and 1 otherwise */
        System.out.println("x ^ y = " + (x^y));
        /** this is a bitwise and operation on the variable x and y. each bit of x is compared to the same position's
          bit value of y and the output bit contains 0 if both the bit is 1 and 0 otherwise */
        System.out.println("x & y = " + (x&y) );
        /** this is a bitwise and operation on the variable x and y. each bit of x is compared to the same position's
         bit value of y and the output bit contains 1 if either of the bit value is 1 , 0 otherwise
         */
        System.out.println("x | y = " + (x|y) );

    }

}
