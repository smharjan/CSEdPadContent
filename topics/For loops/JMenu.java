/**
 @author(Priti Oli)
 @topic(For Loops)
 @title(JMenu)
 @goalDescription(Construct a program that display different types of coffee. The program displays different items in
 an array , one at a time, using for loop)
 @source()
 */

public class JMenu {
    public static void main(String args[]){
//        step 1: initialise a variable j=0 to keep track of index of the items
        int j=0;
//        step 2: initialise a string array containing the list of items
        String items[]={"Espresso","Double Espresso","Americano","Latte","Cappuccino","Mocha","Affogato"};
//        step 3: iterate over each item in the string array items
        for(String item:items){
//            print the index and each item contained in the array
            System.out.println(  ++j+". "+item);
        }

    }

}
