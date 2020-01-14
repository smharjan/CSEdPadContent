/*
@author(Zeyad Alshaikh)
@topic(Inheritance)
@title(InheritanceExample2.java)
@goalDescription(Using Multiple inheritance)
@source(https://www.javatpoint.com/inheritance-in-java)
*/

/**
 @comment(Declearing a super class Animal)
 */
class Animal{
  /**
   @comment(Declearing a method eat that print eating...)
   */
void eat(){
  System.out.println("eating...");
  }
}

/**
 @comment(Declearing a sub class Cat from super class Animal by using the keyword extends)
 */

class Cat extends Animal{
  /**
   @comment(Declearing a method meow that pring meowing...)
   */
void meow(){
  System.out.println("meowing...");
  }
}
class InheritanceExample2{
public static void main(String args[]){
  /**
   @comment(creating an object of Cat name c)
   */

Cat c=new Cat();
/**
 @comment(the object c has 2 functions meow from Cat class and an inherited fucntion eat from Animal class)
 */
c.meow();
c.eat();

}}
