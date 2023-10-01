public class Unary_pre_Inc 
{	
	//Increment value by 1
	//update the Incremented value in the same variable
	//use Incremented value if any operation going on 
	public static void main(String[]args)
		{
		 int a =75;
		 ++a;
		 int b =++a;
		 ++b;
		 int c =++b;
		 ++b;
		 ++c;
		 ++a;
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		}
}
