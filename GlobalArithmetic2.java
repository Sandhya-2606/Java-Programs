package basic;
import java.util.Scanner;
public class GlobalArithmetic2 
{
static int a;
static int b;

static void add()
{
	int sum=a+b;
	System.out.println("The sum of two no. is ->" +sum);
}

static void sub()
{
	int sub=a-b;
	System.out.println("The subtraction of two no. is ->" +sub);
}
static void multi()
{
	int m1=a*b;
	System.out.println("The multiplication of two no. is ->" +m1);
}
static void div()
{
	int m2=b/a;
	System.out.println("The division of two no. is ->" +m2);
}
static void mod()
{
	int m3=b%a;
	System.out.println("The modulus of two no. is ->" +m3);
}

	public static void main(String[] args)
	{
		Scanner Ga1=new Scanner (System.in);

		System.out.println("Enter the value of a");
		
		 a=Ga1.nextInt();
		
		System.out.println("Enter the value of b");
		
		Scanner Gb1=new Scanner (System.in);

		 b=Gb1.nextInt();

add();
sub();
multi();
div();
mod();
	}

}
