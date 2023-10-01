public class Switch 
{
	static void test()
	{
		int a = 5;
		switch(a)
		{
		case 1: System.out.println("123");
		break;
		case 2: System.out.println("456");
		break;
		default: System.out.println("789");
		}
	}

	public static void main(String[]args)
	{
		int a = 2;
		switch(a)
		{
			case 1: System.out.println("ABS");
			break;
			case 2: System.out.println("ABSGFD");
			break;
			case 3: System.out.println("ABSSDF");
			break;
			default: System.out.println("Please type valid no.");
		}
		test();
	}
}
