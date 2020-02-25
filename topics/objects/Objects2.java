/**
 author: Lasang Tamang
 topics: Objects
 subtopics: Initalizing an object, accessing methods
 goalDescription: This program creates rectangle object and caluclates its area
 output: Area : 10.0
*/
public class Rectangle {
    /*
	logical_step_1: Declare variables needed to store heihgt and width of Rectnagle
	question_1: What does the following code block do?
	answer_1: Declare variables needed to store heihgt and width of Rectnaglet
	question_2: What variables are declared?
	answer_2: The private variable float height and width are declared.
   */
    private float height;
    private float width;
    /*
	logical_step_2: Define constructor method needed tointilaize height and width when rectangle object is created
	question_1: What does the following code block do?
	answer_1:  Define constructor method needed tointilaize height and width when rectangle object is created
	question_2: What variables are initlazed?
	answer_2: heiht and width
   */

    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    /*
    logical_step_3: Define getter methods for height and width
	question_1: What does the following code block do?
	answer_1: Define getter and setter methods
	question_2: What variables can be accessed?
	answer_2: height and width
	*/

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    /*
    logical_step_4: Caculate the area of rectangle using height and width of the object
	question_1: What does the following code block do?
	answer_1: Caculate the area of rectangle using height and width of the object
	*/
    public float caculateArea() {
        float area = this.height * this.width;
        return area;
    }


    public static void main(String[] args) {
        /*
        logical_step_5: Create Rectnalge object and intialize it values to 2 and 5
        question_1: What does the following code block do?
        answer_1:  Create Rectnalge object and intialize it values to 2 and 5
        question_2: What is value of height?
        answer_2: 2
        question_3: What is value of width?
        answer_3: 5
	   */
        /*stm_comment: Create an object of class Rectangle. This will also call contstructor*/
        Rectangle myBox = new Rectangle(2, 5);

        /*
        logical_step_5: Caculate the area of current rectangle object and prints the value of area
        question_1: What does the following code block do?
        answer_1:   Call method to caculate the area of current rectangle object and prints the value of area
        question_2: What is the value of area printed
        answer_2: 10
	   */
        /*stm_comment: Call method caculateArea for the object  */
        float area = myBox.caculateArea();
        System.out.println("Area : " + area);
    }

}
