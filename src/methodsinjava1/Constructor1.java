package methodsinjava1;

public class Constructor1 {

	public Constructor1()
	{
		System.out.println("this is constructor without argument");
	}
	
	public Constructor1(String a, int b)
	{
		this(50,"maharashtra",50);                                      //calling one constructor to another constructor
		
		System.out.println("this is constructor with two argument");
		
		System.out.println(a+b);
		
	}
	public Constructor1(int c ,String d,int e)
	{
		this();                                                               //calling one constructor to another constructor
		System.out.println("this is constructor with three argument");
		
		System.out.println(c+d+e);
	}
	public static void main(String[] args) {
		
		Constructor1 t =new Constructor1();                         // object cretion to call constructor
		
		Constructor1 v =new Constructor1 ("mh",19);
				
	}
}
