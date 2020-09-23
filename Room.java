//Application of single level Inheritance

public class Room 
{
	int length, breadth;
	
	Room(int x, int y)
	{
		length = x;
		breadth = y;
	}
	
	int area()
	{
		return (length * breadth);
	}
	
}

class BedRoom extends Room
{
	int height;
	BedRoom(int x, int y, int z)
	{
		super(x,y);		//passing values to superclass
		height = z;
	}
	int volume()
	{
		return (length * breadth * height);
	}
	
	
}

class InheritTest 
{
	public static void main(String args[]) 
	{
		BedRoom room1 = new BedRoom(15,15,10);
		int area1 = room1.area();
		int volume1 = room1.volume();
		System.out.println("Area1 = " +area1);			// area = 15 * 15
		System.out.println("Volume1 = " +volume1);		// volume = 15 * 15 * 10
	}
}
