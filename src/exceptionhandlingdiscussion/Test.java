package exceptionhandlingdiscussion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {

 public void m1()
	{
		System.out.println("this is m1 method");
	}


public static void main(String[] args) throws FileNotFoundException {
	try {
		System.out.println("this is method");
		FileInputStream fis = new FileInputStream("E:\\desktop\\Kfsfsdfatraj\\15 Jan\\Constructor.docx");

	}
	catch(FileNotFoundException f)
	{
		System.out.println("execution");
	}
	

}

	
}
	

	
