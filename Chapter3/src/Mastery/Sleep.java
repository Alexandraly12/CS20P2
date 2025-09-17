package Mastery;

import java.util.Scanner;

public class Sleep 
{

	public static void main(String[] args) 
	{
		//Declare and initialize variable
		int year1 , month1, date1;
		int year2, month2, date2;
		int alive, sleep;
		Scanner input = new Scanner(System.in);
			
		//Collect expenses from user
		System.out.println ("Please enter your birthdate:  ");
		
		System.out.print ("Year: ");
		year1 = input.nextInt();
		
		System.out.print ("Month: ");
		month1 = input.nextInt();
		
		System.out.print ("Date: ");
		date1 = input.nextInt();
		
		System.out.println ("Please enter todays date:  ");
		
		System.out.print ("Year: ");
		year2 = input.nextInt();
		
		System.out.print ("Month: ");
		month2 = input.nextInt();
		
		System.out.print ("Date: ");
		date2 = input.nextInt();
		
		alive = 365 * (year2 - year1) + 30 * (month2 - month1) + (date2 - date1);
		sleep = alive * 8;
		
		System.out.println ("You have been alive for " + alive + " days.");
		System.out.println ("You have been asleep for " + sleep + " hour.");
		
		input.close();
	}

}
