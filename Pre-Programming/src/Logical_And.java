public class Logical_And
{
	static void demo() 
	{
		int a=2;
		int b=3;
		System.out.println(a>=b && b<a);//False
	}
	
	public static void main(String[]args)
	{
	 int a=10;
	 int b=5;
	 System.out.println(a>=b && a>b);//True
	 int c=10;
	 int d=5;
	 System.out.println(c<d && c<=d);//False
	 demo();
	}
}
