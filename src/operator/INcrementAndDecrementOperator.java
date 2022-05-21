package operator;

public class INcrementAndDecrementOperator {

	public static void main(String[] args) {
		
		int x= 10;
		int y= x++;
		
		System.out.println(x);   //11
		System.out.println(y);   //10
		
		
		int z =++x;
		System.out.println(x);    //12
		System.out.println(z);    //12
		
		int a=--x;
		System.out.println(x);     //11
		System.out.println(a);     //11
		
		int c=x--;
		System.out.println(x);//10
		System.out.println(c);//11
		
	}
	
	
	
}
