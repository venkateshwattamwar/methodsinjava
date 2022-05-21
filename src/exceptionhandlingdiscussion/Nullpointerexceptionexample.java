package exceptionhandlingdiscussion;

public class Nullpointerexceptionexample {
	
	static Nullpointerexceptionexample nep;
	
	public void m()
	{
		System.out.println("m1  method is executing"); 
	}

	public static void main(String[] args) {
		
		try {
			nep.m();
		}
		catch (NullPointerException n)
		{
			System.out.println("null pointer exception arrived");
		}
		System.out.println("after catch block");
		
	}
	
	
	
}
