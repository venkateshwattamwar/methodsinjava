package stringclass;

public class MethodsInString {
	public static void main(String[] args) {
		//1.equals (string):check identical or not (check small letter or capital letter )
		
		String s1="velocity";
		String s2="Velocity";
		boolean s3=s1.equals(s2);
		System.out.println(s3);//false
		
		//2.equalsignorecase(String s):check content of both the strings are equal irrespective of cases 
		
		String s4 ="Velocity";
		String s5 ="velOcity";
		boolean s6 =s4.equalsIgnoreCase(s5);
		System.out.println(s6);//true
		
		//3.length:this method returns the total no.of characters available inside a string(space should be calculated)
		
		String s7="abcdefghi ";
	    int s8=s7.length();
	    System.out.println(s8);//9
	    
	    //4.charAT(int index):it represents the character value based on index position
	    
	    String s9="abcdef";
	   char s10=s9.charAt(3);
	   System.out.println(s10);//d
	   
	   //5.replace(char old ,char new):replace the old character with new character
	   
	   String s11="abcdefabc";
	   String s12=s11.replace('b', 'c');
	   System.out.println(s12);//accdefacc
	   
	   //6.replace(string old,string new):
	   String s13="constructor";
	   String s14=s13.replace("truc", "tor");
	   System.out.println(s14);//constortor
	   
	   //7substring(int index)
	   
	   String s15="velocity";
	   String s16=s15.substring(3);
	   System.out.println(s16);//ocity
	   
	   //8.substring(int beginindex,int endindex)

        String s17="corporate";
        String s18=s17.substring(2, 7);
        System.out.println(s18);//rpora
        
        //9.contains(string value)
	   String s19="sandip";
	   boolean s20=s19.contains("ip");
	   System.out.println(s20);//true
	   
	   //10.toLowercase
	   String s21="VELOciy";
	   String s22=s21.toLowerCase();
	   System.out.println(s22);//velociy
	   
	   //11.toUppercase
	   String s23="VElocity";
	   String s24=s23.toUpperCase();
	   System.out.println(s24);//VELOCITY
	   
	   //12.indexof(char ch)//this method returns index position of the character
	  String s25="abcdefabc";
	  int s26=s25.indexOf('c');
	  System.out.println(s26);
	  
	   
	   
//	   
//	   //4.if we provide the index position beyond the extent limit then it will give he stringindexoutofbondexception
//	   String s11="abcedf ";
//	   char s12=s11.charAt(10);
//	   System.out.println(s12);
//	    
	  
	  //13.trim()//remove the space
      
	  String s29="   happy new year    ";
	  String s30=s29. trim();
	  System.out.println(s30);
	  
	  //14.split (String s)
	  String s31="this is String";
	  
	  String [] s33=s31.split(" ");
	  for (String ss:s33)
	  {
		  System.out.println(ss);
		  
	  }
	  
	  
	  //15.toCharArray:this method return a Char array of the given String
	
	  String s34="string value # 123";
	  char [] chararray=s34.toCharArray();
	  
	  int size =chararray .length;
	 for (int i= 0;i<size ;i++)
	 {
		 System.out.println(chararray[i]);
	 }
	 
	 
	//conversion of string type to primitive data type 
	  
	  //example 1
	 
	 String s36="10";
	 
	 int s37=Integer .parseInt(s36);
	 
	 int addvalue =s37+2;
	 System.out.println(addvalue);//12
	 
	 //example 2
	 
	 String s39="56.36";
	 double s40=Double.parseDouble(s39);
	 System.out.println(s40);//56.36
	 
	 //example 3
	 
	 String s41 ="true";
	 
	 boolean s42=Boolean.parseBoolean(s41);
	 System.out.println(s42);//true
	 
	 
	 //isDigit (char c)//this method returns true if the provided character is a digit otherwise it returns false
	 
	 char s43='8';
	 
	 boolean s44=Character.isDigit(s43);
	 System.out.println(s44);//true
	 
	 
	 //19.isAlphabetic(char ch)//this method return true if the provided character is an alphabet otherwise it will return false 
	 
	 char s45= 'g';
	 boolean s46=Character.isAlphabetic(s45);
	 System.out.println(s46);//true
	 
	 //20.replaceAll(String s)

	 String s48="avb@@AB3c64578#%32545urS";
	 
	 String s49=s48.replaceAll("[a-z]", ".");
	 System.out.println(s49);//...@@AB3.64578#%32545..S
	 
	String s50= s48.replaceAll("[A-z]", ".");
	System.out.println(s50);//...@@..3.64578#%32545...
	
	String s51=s48.replaceAll("[a-c]", "*");
	System.out.println(s51);//*v*@@AB3*64578#%32545urS
	
	String s52= s48.replaceAll("[A-za-z]", "0");
	System.out.println(s52);//000@@003064578#%32545000
	
	String s53=s48.replaceAll("[^a-z]", "1");
	System.out.println(s53);//avb11111c111111111111ur1
	
	String s54=s48.replaceAll("[^A-za-z]",",");
	System.out.println(s54);//;avb,,AB,c,,,,,,,,,,,,urS
	
	String s55=s48.replaceAll("[0-9]", "k");
	System.out.println(s55);//avb@@ABkckkkkk#%kkkkkurS
	
	//assignment we want symbols only
	
	String s56=s48.replaceAll("[A-za-z0-9]", "");
	System.out.println(s56);//@@#%
	  
	  
	  
	  
	  
	}}

	
