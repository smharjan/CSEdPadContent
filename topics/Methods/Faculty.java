

package javapedagogy;

/**
  @author(Hasan Mashrique)
  @topic(Methods)
  @title(Faculty information)
  @goalDescription(Use user-defined method to display faculty information.)
  @source()
 */

public class Faculty {

        /**
          @comment(We define user attributes name,gender and number.)
         */
    String name, gender;
    int number;
        
        /**
          @comment(We define method display_information that prints faculty name,gender and number.)
         */
    void display_information() {
        System.out.println("Faculty name: " + name + '\n' + "who gender is " + gender + '\n' + "and has number " + number);

    }

    public static void main(String[] args) {

        /**
          @comment(We create object of class faculty to define values for name,gender and number.)
         */
        Faculty anis = new Faculty();

        anis.name = "anisur rahman"; //define name value for object anis.
        anis.gender = "male";   //define gender value for object anis.
        anis.number = 901245698;    //define number value for object anis.
        
        /**
          @comment(call method display information to show attribute values for object anis.)
         */
        anis.display_information();

    }

}
