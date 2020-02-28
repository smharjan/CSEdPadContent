/**
 author: Lasang Tamang
 topics: Objects
 subtopics: Initalizing an object, accessing getter and setter
 goalDescription: This program shows how to create student object, and accessing getter and setter methods.
 source: ()
 output: Student marks is 2.0
*/
public class Student {
    /*
	logical_step_1: Declare variables needed to store name and marks of student
	question_1: What does the following code block do?
	answer_1: Declare variables needed to store name and marks of student
	question_2: What variables are declared?
	answer_2: The variable String name and float marks are declared.
  */
    String name;
    float marks;

    /*
    logical_step_2: Define getter and setter methods
	question_1: What does the following code block do?
	answer_1: Define getter and setter methods
    */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public float getMarks() {
        return this.marks;
    }



    public static void main(String[] args) {
        /*
        logical_step_3: Create Student object and assign name as Zak and mark as 98
        question_1: What does the following code block do?
        answer_1: Create Student object and assign name and mark 
        question_2: What value is name assigned?
        answer_2: Zak
        question_3: What value is marks assigned?
        answer_3: 98
	   */
        /*stm_comment: Initalize student object */
        Student student1 = new Student();
        /*stm_comment: Set name property of student object with setter method setName */
        student1.setName("Zak");
        /*stm_comment: Set makrs property of student object with setter method setMarks */
        student1.setMarks(98);
        /*
        logical_step_4: Get student name and marks and print the values
        question_1: What does the following code block do?
        answer_1: Get student name and marks and print the values
        question_2: What is the printed value for name?
	  */
        /*stm_comment: Get name student object with getter method getName */
        System.out.println("Student name : " + student1.getName());
        /*stm_comment: Get makrs property of student object with getter method getMarks */
        System.out.print("Student Marks : " + student1.getMarks());

    }
}
