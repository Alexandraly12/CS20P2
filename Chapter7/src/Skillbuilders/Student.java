package Skillbuilders;

public class Student 
{
	private String firstName;
	private String lastName;
	private String address;
	private int StuID;
	
	//Is same name as class
	public Student() // Default Constructor method (nothing inside brackets) - initializes variables above
	{
		firstName = "Unknown";
		lastName = "Unknown";
		address = "Unknown";
		StuID = 00000;
		
	}
	
	public Student(String f, String l, String ad, int id) //Overload constructor method
	{
		firstName = f;
		lastName = l;
		address = ad;
		StuID = id;
	}
	
	//Acessor methods (get)
	public String getFirstName()
	{
		return firstName;
	}
	
	//Modifier methods (set)
	public void setFirstName(String f)
	{
		firstName = f;
	}
	
	//ToString method
	public String toString()
	{
		return("First name: " + firstName
				+ "\nLast name: "+ lastName
				+ "\nAddress: "+ address
				+ "\nStudent ID: " + StuID);
		
	}
	
	
}
