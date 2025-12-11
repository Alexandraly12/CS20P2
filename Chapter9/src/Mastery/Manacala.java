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
		
		for(int i: board)
		{
			System.out.print(i + " ");
		}
	
		for(int i = 12; i >=7; i--)
		{
			System.out.print("i");
		}
		
		//Player 1
		

	}

}
