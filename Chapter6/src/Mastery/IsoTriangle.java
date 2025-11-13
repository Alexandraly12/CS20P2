package Mastery;
import java.util.Scanner;

public class IsoTriangle 
{
		
	public static void drawBar(int stars) 
	{
		for (int i = 1; i <= stars; i++) 
		{
			System.out.print("*");
		}
		
		System.out.println();
	}
		
	public static void addSpace(int spaces)
	{
		for (int i = 1; i <= spaces; i++) 
		{
			System.out.print(" ");
		}
		
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter size of triangle: ");
		int lines = input.nextInt();

		for (int i = 1; i <= lines; i ++)
		{
			int spaces = lines- i;
			int stars = 2 * i - 1;
			drawBar(stars);
			addSpace(spaces);
		}
		
		input.close();
	}

}
