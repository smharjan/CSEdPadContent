/**
 author: Priti Oli
 topic: If-else condition
 title: Grades
 subTopic: getting familiar with if-else condition
 goalDescription: this program uses if-else condition to assign grade tp a  given testscore
 source: 
 output: Grade = 90
 
 */
public class Grades {
    public static void main(String[] args) {

    /* stm_comment: declare a variable testscore and assign value to it*/
        int testscore = 90;
        char grade;
        
        		/*
		logical_step_1: Use if-else to assign a grade to a give testsocre
		question_1: What is the grade assigned to the testscore
		answer_1: Grade A
		question_2: What will be the value of variable grade if testscore=70
		answer_2: Grade C
		question_3:which if else block will be executed in the program below
		answer_3: the block ' if (testscore >= 90) { grade = 'A';}' evaluates a true condition and gets executed

		*/

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}
