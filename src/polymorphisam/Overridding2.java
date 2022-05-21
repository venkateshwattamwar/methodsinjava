package polymorphisam;

public class Overridding2 extends Overridding {

	public void  m2(int a)
	{
		System.out.println("this is m2 method from overridding2");
		
	}
	
	public static void m3 ()
	{
		System.out.println("this is static method m3 from overridding 2");
	}
	
	public static void main(String[] args) {
		  
		Overridding2 c= new Overridding2();
		c.m2(10);
		c.m3();
		
		Overridding b=new Overridding();
		b.m1();
		b.m2(10);
		b.m3();
		
		Overridding n=new Overridding2();
		n.m2(20);
		n.m1();
		n.m2(25);
		n.m3();//static method does not follow overridding, its known as method hidding
	
	}
}
