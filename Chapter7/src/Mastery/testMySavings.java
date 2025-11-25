package Mastery;

import java.util.Scanner;

public class testMySavings {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. Show total in bank. "
				+ "\n2. Add a penny. "
				+ "\n3. Add a nickel. "
				+ "\n4. Add a dime."
				+ "\n5. Add a quarter."
				+ "\n6. Take money out of bank."
				+ "\nEnter 0 to quit."
				);
		System.out.print("Enter your choice: ");
		int option = input.nextInt();
		
		mySavings PiggyBank = new mySavings();
		System.out.print(PiggyBank);
		
		if(option == 1)
		{
			
		}
	}

}
