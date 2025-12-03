package Mastery;

import java.util.Scanner;

public class testNim2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Nim2 game = new Nim2();
		
		System.out.println("There are " + game.start() + " stones.");
		
		do {
			System.out.println("How many stones would you like to take?(1, 2 or 3)");
			int taken = input.nextInt();
			game.useValue(taken);
			
			if(taken == 1)
			{
				System.out.println("Computer takes " + game.comTakeStone() + " stone(s).");
				System.out.println("Stones remaining: " + game.remainingStones1());
			}
			else if(taken == 2)
			{
				System.out.println("Computer takes " + game.comTakeStone() + " stone(s).");
				System.out.println("Stones remaining: " + game.remainingStones2());
			}
			else if(taken == 3)
			{
				System.out.println("Computer takes " + game.comTakeStone() + " stone(s).");
				System.out.println("Stones remaining: " + game.remainingStones3());
			}
			else
			{
				System.out.println("Unvalid amount.");
				System.out.println("Stones remaining: " + game.getstones());
			}

		}while (game.getstones() >= 0);
		
		input.close();
		
	}

}
