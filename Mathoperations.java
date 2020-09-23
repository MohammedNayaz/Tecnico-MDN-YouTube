//Defining and using static members
public class Mathoperations 
{
	static float multiply(float x, float y)
	{
		return x*y;
	}
	
	static float divide(float x, float y)
	{
		return x/y;
	}
}

class MathApplication
{
	public static void main(String args[])
	{
		float a = Mathoperations.multiply(4, 5);		//length = 4 & width = 5	is assigned
		float b = Mathoperations.divide(a, 2);			//length = a = 20 & width = 2	is assigned
		
		float c = Mathoperations.multiply(a, b);		//length = a= 20 & width = b = 10 	is assigned
		float d = Mathoperations.divide(a, b);			//length = a =200  & width = 10	is assigned
		
		System.out.println("a=" +a);		// 4 * 5 = 20
		System.out.println("b=" +b);		// 20 / 2 = 10
		System.out.println("c=" +c);		// 20 * 10 = 200
		System.out.println("d=" +d);		// 200 / 10 = 2
	}
}
