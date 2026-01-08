package Challenge;

import com.phidget22.*;

public class Thermostat {

	public static void main(String[] args) throws Exception
	{
		//Create object
		DigitalOutput redLED = new DigitalOutput();
		DigitalOutput greenLED = new DigitalOutput();
		DigitalInput redButton = new DigitalInput();
		DigitalInput greenButton = new DigitalInput();
		
		//Address
		redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        //Open time
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        
        //Set temp
        int Temperature = 21;
        
        //Phidget
        while(true)
        {
        	if(greenButton.getState())
        	{
        		Temperature += 1;
        		System.out.println("Current Temp: " + Temperature + "°C" );
        	}
        	
        	else if(redButton.getState())
        	{
        		Temperature -=1;
        		System.out.println("Current Temp: " + Temperature + "°C");
        	}
        	
        	if(Temperature < 24 && Temperature > 18)
        	{
        		greenLED.setState(true);
    			redLED.setState(false);
    			Thread.sleep(200);
        	}
        	
        	else
        	{
        		redLED.setState(true);
    			greenLED.setState(false);
    			Thread.sleep(200);
        	}
        }
	}

}
