/**
 author: Priti Oli
 topic: Two Dimensional Array
 title: MovieRating
 subTopic: getting familiar with two dimensional array
 goalDescription: this program stores movie ratings on a scale of 5 for 4 different movie. the program demonstrates the calculation of average rating for a given movie
 source: 
 output: 3.4
 
 */
 
public class MovieRating {
    public static void main(String[] args){
    	/*stm_comment: store the value of movie ratings in a two dimensional array*/
        int[][] movieRate = {
                {4, 4, 5,3,4},
                {3, 4, 4,2,3},
                {3, 4, 4,3,3},
                {4, 4, 4,4,3}
        };

    	/*stm_comment: initialise the value of average and sum to be 0*/
        float avg =0;
        int sum=0;
        
    	/*
	    logical_step_1: calculate the sum of the movie ratings for movie 2 
	    logical_step_details: the for loop calculates the average movie rating for movie 2 by iterating over all 
	    the movie ratings for movie 2
	    question_1: what are the movie ratings for movie[2]
	    answer1: 3, 4, 4,3,3
	    question_2: what will be the sum of movie rating for movie 1
	    answe_2:16
	    
	*/
        for(int rate=0;rate<movieRate[2].length;rate++){
           sum=sum+movieRate[2][rate];
        }
          		/*
	    logical_step_2: calculate and display the average rating
	    logical_step_details: calculate the average rating by dividing the sum of the ratings by the length of the rating.
	    movieRate[2].length gives the length of the movie ratings for movie 2 (5)
	    question_1: what is the average rating for movie[2]
	    answer1: 3.4
	    question_2: what is the value of movieRate[2].length
	    answe_2: 5
	    question_3: what is the value of movieRate[1].length
	    answe_3: 5
	    
	*/
        avg=(float)sum/movieRate[2].length;
        System.out.println("the avergae rating is:  " + avg);
    }
}
