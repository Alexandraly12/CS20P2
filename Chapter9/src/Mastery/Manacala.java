package Mastery;

import java.util.Scanner;

public class Manacala {

	public static void main(String[] args) 
	{
		int [] board = new int [14];
		boolean playerTurn = true;
		Scanner input = new Scanner(System.in);
		char move;
		int pit = 1;
		int in;
		boolean player1Empty = false;
		boolean player2Empty = false;
		
		//Set up game
		for(int i =0; i < board.length; i++)
		{
			if ( i != 6 && i != 13)
			{
				board[i] = 3;
			}
		}
		
		
		do//Player 1 Turn
		{
			//Formatting board
			//top row (player 2)
			System.out.print("     ");
			for(int i = 12; i >=7; i--)
			{	
				if(board[i] >= 10)
				{
				System.out.print("[" + board[i] + "] ");
				}
				
				else
				{
					System.out.print("[ " + board[i] + "] ");
				}
			}
			
			//Home pits
			if(board[6] >= 10 && board[13] >=10) // If both pits have more than 10 stones
			{
				System.out.println("\n"
							+ "[" + board[6] + "]                               [" + board[13] + "]");
			}
			else if( board[6] <=10 && board[13] <=10) // If both pits have less than 10 stones
			{
				System.out.println("\n"
						+ "[ " + board[6] + "]                               [ " + board[13] + "]");
			}
			//If one pit has more and one pit has less than 10
			else if(board[6] <=10 && board[13] >=10)
			{
				System.out.println("\n"
						+ "[ " + board[6] + "]                               [" + board[13] + "]");
			}
			else
			{
				System.out.println("\n"
							+ "[" + board[6] + "]                               [ " + board[13] + "]");
			}
			
			//Bottom row (player 1)
			System.out.print("     ");
			for(int i = 0; i <=5; i++)
			{
				if(board[i] >= 10)
				{
				System.out.print("[" + board[i] + "] ");
				}
				
				else
				{
					System.out.print("[ " + board[i] + "] ");
				}
			}
		
	
			//Player 1 game play
			while(playerTurn == true)
			{
				//Letters for user to enter
				System.out.print("\n       ");
				for(int i = 0; i < 6; i ++)
				{
					System.out.print((char)('A' + i) + "    ");
				}
				
				//User input
				System.out.print("\n");
				System.out.print("Player 1: Which pit would you like to move? (A - F)");
				move = input.next().toUpperCase().charAt(0);
				pit = move - 'A';
				
				//Validate move
				if(pit < 0 || pit > 5)
				{
					System.out.println("Invalid move. Choose pit A - F .");
				}
				
				else if(board[pit] == 0)
				{
					System.out.print("That pit is empty. Reselect pit A - F");
				}
				
				int stones = board[pit];
				board[pit] = 0;
				in = pit;
				
				//Move stones into new pits
				while(stones > 0)
				{
					in = (in + 1) % 14;
					if(in != 13)
					{
						board[in]++;
						stones--;
					}
				}
				
				playerTurn = false;
		
			}
			
			//Player 2
			while(playerTurn == false)
			{
				//Letters for user to enter
				System.out.print("\n       ");
				for(int i = 7; i < 12; i --)
				{
					System.out.print((char)('F' + i) + "    ");
				}
				
				//User input
				System.out.print("Player 2: Which pit would you like to move? (A - F)");
				move = input.next().toUpperCase().charAt(0);
				pit = move - 'A';
				
				//Validate move
				if(pit < 7 || pit > 12)
				{
					System.out.println("Invalid move. Choose pit A - F .");
				}
				else if(board[pit] == 0)
				{
					System.out.print("That pit is empty. Reselect pit A - F");
				}
				
				int stones = board[pit];
				board[pit] = 0;
				in = pit;
				
				while(stones > 0)
				{
					in = (in + 1) % 14;
					if(in != 13)
					{
						board[in]++;
						stones--;
					}
				}
				
				playerTurn = true;
			}
			
				
		}while(player1Empty == true || player2Empty == true);

	}
}
