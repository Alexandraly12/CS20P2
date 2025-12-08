package Mastery;
import java.util.Random;

public class Nim2 
{	
	private static final int max = 30; // Max number of stones
	private static final int min = 15; // Min number of stones
	private int number; 
	private int userStones;
	private boolean playerTurn = true;
	
	public Nim2()
	{
		number = 1; //Starting number
	}
	
	//generate random amount of starting stones
	public int startNum()
	{
		Random random = new Random();
		number = random.nextInt(max - min + 1) + min;
		return(number);
	}
	
	//Determine computer turn
	public int comTakeStone()
	{	
		//Calculate random amount of stones for the computer to take (1,2 or 3)
		Random amount = new Random();
		int maxTaken = Math.min(3, number); // Let the computer take no more than amount of stones available
		int take = amount.nextInt(maxTaken) +1;
		number -= take;
		
		return take;
	}
	
	//Calculate remaining stones after user take
	public int remainingStones()
	{
		number -= userStones;
		return number;
	}
	
	//Get the number of stones the user takes
	public int getValue(int v)
	{	
		userStones = v;
		return v;
	}
	
	//Get the amount of stones not taken
	public int getStones()
	{
		return(number);
	}
	
	//player's turn starts off true
	public boolean turn()
	{
		return (playerTurn);
	}
	
	//Flip the turn from true to false
	public void flipTurn()
	{
		playerTurn = !playerTurn;
	}
	
}