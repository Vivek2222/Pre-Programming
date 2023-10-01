public class Typecast_Narrow 
{
	
	//datatype varname=(converting datatype) varname
	static void test()
	{
		long varn=256;
		int l=(int)varn;
		System.out.println(varn+" "+l);
//		System.out.println(l.getClass());
	}
	public static void main(String[]args)
	{
		int varname=1234567;
		short s=(short)varname;
		System.out.println(varname+" "+s);
		test();
	}
}
