package Mastery;

import java.util.Scanner;
import java.util.Random;

public class mathTutor 
{
    public static void main(String[] args) 
    {
        // Define the minimum and maximum range for random numbers
        int min = 1;
        int max = 10;

        // Array of possible math operators
        char[] operators = {'+', '-', '*', '/'};

        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Create Random object to generate random numbers
        Random number = new Random();

        // Generate two random integers between min and max (inclusive)
        int num1 = number.nextInt((max - min) + 1) + min;
        int num2 = number.nextInt((max - min) + 1) + min;

        // Select a random operator from the array
        int index = number.nextInt(operators.length);
        char randomOperator = operators[index];

        // Display the math problem to the user and prompt for their answer
        System.out.print(num1 + " " + randomOperator + " " + num2 + " = ");
        double guess = input.nextDouble();

        // Variable to store the correct answer
        double answer = 0;

        // Use if-else statements to calculate the answer based on the operator
        if (randomOperator == '+')
        {
            answer = num1 + num2;
        }
        else if (randomOperator == '-')
        {
            answer = num1 - num2;
        }
        else if (randomOperator == '*')
        {
            answer = num1 * num2;
        }
        else if (randomOperator == '/')
        {
            // Cast to double to ensure decimal division
            answer = (double) num1 / num2;

            // Round result to one decimal place for cleaner output
            answer = Math.round(answer * 10.0) / 10.0;
        }

        // Check if the user's guess matches the correct answer
        if (guess == answer)
        {
            System.out.print("You are correct!");
        }
        else
        {
            System.out.println("Sorry, incorrect!");
            System.out.println("The correct answer is: " + answer);
        }

        // Close the Scanner to prevent resource leaks
        input.close();
    }
}
