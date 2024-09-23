package basic;

public class Global_Arithmetic 
{
static int a=100;
static int b=200;

static void add()
{
	int sum=a+b;
	System.out.println(sum);
}

static void sub()
{
	int sub=a-b;
	System.out.println(sub);
}
static void multi()
{
	int m1=a*b;
	System.out.println(m1);
}
static void div()
{
	int m2=b/a;
	System.out.println(m2);
}
static void mod()
{
	int m3=b%a;
	System.out.println(m3);
}

	public static void main(String[] args)
	{
add();
sub();
multi();
div();
mod();
	}

}
