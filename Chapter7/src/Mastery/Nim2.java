package Mastery;
import java.util.Random;

public class Nim2 
{	
	private static final int max = 30;
	private static final int min = 15;
	private int number;
	private int userStones;
	private int comStones;
	private boolean playerTurn = true;
	
	public Nim2()
	{
		number = 1;
	}
	
	public Nim2(int a)
	{
		number = a;
	}
	
	public int start()
	{
		Random random = new Random();
		number = random.nextInt(max - min + 1) + min;
		return(number);
	}
	
	public int comTakeStone()
	{	
		Random amount = new Random();
		int maxTaken = Math.min(3, number);
		int take = amount.nextInt(maxTaken) +1;
		comStones += take;
		number -= take;
		
		return take;
	}
	
	public int remainingStones()
	{
		number -= userStones;
		return number;
	}
	
	public int getValue(int v)
	{	
		userStones = v;
		return v;
	}
	
	public int getStones()
	{
		return(number);
	}
	
	public boolean turn()
	{
		return (playerTurn);
	}
	
	public void flipTurn()
	{
		playerTurn = !playerTurn;
	}
	
	public String toString()
	{
		return("There were " + start() + " stones."
				+ "You have " + userStones + " stones."
				+"\nComputer has " + comStones + " stones.");
	}
}
