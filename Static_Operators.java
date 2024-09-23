package basic;

public class Static_Operators 
{

	static void addition()
	{
int a=100;
int b=200;
int sum=a+b;

System.out.println("The addition of two number is ->" + sum);
	}

static void subtraction()
{
	int a=100;
	int b=2000;
	int sub=b-a;
	
	System.out.println("The subtraction of two no. is ->" + sub);
}

static void multiplication()
{
	int a=100;
	int b=20;
	int multi=b*a;
	
	System.out.println("The multiplication of two no. is ->" + multi);
}

static void divide()
{
	int a=100;
	int b=20;
	int div=a/b;
	
	System.out.println("The division of two no. is ->" + div);
}

static void modulus()
{
	int a=100;
	int b=20;
	int mod=a%b;
	
	System.out.println("The modulus of two no. is ->" + mod);
}

public static void main(String[] args)
{
	addition();
	subtraction();
	multiplication();
	divide();
	modulus();
	
}

}