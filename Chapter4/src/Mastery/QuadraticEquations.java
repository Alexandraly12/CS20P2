package Mastery;

import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquations 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the value of a: ");
		double varA = input.nextDouble();
		
		System.out.print("Please enter the value of b: ");
		double varB = input.nextDouble();
		
		System.out.print("Please enter the value of c: ");
		double varC = input.nextDouble();
		
		double quadratic = (-varB + Math.sqrt(varB * varB - 4*varA*varC)) / (2*varA);
		System.out.print(quadratic);
		
		input.close();

	}

}
