package basic;

public class Non_Static 
{
 void add()
{
	System.out.println("addition");
	}

void sub()
	{	
		System.out.println("subtraction");
	}

void multi()
	{	
		System.out.println("multiplication");
	}

void division()
	{	
		System.out.println("divide");
	}

void percentage()
	{	
		System.out.println("percentage");
	}
	
public static void main(String[] args) 
	{  //calling non-static methods
	
	Non_Static n1 = new Non_Static();
	n1.add();
	n1.sub();
	n1.multi();
	n1.division();
	n1.percentage();
	}
}