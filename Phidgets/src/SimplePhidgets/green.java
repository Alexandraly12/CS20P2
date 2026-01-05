package SimplePhidgets;

import com.phidget22.*;
public class green {

	public static void main(String[] args) throws Exception
	{
		DigitalOutput greenLED = new DigitalOutput();
		
		greenLED.setHubPort(4);
		greenLED.setIsHubPortDevice(true);
		
		greenLED.open(2000);
		
		while(true)
		{
			//redLED.setState(true);
			greenLED.setState(true);
			Thread.sleep(1000);
			//redLED.setState(false);
			greenLED.setState(true);
			Thread.sleep(1000);
		}

	}

}
