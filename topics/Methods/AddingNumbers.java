/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapedagogy;

/**
 * @author(Hasan Mashrique)
 * @topic(Methods)
 * @title(Faculty information)
 * @goalDescription(Use user-defined method to display faculty information.)
 * @source()
 */
public class AddingNumbers {

    /**
     * @comment(We define method sum which adds two given values as parameters
     * and returns their sum.)
     */
    public int sum(int value1, int value2) {
        return value1 + value2; // returns the addition of the two given integer values.
    }

    public static void main(String[] args) {

        /**
         * @comment(We create object of class AddingNumbers (addy).)
         */
        AddingNumbers addy = new AddingNumbers();

        int result = addy.sum(4, 9); //calling method sum which stores the sum value in int value result.

        System.out.println(result); // prints the value stored in integer result.

    }

}
