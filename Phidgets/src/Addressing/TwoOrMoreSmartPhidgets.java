package Addressing;

import com.phidget22.*;

public class TwoOrMoreSmartPhidgets 
{

	public static void main(String[] args) throws Exception
	{
		//Create 
        TemperatureSensor temperatureSensor0 = new TemperatureSensor();
        TemperatureSensor temperatureSensor1 = new TemperatureSensor();
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        
        //Address 
        temperatureSensor0.setHubPort(3);
        temperatureSensor1.setHubPort(2);
        
        redButton.setIsHubPortDevice(true);
        redButton.setHubPort(0);
        
        greenButton.setHubPort(5);
		greenButton.setIsHubPortDevice(true);
        
        //Open 
        temperatureSensor0.open(1000);
        temperatureSensor1.open(1000);
        
        redButton.open(1000);
        greenButton.open(1000);
        
        //Use your Phidgets 
        while (true) 
        {
        	if (redButton.getState())
        	{
        		System.out.println("Temperature 0: " + temperatureSensor0.getTemperature() + " °C" );
        	}
        	if (greenButton.getState())
        	{
        		System.out.println("Temperature 1: " + temperatureSensor1.getTemperature() + " °C" );
        	}
            Thread.sleep(200);
        }

	}

}
