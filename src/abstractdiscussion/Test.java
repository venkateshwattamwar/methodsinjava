package abstractdiscussion;

public abstract class Test {
	
	
	public Test ()//we can have constructor in abstract class
	{
		System.out.println("this is constructor in abstact class");
	}
	
	public void loginpage ()
	{
		System.out.println("login method from test class");
	}
	public void homepage()
	{
		System.out.println("homepage method fromtest class");
	}
	
	public abstract void editinformation();
	
	public abstract void uaploadimage();//abstract means its combination of complete as well as incomplete methods
	                                    //whenever we declare as abstract in then it will not compulsory not complete method 
	                                    //means abstract method should be included

}
