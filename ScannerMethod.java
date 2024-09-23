package basic;
import java.util.Scanner;

public class ScannerMethod
{

	public static void main(String[] args) 
	{
Scanner s1=new Scanner(System.in);

System.out.println("Enter your name");

String Firstname=s1.next();

System.out.println("Are you Graduate?");

Scanner s2=new Scanner(System.in);

boolean b1=s2.nextBoolean();

System.out.println(Firstname);
System.out.println(b1);


	}

}
