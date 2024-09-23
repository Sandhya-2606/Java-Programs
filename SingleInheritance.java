package basic;

class one  //Super class
{
	void add()
	{
	System.out.println("add");
}
 void sub()
 {
	 System.out.println("sub");
 }
}

public class SingleInheritance extends one    //Sub class
{
void mul()
{
	System.out.println("mul");
}

void div()
{
	System.out.println("div");
}

	public static void main(String[] args) 
	{
		SingleInheritance s1=new SingleInheritance();
s1.mul();
s1.div();
s1.add();
s1.sub();
	}
}
