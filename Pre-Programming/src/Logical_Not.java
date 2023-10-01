public class Logical_Not 
{
	static void demo() 
	{
		int a=5;
		int b=15;
		System.out.println(!(a>b));//False 5>15
	}
	
	public static void main(String[]args)
	{
		demo();	
		int a=10;
		int b=5;
		System.out.println(!(a>b));//True 10>5
	}
}

