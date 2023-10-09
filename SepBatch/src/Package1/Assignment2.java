package Package1;

public class Assignment2 {
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int sub(int a1,int b1)
	{
		int c1;
		c1=a1+b1;
		return c1;
	}
	public int mul(int a2,int b2)
	{
		int c2;
		c2=a2+b2;
		return c2;
	}
	public void div(int a3,int b3)
	{
		int c3;
		c3=a3+b3;
		System.out.println("Final result is = " +c3);
	}
	public static void main(String[] args)
	{
		Assignment2 ass=new Assignment2();
		int x=ass.sum(23,12);
		System.out.println("Value of 1st sum is = " +x);
		int y=ass.sum(x,45);
		System.out.println("Value of 2nd sum is = " +y);
		int z=ass.sub(y,9);
		System.out.println("Value of subtraction is = " +z);
		int x1=ass.mul(z,3);
		System.out.println("Value of multipliaction is = " +x1);
		ass.div(x1,9);
		
	}

}
