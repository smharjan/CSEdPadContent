/**
 @author(Priti Oli)
 @topic(Two Dimensional Array)
 @title(JMovieRating)
 @goalDescription(Construct a program that calculates the average movie rating for movie 2)
 @source()
 */
public class JMovieRating {
    public static void main(String[] args){
//        step 1: initialise a two dimensional array, the rows containing the rating for movie i .
//        assign values to the two dimensional array
        int[][] movieRate = {
                {4, 4, 5,3,4},
                {3, 4, 4,2,3},
                {3, 4, 4,3,3},
                {4, 4, 4,4,3}
        };

//     step 2: initialize the value of avg to 0 , the variable avg stores the average value of the rating for  a movie
        float avg =0;
//      step 3: initialize the value of sum to 0 , the variable sum stores the sum of the rating for  a movie
        int sum=0;

//      step 4:  iterate through each rating for movie 2
        for(int rate=0;rate<movieRate[2].length;rate++){
//      step 5: sum the ratings for the movie 2
           sum=sum+movieRate[2][rate];
        }
//      step 6: calculate the average rating for movie 2 by diving the rating counts
        avg=(float)sum/movieRate[2].length;
//      step 7: display the average rating in the output stream
        System.out.println("the avergae rating is:  " + avg);
    }
}
