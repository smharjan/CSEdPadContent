/**
 @author : Jordan Barria-Pineda
 @topics : Recursion
 @subtopics: recursive method calling, recursion base case
 @goalDescription:This program computes Fibonacci numbers using a recursive method
 @source: Big Java Book (3rd edition), page 603 (only difference is that original input n was 50)
 @output : Enter n: 7
           fib(1)=1
           fib(2)=1
           fib(3)=2
           fib(4)=3
           fib(5)=5
           fib(6)=8
           fib(7)=13
*/

public class RecursiveFib{
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
     logical_step_x: Define a function that computes a Fibonacci number taking integer param n and returning the nth Fibonacci number
  */
  public static long fib(int n){
    //@stm_comment: the recursion base case is whenever n is either 1 or 2, where the result of fib() is 1
    if(n<=2) return 1;
    //@stm_comment: the recursion base case is whenever n is either 1 or 2, where the result of fib() is 1
    else return fib(n-1) + fib(n-2);
  }
}
