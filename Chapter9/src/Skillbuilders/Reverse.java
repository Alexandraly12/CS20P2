package Skillbuilders;

public class Reverse {

	public static void main(String[] args) 
	{
		int[] countdown = new int[10];
		
		for(int i = 0; i < 10; i++)
		{
			countdown[i] = i;
		}
		
		for(int i = 10 - 1; i >= 0; i--)
		{
			System.out.print(countdown[i] + " ");
		}

	}

}
