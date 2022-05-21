package inhetritance;

public class D extends E {
	
    public void m10 ()
    {
    	k1.m1();
    	k2.m5();
    	k3.m9();
    }
    
    public void m11()
    {
    	k2.m6();
    	k1.m1();
    	
    }
    
    public void m12()
    {
    	k1.m1();
    	k3.m9();
    	
    }
    
    public static void main(String[] args) {
		
    	D z =new D();
    	z.m10();
    	z.m11();
    	z.m12();
	}
    

}
