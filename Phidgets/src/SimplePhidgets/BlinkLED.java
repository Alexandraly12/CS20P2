package SimplePhidgets;

import com.phidget22.*;
public class BlinkLED {

	public static void main(String[] args) throws Exception
	{
		//Create object
		DigitalOutput redLED = new DigitalOutput();
		DigitalOutput greenLED = new DigitalOutput();

		
		//Address
		redLED.setHubPort(1);
		redLED.setIsHubPortDevice(true);
		greenLED.setHubPort(4);
		greenLED.setIsHubPortDevice(true);

		//Open
		redLED.open(1000);
		greenLED.open(1000);

		
		//Using Phidget
		while(true)
		{
			redLED.setState(true);
			Thread.sleep(2000);
			redLED.setState(false);
			Thread.sleep(1000);
			
			greenLED.setState(true);
			Thread.sleep(2000);
			greenLED.setState(false);
			Thread.sleep(1000);
		}

	}

}

