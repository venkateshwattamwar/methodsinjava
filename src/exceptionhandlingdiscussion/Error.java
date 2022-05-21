package exceptionhandlingdiscussion;

public class Error {
	
	public void m1()
	{
		System.out.println("this is m1 method");
		m2();
	}
	public void m2()
	{
		System.out.println("this is m2 method");
		m1();
	}
public static void main(String[] args) {
	
	Error e =new Error();
	e.m1();
}
}//error;when any problem arrives in system and program terminate abnormally  then its known as error
//to handle that error ;to improve the system performance
