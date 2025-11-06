package Mastery;

import java.util.Scanner;

public class Necklace {

	public static void main(String[] args) 
	
	{	
		// Declare variables to store the sum of digits and the last digit of that sum
		int sum;
		int lastdigit;
		
		// Create a Scanner object to read user input
		Scanner input = new Scanner(System.in);
		
		// Prompt user for the first starting number
		System.out.print("Please enter the first starting number:");
		int num1 = input.nextInt();
		
		// Prompt user for the second starting number
		System.out.print("Please enter the second starting number:");
		int num2 = input.nextInt();
		
		// Display the first two numbers in the sequence
		System.out.print(num1 + " " + num2);
		
		// Copy the starting numbers into temporary variables (so we can modify them in the loop without losing the originals)
		int Num1 = num1;
		int Num2 = num2;
		
		// Start the do-while loop that generates the necklace sequence
		do
		{
			// Add the last two numbers in the sequence
			sum = Num1 + Num2;
			
			// Keep only the last digit of the sum (same as sum % 10)
			lastdigit = sum % 10;
			
			// Print the new digit in the sequence
			System.out.print(" " + lastdigit);
		
			// Update the two previous numbers for the next loop iteration
			Num1 = Num2;
			Num2 = lastdigit;
		
		// Continue looping until the sequence returns to the original two starting numbers
		}while(Num1 != num1 || Num2 != num2);
		
		// Close the Scanner to prevent resource leaks
		input.close();

	}

}