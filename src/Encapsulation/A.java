package Encapsulation;

public class A {
	
	private int i=10000;
	 final int j=20000;
	
	public void login (int a)
	{
		if(a==1234)
		{
		System.out.println("log in sucessfull"+i);
		
	}
		else	
		{
			System.out.println("login unsucessfull");
		}
		

}
	public void order(int o)
	{
		int k=j+500;
		System.out.println(k);
		 i=i-o;
		System.out.println("remaning wallet"+i);
		
	}
	public static void main(String[] args) {
		A a=new A();
		
		a.login(1234);
		
		a.order(4200);
		
		
		
	}
	
}
