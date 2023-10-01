public class Logical_OR
{
	static void log()
	{
		int a=20;
		int b=21;
		System.out.println(a>=b || a<=b);//true
	}
	
	public static void main(String[]args)
	{
		log();
		int a=10;
		int b=5;
		System.out.println(a>=b || a>b);
		int c=10;
		int d=5;
		System.out.println(c<d || c<=d);
	}
}
