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
			game.getValue(taken);
			
			if(taken <= 3 && game.getStones() >= 1)
			{	
				System.out.println("Stones remaining: " + game.remainingStones());
			}
			else
			{
				System.out.println("Unvalid amount.");
				System.out.println("Stones remaining: " + game.getStones());
			}
			
			if(game.getStones() > 0 && taken <= 3)
			{
				System.out.println("Computer takes " + game.comTakeStone() + " stone(s).");
				System.out.println("Stones remaining: " + game.getStones());
				game.flipTurn();
			}
			

		}while (game.getStones() > 0);
		
		if(game.turn() == true)
		{
			System.out.println("You won!");
		}
		else
		{
			System.out.println("You lost, good try!");
			
		}	
		
		input.close();
		
	}

}

//Stones remaining: 6
//Computer takes 1 stone(s).
//Stones remaining: 5
//How many stones would you like to take?(1, 2 or 3)
//2
//Stones remaining: 3
//Computer takes 3 stone(s).
//Stones remaining: 0
//You won!

