package inhetritance;

public class Parent extends Grandparent
{ 
	   String s = "non static variable parent class";

       static String j = "Staticvariable parent class";
	


		
		public void home()
		{
			System.out.println("Home method from parent class");
		}
		
		
		public void car()
		{
			System.out.println("car method from parent class");
		}
		
		public void furniture()
		{
			System.out.println("furniture method from parent class");
		}
		
		public static void property()
		{
			System.out.println("Property method from parent class");
		}
		
		public static void main(String[] args) {
			
			Parent p = new Parent();
			p.home();
			property();
			p.furniture();
			
			Grandparent n=new Grandparent();
			n.farm();
			
		}
		
	}


