package exceptionhandlingdiscussion;

public class InterruptedException1 {
	
	public static void main(String[] args) {
		
		System.out.println("first line");
		try {
		Thread.sleep(5000);
	}
		catch(InterruptedException i)
		{
			System.out.println("catch block");
		}
		
		System.out.println("last line");
		}

}
