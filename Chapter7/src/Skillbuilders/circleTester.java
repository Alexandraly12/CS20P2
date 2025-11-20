package Skillbuilders;

public class circleTester {

	 public static void main(String[] args) 
	 {
		 Circle spot = new Circle(5);
		 //spot.setRadius();
		 System.out.println(spot);
		 System.out.println("Circle circumference: " + spot.circumference());
		 System.out.println("Circle area: " + spot.area()
				 			+ "\n");
		 
		 Circle.displayAreaFormula();
		 
		 System.out.print("Does test obj. have the same radii as spot?: " + spot.equals(spot));
	 }

	 
}
