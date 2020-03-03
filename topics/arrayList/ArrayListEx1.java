/**
 
 author: Lasang Tamang
 topics: ArrayList
 subtopics:  Create arraylist, add element to arraylist, acces elements of arraylist, remove elements from ArrayList
 goalDescription: This progom shows a person's orginal travel list and creating new travel list from orginal and making some changes on new travellist.
 source: https://beginnersbook.com/2013/12/java-arraylist/
 output: [Denmark, India, Thailand]
*/
import java.util.ArrayList;

class Main {
 public static void main(String[] args) {
  /*
    logical_step_1: Creates an arraylist travelList for holding travel list and add countries to travel
    logical_step_details: Declares an arraylist travelList which element are of type string and add Swizerland,Denmark, India, China, Thailand and Bhutan.
    question_1: What does the following code block do?
    answer_1: Creates an travelList for holding travel list and add countries to travel.
    question_2: What is the type of element of travelList?
    answer_2: String
    question_3: What element are added to travelList ?
    answer_3: Swizerland,Denmark, India, China, Thailand and Bhutan.	
 */
  ArrayList < String > travelList = new ArrayList < String > ();
  travelList.add("Swizerland");
  travelList.add("Denmark");
  travelList.add("India");
  travelList.add("China");
  travelList.add("Thailand");
  travelList.add("Bhutan");

  /*
  	logical_step_1: Creates list newTravelList from orginal Travel list travelList
  	logical_step_details: Creates an arraylist newTravelList for holding new travel which element type are of string list and add 4 countries from traveList
  	question_1: What does the following code block do?
  	answer_1: Creates list newTravelList from orginal Travel list newTravelList
  	question_2: What is the type of element of newTravelList?
  	answer_2: String
  	question_3: What element are added to arraylist ?
  	answer_3: Swizerland,Denmark, India, China and Thailand.	
  	*/
  ArrayList < String > newTravelList = new ArrayList < String > ();
  for (int i = 0; i < 5; i++) {
   newTravelList.add(i, travelList.get(i));
  }

  /*
  	logical_step_1: Removes elememnts from newTravelList and print value of newTravelList 
  	logical_step_details: Removes china from from newTravelList and remove element at 0
  	question_1: What does the following code block do?
  	answer_1:  Removes elememnts from newTravelList and print value of newTravelList 
  	question_2: What countries are removed?
  	answer_2: China and Swizerland
  	question_3: What value are printed  ?
  	answer_3: [Denmark, India, Thailand].	
  	*/
  newTravelList.remove("China");
  newTravelList.remove(0);
  System.out.print(newTravelList);

 }
}
