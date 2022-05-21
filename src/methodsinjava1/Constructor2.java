package methodsinjava1;

public class Constructor2 {
	
//in this class we will see the use of constructor
	
	String name;
	String nativeplace;
	int mathmarks;
	int age;
	
	static int roll;
	static String collagecity;
	static String coolagename;
	
	public Constructor2(String name,String nativeplace, int mathmarks,int age)
	{
		this.name=name;
		this.nativeplace = nativeplace;
		this.mathmarks= mathmarks;
		this.age=age;
		
	}
	public static void main(String[] args) {
		
		Constructor2 s1 = new Constructor2("venkatesh", "nanded",10,19);
		
		Constructor2 s2 =new Constructor2("sandip","mukhed",19,20);
		
		System.out.println(s2.age);
		System.out.println(s1.mathmarks);
		
	}
	
	
	
}
