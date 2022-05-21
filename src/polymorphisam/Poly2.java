package polymorphisam;

public class Poly2 extends Polymorfism1 {

	
	public void m1(int a, int b)
	{
		System.out.println("this is m1 method from poly2");
		
	}
	public static void main(String[] args) {
		Poly2 x=new Poly2();
		x.m1();
	}
	
}
