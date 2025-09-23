package Skillbuilders;

import java.util.Scanner;

public class Hurricane 
{

	public static void main(String[] args) 
	{
		 int hurricane;
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("Please enter the hurricane category (1 - 5): ");
		 hurricane = input.nextInt();
		 
		 if (hurricane == 1) 
		 { //Category 1 hurricane
			 System.out.println("The speed of the wind during a Category 1 hurricane is 74-95 mph or 64-82 kt or 119-153 km/hr.");
		 } 
		 else if ( hurricane == 2) 
		 { //Category 2 hurricane
			 System.out.println("The speed of the wind during a Category 2 hurricane is 96-110 mph or 83-95 kt or 154-177 km/hr.");
		 } 
		 else if ( hurricane == 3) 
		 { //Category 3 hurricane
			 System.out.println("The speed of the wind during a Category 2 hurricane is 111-130 mph or 96-113 kt or 178-209 km/hr.");
		 } 
		 else if ( hurricane == 4) 
		 { //Category 3 hurricane
			 System.out.println("The speed of the wind during a Category 2 hurricane is 131-155 mph or 114-135 kt or 210-249 km/hr.");
		 } 
		 else if ( hurricane == 5) 
		 { //Category 3 hurricane
			 System.out.println("The speed of the wind during a Category 2 hurricane is greater than 155 mph or 135 kt or 249 km/hr.");
		 } 
		 
		 input.close();
	}

}




//Make user enter category of hurricane from 1 - 5
//Create if thing where if user enter 1 display.., if user enter 2 display..., etc.