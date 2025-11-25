package Skillbuilders;

public class testRectangle 
{

	public static void main(String[] args) 
	{
		Rectangle one = new Rectangle(2,4);
		
		//one.setLength(2);
		//one.setWidth(4);
		
		System.out.println(one
				+ "\n ");
		
		System.out.println("Rectangle area: " + one.area());
		System.out.println("Rectangle perimeter: " + one.perimeter()
							+ "\n ");
		
		Rectangle.areaFormula();
		
		System.out.println("Is the test rectangle equal to rectangle 'one'?: " + one.equals(one));
	}

}
