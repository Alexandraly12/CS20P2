package Mastery;

import java.util.Scanner;

public class Necklace {

	public static void main(String[] args) 
	
	{	
		int sum;
		int digit;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the first digit:");
		int num1 = input.nextInt();
		
		System.out.print("Please enter the second digit:");
		int num2 = input.nextInt();
		
		do {
		digit = num1 + num2;
		sum = digit % 10;
		}
		
		while (digit != num1 || digit !=num2); {
			System.out.print(sum);
		}
		
		
		
		input.close();

	}

}
