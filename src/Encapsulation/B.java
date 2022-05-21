package Encapsulation;

public class B {
	
	public void showbalance(int a)
	{
		A a2=new A();
		a2.login(a);
		
	}
	public void showorder(int o)
	{
		A a1=new A();
		a1.order(o);
		System.out.println(a1.j);
		
		
	}
	public static void main(String[] args) {
		
		
		A a3=new A();
		System.out.println(a3.j);
				
	}
	
	

}
