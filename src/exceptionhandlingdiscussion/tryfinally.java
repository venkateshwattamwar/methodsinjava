package exceptionhandlingdiscussion;

public class tryfinally {
	
	public static void main(String[] args) {
		try {
		System.out.println("insisde the try block");
		int i=10;
		int j=0;
		
		int k= i/j;
		}
		finally
		{
			System.out.println("finally block");
		}
	}
	
//we can use try finally also but exception arrives into the try block then program will get termininated abnormally
	//but finally will always get execute
}
