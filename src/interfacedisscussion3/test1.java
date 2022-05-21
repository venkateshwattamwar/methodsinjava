package interfacedisscussion3;

public class test1 {
	public static void main(String[] args) {
		
		System.out.println(Interface1.v);
		System.out.println(Interface2.v);
		
		Browser2 b= new Browser2();
		b. close();
		b.refresh();
		b.m1();
		
//we can not create an object of interface but we can create a reference variable of interface		
		Interface1 i=new Browser2();
		i.close();
		i.back();
		i.refresh();
	
		Interface2 j= new Browser2();
		j.m1();
		j.m2();
		j.m3();
		j.m4();
		
		Interface1 n=new browser1();
		n.close();
	}


}
