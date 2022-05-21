package exceptionhandlingdiscussion;

public class exception {
	
	public static void main(String[] args) {
		try {
			int k;
			
			int i=10;
			int j=0;
			
			k=i/j;
			 
			System.out.println(k);
			
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("this is arrey enception");
		}
		catch(ClassCastException c)
		{
			System.out.println("this is classcastexception");
		}
		catch(NullPointerException n)
		{
			System.out.println("this is null pointer exception");
		}
		catch(Exception e)
		{
			System.out.println("this is exception");
		}
		catch(Throwable t)
		{
			System.out.println("throwable message ");
		}
		
		System.out.println("last print sattement");
	}
		





	
		
	

}
