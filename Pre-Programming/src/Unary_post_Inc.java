public class Unary_post_Inc 
{
	//Increment value by 1
	//update the Incremented value in the same variable
	//use current value if any operation going on 
	public static void main(String[]args)
		{
		 int a =98;
		 a++;
		 int b =a++;
		 b=a++;
		 int c =32;
		 ++c;
		 a=46;
		 b=++a;
		 c=++b;
		 a++;
		 a=b++;
		 b=c++;
		 System.out.println(a);//48
		 System.out.println(b);//48
		 System.out.println(c);//49
		}
}
