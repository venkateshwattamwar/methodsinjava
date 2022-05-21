package abstract1;

public class ClassB  extends ClassA {

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
		System.out.println("this is abstract method ");
		
	}
	public static void main(String[] args) {
		
		ClassB b=new ClassB();
		b.m1();
		b.m2();
		b.m3();
	}
	

}
