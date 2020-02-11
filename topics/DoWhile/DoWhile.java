package javapedagogy;

/**
  @author(Hasan Mashrique)
  @topic(DoWhile)
  @title(PrintValues_DoWhile)
  @goalDescription(Print integer values using do while loop.)
  @source()
 */
public class DoWhile {

    public static void main(String[] args) {

        /*
        question_1: what variables are declared?
        answer_1: an integer variable 'i' is declared.
        question_2: what does the following code block do?
        answer_2: It declares a integer variable and assigns a variable to it.
        
        */     

        int i = 8; // change values to > 10 and see what the codes prints.
        
        
       /*
        question_1: what does the code do inside the do while loop?
        answer_1: It prints the value of i and increments its value by one every time.
        question_2: When does the do while loop terminate?
        answer_2: After each iteration, the loop checks for the terminating condition in the while 
        bracket and terminates the loop if the condition does not match anymore.
        question_3: what does the following code block do?
        answer_3: 
  
        
        */  

        do {
            System.out.println(i); //prints the value of i
            i++;
        } while (i <= 10); //if i is >10 , it will still print once since the condition is checked after the while 
                           //  execution once.

    }

}
