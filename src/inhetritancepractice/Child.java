package inhetritancepractice;

public class Child extends Parent {
	
	String s="madhuri";
	static int i=20;
	
	
	public void m3()
	{
		System.out.println(super.s);
		System.out.println(this.s);
		
		System.out.println("this is method m3 from  child");
		
	}
    public static void m4 ()
    {
       
    	System.out.println("this is method m4 from  child");
    }
    
    public static void main(String[] args) {
    	
    	Child z=new Child();
    	z.m3();
    	m4();
    	z.m1();
    	m2();
    	Parent.m2();
    	
    	System.out.println(z.s);//child ch ghetl
    	System.out.println();
    	
    	
	}
    
    
    
}
