package Mastery;
import java.util.Scanner;


public class Manacala 
{
	
	static int lastPit;
	
    public static void main(String[] args) 
    {
        int[] board = new int[14];
        boolean playerOneTurn = true;
        Scanner input = new Scanner(System.in);
        char move;

        // Set up board
        for (int i = 0; i < board.length; i++) {
            if (i != 6 && i != 13) {
                board[i] = 3;
            }
        }


        // Game play
        while ( isGameOver(board) == false) 
        {
            printBoard(board);

            //Player 1's turn
            if (playerOneTurn == true) 
            {
                System.out.print("\n"
                		+ "Player 1: Choose pit (A - F): ");
                move = input.next().toUpperCase().charAt(0);
                int pit = move - 'A';


                // Validate move
                if (pit < 0 || pit > 5 ) 
                {
                    System.out.println("Invalid move. Choose pit A - F.");
                    continue;
                }
                else if(board[pit] == 0)
                {
                	System.out.print("That pit is empty, please reselect A - F.");
                }
                else
                {
	                boolean extraTurn = sowStones(board, pit, true);
	                if (extraTurn == false)
	                {
	                	exceptions(board, playerOneTurn);
	                	playerOneTurn = !playerOneTurn;
	                }
                
                }
            } 
            //Player 2's turn
            else if (playerOneTurn == false)
            {
                System.out.print("\n"
                		+ "Player 2: Choose pit (A - F): ");
                move = input.next().toUpperCase().charAt(0);
                int pit = (12 - (move - 'A')) ;

                if (pit < 7 || pit > 12 ) 
                {
                    System.out.println("Invalid move. Try again.");
                }
                else if(board[pit] == 0)
                {
                	System.out.print("That pit is empty, please reselect A - F.");
                }
                else
                {
	                boolean extraTurn = sowStones(board, pit, false);
	                if (extraTurn == false)
	                {
	                	exceptions(board, playerOneTurn);
	                	playerOneTurn = !playerOneTurn;
	                }
	                
                }
            }

            
        }


     printBoard(board);
     System.out.println("\n"
        		+ "Game Over! \n");
     finalTally(board);
     
     input.close();
    }


    // Distribute stones into each pit
    public static boolean sowStones(int[] board, int pit, boolean playerOneTurn) 
    {
        int stones = board[pit];
        board[pit] = 0;
        boolean extraTurn = false;

        while (stones > 0) 
        {
            pit = (pit + 1) % 14;

            if (playerOneTurn == true)
            {
                if (pit != 13)
                {
                    board[pit]++;
                    stones--;
                }
            }
            else
            {
                if (pit != 6)
                {
                    board[pit]++;
                    stones--;
                }
            }
        }

        // where the last stone landed
        lastPit = pit;

        //Check extra turn 
        if (playerOneTurn == true && pit == 6)
        {
            System.out.print("Last stone in home pit! Go Again!");
            extraTurn = true;
        }
        else if (playerOneTurn == false && pit == 13)
        {
            System.out.print("Last stone in home pit! Go Again!");
            extraTurn = true;
        }

        return extraTurn;
    }
    

    // Check if one side is empty
    public static boolean isGameOver(int[] board) 
    {
        boolean side1 = true;
        boolean side2 = true;

        for (int i = 0; i < 6; i++)
        {
            if (board[i] != 0)
            {
            	side1 = false;
            }
        }

        for (int i = 7; i < 13; i++)
        {
            if (board[i] != 0)
            {
            	side2 = false;
            }
        }

        return side1 || side2;
    }
    
    public static void exceptions(int[] board, boolean playerOneTurn)
    {
        if (playerOneTurn == true)
        {
            if (lastPit >= 0 && lastPit <= 5 && board[lastPit] == 1)
            {
                int otherSide = 12 - lastPit;

                if (board[otherSide] > 0)
                {
                    board[6] += board[otherSide] + 1;
                    board[lastPit] = 0;
                    board[otherSide] = 0;
                }
            }
        }
        else
        {
            if (lastPit >= 7 && lastPit <= 12 && board[lastPit] == 1)
            {
                int otherSide = 12 - lastPit;

                if (board[otherSide] > 0)
                {
                    board[13] += board[otherSide] + 1;
                    board[lastPit] = 0;
                    board[otherSide] = 0;
                }
            }
        }
    }
    
    public static void finalTally(int[] board )
    {
    	if(isGameOver(board) == true)
    	{
	    	for(int i = 0; i < 6; i++)
	    	{
	    		board[6] += board[i];
	    		board[i] = 0;
	    	}
	    	
	    	for(int i = 7; i < 13; i++)
	    	{
	    		board[13] += board[i];
	    		board[i] = 0;
	    	}
    	}
    	
    	System.out.print("Player One: " + board[6] +
    			"\nPlayer Two: "+ board[13]);
    	
    }


    // Print board
    public static void printBoard(int[] board) 
    {
        System.out.print("\n     ");
        for (int i = 12; i >= 7; i--)
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

        
        System.out.println("\n[" + board[13] + "]                                 [" + board[6] + "]");


        System.out.print("     ");
        for (int i = 0; i <= 5; i++)
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
        
        System.out.print("\n       ");
        for(int i = 0; i < 6; i++)
        {	
        	System.out.print((char) ('A' + i) + "    ");
        }
        
    }
    
}
