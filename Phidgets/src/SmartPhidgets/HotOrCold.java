package SmartPhidgets;

import com.phidget22.*;

public class HotOrCold 
{

	public static void main(String[] args) throws Exception
	{
		//Create object
		TemperatureSensor tempSensor = new TemperatureSensor();
		DigitalOutput redLED = new DigitalOutput();
		DigitalOutput greenLED = new DigitalOutput();
		
		//Address
		redLED.setHubPort(1);
		redLED.setIsHubPortDevice(true);
		greenLED.setHubPort(4);
		greenLED.setIsHubPortDevice(true);
		
		//Open time
		tempSensor.open(1000);
		redLED.open(1000);
		greenLED.open(1000);
		
		//Use Phidget
		while(true)
		{	
			if(tempSensor.getTemperature() > 20 && tempSensor.getTemperature() < 27)
			{
				redLED.setState(true);
				greenLED.setState(false);
				Thread.sleep(100);
			}
			
			else if(tempSensor.getTemperature() < 20 || tempSensor.getTemperature() > 27)
			{
				greenLED.setState(true);
				redLED.setState(false);
				Thread.sleep(100);
			}
			
			double fahrenheit = Math.round((tempSensor.getTemperature() * 1.8 + 32) * 100.0) / 100.0 ;
			System.out.println("Temperature: " + tempSensor.getTemperature() + " °C or " + fahrenheit + "°F"); 
			Thread.sleep(1000);
		}

	}

}
