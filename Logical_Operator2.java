package basic;

public class Logical_Operator2 
{

	public static void main(String[] args) 
	{
int a=10;
int b=20;

if(a==b|| a==10)
{
	System.out.println("1");
}

if(! (a<b && a==10))
{
	System.out.println("3");
}

if(! (a==b) || (a==10))
{
	System.out.println("4");
}
	}	
}
