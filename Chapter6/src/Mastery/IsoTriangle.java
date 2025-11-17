package Mastery; 
import java.util.Scanner;

public class IsoTriangle 
{
    // Prints a row of stars (*) based on the number given
    public static void drawBar(int stars) 
    {
        // Loop that prints one star at a time
        for (int i = 1; i <= stars; i++) 
        {
            System.out.print("*");
        }
        
        // Move to a new line after printing all stars
        System.out.println();
    }
    
    // Prints a number of spaces before the stars to help shape the triangle
    public static void addSpace(int spaces) 
    {
        // Loop that prints one space at a time
        for (int i = 1; i <= spaces; i++) 
        {
            System.out.print(" ");
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); 
        
        // Ask the user how many lines tall the triangle should be
        System.out.print("Enter size of triangle: ");
        int lines = input.nextInt(); 

        // Loop once per line of the triangle
        for (int i = 1; i <= lines; i++) 
        {   
            // Calculates how many stars to print on this line (always odd)
            int stars = 2 * i - 1;

            // Calculates how many spaces to print before the stars
            int spaces = lines - i;

            // Print spaces first so the triangle is centered
            addSpace(spaces);

            // Then print that line's stars
            drawBar(stars);
        }
        
        input.close(); // Close the scanner to prevent resource leaks
    }

}
