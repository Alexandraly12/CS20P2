package Skillbuilders;

import java.util.Scanner;

public class RectanglePerimeter 
{

	public static void main(String[] args) 
	{
		
		//Declare variables
		 int width;
	     int length;
	     int perimeter;
	     
	     Scanner input = new Scanner(System.in);
	     
	     // Prompt user for the width and length
	        System.out.print("Enter the width of the rectangle: ");
	        width = input.nextInt(); // Get the width from the user
	        
	        System.out.print("Enter the length of the rectangle: ");
	        length = input.nextInt(); // Get the length from the user
	        
	     //Calculate the perimeter
	        perimeter = 2 * (width + length);
	        		
	     // Display the width and length
	        System.out.println("The width is:" + width);
	        System.out.println("The length is:" + length);
	     // Display the perimeter
	        System.out.print("The perimeter of the rectangle is:" + perimeter);
	        
	}

}
