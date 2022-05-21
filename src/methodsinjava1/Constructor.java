package methodsinjava1;

public class Constructor {
	
	public void m1()
	{
		System.out.println("this is m1 method");
		
		
	}
	public Constructor()
	{
		System.out.println("this is constructor");
		int i =10;
		int j=20;
	System.out.println(i+j);
	System.out.println(i*j);
	
		
	}
	public static void main(String[] args) {
		
		Constructor t =new Constructor();
		t.m1();
		
	}
	
	
	
	

}
