package Mastery;

import java.util.Scanner;
import java.util.Random;

public class mathTutor 
{

	public static void main(String[] args) 
	{
		
		int min = 1;
		int max = 10;
		char[] operators = {'+', '-', '*', '/'};
		Scanner input = new Scanner(System.in);
		
		Random number = new Random();
		
		int num1 = number.nextInt((max-min) + 1) + min;
		int num2 = number.nextInt((max-min) + 1) + min;
		
		int index = number.nextInt(operators.length);
		char randomOperator = operators[index];
		
		System.out.print(num1 + " " + randomOperator + " " + num2 + " = ");
		double guess = input.nextDouble();
		
		double answer = 0;
		if(randomOperator == '+')
		{
			answer = num1 + num2;
		}
		else if (randomOperator == '-')
		{
			answer = num1 - num2;
		}
		else if(randomOperator == '*')
		{
			answer = num1 * num2;
		}
		else if(randomOperator == '/')
		{
			answer = (double) num1 / num2;
			answer = Math.round(answer * 10.0) / 10.0;
			
		}
		
		if(guess == answer)
		{
			System.out.print("You are correct!");
		}
		else
		{
			System.out.println("Sorry, incorrect!");
			System.out.println("The correct answer is:" + answer);
		}
		
		input.close();
	}

}
