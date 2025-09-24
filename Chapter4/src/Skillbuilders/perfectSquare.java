package Skillbuilders;

import java.lang.Math;
import java.util.Scanner;

public class perfectSquare {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		int number = input.nextInt();
		
		double sqrtNum = Math.sqrt (number);
		
		int num = (int) sqrtNum;
		
		int squared = num * num;
	
		if (squared == number)
		{
			System.out.print( number + " is a perfect square.");
		}
		else
		{
			System.out.print( number + " is not a perfect square.");
		}
		
		input.close();

	}

}
