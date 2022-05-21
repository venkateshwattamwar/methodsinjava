package arrey;

import interfacedisscussion3.browser1;

public class Arreydefination {
	
	public static void main(String[] args) {
		
		int[]a=new int [5];
		
		a[0]=10;
		a[1]=20;
		a[2]=25;
		a[3]=30;
		a[4]=35;//0//if this is method is not here it can automatically store default value '0'
//		a[5]=40;/it get exception ArryIndexOutofBounEecxeption
		
		System.out.println(a[2]);
	
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	
}
