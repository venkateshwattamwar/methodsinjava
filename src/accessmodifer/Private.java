package accessmodifer;
// private we can call only with in class

public class Private {
	private void m1() {
	System.out.println("private method m1");
	}
	public static void main(String[] args) {
		System.out.println("hello");
		Private d=new Private();
		d.m2();
	}
public void m2() {
	m1();
}

}
