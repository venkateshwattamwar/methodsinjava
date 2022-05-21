package interfacedisscussion3;

public class browser1 implements Interface1 {

	
	public void close() {
		System.out.println("this is close method from browser 1 ");
	}

	
	public void back() {

		System.out.println("this is back method from browser 1");
		
	}


	public void refresh() {
		
		System.out.println("this is refresh method from browser 1");
	}

}
