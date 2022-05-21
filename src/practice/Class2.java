package practice;

public class Class2 extends Class1 {
	
	public void m1(String l,String k)
	{
		System.out.println("this is m1 method from class 2");
	}

	
	public static void main(String[] args) {
		
		Class2 ab=new Class2();
		ab.m1();
		ab.m1("am","pm");
		
		
		
	}
}
