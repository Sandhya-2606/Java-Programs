package basic;

import java.util.Scanner;

public class Area_Circle 
{

	public static void main(String[] args) 
	{
Scanner s1= new Scanner(System.in);

System.out.println("Enter the value of pi");
double pi=s1.nextDouble();

System.out.println("Enter the value of r");
double r=s1.nextDouble();

double area=pi*r*r;

System.out.println(area);

//Circumference of circle
double circumference=2*pi*r;
System.out.println(circumference);


	}

}
