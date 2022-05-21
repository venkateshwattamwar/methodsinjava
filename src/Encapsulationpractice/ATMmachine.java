package Encapsulationpractice;

public class ATMmachine {
	
	public void balenqurry(int pin)
	{
		Bankserver1 a =new Bankserver1();
		a.getbalance(pin);
	}
	public void widrawal(int amount)
	{
		Bankserver1 b=new Bankserver1();
		b.setbalance(amount);
	}
	public static void main(String[] args) {
		ATMmachine v=new ATMmachine();
		v.balenqurry(1234);
		v.widrawal(10000);
	}
}
