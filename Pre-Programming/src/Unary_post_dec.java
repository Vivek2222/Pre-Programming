public class Unary_post_dec 
{
	//decrement value by 1
	//update the decrement value in the same variable
	//use current value if any operation going on
	 public static void main(String[]args)
		{
		 int a =37;
		 a--;
		 int b =a--;
		 int c =b--;
		 int d =c--;
		 a=c--;
		 b=a--;
		 c=d--;
		 d=b--;
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 System.out.println(d);
		}
}
