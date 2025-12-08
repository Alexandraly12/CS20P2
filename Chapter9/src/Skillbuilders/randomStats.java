package Skillbuilders;

public class randomStats {

	public static void main(String[] args) 
	{
		//Declare an that one dimension ( initializing) 
		int[] outcomes = new int[10]; // array has 10 slots, if it is a fixed number you gonna have to use for loop
		int outcome;
		
		
		//Storing values into array
		for(int i = 0; i<100; i++)
		{
			outcome = (int)(10*Math.random());
			outcomes[outcome] += 1; // how you assign to array
			
		}
		
		//Display what is in the array
		for(int i = 0; i<10; i++)
		{
			System.out.println(outcomes[i]);
			System.out.println(" ");
		}
	}

}
