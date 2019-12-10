/**
 @author (Lasang Tamang)
 @topic (Arrays Lists)
 @title (ArrayList.Ex2)
 @goalDescription (demonstrate working of ArrayList in java)
 @source (https://www.geeksforgeeks.org/arraylist-in-java/)
 @output (0 10 2 3 5)
*/
import java.util.*;
public class ArrayListEx2 {
    public static void main(String[] args) {
        // Step 1: create an array list
        ArrayList < Integer > myNum = new ArrayList < > ();

        // step 2: add elements to the array list
        for (int i = 0; i < 6; i++) {
            myNum.add(i);
        }

        // step 3: Modify the element add index 2
        myNum.set(1, 10);

        // step 4: Remove element at index 4
        myNum.remove(4);

        // step 5 Printing elements one by one 
        for (int i = 0; i < myNum.size(); i++) {
            System.out.print(myNum.get(i) + " ");
        }
    }
}
