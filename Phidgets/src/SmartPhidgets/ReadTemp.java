package SmartPhidgets;

import com.phidget22.*;

public class ReadTemp 
{

	public static void main(String[] args) throws Exception
	{
		//Create object
		TemperatureSensor tempSensor = new TemperatureSensor();
		
		//Open time
		tempSensor.open(1000);
		
		//Using Phidget
		while(true)
		{	
			double fahrenheit = Math.round((tempSensor.getTemperature() * 1.8 + 32) * 100.0) / 100.0 ;
			System.out.println("Temperature: " + tempSensor.getTemperature() + " °C or " + fahrenheit + "°F"); 
			Thread.sleep(500);
		}

	}

}
