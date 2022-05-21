package exceptionhandlingdiscussion;

public class ThrowsKeyword {
	
		Test t;
		public static void main(String[] args) throws  InterruptedException, ArithmeticException, NullPointerException
		{
			
			
			System.out.println("first line");
			
//			FileInputStream fis = new FileInputStream("E:\\desktop\\Kfsfsdfatraj\\15 Jan\\Constructor.docx");
					
			System.out.println("LAst line");
			
			ThrowsKeyword tk = new ThrowsKeyword();
			
			tk.m2();// Null pointer exception because we have only reference variable but not object
			
			
			
		}
		
		public void m2() 
		{
			try {
				t.m1();
			}
			catch(NullPointerException n)
			{
				System.out.println("this is null pointer exception ");
			}
			
		}

	}



