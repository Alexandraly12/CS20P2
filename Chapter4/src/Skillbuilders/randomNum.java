package Skillbuilders;

import java.util.Scanner;
import java.util.Random;

public class randomNum 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter minimum value: ");
		 int min = input.nextInt();
		 
		 System.out.print("Please enter maximum value: ");
		 int max = input.nextInt();
		 
		 Random rand = new Random();
		 
		 int num = rand.nextInt((max-min) + 1) + min;
		 
		 System.out.println("Random number between " + min + " and " + max + ": " + num);
		 
		 input.close();
		 
	}

}
