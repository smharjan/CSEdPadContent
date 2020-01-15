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

         /**
          @comment(We define integer value i.)
         */    
        int i = 8; // change values to > 10 and see what the codes prints.
         
        /**
          @comment(Start of the do while loop which prints values up to 10.)
         */    
        do {
            System.out.println(i); //prints the value of i
            i++;
        } while (i <= 10); //if i is >10 , it will still print once since the condition is checked after the while 
                           //  execution once.

    }

}
