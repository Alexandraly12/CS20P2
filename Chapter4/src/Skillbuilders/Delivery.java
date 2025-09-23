package Skillbuilders;

import java.util.Scanner;

public class Delivery 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the width of the package: ");
		int width = input.nextInt();
		System.out.print("Please enter the length of the package: ");
		int length = input.nextInt();
		System.out.print("Please enter the height of the package: ");
		int height = input.nextInt();
		
		if ( length <= 10 && width <= 10 && height <= 10) 
		{
			System.out.print("Package: Accepted.");
		}
		else
		{
			System.out.print("Package: Rejected.");
		}
		
		input.close();
	}

}
