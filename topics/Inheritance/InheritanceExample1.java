/*
@author(Zeyad Alshaikh)
@topic(Inheritance)
@title(InheritanceExample1java)
@goalDescription(Creating sub class MountainBike from super class Bicycle)
@source(https://www.geeksforgeeks.org/inheritance-in-java/)
*/

     class Bicycle
 {
    /**
     @comment( the Bicycle class has two fields)
    */
     public int gear;
     public int speed;

     /**
      @comment( the Bicycle class has one constructor)
      */
     public Bicycle(int gear, int speed)
     {
         this.gear = gear;
         this.speed = speed;
     }

     /**
      @comment( the Bicycle class has three methods )
      */
     public void applyBrake(int decrement)
     {
         speed -= decrement;
     }

     public void speedUp(int increment)
     {
         speed += increment;
     }

     /**
      @comment( toString() method to print info of Bicycle)
      */
     public String toString()
     {
         return("No of gears are "+gear
                 +"\n"
                 + "speed of bicycle is "+speed);
     }
 }

 /**
  @comment( derived class )
  */
 class MountainBike extends Bicycle
 {

 /**
  @comment( the MountainBike subclass adds one more field )
  */
     public int seatHeight;

     /**
      @comment( the MountainBike subclass has one constructor)
      */
     public MountainBike(int gear,int speed,
                         int startHeight)
     {
         // invoking base-class(Bicycle) constructor
         super(gear, speed);
         seatHeight = startHeight;
     }

     /**
      @comment( the MountainBike subclass adds one more method )
      */
     public void setHeight(int newValue)
     {
         seatHeight = newValue;
     }

     /**
      @comment( overriding toString() method of Bicycle to print more info)
      */

     @Override
     public String toString()
     {
         return (super.toString()+
                 "\nseat height is "+seatHeight);
     }

 }

 /**
  @comment( driver class)
  */
 public class InheritanceExample1
 {
     public static void main(String args[])
     {

         MountainBike mb = new MountainBike(3, 100, 25);
         System.out.println(mb.toString());

     }
 }
