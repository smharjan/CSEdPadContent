/**
 @author (Lasang Tamang)
 @topic (Objects)
 @title (object creation and accessing methods)
 @goalDescription (demonstrate how to create object and access its method and instance variable in java)
 @source ()
 @output (
    height : 8.0
    width : 12.0
 )
 @question("1. What is the final output of the code? 2. What does line 36 do? 3. What does line 39 do? )
*/
public class Rectangle {
	private double height;
	private double width;
	
	public double getHeight(){
	    return height; 
	}

	public double getWidth(){
	    return width; 
	}
	public Rectangle(double height, double width){
	this.height = height;
	this.width = width;
	}
	public void magnify (int ratio) {
	    height = height * ratio;
	width = width * ratio;
	}


	public static void main(String[] args) {
		//step 1 : Create Object 
		Rectangle myBox = new Rectangle(4, 6);

		//step 2 :  Call class method magnify that alters value of height and width
		myBox.magnify(2);

		// step 3: Access instance variables
		System.out.println("height : "+myBox.getHeight());
		System.out.println("width : "+myBox.width);
	}

}
