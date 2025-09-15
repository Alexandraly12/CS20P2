package Skillbuilders;

import java.util.Scanner;

public class GradeAvg1 
{

	public static void main(String[] args) 
	{
		//Declare variables
		double num1;
		double num2;
		double num3;
		double num4;
		double num5;
		double average;
		
		Scanner input = new Scanner(System.in);
			
		//Prompt user to enter 5 grades
		System.out.print ("Enter grade 1: ");
		num1 = input.nextInt();
		
		System.out.print ("Enter grade 2: ");
		num2 = input.nextInt();
		
		System.out.print ("Enter grade 3: ");
		num3 = input.nextInt();
		
		System.out.print ("Enter grade 4: ");
		num4 = input.nextInt();
		
		System.out.print ("Enter grade 5: ");
		num5 = input.nextInt();
		
		//Calculate grade average
		average = (num1 + num2 + num3 + num4 + num5)/ 5;

		//Display Average
		System.out.print("Your grade average is " + average + "%");
		
		input.close();
	}

}
