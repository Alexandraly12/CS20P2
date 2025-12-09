package Skillbuilders;

import java.util.Scanner;

public class studentRoster {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int numStudents;
		String[] roster;
		
		System.out.print("How many students are in the class?: ");
		numStudents = input.nextInt();
		roster = new String[numStudents];
		input.nextLine();
		
		for(int i = 0; i< numStudents; i++)
		{
			System.out.print("Enter the name of student #" + ( i + 1 ) + ":");
			roster[i] = input.nextLine();
		}
		
		System.out.println("\n" 
				+ "Student Roster: ");
		
		for(int i = 0; i< numStudents; i++)
		{
			System.out.println(roster[i]);
		}
		
		input.close();
	}

}
