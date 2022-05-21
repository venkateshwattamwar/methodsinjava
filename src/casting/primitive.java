package casting;

public class primitive {
	public static void main(String[] args) {
		//implicit casting: whenever we are converting lower data type into higher data type
		//there cannot be chance of data loss
		
		byte b=20;
		
		int c=(int)b;
		
		System.out.println(c);
		

		//explicit casting; we are converting higher data type into lower data type
		//there can be a chance of data loss
		
		int i=130;
		
		byte k=(byte)i;
		
		System.out.println(k);
	}
	
	
}
