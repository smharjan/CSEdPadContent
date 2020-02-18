/**
 author: Lasang Tamang
 topics: Variables
 subtopics: local variables, instance, static variables
 goalDescription: Construct a program that stores the player information and display them.
 source: Memphis team created on own
 output: 1
		Lasang
		Nepal
		2
		Jeevan
		Nepal
 */

public class Player { 
    
    
    /* 
    logical_step_1: Declare variables needed to store player id,name and country. 
    logical_step_details: Declare a variable id, name and country which referes to the id, name and coutnry of player. The variable country name is intialzed to Nepal.
    question_1: What does the following code block do?
    answer_1: Declare variables needed to store player id,name and coutnry
    question_2: What variables are declared?
    answer_2: The variable id, name and country are declared.
    question_3: To what value variable country is intialzed?
    answer_3: Nepal	
    */
	  /*stm_comment: declare a instance variable called id of type integer*/
    int id ;
	  /*stm_comment: declare a instance variable called name of type String*/	
    String name;
	  /*stm_comment: declare a static variable called country of type String and intialize it value to Nepal*/	
    static String country = "Nepal";
     
    public static void main(String args[]) { 
        /* 
        logical_step_2: Declare variables needed to store count to track number of player created. 
        logical_step_details: The program keep track of number of player with this count value. The intial count value is 0.
        question_1: What does the following code block do?
        answer_1: Declare variables needed to store count to track number of player created.
        question_2: What is starting count value?
        answer_2: 0
        */
		    /*stm_comment: declare a loval variable called count of type int and intialize it value to 0*/	
        int count = 0;
        
        /* 
        logical_step_step_3: Create 2 player object to stroe player inforamtion and assign id and name 
        logical_step_details: Two player, player 1 and player 2 are created. It also assign id and name to each of them.
        question_1: What does the following code block do?
        answer_1: reate 2 player object to stroe player inforamtion and assign id and name 
        question_2: What is the id and name of first player?
        answer_2: 1, lasang
        question_3: What is the id and name of second player?
		    answer_3: 2, jeevan
		    */
		    //create first player object
        Player player1 = new Player();
        player1.id = ++count; 
        player1.name = "Lasang"; 
        // Creates second player object
        Player player2 = new Player();
        player2.id = ++count; 
        player2.name = "Jeevan"; 
        
        /* 
        logical_step_step_4:Display 2 player information we stored
		    logical_step_details: The program simply displays the value for each player that has been stroed.
		    question_1: What does the following code block do?
		    answer_1: Display 2 player information we stored
		    */
        System.out.println(player1.id); 
        System.out.println(player1.name); 
        System.out.println(player1.country);
        System.out.println(player2.id); 
        System.out.println(player2.name); 
        System.out.println(player2.country); 
  
    } 
} 
