package Mastery;

public class mySavings 
{
	private static final double penny = 0.01;
	private static final double nickel = 0.05;
	private static final double dime = 0.10;
	private static final double quarter = 0.25;
	private double balance;
	private double out;
	
	public mySavings()
	{
		balance = 0;
	}
	
	public mySavings(double amount)
	{
		balance = amount;
	}
	
	public void depositP()
	{
		balance += penny;
	}
	
	public void depositN()
	{
		balance += nickel;
	}
	
	public void depositD()
	{
		balance += dime;
	}
	
	public void depositQ()
	{
		balance += quarter;
	}
	
	public double getBalance()
	{	
		Math.round((balance * 100) / 100);
		return(balance);
	}
	
	public double withdraw()
	{
		out += balance;
		balance -= balance;
		return(out);
	}

	public String toString()
	{
		return("Bank Balance: " + balance
				+"\nAmount withdrew: " + out);
	}
	
	
}
