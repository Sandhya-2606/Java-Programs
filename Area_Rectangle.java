package basic;

import java.util.Scanner;

public class Area_Rectangle 
{

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		
		System.out.println("Enter the value of L");
		double L=s1.nextDouble();

		System.out.println("Enter the value of B");
		double B=s1.nextDouble();

		double area=L*B;
		
		System.out.println(area);
	}

}
