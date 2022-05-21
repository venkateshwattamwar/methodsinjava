package practice;

public class Class1 {
	
	public Class1() {
		System.out.println( "this is constructor method");
	}
	
	public void m1()
	{
		System.out.println("this is method m1 from class1 zero arg");
	}
	public void m1(int i)
	{
		System.out.println("this is method m1 from class1");
	}
	public void m1(String j,int k)
	{
		System.out.println("this is method m1 from class1");
	}

	public static void main(String[] args) {
		
		Class1 a= new Class1();
		a.m1();
	
		a.m1(20);
		a.m1("samdip",10);
		Class1.m1(10, "amit");
		m1(10,"venk");
	}
	
	public static void m1(int m,String n)
	{
		System.out.println("this is m1 method with doublre argu");
	}
	public boolean m1(boolean k)
	{
		System.out.println("this is return type method");
         return true;
         
	}
	private void m1(int k,int l)
	{
		System.out.println();
	}

}
