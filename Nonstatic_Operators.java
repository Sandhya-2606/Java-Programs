package basic;

public class Nonstatic_Operators
{
	 void addition()
	{
int a=100;
int b=200;
int sum=a+b;

System.out.println("The addition of two number is ->" + sum);
	}

 void subtraction()
{
	int a=100;
	int b=2000;
	int sub=b-a;
	
	System.out.println("The subtraction of two no. is ->" + sub);
}

 void multiplication()
{
	int a=100;
	int b=20;
	int multi=b*a;
	
	System.out.println("The multiplication of two no. is ->" + multi);
}

 void divide()
{
	int a=100;
	int b=20;
	int div=a/b;
	
	System.out.println("The division of two no. is ->" + div);
}

 void modulus()
{
	int a=100;
	int b=20;
	int mod=a%b;
	
	System.out.println("The modulus of two no. is ->" + mod);
}

public static void main(String[] args)
{
	Nonstatic_Operators n1=new Nonstatic_Operators();
	n1.addition();
	n1.subtraction();
	n1.multiplication();
	n1.divide();
	n1.modulus();
	
}

}