package Mastery;

import java.util.Scanner;

public class collegeCalculator 
{

	public static void main(String[] args) 
	{
		//Declare and initialize variable
		double sum = 0;
		Scanner input = new Scanner(System.in);
		
		//Collect expenses from user
		System.out.println ("Please enter the  ");
		System.out.print ("Tuition: ");
		sum += input.nextDouble();
				
		System.out.print ("Rent: ");
		sum += input.nextDouble();
				
		System.out.print ("Books: ");
		sum += input.nextDouble();
				
		System.out.print ("Transportation: ");
		sum += input.nextDouble();
				
		System.out.print ("Food: ");
		sum += input.nextDouble();
		
		//Collect offset costs from user
		System.out.print ("Scholarships: ");
		sum -= input.nextDouble();
				
		System.out.print ("Grants: ");
		sum -= input.nextDouble();
		
		//Display total costs to user
		System.out.print("Your total schooling cost is $" + sum );
		
		//Close scanner
		input.close();
	}

}
