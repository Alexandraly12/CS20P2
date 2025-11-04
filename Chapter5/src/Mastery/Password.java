package Mastery;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) 
	
	{
		String password = "POTATO";
		String guess = " ";
		int numguess = 0;
		Scanner input = new Scanner(System.in);
		
		do 
		{
			System.out.println("Password: ");
			guess = input.nextLine();
			numguess += 1;
			
			if (guess.equals(password) == false && numguess <= 2) 
			{
				System.out.println("The password you have entered is incorrect. Try again.");
			}
			
		}while(guess.equals(password) == false && numguess <= 2);
		
		
		if(guess.equals(password) == true) {
			System.out.print("Welcome!");
		}
		
		else {
			System.out.print("Access denied.");
		}
		
		input.close();
	}

}
