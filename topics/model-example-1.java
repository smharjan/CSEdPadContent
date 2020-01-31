/**
 @author (Lasang Tamang)
 @topics (Arrays)
 @lerningGoal (declaring array variables, Adding element of array, processing array)
 @goalDescription(This program demonstrates how to create array, intialize them and print the values of arrays)
 @source (Here we keep the URL if there exist any source )
 @output (0,1,2,3,4,5,6,7,8,9)
*/
public class BasicArrayExample3{

	public static void main(String[] args) {
		
		/*
		logical_step_1: Declare variable size and intialize value 10
		*/
		int size = 10;
		
		
		/*
		logical_step_2: Add array elements 0 to 9 in array myNumber
		Questions:
		
		execution_detail: The length of array myNumber is 10. The loop starts at for i = 0 and loops until i=9. 
		For each value of i, array mynumber is intialized to value of  i.The new values of array myNumber
		is 0,1,2,3,4,5,6,7,8,9
		*/
		int[] myNumber = new int[size];	
		for(int i = 0; i < myNumber.length; i++) {/*@stm_comment: loop 10 times, start at 0 and iterate until i is less than 10*/		
			myNumber[i] = i;/*@stm_comment: Insert the value of i for arry myNumber at index postion i*/			
		}				
		
		/*
		logical_step_4: Display the value of array mynumber
		execution_detail: The length of myNumber is 10. The loop starts at for i = 0 and loops until i=9. 
		For each value of i, the value of myNumber at index postion i is printed. The program prints all the value of array myNumber.
		*/
		for(int i = 0; i < myNumber.length; i++) { /*@stm_comment: loop 10 times, start at 0 and iterate until i is less than 10*/		
			System.out.println(myNumber[i]); /*@stm_comment: Insert the value of i for arry myNumber at index postion i*/			
		}
	}
}
