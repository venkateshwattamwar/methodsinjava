package casting;

public class Child extends Parent{
	
	public void m1()
	{
		System.out.println("this is m1 method from child class");
	}
	
	public static void main(String[] args) {
		
		Child c=new Child();
		Parent p=(Parent)c;//up casting or generalization ; we have to casting from child class to parent class is known up casting 
		
		p.m1();
		p.m2();
		
//		Parent x=new Parent ();
//		Child y=(Child)x;
//		y.m1();
//		y.m2();
//		
		Child v=(Child)p;//down casting or specialization; first we have take child to parent then parent to child 
		                 //because of parent to child is not valid in java
		v.m1();
		v.m2();
				
	}

}
