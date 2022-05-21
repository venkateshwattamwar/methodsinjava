package stringclass;

public class Assignment4 {
	
	//WAP reverse string world
	
public static void main(String[] args) {
	
	String s1="this is string";
	
	String [] s2=s1.split(" ");
	
//	for(String h:s2) {
//		System.out.println(h);
//	}
	
	for (int j=s2.length-1;j>=0;j--)
	{
		System.out.print(s2[j]+" ");
	}
	System.out.println();//string is this 
}

}
