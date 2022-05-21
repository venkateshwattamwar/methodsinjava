package exceptionhandlingdiscussion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Filenotfondexceptionexmp {
	
	public static void main(String[] args) throws FileNotFoundException {
		
	//	try 
	//	{
			System.out.println("before tracking the file ");
			
			FileInputStream fis =new FileInputStream ("C:\\Users\\ADMIN$\\Pictures\\sql\\DAY01 (1).docx");
					
	//	}
		
//		catch(FileNotFoundException e)
//		{
//		System.out.println("file not found exception arrived and catch is executing");	
//		
//		}
		System.out.println("after tracking the file");
		}
		
	

}
