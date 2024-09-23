package basic;

public class MethodOverloading 
{
static void addition(double a,double b)
{
	double sum=a+b;
	System.out.println(sum);
}
	
static void addition(int a,int b)
{
	int sum=a+b;
	System.out.println(sum);
}
	
static void addition(int a,double b)
{
	double sum=a+b;
	System.out.println(sum);
}
		
	public static void main(String[] args) 
	{
addition(43,64);
addition(6.757,5.46);
addition(43,665.64);
	}

}
