package basic;

public class Overload_main
{
	public static void main(String[] args)
	{
System.out.println("Main method");
main();
main("Sandhya", 'S');
	}
	
	public static void main()
	{
System.out.println("Main method with no argument");
	}
	
	public static void main(String name, char gender)
	{
System.out.println("Main method with argument as string and char");
	}
	
	
}
