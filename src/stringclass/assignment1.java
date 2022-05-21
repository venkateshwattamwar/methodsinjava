package stringclass;

public class assignment1 {
	
	//WAP to print reverse of string value
	
	public static void main(String[] args) {
		
	String s11="this is string";
	
	String d=""; 
	
      int size =s11.length();
	
	int lastindex =size-1;
	
    for (int i =lastindex ;i>=0;i--)
	{
		d=d+s11.charAt(i);
	
	}
	System.out.println(d);

//		
}

}
