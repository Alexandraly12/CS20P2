package Skillbuilders;

import java.lang.Math;
import java.util.Scanner;

public class perfectSquare {

	public static void main(String[] args) 
	{
		double power = 2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		int num = input.nextInt();
		
		num = Math.sqrt (num);
		
		Math.pow(num, power);
		
		System.out.print(num);
	
		

	}

}
