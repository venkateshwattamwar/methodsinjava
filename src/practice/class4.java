package practice;

public class class4 extends class3 {

	public void m1()
	{
		System.out.println("this is overridden method class4");
	}
	public void m3(int i)
	{
		System.out.println("this is overridden method");
	}
	public void m2( String j)
	{
		System.out.println("this is overridden method");
	}
	public static void main(String[] args) {
		class4 aa =new class4();
		aa.m1();
		
		class3 bb= new class3();
		bb.m1();
		
		 
		
		
	}
}
