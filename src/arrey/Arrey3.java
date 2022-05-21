package arrey;

public class Arrey3 {
	
	public static void main(String[] args) {
		
		//WAP to add the all the elements in array
		int d[]=new int [5];
		
		int sum =0;
		
		d[0]=10;
		d[1]=21;
		d[2]=2;
		d[3]=60;
		d[4]=60;
		
		for (int dd:d)
		{
			sum=sum+dd;
		}
		System.out.println(sum);
		
		System.out.println("*********************************************************");
		
		int [] i=new  int [8];
		i[0]= 10;
		i[1]=21;
		i[2]=2;
		i[3]=60;
		i[4]=60;
		i[5]=2;
		i[6]=60;
		i[7]=20;
		System.out.println(i.length);//8
		for (int a=0;a<i.length;a++)
		{
			if (a%2==0)
			{
				System.out.println(i[a]);
			}
		}
		
		//2nd way to define arrey 
	System.out.println("**************************************************************");
	
	String k[]= {"Danial","Elder","amit","venkatesh"};
	
	System.out.println(k.length);
	
	for (String kk:k)
	{
		System.out.println(kk);
	}
	int v[]= {10,52,56,42,60};
	System.out.println(v.length);
	
		
		
	}

}
