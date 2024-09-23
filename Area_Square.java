package basic;

import java.util.Scanner;

public class Area_Square
{

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);

		System.out.println("Enter the value of a");
		double a=s1.nextDouble();

		double area=a*a;

		System.out.println(area);
		
	}

}
