package SimplePhidgets;

import com.phidget22.*;
public class ReadButton {

	public static void main(String[] args) throws Exception
	{
		//Create object
		DigitalInput redButton = new DigitalInput();
		DigitalInput greenButton = new DigitalInput();
		
		//Address
		redButton.setHubPort(0);
		redButton.setIsHubPortDevice(true);
		
		greenButton.setHubPort(5);
		greenButton.setIsHubPortDevice(true);
		
		//Open
		redButton.open(1000);
		greenButton.open(1000);
		
		boolean previousRState = false;
		boolean previousGState = false;
		//Use Phidget
		while(true)
		{
			boolean currentRState = redButton.getState();
			boolean currentGState = greenButton.getState();
			
			if(currentRState != previousRState)
			{
				System.out.println("Red Button State: " + redButton.getState());
				Thread.sleep(200);
				previousRState = currentRState;
			}
			
			if(currentGState != previousGState)
			{
				System.out.println("Green Button State: " + greenButton.getState());
				Thread.sleep(200);
				previousGState = currentGState;
			}
			
		}
		
	}

}
