package Methods;

import com.phidget22.*;

public class LEDBrightness 
{

	public static void main(String[] args) throws Exception
	{
		//Create 
        DigitalOutput redLED = new DigitalOutput();

        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(2000);
        
        //Phidget
    	for(double i = 0.0; i < 1.0; i += 0.1)
    	{
    		redLED.setDutyCycle(i);
	        Thread.sleep(400);
    	}
    	for(double i = 1.0; i > 0.0; i -= 0.1)
    	{
    		redLED.setDutyCycle(i);
	        Thread.sleep(400);
    	}

	}

}
