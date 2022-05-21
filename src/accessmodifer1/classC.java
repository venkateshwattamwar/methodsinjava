package accessmodifer1;

import accessmodifer.ClassA;

public class classC {
	
	public void m3()
	{
		System.out.println("this is m3 method from class c");
		ClassA x =new ClassA();//calling public class another package
		x.m1();
		
	}
	public static void main(String[] args) {
		classC c =new classC();
		c.m3();
	}

}
