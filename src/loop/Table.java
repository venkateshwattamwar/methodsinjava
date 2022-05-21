package loop;

public class Table {
	public Table(int a) {
		int i=1;
		while (i<=10) {
			System.out.println(a*i);
			i++;
		}
	}
public static void main(String[] args) {
	Table a =new Table(4);
}
}
