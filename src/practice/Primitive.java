package practice;

public class Primitive {
	
	public static void main(String[] args) {
		//Implicit casting: whenever we are converting  data lower to higher data type is known as implicit casting
		//there can not be chance of data loss
		byte b=20;
		
	    int c=(int)b;
	    
	    System.out.println(c);
	    
	    //explicit casting:whenever we are converting higher to lower data type is known as explicit casting
	    //there might be chance of data loss
	    
	    int a=130;
	    
	    byte d=(byte)a;
	    System.out.println(d);
	    
	    
	}

}
