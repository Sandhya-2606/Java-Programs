package basic;

public class MathClass 
{

	public static void main(String[] args) 
	{
System.out.println(Math.addExact(100,200));
System.out.println(Math.addExact(3456789l,234567654));

System.out.println(Math.subtractExact(100, 1000));
System.out.println(Math.subtractExact(999999999l, 1111111111));

System.out.println(Math.multiplyExact(10, 10));
System.out.println(Math.multiplyExact(1111111111l, 22222222l));

System.out.println(Math.max(10,90));
System.out.println(Math.min(10,90));

System.out.println(Math.abs(-888));

System.out.println(Math.random());




	}

}
