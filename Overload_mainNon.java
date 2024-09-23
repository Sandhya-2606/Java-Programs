package basic;

public class Overload_mainNon
{
	
	public static void main(String[] args)
	{
System.out.println("Main method");
Overload_mainNon o1 = new Overload_mainNon();
o1.main();
o1.main("Sandhya", 'S');
	}
	
	public  void main()
	{
System.out.println("Main method with no argument");
	}
	
	public  void main(String name, char gender)
	{
System.out.println("Main method with argument as string and char");
	}	
}
