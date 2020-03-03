/**
 
 author: Lasang Tamang
 topics: ArrayList
 subtopics:  Create arraylist, add element to arraylist, modify, remove elements from ArrayList
 goalDescription: This progom shows a person's orginal travel list and creating new travel list from orginal and making some changes on new travellist.
 source: 
 output:iphone 11
apple watch
umbrella
*/
import java.util.*;
import java.util.ArrayList;

public class Main {
 public static void main(String[] args) {
  /*
    logical_step_1: Initalzes an arraylist wishList with first 3 items
    logical_step_details: Creates and initialzes an arraylist wishList which element are of type string and add iphone 10, apple watch and go pro
    question_1: What does the following code block do?
    answer_1: Initalzes an arraylist wishList with first 3 items
    question_2: What is the type of element of travelList?
    answer_2: String
    question_3: What element are added to travelList ?
    answer_3: iphone 10, apple watch and go pro	
 */


  ArrayList < String > wishList = new ArrayList < String > () {
   {
    add("iphone 10");
    add("apple watch");
    add("go pro");
   }
  };

  /*
  	logical_step_2: Modifies wish list
  	logical_step_details: Modies iphone 1o to iphone 11, removes go pro and add umbrella
  	question_1: What does the following code block do?
  	answer_1:  Modifies wish list
  	question_2: What item is modifeid to what?
  	answer_2: iphone 11 is modifed to iphone 11
  	question_3:waht item is removed ?
  	answer_3: apple watch.
  	question_3:waht item is added ?
  	answer_3: go pro
  	*/
  wishList.set(0, "iphone 11");
  wishList.remove("go pro");
  wishList.add("umbrella");

  /*
  	logical_step_2: Displays wishlist
  	logical_step_details: Itreates thorugh each item of wishlist and displays them
  	question_1: What does the following code block do?
  	answer_1: Displays wishlist
  	*/
  for (String item: wishList)
   System.out.println(item);


 }
}
