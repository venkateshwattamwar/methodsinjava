package loop;

public class StarPattern33 {
	//star program
//	*****
//	 ****
//	  ***
//	   **
//	    *
	public static void main(String[] args) {
		
		for (int i =1; i<=5;i++)  //outer loop
		{
			for (int j=1;j<=5; j++)   //inner loop
			{
				if(j>=i)
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print(" ");
				}
				
			}System.out.println();
		}
		
		
		
	}

}
