package basic;

import java.util.Scanner;

public class ConditionalStatement2 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter your age");

		
Scanner s1=new Scanner (System.in);
int age = s1.nextInt();

if(age>=18)
{
	System.out.println("Your are eligible to vote");
}
else
{
	System.out.println("You are not eligible to vote");
}
	}

}
