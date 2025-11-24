package Skillbuilders;

public class Rectangle 
{
	private double length;
	private double width;
	
	public Rectangle()
	{
		length = 1;
		width = 1;
	}
	
	public Rectangle( int l, int w)
	{
		length = l;
		width = w;
	}
	
	public void setLength(int l)
	{
		length = l;
	}
	
	public void setWidth (int w)
	{
		width = w;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double area()
	{
		double area;
		area = length * width;
		return (area);
	}
	
	public double perimeter()
	{
		double perimeter;
		perimeter = 2 * length + 2 * width;
		return (perimeter);
	}
	
	public static void areaFormula()
	{
		System.out.println("Area of Rectangle Formula: length x width");
	}
	
	public String toString()
	{
		return("length: " + length
				+ "\nWidth: " + width); 
				
	}
	
	public boolean equals(Object a)
	{
		Rectangle testObj = (Rectangle)a;
		
		if (testObj.getLength() == length && testObj.getWidth() == width)
		{
			return(true);
		}
		else
		{
			return(false);
		}
		
	}
	
}
