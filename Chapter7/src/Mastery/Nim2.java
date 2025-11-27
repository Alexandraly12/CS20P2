package Mastery;
import java.util.Random;

public class Nim2 
{
	private int number;
	
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
		int number = random.nextInt();
		return(number);
	}
	
	public int userplayer(int stones)
	{
		return(stones);
	}
	
	public int comPlayer(int stones2)
	{
		return(stones2);
	}
	
	public String toString()
	{
		
	}
}
