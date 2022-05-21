package ConditionalStatement;

public class BreakwithOuterLoop {
public static void main(String[] args) {
		
		
		for(int j =0; j<=5; j++)       //outer loop
		{
		
		for(int i = 0; i<=10; i++)   // inner loop
		{
			System.out.println("i value is "+i);
			if(i==2)
			{
				break;
			}
			
		}
		
		}
		
	}

	
}
