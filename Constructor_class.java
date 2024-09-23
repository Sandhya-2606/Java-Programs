package basic;

public class Constructor_class 
{
Constructor_class()
{
	System.out.println("1st");
}
	
Constructor_class(int a)
{
	System.out.println("2nd");
}

	public static void main(String[] args)
	{
new Constructor_class();
new Constructor_class(3);
	}

}
