
/**
 @author (Lasang Tamang)
 @topic (Arrays Lists)
 @title (ArrayList.Ex1)
 @goalDescription (demonstrate working of ArrayList in java)
 @source (https://www.tutorialspoint.com/java/java_arraylist_class.htm)
 @output ([BMW, Toyota, Nissan, Ford, Mazda])
*/
import java.util.*;
public class ArrayListEx1{
    public static void main(String[] args) {
      // Step 1: create an array list
      ArrayList<String> cars = new ArrayList<String>();

      // step 2: add elements to the array list
      cars.add("BMW");
      cars.add("Volvo");
      cars.add("Nissan");
      cars.add("Ford");
      cars.add("Mazda");

      // step 3: Insert new car "Toyota" at index postion 1
      cars.add(1, "Toyota");

      // step 4:  Remove element at index 2 
      cars.remove(2);
      
      //step 5: print the value of arrayList
      System.out.println(cars);

    }
}
