package Skillbuilders;

import java.util.Scanner;

public class Digits 
{

	public static void main(String[] args) 
	{
		//Declare variables
		int number, tens, ones;
		
		//Create scanner object to read user input
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter a two digit number
		System.out.print ("Enter a two digit number: ");
		number = input.nextInt();
		
		// Calculate tens and ones place digits
		tens = number / 10;
        ones = number % 10;
        
        //Display the digits
        System.out.println("Tens place digit: " + tens);
        System.out.println("Ones place digit: " + ones);
        
        input.close();
	}

}
