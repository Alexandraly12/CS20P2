package Mastery;
import java.util.Random;

public class Nim2 
{	
	private static final int max = 30;
	private static final int min = 15;
	private int number;
	private int userStones;
	private int v;
	
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
		int take = amount.nextInt(3) +1;
		comStones += take;
		number -= take;
		
		return take;
	}
	
	public int remainingStones1()
	{
		number -= 1;
		return number;
	}
	
	public int remainingStones2()
	{
		number -= 2;
		return number;
	}
	
	public int remainingStones3()
	{
		number -= 3;
		return number;
	}
	
	public int useValue(int v)
	{
		return v;
	}
	
	public int getstones()
	{
		return(number);
	}
	
	public boolean equals()
	{
		if (
	}
	
	public String toString()
	{
		return("")
	}
}
