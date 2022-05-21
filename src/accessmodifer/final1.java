package accessmodifer;
//final

public final class final1 extends  finalTest1 {
	
	public  void m7()
	{
		m3();
		System.out.println("this is final m7 method and class  ");
	}
	public  static void m8()
	{
		System.out.println ("this is final m8 method and class");
	}
   
	
	public static void main(String[] args) {
		final1 e =new final1();
		e.m7();
		
		m8();
		
	}
	
	

}
