package interfacedisscussion;

public class Browser2 implements Interface1 {

	
	public void close() {
		
		System.out.println("close method from browser 2");
	}

	
	public void back() {

		System.out.println("back method from browser 2");
		
	}

	
	public void refresh() {
	System.out.println("refresh method from browser2");	
	}

}
