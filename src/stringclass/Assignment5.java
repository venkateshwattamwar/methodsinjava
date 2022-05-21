package stringclass;

public class Assignment5 {
	
	//WAP differentiate char & num & special symbol
	
	public static void main(String[] args) {
		
		String s5="12345@#$%^venka";
		
		String s6=s5.replaceAll("[^a-z]", "");
		System.out.println(s6);//venka
		
		String s7=s5.replaceAll("[^0-9]", "");
		System.out.println(s7);//12345
		
		String s8= s5.replaceAll("[^a-z0-9]", "");
		System.out.println(s8);//12345venka
		
		String s9=s5.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(s9);//@#$%^

	}

}
