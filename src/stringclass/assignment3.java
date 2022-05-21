package stringclass;

public class assignment3 {
	
	//WAP to count a character in a String 
	
	public static void main(String[] args) {
		String s1="aaabbaacccdd";
		int count =0;
		
		for (int i =0;i<s1.length();i++)
		{
			char s2 = s1.charAt(i);
			if(s2=='a')
			{
				count ++;
			}
		}
		System.out.println(("character a is present for "+count+"times"));
		
		
	}


}
