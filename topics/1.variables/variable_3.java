/*
@author(Lasang Tamang)
@topic(variables)
@title(Student)
@goalDescription(Decalre static, instance and lcoal variable and print them)
@source()
*/
public class Student { 
  	//Step 1: declares variables  and assign values
   /**
    @comment(the instance variable score of type int is declared and initalized to value of 88)
    @comment(note that variables which are defined without the STATIC keyword and are Outside 
    any method declaration are Object-specific and are known as instance variables.They are called
    so because their values are instance specific and are not shared among instances)
     */
    int score = 88; 
  	/**
    @comment(the static variable count of type int is declared and initalized to value of 4)
    @comment(A static variable is common to all the instances (or objects) of the class because
    it is a class level variable. In other words you can say that only a single copy of static
    variable is created and shared among all the instances of the class)
     */
    static int count = 4;
  
   //Step 2: Declare method
  	/**
    @comment(declare public method StudentAge)
    */
    public void StudentAge()
    { 
      /**
    	@comment(local variable age of type integer and assing value of 0)
        @comment(variable age has scope within the context of method StudentAge only. Therefore, it is local variable.)
     */ 
      int age = 0; 
      /**
    	@comment(prin the value of local variable age)
     */ 
      
      System.out.println("Student age is : " + age); 
    } 
   //Step 3: decalre main static method that runs the program
    public static void main(String args[]) 
    { 
      /**
    	@comment(Create the object istnace of Student class)
     */ 
      Student obj = new Student(); 
      /**
    	@comment(Call the method StudentAge)
        @comment(StudentAge method is called and the method prints the value of local variable)
     */ 
      obj.StudentAge(); 
      //Step 2: Print the value of variables
      /**
      @comment(print the value of score)
      @comment(the score is instance variable. So, each instance of the object has score variable instance.)
      */
      System.out.println("Score : " + obj.score); 
       /**
      @comment(print the value of count)
      @comment(the count is static variable. So, every instance of the object of Studen class share the single instance of count.)
      */
      System.out.println("count : " + count); 
    } 
} 