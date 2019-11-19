/**
 @author(Priti Oli)
 @topic(Logical Operator)
 @title(JConditionalOperator)
 @goalDescription(Construct a program that performs unary operations on variables
 @source()
 */
public class JUnaryOperator {
    public static void main(String args[]){
        //   step 1: initialize variables a and b
        /* two variables a and b is assigned some value so as to perform unary operation on them  **/
        int a=100;
        int b=-1;
        // step 2: the result of comparision of post-increment operation and pre-increment operation on a is stored in variable result
        boolean result = a++ == ++a;
        /* the output of the operation is displayed in the output stream  **/
        System.out.println("result = "+result);
        // the result of pre-increment operation in java
        /* the output of the pre-increment operation in a is displayed in the output stream  **/
        System.out.println(++a);
        /* the output of the pre-increment operation in b is displayed in the output stream  **/
        System.out.println(++b);
        /* the output of the pre-decrement operation in a is displayed in the output stream  **/
        System.out.println(--a);
        /* the output of the pre-decrement operation in b is displayed in the output stream  **/
        System.out.println(--b);
        /* the output of the post-increment operation in a is displayed in the output stream  **/
        System.out.println(a++);
        /* the output of the post-increment operation in b is displayed in the output stream  **/
        System.out.println(b++);
        /* the output of the post-decrement operation in a is displayed in the output stream  **/
        System.out.println(a--);
        /* the output of the post-decrement operation in b is displayed in the output stream  **/
        System.out.println(b--);
    }}
