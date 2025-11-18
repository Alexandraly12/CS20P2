package Skillbuilders;

public class circleTester {

	 public static void main(String[] args) 
	 {
		 Circle spot = new Circle(5);
		 //spot.setRadius();
		 System.out.println("Circle radius: " + spot.getRadius());
		 System.out.println("Circle circumference: " + spot.circumference());
		 System.out.println("Circle area: " + spot.area());
	 }

	 public static void displayAreaFormula()
	 {
		 System.out.print ("The formula for the area of a circle is a= PI * r * r");
	 }
}
