package operator;

public class Logicaloperator {
	
	//logical and operator
	public static void main(String[] args) {
		 int i =50;
		 int j= 20;
		 
		 boolean s=(i>20)&&(j<50); 
		 System.out.println(s); //true
		 
		 boolean v=(i==j)&&(i<j);
		 System.out.println(v);//false      //ekhadi statement jr chukichi asel tr falsech yenar
		 
		 
		 //logical or operator
		 
		 boolean e=(i>20)||(j<50);
		 System.out.println(e);  //true
		 
		 boolean n=(i==20)||(j<50);
		 System.out.println(n);  //true          //ekhadi statement jr correct asel tr truech yenar
		 
		 
		 //logical not operator
		 
		 boolean o=i!=20;
		 System.out.println(o);  //true
		 
		 boolean k=!(i>50);
		 System.out.println(k);  //true
		 
		 
		 
		 
	}
	
	

}
