package basic;
import java.util.Scanner;
public class Case 
{

public static void main(String[] args) 
{
Scanner s1=new Scanner(System.in);

System.out.println("Please enter 1 for Chrome Browse");
System.out.println("Please enter 2 for firefox Browse");
System.out.println("Please enter 3 for edge Browse");
System.out.println("Please enter 4 for Safari Browse");

int input=s1.nextInt();

switch(input)
{
case 1: System.out.println("Launching Chrome Browse"); 
 		break;
 		
case 2: System.out.println("Launching firefox Browser");
		break;
		
case 3: System.out.println("Launching edge Browser");
		break;
		
case 4: System.out.println("Launching Safari Browser");
		break;
		
default: System.out.println("Your Selection is wrong, can you try again");
}
	}

}
