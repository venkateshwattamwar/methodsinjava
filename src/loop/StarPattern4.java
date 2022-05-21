package loop;

public class StarPattern4 {
//star project 
//	    *
//	   **
//	  ***
//	 ****
//	*****

	public static void main(String[] args) {
		for (int i =1;i<=5; i++)   //outer loop
		{
			for(int j =5; j>=1; j--)   //inner loop
			{
				if(j<=i)
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print(" ");
					
				}
				}
				System.out.println();
			
			
		}
	}

}
