package basic;

public class Global_variable1 
{
static int a=100;
int b=90;

	public static void main(String[] args)
	{
System.out.println(a);

Global_variable1 g1=new Global_variable1();
//g1.b=7;			//updating the value of global variable
System.out.println(g1.b);

	}

}
