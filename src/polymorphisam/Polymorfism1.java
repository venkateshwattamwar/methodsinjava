package polymorphisam;

public class Polymorfism1  {
	
	public void m1()
	{
		System.out.println("this is m1 method ");
		
	}
    public void m1(int a)
    {
    	System.out.println("this is overloding method");
    	
    }
    public static void main(String[] args) {
		
    	Polymorfism1 z=new Polymorfism1();
    			z.m1();
    			z.m1(50);
	}
}
