/**
 * @author(Roya Hosseini, Kamil Akhuseyinoglu)
 * @topic(Objects)
 * @subtopics(Defining class, access object methods, modify object instance variables through object methods)
 * @goalDescrption(Construct a class that represents a point in the Euclidean plane. The class should contain data that represents the point’s integer coordinates (x,y). The class should also include getter and setter methods for accessing and changing the point's coordinates and a method to translate the point, i.e.,  shift the point's location by the specified amount.\\n\\nThe class PointTester1 instantiates an object from this class, sets the (x,y) coordinates of the point, and translates the point by the specified amount.)
 * @source(http://pawscomp2.sis.pitt.edu/pcex/pcex_v2/index.html?lang=JAVA&set=objects.classes.point&v=201803162257)
 * @correctOutput(The point's coordinates: (18, 8)\n)
 * @userInput()
 * @title(The Class for Representing a Point in the Euclidean Plane (Case 1))
 */

/**
 * @logicalStep(Define the class PointTester1 to demonstrate the creation of Point1 insstance and accessing Point1 methods.)
 */
public class PointTester1 {
	public static void main(String[] args) {

        /**
         * @statement_comment(This statement creates a Point1 object using the new keyword and empty parentheses. The variable point holds a reference to a Point1 object.)
         */
        Point1 point = new Point1();
         /**
         * @statement_comment(This statement invokes the method setX of the point to set its x-coordinate to 7.)
         */
        point.setX(7);
         /**
         * @statement_comment(This statement invokes the method setY of the point to set its y-coordinate to 2.)
         */
        point.setY(2);
         /**
         * @statement_comment(This statement invokes the method translate of the point. The translate method receives two parameters. The first parameter specifies how much we want to shift the x-coordinate of the point. The second parameter specifies how much we want to shift the y-coordinate of the point.)
         */
        point.translate(11, 6);
        
         /**
         * @statement_comment( To get the point's coordinates, we invoke the method getX and getY of the point. Note that we do not necessarily have to store the returned value from each of these methods in a variable. We could use the returned value of them directly in the println statement.)
         */
		System.out.println("The point's coordinates: (" + point.getX() + ", " + point.getY() + ")") ;
	}
}
/**
 * @logicalStep(Define the class Point1 to represent a point in the Euclidian plane.)
 */
class Point1 {
	/**
     * @logicalStep(Declare the instance variables that stores x and y coordinates)
     * @questionAnswer(What should be the instance variables of the class, integer variables to store x and y coordinates)
     */
	private int x;
    private int y;
    
    /**
     * @logicalStep(Declare the method called 'translate' to shift this point's location by the given amount.)
     * @questionAnswer(What are the parameters to this method, the change in x and y coordinates)
     */
	public void translate(int dx, int dy) {
		x += dx;
		y += dy;
    }
    
     /**
     * @logicalStep(Define the setter and getter methods for the x and y coordinates of the point)
     * @questionAnswer(What are the parameters to this method, the change in x and y coordinates)
     */
	public void setX(int newX) {
		x = newX;
	}
	public int getX() {
		return x;
	}
	
	public void setY(int newY) {
		y = newY;
	}
	public int getY() {
		return y;
	}
}