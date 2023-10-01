public class Marks_ladder_if_elseif 
	{ 
	 public static void main(String[]args)
		{
		 int a=101;
		 if (a>=90 && a<=100)
		 {
		   System.out.println(a +" = Outstanding");
		 }
		 else if (a>=80 && a<=90)
		 {
		   System.out.println(a +" = Very Good ");
		 }
		 else if (a>=70 && a<=80)
		 {
		   System.out.println(a +" = Good ");
		 }
		 else if (a>=60 && a<=70)
		 {
		   System.out.println(a +" = Average ");
		 }
		 else if (a>=45 && a<=60)
		 {
		   System.out.println(a +" = Atleast u tried ");
		 }
		  else if (a<45)
		 {
		   System.out.println(a +" = don't give attention ");
		 }
		  else
		 {
		   System.out.println("Bad value");
		 }
		}
	}

