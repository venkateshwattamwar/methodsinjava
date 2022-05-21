package practice;

public class Child extends Parent{
	
	public void m1()
	{
		System.out.println("this is method m1 from child class");
	}
	
	public static void main(String[] args) {
		
		Child c= new Child();
		Parent d=(Parent) c;//up casting: we have to casting from child class to parent class is known as up casting
		d.m1();
		d.m2();
		
//		Parent p= new Parent();//casting exception 
//		Child e=(Child)p;
//		e.m1();e.m2();
		
		Child e=(Child)d;//down casting: we have to casting from parent to child class is known as down casting
		e.m1();
		e.m2();
//		
		
	}
	

}
