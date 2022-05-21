package ConditionalStatement;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		String s = "Chinchwad";     //desion making statement between no.of cases
		                           //decision making mhanje konti case execute karaychi
		
//		switch(variablename)
		
//		case "value1" : Actions
//		case "Value2" : Actions
//		default : Actions
		
		
		switch(s)
		{
		
		case "Delhi" : System.out.println("case 1 satisfy");
		
		System.out.println("Delhi is selected");
		break;
		
		case "Bengaluru" : System.out.println("Bengaluru selected");
		break;
		case "Pune": System.out.println("Pune is selected");
		break;
		
		default : System.out.println("no case matched");
		
		
		
		
		}
		
		
		
		
	}

}
