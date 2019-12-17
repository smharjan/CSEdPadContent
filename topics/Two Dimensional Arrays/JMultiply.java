/**
 @author(Priti Oli)
 @topic(Two Dimensional Array)
 @title(JIncrement)
 @goalDescription(Construct a program that multiplies two matrix )
 @source()
 */
public class JMultiply {
    public static void main(String[] args) {
//        step 1: initialise the value of row and column for the two matrix
//        r1,c1 denotes the row and column for matrix x
//        r2,c2 denotes the row and column for matrix y
        int r1 = 1, c1 = 3;
        int r2 = 3, c2 = 1;
//      step2:  initialise and assign the value of matrix x
        int[][] x = { {1,2,3} };
//        step 3: initialise and assign the value of matrix y
        int[][] y = { {3}, {2}, {1} };
//        initiase the matrix xy to store the result of the product of two matrix x and y
        int[][] xy = new int[r1][c2];
//        step 4:iterate trough the rows of matrix x
        for(int i = 0; i < r1; i++) {
//        step 5:iterate through the colum of matrix y
            for (int j = 0; j < c2; j++) {
//        step 6: iterate through the column of matrix x or row of matrix y
                for (int k = 0; k < c1; k++) {
//        step 7: calculate the partial product and assignt the value to variable xy
                    xy[i][j] += x[i][k] * y[k][j];
                }
            }
        }

//        step 8: display the value of the product of the two matrix stored in the variable xy
        for(int[] row : xy) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }

}
