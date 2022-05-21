package arrey;

public class arrey2 {
	public static void main(String[] args) {
		//advance for loop
		
			int[]b=new int [5];
			
			b[0]=10;
			b[1]=21;
			b[2]=30;
			b[3]=40;
			b[4]=50;

			for (int t:b) {
				//for(int t=0;t<=4;t++)
				System.out.println(t);
			}
			
			String str[]=new String [3];
			
			str[0]="a1";
			str[1]="a2";
			str[2]="a3";
			
			for (String h :str)
			{
				if (h.equals("a2"))
				{
					h=h+34;
					System.out.println(h);
				}
			}
					
			//WAP to print the values of even index position of an array
			
			System.out.println("************************************************************");
			
			String s1[]=new String [5];
			
			s1[0]="abc";
			s1[1]="def";
			s1[2]="ghi";
			s1[3]="klm";
			s1[4]="nop";
			
			for (int i=0;i<5;i++)
			{
				if(i%2==0)
				{
					System.out.println(s1[i]);//abc
				                             //	ghi
					                        //  nop
				}
			}
			
					
			
			
	}
	


}
