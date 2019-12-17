/**
 @author(Priti Oli)
 @topic(For Loops)
 @title(JSumOddNumbers)
 @goalDescription(Construct a program that calculates the sum of off numbers from 1 to 57 )
 @source()
 */
public class JSumOddNumbers {
    public static void main(String args[]){
//        step 1: initiase the sum of the odd numbers as 0
        int sum=0;
//       step 2: iterate through 0 to 57
        for(int i=0;i<=57;i++){
//       step 3: check if the current value of i is odd
            if(i%2==1)
//       step 4: if i is odd them add the value of i to sum
                sum=sum+i;
        }
//        step 5: display the final value of the sum
        System.out.println(" the sum is:  " + sum);
    }

}
