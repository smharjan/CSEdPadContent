/**
source: Here we keep the URL if there exist any source
author : Jordan Barria-Pineda
topics : Recursion
subtopics: recursive method calling, recursion base case
goalDescription: This program computes Fibonacci numbers using a recursive method
source: Big Java Book (3rd edition), page 603 (only difference is that original input n was 50)
output : Enter n: 7
           fib(1)=1
           fib(2)=1
           fib(3)=2
           fib(4)=3
           fib(5)=5
           fib(6)=8
           fib(7)=13
**/

public class RecursiveFibonacci{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = in.nextInt();
    for(int i=1; i<=n; i++){
      long f = fib(i);
      System.out.println("fib("+ i ") = " + f);
    }
  }
  
  /*
     stm_comment: Define a function that computes a Fibonacci number taking integer param n and returning the nth Fibonacci number
  */
  public static long fib(int n){
     /*
    logical_step_1: the recursion base case is whenever n is either 1 or 2, where the result of fib() is 1, which is the returned value of the function
    question_1: what case for recursive algorithms is this if statement representing?
    answer_1: the base case
    */
    if(n<=2) return 1;
     /*
    logical_step_2: whenever n is different than 1 or 2, recursively calls fib() of n-1 and fib() of n-2 in order to return the sum of both values
    question_1: what case for recursive algorithms is this if statement representing?
    answer_1: the recursive call case
    */
    else return fib(n-1) + fib(n-2);
  }
}
