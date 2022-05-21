package practice;

public class ClassB extends ClassA {
	int i=30;
	
	public void m5() 
	{
		int i=50;
		
		System.out.println();
		System.out.println("this is m5 method from class B");
		
	}
	
	public void m6() 
	{
		System.out.println("this is m6 method from class 6");
	}
	

public static void main(String[] args) {
	ClassB b=new ClassB();
	b.m1();
	b.m2();
	b.m5();
	b.m6();
	m4();
	
	System.out.println(c);
	System.out.println(b.i);
}
}
