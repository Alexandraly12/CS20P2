package Mastery;

import java.util.Scanner;

public class testNim2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Nim2 game = new Nim2();
		
		System.out.println("There are " + game.start() + " stones."
							+"\nHow many stones would you like to take?(1, 2 or 3)");
		int taken = input.nextInt();
		
		while (game.getstones() != 0)
		
			if(taken == 1)
			{
				
			}
			else if(taken == 2)
			{
				
			}
			else if(taken == 3)
			{
				
			}
			else
			{
				
			}
		
		
		input.close();
		
	}

}
