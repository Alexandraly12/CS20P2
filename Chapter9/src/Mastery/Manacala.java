package Mastery;
import java.util.Scanner;


public class Manacala {
    public static void main(String[] args) {
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
        while (!isGameOver(board)) 
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

                sowStones(board, pit, true);
            } 
            //Player 2's turn
            else 
            {
                System.out.print("\n"
                		+ "Player 2: Choose pit (A - F): ");
                move = input.next().toUpperCase().charAt(0);
                int pit = (move - 'A') ;

                if (pit < 7 || pit > 12 ) 
                {
                    System.out.println("Invalid move. Try again.");
                }
                else if(board[pit] == 0)
                {
                	System.out.print("That pit is empty, please reselect A - F.");
                }


                sowStones(board, pit, false);
            }

            playerOneTurn = !playerOneTurn;
        }


        printBoard(board);
        System.out.println("Game Over!");
    }


    // Distribute stones into each pit
    static void sowStones(int[] board, int pit, boolean playerOneTurn) 
    {
        int stones = board[pit];
        board[pit] = 0;
      
		if(playerOneTurn == true)
        {
        	while (stones > 0) 
        	{
        		pit = (pit + 1) % 14;
        		if (pit != 13)
        		{
        			board[pit]++;
        			stones--;
        		}
        	}
        }
        
        else if(playerOneTurn == false)
        {
        	while (stones > 0) 
        	{
        		pit = (pit + 1) % 14;
        		if (pit != 7)
        		{
        			board[pit]++;
        			stones--;
        		}
        	}
        }
    }
    

    // Check if one side is empty
    static boolean isGameOver(int[] board) 
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


    // Print board
    static void printBoard(int[] board) 
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
