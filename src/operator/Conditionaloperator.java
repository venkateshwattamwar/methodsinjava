package operator;

public class Conditionaloperator {
	
	//greater than operator >"
	public static void main(String[] args) {
		int i =100;
		int j=20;
		
		boolean r=i>j;
        
		System.out.println(r);//true
		
		
		if (i>j)
		{
			System.out.println("if is executing");//if is executing
			
		}
		else {
			System.out.println("else is executing");
			
		}
		
		// greater than or equal to'>='
		
		boolean k=i>=j;
		System.out.println(k);//true
		
		
		
		//less than
		boolean n=i<j;
		System.out.println(n);//false
		
		
		//less than or equal to'<='
		
		boolean l=i<=j;
		System.out.println(l);//false
		
		
		//equal to operator'=='
		boolean o=i==j;
		System.out.println(o);//false
		
		if (i==j)
		{
			System.out.println("if is executing");
			
		}
		else {
			System.out.println("else is executing");//else is executing
		}
		//operator he sgle main method madhech ghetat
		
	}
	
	
	
	
	
	

}
