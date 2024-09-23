package basic;

public class Static_Nonstatic 
{
static void addition()
{
	System.out.println("Addition");
}

void subtraction()
{
	System.out.println("Subtraction");
}

	public static void main(String[] args) 
	{
		addition();
		Static_Nonstatic s1 = new Static_Nonstatic();
		s1.subtraction();
}

	}


