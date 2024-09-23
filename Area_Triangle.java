package basic;

import java.util.Scanner;

public class Area_Triangle 
{

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);

		System.out.println("Enter the value of b");
		double b=s1.nextDouble();

		System.out.println("Enter the value of h");
		double h=s1.nextDouble();

		double area=0.5*b*h;

		System.out.println(area);
					

	}

}
