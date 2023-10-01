public class Loop2 
{
	static void test() 
	{
		for (int a=59;a>=55;a--)
		{
			if(a%2==0)
			{
				System.out.println(a);
			}
		}
	}
	
	public static void main(String[]args)
	{
		for(int a=25;a<=75;a++)
		{
			if(a%2==0)
			{
			System.out.println(a);
			}
		}
		System.out.println("-------------------");
		test();
	}
}
