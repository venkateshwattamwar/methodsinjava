package ConditionalStatement;

public class ContinueKeyword {
	
	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++)
		{
			if (i%2==0)
			{
				continue;        //keyword gets execute it move the loop to the next iteration  
			}
			System.out.println(i);
		}
	}

}
