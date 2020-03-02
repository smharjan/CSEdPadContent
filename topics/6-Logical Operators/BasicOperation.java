/**
 author: Priti Oli
 topic: Logical Operator
 title: BasicOperation
 subTopic: getting familiar with logical operations in Java
 goalDescription: this program demonstrates the basic logical opertions that can be perfomed in java
 source: 
 output:a || b = true
        !(a && b) = true
        x ^ y = 1
        x & y = 1010
        x | y = 1011
 
 */
 
public class BasicOperation {

    public static void main(String args[]) {
	/* stm_comment: Declare the value of variables to perform logical operations */
        boolean a = true;
        boolean b = false;
        int x=1011;
        int y=1010;

        /* logical_step1: perform different logical operations and output the result
	    logical_step_details: display the output of logical and (&&), logical or(||) and logical not(!) operation on 
	    the boolean variable a and b . display the output of bitwise xor (^) , bitwise or(|) and bitwise and(&) 
	    operation on the variable x and y.
            System.out.println("a && b = " + (a&&b));
            question_1: what is the output displayed by 'System.out.println("!(a && b) = " + !(a && b));'
            answer 1: !(a && b) = true
            question_2: what is the output for 'System.out.println("a || b = " + (a||b) );' if  the value of a=false
            answer 2: a || b = false
            question_3: what is the output for 'System.out.println("x & y = " + (x&y) );'
            answer 3: x & y = 1010
            question_1: what is the output displayed by 'System.out.println("x ^ y = " + (x^y));' if x=1010
            answer 1: x ^ y = 0
         */
        System.out.println("a || b = " + (a||b) );
        System.out.println("!(a && b) = " + !(a && b));
        System.out.println("x ^ y = " + (x^y));
        System.out.println("x & y = " + (x&y) );
        System.out.println("x | y = " + (x|y) );

    }

}
