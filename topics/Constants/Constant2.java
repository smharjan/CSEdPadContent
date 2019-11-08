/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapedagogy;

/**
  @author(Hasan Mashrique)
  @topic(Constants)
  @title(CircleArea_Constant)
  @goalDescription(Construct a program that determines the area of a circle.)
  @source()
 */
public class Constant2 {

    public static void main(String args[]) {
        
        /**
          @comment(We declare local final variable PI which stays fixed every time and gives error if changed..)
         */
        final double PI = 3.1416;
        
        /**
          @comment(We define radius of the circle as integer value.)
         */
        int radius = 5;
        
        /**
          @comment(We define formula for area of the circle.)
         */
        double Area_of_Circle = PI * Math.pow(radius, 2);
        
        /**
          @comment(We print out the area of the circle.)
         */
        System.out.println(Area_of_Circle); // Prints area of a circle.
        
        //But the following line would result in a syntax error.            
        //PI = 100;

    }

}
