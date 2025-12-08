package Mastery;

import java.util.Scanner;

public class testNim2 
{

	public static void main(String[] args) 
	{	
		//Create Scanner
		Scanner input = new Scanner(System.in);
		//Create object game
		Nim2 game = new Nim2();
		
		//Display starting amount of stones
		System.out.println("There are " + game.startNum() + " stones.");
		
		//Create loop
		do {
			System.out.println("How many stones would you like to take?(1, 2 or 3)");
			int taken = input.nextInt();
			//Obtain value of how many stones user takes
			game.getValue(taken);
			
			//Player's turn
			//If the user takes 3 stones or less AND the amount of remaining stones is 1 or greater
			if(taken <= 3 && game.getStones() >= 1)
			{	
				//Display remaining stones after user takes
				System.out.println("Stones remaining: " + game.remainingStones());
				//Flip from user's turn to computers's
				game.flipTurn();
			}
			else
			{	
				System.out.println("Unvalid amount.");
				//Reprint remaining stones without subtraction of stones taken
				System.out.println("Stones remaining: " + game.getStones());
			}
			
			//Computer's turn
			//If stones remaining is greater than 0 and amount of stones taken is 3 or less
			if(game.getStones() > 0 && taken <= 3)
			{	
				//Display amount of stones computer takes
				System.out.println("Computer takes " + game.comTakeStone() + " stone(s).");
				//Display remaining stones
				System.out.println("Stones remaining: " + game.getStones());
				//Flip turn back to player
				game.flipTurn();
			}
			

		}while (game.getStones() > 0); // Continue loop while amount of stones remaining is greater than 0
		
		//Determine winner
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

