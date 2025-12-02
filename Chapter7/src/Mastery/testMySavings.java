package Mastery;

import java.util.Scanner;

public class testMySavings {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		mySavings PiggyBank = new mySavings();
		
		System.out.println("1. Show total in bank. "
				+ "\n2. Add a penny. "
				+ "\n3. Add a nickel. "
				+ "\n4. Add a dime."
				+ "\n5. Add a quarter."
				+ "\n6. Take money out of bank."
				+ "\nEnter 0 to quit."
				);
		
		int option;
		
		do 
		{
			System.out.print("Enter option: ");
			option = input.nextInt();
			
			if(option == 1)
			{
				System.out.println("Balance: $" + PiggyBank.getBalance());
			}
			else if(option == 2)
			{
				PiggyBank.depositP();
			}
			else if(option == 3)
			{
				PiggyBank.depositN();
			}
			else if(option == 4)
			{
				PiggyBank.depositD();
			}
			else if(option == 5)
			{
				PiggyBank.depositQ();
			}
			else if(option == 6)
			{
				System.out.println("Withdrew: $" + PiggyBank.withdraw());
			}
			else if(option == 0)
			{
				System.out.print(PiggyBank);
			}
			else
			{
				System.out.println("Invalid Option.");
			}
		
		}while (option != 0);
			
		input.close();
	}

}
