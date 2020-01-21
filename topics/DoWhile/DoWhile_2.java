/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapedagogy;

/**
 * @author(Hasan Mashrique)
 * @topic(DoWhile)
 * @title(PrintValuesInArray_DoWhile)
 * @goalDescription(Iterate through an array and print values greater than 10.)
 * @source()
 */
public class DoWhile_2 {

    public static void main(String[] args) {

        /**
         * @comment(We define integer array arr with values.)
         */
        int arr[] = {2, 11, 45, 9};

        /**
         * @comment(We initialize integer value i to 0 for iteration in the
         * array.)
         */
        int i = 0;

        /**
         * @comment(Start of the do while loop which iterates through the array
         * and prints values greater than 10.)
         */
        do {
            if (arr[i] > 10) // checks if the array value is greater than 10.
            {
                System.out.println(arr[i]); // prints array values if >10.
            }
            i++;
        } while (i < 4); // iteration continues till i<4. So it will iterate through 0,1,2,3 in the array.

    }
}
