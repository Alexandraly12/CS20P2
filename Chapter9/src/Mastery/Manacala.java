package Mastery;

public class Manacala {

	public static void main(String[] args) 
	{
		int [] board = new int [14];
		boolean playerTurn = true;
		
		//Set up game
		for(int i =0; i < board.length; i++)
		{
			if ( i != 6 && i != 13)
			{
				board[i] = 3;
			}
		}
		
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
		if(board[6] >= 10 || board[13] >=10)
		{
			System.out.println("\n"
						+ "[" + board[6] + "]                               [" + board[13] + "]");
		}
		else
		{
			System.out.println("\n"
						+ "[ " + board[6] + "]                               [ " + board[13] + "]");
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
		
		

	}

}
