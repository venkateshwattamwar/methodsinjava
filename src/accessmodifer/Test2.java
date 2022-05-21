package accessmodifer;
// default method
 class Test2 {
	
	 void m9()
	{
		System.out.println("this is default m9 method ");
	}

	public static void main(String[] args) {
		ClassA a =new ClassA ();//calling public method
		a.m1();
		ClassA.m2(); 
		ClassB b= new ClassB();//calling default method
		b.m4();
		b.m5();
		
	} 
}
