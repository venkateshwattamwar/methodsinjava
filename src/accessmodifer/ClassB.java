package accessmodifer;
//default class , method variable: it can be access with in the package
 class ClassB {
	
	void m4()
	{
		System.out.println("this is m4 method from classB default class");
		
	}
	
	void m5()
	{
		System.out.println("this is m5 method from classB default class");
		
	}
	public static void main(String[] args) {
		
		ClassB n = new ClassB();
		n.m4();
	}

}
