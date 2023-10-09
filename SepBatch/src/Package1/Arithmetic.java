package Package1;

public class Arithmetic 
{
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum is = " +c);
		return c;
		
	}
	public int sub(int x, int y)
	{
		int z;
		z=x+y;
		System.out.println("Subtraction is = " +z);
		return z;
	}
	public void mul(int a1,int a2)
	{
		int a3; 
		a3=a1+a2;
		System.out.println("Final value is = " +a3);
	}
	public static void main(String[] args)
	{
		Arithmetic art1=new Arithmetic();
		int s1=art1.sum(12,34);
		int s2= art1.sub(23,13);
		art1.mul(s1, s2);
		System.out.println("Here i have done this Assignment again");
	}

}
