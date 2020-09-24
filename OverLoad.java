//Example for Method overloading
public class OverLoad 
{
	int length, width, height;
	
	int area()
	{
		length = 5;
		width = 10;
		return (length * width);
	}
	
	int area(int x, int y)
	{
		length = x;
		width = y;
		return (length * width);
	}
	
	int area(int x, int y, int z)
	{
		length = x;
		width = y;
		height = z;
		return (length * width * height);
	}
}

class RectArea3
{
	public static void main( String args[])
	{
		OverLoad c1 = new OverLoad();				
		int area1 = c1.area();
		System.out.println("Area1 = " + area1);

		OverLoad c2 = new OverLoad();				
		int area2 = c2.area( 10 , 20 );
		System.out.println("Area2 = " + area2);
		
		OverLoad c3 = new OverLoad();				
		int area3 = c3.area( 5 , 20 , 12 );
		System.out.println("Area3 = " + area3);
	}
}
