public class Unary_pre_Dec 
{
	//decrement value by 1
	//update the decrement value in the same variable
	//use decremented value if any operation going on 
	public static void main(String[]args)
		{
		 int m =47;
		 --m;
		 int n =46;
		 --n;
		 int p =--m;
		 --n;
		 m=32;
		 n=--p;
		 p=--m;
		 System.out.println(m);
		 System.out.println(n);
		 System.out.println(p);
		}
}
