package stringclass;

public class Basicconcept {
	
	public static void main(String[] args) {
		
		String s= new String ("abc");//its object created in heap area &other at SAP area(provided if any other object by same 
		                           //value is not available
		
		String s1=new String ("def");
		
		String ss="jkl";
		
		String ss1="jkl";
		
		String s2=new String("jkl");
		
		String s3=new String("abc");
		
		String ss2="abc";//it will create object in SAP area
		
		boolean ispointingsame=ss==ss1;
		System.out.println(ispointingsame);//true/object same ahe mhnun
		
		boolean b=ss==ss2;
		System.out.println(b);//false/object vegl ahe mhnun
		
		boolean isequal=s3.equals(s);//EQUALS IS USED FOR CONTENT COMPARISON
		System.out.println(isequal);//TRUE
		
		boolean isequal1 = ss.equals(ss2);
		System.out.println(isequal1);//false
		
		String var1= "velocity";
		var1.concat("corporate");
		System.out.println("output of string is" +var1);//immutable
		
		System.out.println("*****************");
		
		StringBuffer sb= new StringBuffer(" velocity ");
		sb.append("corporate");
		System.out.println("output of string buffer is"+ sb);//mutable
		
	
		
	}
	
	
	
	
	

}
