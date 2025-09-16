package Skillbuilders;

import java.util.Scanner;

public class GradeAvg2 
{

	public static void main(String[] args) 
	{
		//Declare variables
		double sum = 0;
		double average;
				
		Scanner input = new Scanner(System.in);
					
		//Prompt user to enter 5 grades
		System.out.print ("Enter grade 1: ");
		sum += input.nextInt();
				
		System.out.print ("Enter grade 2: ");
		sum += input.nextInt();
				
		System.out.print ("Enter grade 3: ");
		sum += input.nextInt();
				
		System.out.print ("Enter grade 4: ");
		sum += input.nextInt();
				
		System.out.print ("Enter grade 5: ");
		sum += input.nextInt();
				
		//Calculate grade average
		average = sum / 5;

		//Display Average
		System.out.print("Your grade average is " + average + "%");
	
				
		input.close();

	}

}
