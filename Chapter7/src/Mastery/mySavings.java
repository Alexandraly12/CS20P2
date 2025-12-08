package Mastery;

public class mySavings 
{
	private static final double penny = 0.01;
	private static final double nickel = 0.05;
	private static final double dime = 0.10;
	private static final double quarter = 0.25;
	private double balance;
	private double out;
	
	//Constructor method
	public mySavings()
	{
		balance = 0;
	}
	
	public mySavings(double amount)
	{
		balance = amount;
	}
	
	//Add a penny to balance
	public void depositP()
	{
		balance += penny;
	}
	
	//Add a nickel to balance
	public void depositN()
	{
		balance += nickel;
	}
	
	//Add a dime to balance
	public void depositD()
	{
		balance += dime;
	}
	
	//Add a quarter to balance
	public void depositQ()
	{
		balance += quarter;
	}
	
	//Calculate balance without extra decimals
	public double getBalance()
	{	
		Math.round((balance * 100) / 100);
		return(balance);
	}
	
	//Withdraw all money from balance
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
