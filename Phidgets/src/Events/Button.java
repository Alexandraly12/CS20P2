package Events;

import com.phidget22.*;

public class Button 
{

	public static void main(String[] args) throws Exception
	{
		//Create
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();

        //Address
        redButton.setIsHubPortDevice(true);
        redButton.setHubPort(0);
        
        greenButton.setHubPort(5);
		greenButton.setIsHubPortDevice(true);

        //Event 
        redButton.addStateChangeListener (new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e) 
            {
                System.out.println("Red Pressed: " + e.getState());
            }
        });
        
        greenButton.addStateChangeListener (new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e) 
            {
                System.out.println("Green Pressed: " + e.getState());
            }
        });

        //Open
        redButton.open(1000);
        greenButton.open(1000);

        //Keep program running
        while (true) 
        {
            Thread.sleep(150);
        }

	}

}
