package Mastery;

import java.util.Scanner;

public class Necklace {

	public static void main(String[] args) 
	
	{	
		int sum;
		int lastdigit;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the first starting number:");
		int num1 = input.nextInt();
		
		System.out.print("Please enter the second starting number:");
		int num2 = input.nextInt();
		
		System.out.print(num1 + " " + num2);
		
		int Num1 = num1;
		int Num2 = num2;
		
		do
		{
			sum = Num1 + Num2;
			lastdigit = sum % 10;
			
			System.out.print(" " + lastdigit);
		
			Num1 = Num2;
			Num2 = lastdigit;
		
		}while(Num1 != num1 || Num2 !=num2);
		
		input.close();

	}

}
