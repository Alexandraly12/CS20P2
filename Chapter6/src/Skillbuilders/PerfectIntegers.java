package Skillbuilders;

public class PerfectIntegers 
{
	
	public static boolean isPerfect(int num)
	{
		int sum = 0;
		int divisor = 0;
		
		for(divisor =1; divisor <num; divisor++)
		{
			if(isFactor(num,divisor))
			{
				sum = sum + divisor;
			}
		}
		
		if(sum == num)
		{
			return(true);
		}
		
		else
		{
			return(false);
		}
	}
	
	public static boolean isFactor(int divident, int divisor)
	{
		if(divident % divisor == 0)
		{
			return(true);
		}
		
		else
		{
			return(false);
		}
	}
	
	public static void main(String[] args) 
	{
		for(int num =1; num <=100; num++)
		{
			if(isPerfect(num))
			{
				System.out.println(num);
			}
		}
	
	}

}
