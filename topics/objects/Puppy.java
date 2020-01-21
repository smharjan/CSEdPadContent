/**
 @author (Lasang Tamang)
 @topic (Objects)
 @title (object creation and accessing methods)
 @goalDescription (demonstrate usage of objects in java such as creating objects and accessing it's method)
 @source (https://www.tutorialspoint.com/java/java_object_classes.htm)
 @output (
     Puppy's name :tommy
     Puppy's age is :2
 )
 @question("1. What is the output of the code? 2. What does line 35 do? 3. WHat does line 39 do? )
*/
public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        // This constructor has one parameter, name.
        System.out.println("Puppy's name :" + name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("Puppy's age is :" + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {

        //step 1 : Create Object 
        Puppy myPuppy = new Puppy("tommy");

        //step 2 :  Call class method to set puppy's age 
        myPuppy.setAge(2);

        //step 3:  Call another class method to get puppy's age 
        myPuppy.getAge();

    }
}
