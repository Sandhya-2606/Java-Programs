package basic;

public class Methodoverloading_Non 
{
	
 void addition(double a,double b)
{
	double sum=a+b;
	System.out.println(sum);
}
	
 void addition(int a,int b)
{
	int sum=a+b;
	System.out.println(sum);
}
	
 void addition(int a,double b)
{
	double sum=a+b;
	System.out.println(sum);
}
		
	public static void main(String[] args) 
	{
		Methodoverloading_Non m1=new Methodoverloading_Non();
		
m1.addition(43,64);
m1.addition(6.757,5.46);
m1.addition(43,665.64);
	}

}


/*
{
	static void addition(boolean b, String c,char d)
	{
	System.out.println("My name is" + c);
	System.out.println(d);	
	System.out.println(b);
	}
	public static void main (String[] args) 
	{
		addition(true,"Sandhya",'S');
	
}
}  
*/