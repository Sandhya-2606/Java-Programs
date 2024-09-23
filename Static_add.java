package basic;

public class Static_add 
{
static void add()
{
	System.out.println("addition");
	}

	static void sub()
	{	
		System.out.println("subtraction");
	}

	static void multi()
	{	
		System.out.println("multiplication");
	}

	static void division()
	{	
		System.out.println("divide");
	}

	static void percentage()
	{	
		System.out.println("percentage");
	}
	
	public static void main(String[] args) 
	{  //calling static methods
	add();
	sub();
	multi();
	division();
	percentage();
	}
}