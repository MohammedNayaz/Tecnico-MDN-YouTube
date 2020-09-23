//Application of constructor
public class Constructor 
{
	int length,width;
	
	Constructor ()
	{
		System.out.println("Hi i am default constructor");
	}
	
	Constructor ( int x, int y)
	{
		System.out.println("Hi i am parameterized constructor");
		length = x;
		width = y;
	}
	
	int areaOfRectangle()
	{
		return (length * width);
	}
	
}

class RectArea2
{
	public static void main( String args[])
	{
		Constructor c1 = new Constructor();				//Default constructor is called autometically
		int area1 = c1.areaOfRectangle();
		System.out.println("Area = " + area1);

		Constructor c2 = new Constructor(10,20);		//Parameterized constructor is called 
		int area2 = c2.areaOfRectangle();
		System.out.println("Area = " + area2);
	}
}