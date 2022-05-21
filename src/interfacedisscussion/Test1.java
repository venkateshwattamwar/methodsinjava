package interfacedisscussion;

public class Test1 {
	
	public static void main(String[] args) {
		Browser2 b=new Browser2();
		b.close();
		b.back();
		b.refresh();
		
		
		Interface1 i1=new Browser2();
		
		i1.back();
		i1.refresh();
		i1.close();
		}

}
