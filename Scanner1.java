package basic;

import java.util.Scanner;

public class Scanner1 
{
	public static void main(String[] args) 
	{
Scanner s1 = new Scanner(System.in);

System.out.println("Enter the value of a");

int a=s1.nextInt();

System.out.println("Enter the value of B");

int b=s1.nextInt();
int sum=a+b;

System.out.println("Sum of the two no. is ->" + sum);
	}

}
