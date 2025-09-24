package Skillbuilders;

import java.lang.Math;
import java.util.Scanner;

public class perfectSquare {

	public static void main(String[] args) 
	{
		double power = 2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		int number = input.nextInt();
		
		double sqrtNum = Math.sqrt (number);
		
		int num = (int) sqrtNum;
		
		
		
		
		System.out.print(num);
	
		input.close();

	}

}
