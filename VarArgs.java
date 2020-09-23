//Illustration, the use of varargs to print the String value passed as an argument to a method
public class VarArgs 
{
	void VarArg(String...person)
	{
		for(String name: person)
		{
			System.out.println("Hello " +name);
		}
	}
}
class VarArgtest
{
	public static void main(String args[])
	{
		VarArgs v =new VarArgs();
		v.VarArg("Jhon", "Jarvis", "Marvel");
	}
}
