package exceptionhandlingdiscussion;

public class Trycatch {
	
	
	public static void main(String[] args) {
		int k;
	try {
		int i=10;
		int j=0;
		
      k=i/j;
	
	System.out.println(k);
		
		
	}
	catch (ArithmeticException a)
	{
		System.out.println("this is arithmatic exception");
	} 
	System.out.println("after catch is executing");


	} }



