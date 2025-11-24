package Skillbuilders;

public class Circle {

	 private static final double PI = 3.14;
	 private double radius;
	 
	 public Circle() 
	 {
		 radius = 1; //default radius
	 }
	 
	 public Circle(double r)
	 {
		 radius = r;
	 }
	 
	 public void setRadius(double newRadius) 
	 {
		 radius = newRadius;
	 }
	 
	 public double area() 
	 {
		 double circleArea;
		 circleArea = PI * radius * radius;
		 return(circleArea);
	 }
	 
	 public double getRadius() 
	 {
		 return(radius);
	 }
	 
	 public double circumference() 
	 {
		 double circumference = 2 *  PI * radius;
		 return(circumference);
	 }
	 
	 public static void displayAreaFormula()
	 {
		 System.out.println ("The formula for the area of a circle is A = PI * r * r");
	 }
	
	 public boolean equals(Object c) 
	 {
		 Circle testObj = (Circle)c;

	 	if (testObj.getRadius() == radius) 
	 	{
	 		return(true);
	 	} 
	 	else 
	 	{
	 		return(false);
	 	}
	 }
	 
	 public String toString() 
	 {
		 return("Radius: " + radius);
	 }
}
