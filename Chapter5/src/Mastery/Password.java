package Mastery;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) 
	
	{
		// Store the correct password that the user must guess
		String password = "Potato";
		
		// Variable to store the user's current guess
		String guess = " ";
		
		// Counter to track how many guesses the user has made
		int numguess = 0;
		
		// Create a Scanner object to read input from the user
		Scanner input = new Scanner(System.in);
		
		// Use a do-while loop to allow the user up to 3 attempts (0, 1, 2)
		do 
		{
			// Prompt the user to enter a password guess
			System.out.println("Password: ");
			
			// Read the user's guess as a string
			guess = input.nextLine();
			
			// Increment the number of guesses made
			numguess += 1;
			
			// If the guess is incorrect and the user still has attempts left, display an error message prompting them to try again
			if (guess.equals(password) == false && numguess <= 2) 
			{
				System.out.println("The password you have entered is incorrect. Try again.");
			}
			
		// Continue looping if the password is still incorrect AND the user has made 2 or fewer attempts (3 tries total)
		}while(guess.equals(password) == false && numguess <= 2);
		
		
		// After the loop ends, check if the password was guessed correctly
		if(guess.equals(password) == true) {
			// Display a welcome message if the user entered the correct password
			System.out.print("Welcome!");
		}
		
		// If all attempts are used and the password was not guessed correctly, deny access
		else {
			System.out.print("Access denied.");
		}
		
		// Close the Scanner to prevent resource leaks
		input.close();
	}

}
