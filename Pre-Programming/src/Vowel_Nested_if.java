public class Vowel_Nested_if 
{
		public static void main(String[]args)
		{
			 char ch = '%';
			 if(ch >='A'&& ch <='Z')
			 {
				 if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				 {
					 System.out.println(ch +" is uppercase vowel ");
				 }
				 else
				 {
					 System.out.println(ch +" is uppercase consonant ");
				 }
			 }
			 else if (ch >='a'&& ch <='z')
			 {
				 if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				 {
					 System.out.println(ch +" is lowercase vowel ");
				 }
				 else
				 {
					 System.out.println(ch +" is lowercase consonant ");
				 }
			 }
			 else if (ch >='0'&& ch <='9')
			 {
				 System.out.println(ch + "Number");
			 }
			 else
			 {
				 System.out.println("Special Character");
			 }
				 
		 }
}
