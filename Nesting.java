// Nesting of methods
public class Nesting 
{
	int m, n;
	
	Nesting(int x, int y)		//Constructor method
	{
		m =x;
		n = y;
	}
	
	int largest()
	{
		if ( m >= n)
		{
			return m;
		}
		else
			return n;
	}
	
	void display()
	{
		int large = largest();		//calling a method
		System.out.println("Largest of two numbers is :" +large);
		System.out.println("Largest of "+m+" and " +n+ " numbers is :" +large);
		System.out.println("");
	}
}

class NestingTest
{
	public static void main(String args[])
	{
		Nesting nest1 = new Nesting(10,20);
		nest1.display();
		
		Nesting nest2 = new Nesting(100,50);
		nest2.display();
	}
}
