/**
 author: Priti Oli
 topic: Two Dimensional Arrays
 title: Multiply
 subTopic: getting familiar with for loop
 goalDescription: this program demonstrates the multiplication of two matrix using two dimensional array
 source: 
 output: 16    19    
        36    43   
 */
 
public class Multiply {
    public static void main(String[] args) {
        
    /*stm_comment: assign values to variable x, y such that the two matrix can be multiplied */

        int r1 = 2, c1 = 2;
        int r2 = 2, c2 = 2;
        int[][] x = { {1,2},{3,4} };
        int[][] y = { {4,5}, {6,7} };
        int[][] xy = new int[r1][c2];
        
        	/*
        logical_step_1: Perform the necessary operations to multiply the two matrix 
        logical_step_details: the netsed for-loop block below multiplies the two matrices. the 
        outer-most  for-loop iterates over the row of the matrix x. the inner for-loop iterates over the column in matrix y.
        the innermost for-loop iterates over column of  matrix  xand the multiplication for each element is performed in the
        inner-most for-block
        question_1: What is the value of x[0][1]
        answer_1: 2
        question_2: What is the value of y[1][1]
        answer_2: 7
        question_3: What is the value of xy when x=1 and y=0
        answer_3: 12
        */
        
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    xy[i][j] += x[i][k] * y[k][j];
                }
            }
        }
        
        
        	/*
        logical_step_2: Dislay the result of the matrix operation
        logical_step_details: display the result of the matrix multiplication by iterating over first over row and then over column 
        of the matrix obtained after the multiplication of two matrix x and y
        question_1: what is the output displayed in first iteration of outer look 'for(int[] row : xy) { ..... }'
        answer_1: 16    19  
        */
        

        for(int[] row : xy) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }

}
