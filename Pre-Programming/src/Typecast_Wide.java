public class Typecast_Wide 
{
	static void test() {
		int a=455;
		float b=a;
		System.out.println(a+" "+b);
	}
	//cannot possible narrowing for large to small
//	static void test2() {
//		float a=455;
//		int b=a;
//		System.out.println(a+" "+b);
//	}
//	static void test3() {
//		String a="455";
//		float b=a;
//		System.out.println(a+" "+b);}

	public static void main(String[]args)
	{
		test();
//		test2();
		byte b=4;
		int i=b;
		System.out.println(b+" "+i);
	}
}
