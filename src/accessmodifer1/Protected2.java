package accessmodifer1;

import accessmodifer.Protected;

public class Protected2 extends Protected  {
	
	public void m2()
	{
		Protected2 z = new Protected2();
		z.m1();
		m3();
		
	}	
	
	public static void main(String[] args) {
		
		Protected2 z = new Protected2();
		z.m2();//calling with object of child class
	}

}//protected behave like a default but when it call in another package then we 
//have extend and call with child object
//

