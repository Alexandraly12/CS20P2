package Mastery;
import java.util.Random;

public class Nim2 
{	
	private static final int max = 30;
	private static final int min = 15;
	private int number;
	private int userStones;
	private int comStones;
	
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
	
	public int comTakeStone(int take)
	{	
		Random amount = new Random();
		take = amount.nextInt(1 - 3) +1;
		comStones += take;
		number -= take;
		
		return take;
	}
	
	public int remainingStones()
	{
		
	}
	
	public void user()
	{
		number -= ;
	}
	
	
	public int getstones()
	{
		return(number);
	}
	
	public String toString()
	{
		return("")
	}
}
