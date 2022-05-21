package exceptionhandlingdiscussion;

public class Trycatchfinally {
	
	public static void main(String[] args) {
		
		try {
		int i=10;
		int j=0;
		
		int k=i/j;
	
		}
		catch(ArithmeticException a)
		{
			String message = a.getMessage();
			System.out.println(message);
			System.out.println("arithmatic exception block");
		}
		finally
		{
			System.out.println("finally block");
		}
		
		//we can take try then finally also;
		
	}
	
	
	


	
		
	}


