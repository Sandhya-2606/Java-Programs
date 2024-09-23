package basic;

public class Global_Variable
{
	static boolean answer;
int a=100;			//global variable
static int b=100;		//global variable

	public static void main(String[] args) 
	{
int c=90; 		//local variable
answer=false;		//updating the value o global variable
Global_Variable g1=new Global_Variable(); //creating the object to call non static global variable

System.out.println(c+g1.a);

System.out.println(answer);
	}

}
