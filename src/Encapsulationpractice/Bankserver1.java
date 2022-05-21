package Encapsulationpractice;

public class Bankserver1 {
	
	private int cust1balance=50000;
	
	public void getbalance(int pin) 
	{
		if (pin==1234)
		{
			System.out.println("your balance is "+cust1balance);
		}
		else
		{
			System.out.println("please enter valid pin");
		}
		
	}
	
	
	public void setbalance(int amount)
	{
		cust1balance=cust1balance-amount;
		System.out.println("amount"+amount+"you has been witharwal your balance is" +cust1balance);
	}
	
	}
	



