// This class defines a Line Segment

public class LineSegment 
{
   // Create four private integer variables, x1, y1, x2, y2. 
	private int xi, y1, x2, y2;
   // These will store the left and right end points of the line segment
   
   // Create a private static integer variable called numLineSegments and 
   // initialize it to 0. This variable will keep a count of the number 
   // of LineSegmented objects created
	private static int numLineSegment = 0;
   
   
   // Create a default constructor method with no parameters that initializes instance variables
   // x1, y1, x2, y2 to 0
   // Don't forget to increment the numLineSegments variable
	public LineSegment()
	{
		x1=0, y1=0, x2=0, y2=0;
		numLineSegment++;
	}
   
	
	
   // Create a constructor method that takes four integer parameters, one each for x1, y1, x2, y2
   // Use these parameter variables to set the instance variables x1, y1, x2, y2
   // Note: if your parameter variables have the same name as your instance variables, make sure
   // to use the "this" keyword. For example, if the parameter variable is called xCoord and the
   // instance variable is also called xCoord, then initialize the instance variable as:
   // this.xCoord = xCoord; Also, remember to increment the numLineSegments variable
   

	
	
   // Create a public static method that returns the number of LineSegment objects created
   
   
   // Create an accessor method (i.e. get method) for the x1 instance variable
   
   
   // Create an accessor method (i.e. get method) for the y1 instance variable
   
   
   // Create an accessor method (i.e. get method) for the x2 instance variable
   
   
   // Create an accessor method (i.e. get method) for the y2 instance variable
   
	
   // Create a mutator method (i.e. "set" method) called setLine to set the end points of the line
   // segment. The set method should have integer parameters x1, y1, x2, y2 
   
   
   
   // Create an instance method called getLength() to compute the length of this line segment object
   // The method should return a double value. Use the Math class sqrt() function
   // The formula for the length: sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2))
   // When referring to the instance variables, use the *this* keyword to emphasize they are
   // associated with the current LineSegment object. Example: this.x1 etc
   
	
   // Create a static method also called getLength() that takes four integer parameters - 
   // x1, y1, x2, y2 representing the end points of some arbitrary line segment
   // This method uses the given parameters to compute and return a double value representing
   // the length of the line segment. It has nothing to do with the instance variables x1, y1, x2, y2 
   
	
   // Create a method called getDescription that returns a String
   // The string returned contains a concatenation of:
   // The string "LineSegment[x1 = " followed by the x1 value followed by 
   // the string " y1 = " followed by the y1 value followed by the string
   // " x2 = " followed by the x2 value followed by the string " y2 = " followed by 
   // the y2 value of this LineSegment object followed by the string "]"
   // NOTE: do not call System.out.println() in here, return a String!!!!
	
	
    
}
