package stringclass;

public class Assignmentsix {
	
	public static void main(String[] args) {
		String s1= "this is venkatesh";
		String []s2=s1.split(" ");
		
		for (String s3:s2)
		{
			//System.out.println(s3);
			String s4=s3.substring(0, 1);
			//System.out.println(s4);
			
			String s5=s3.substring(1);
			//System.out.println(s5);
			
			String s6=s4.toUpperCase();
			//System.out.println();
			
			String s7=s6.concat(s5);
			System.out.println(s7+" ");//This 
		                             //	Is 
		                            //	Venkatesh 
			
			
		}
		
	}
	

}
