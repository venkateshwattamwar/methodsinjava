package exceptionhandlingdiscussion;

public class test2 {
 static int i=10;
 static int j=20;
	public static void throwException()
	{try {
		if(i<j)
		{
		System.out.println("null pointer");
		throw new NullPointerException("ahfbdf");
		}
	}
	catch(ArithmeticException a)
	{
		
		
			System.out.println("arithmetic");
			
			throw new ArithmeticException("throwing exception for example");
		
		
	}
	
	}
	
	public static void main(String[] args) {
		throwException();
	}

}


