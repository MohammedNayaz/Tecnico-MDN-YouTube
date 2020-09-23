//Application of classes and objects
public class Rectangle 
{
int length, width;	//Declaration of variables
	
	void getdata(int x, int y)	//Definition of method
	{
		length = x;
		width = y;
	}

	int rectArea()	//Definition of method
	{
		int area = length * width;
		return area;
	}
}

class RectArea	//class with main method
{
	public static void main(String[] args) 
	{
		int area1, area2;
		Rectangle r1 = new Rectangle();		//creating object
		Rectangle r2 = new Rectangle();		
		r1.length = 15;						//accessing variables and asigning a value
		r1.width = 10;						
		area1 = r1.length * r1.width;
		r2.getdata(20, 12);					//accessing method
		area2 = r2.rectArea();
		System.out.println("Area 1: "+area1);
		System.out.println("Area 2: "+area2);
		
		
	}

}
