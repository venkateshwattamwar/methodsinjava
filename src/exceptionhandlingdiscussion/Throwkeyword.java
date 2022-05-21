package exceptionhandlingdiscussion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throwkeyword {
	
	public static void main(String[] args) throws FileNotFoundException,InterruptedException {
		
		System.out.println("first line");
		
		FileInputStream fis =new FileInputStream("C:\\Users\\ADMIN$\\Downloads\\Exception Handling (1).docx");
				
		System.out.println("last line");
	}

}//throws keyword; it is used to handle the exception but it can not terminating abnormally
// with the help of throw keyword we resolve the compile time error but if exception comes into the program then 
// we will not be able to handle it .to handle that exception we must try catch block
