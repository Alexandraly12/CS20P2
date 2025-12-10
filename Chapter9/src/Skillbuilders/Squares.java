package Skillbuilders;

public class Squares {

	public static void main(String[] args) 
	{
		double[] Square;
		
		Square = new double[5];
		
		for (int i = 0; i < 5; i++)
		{
			double number = Math.pow(i, 2);
			System.out.print(number + " ");
			Square[i] = number;
		}
		
	}

}
