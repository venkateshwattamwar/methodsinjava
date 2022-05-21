package polymorphisam;

public class Polymorphisam extends PolymorTest {
	public void method2() {
		System.out.println("hello 1");
	}
public static void main(String[] args) {
	
	PolymorTest var2=new Polymorphisam();
	var2.method2();	
}
}
