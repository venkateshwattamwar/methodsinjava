package accessmodifer;




//public class level ,method level ,variable level :
// public can be access throughout project
//through out the project mhnje eka project madhe kuthehi call karu shakto


public class  ClassA {
	//public class
	int a=10;
static String b = "abc";

	
	
	public void m1()
	{
		System.out.println(" this is m1 method from class 1");
		
	}
	public static void m2()
	{
		System.out.println("this is method m2 from class 1 ");
	}
	public static void main(String[] args) {
		
		m2();
		ClassA z = new ClassA();
		z.m1();
		
		ClassB n =new ClassB();
		n.m5(); //calling default class
		
		
		
	}
	

}
