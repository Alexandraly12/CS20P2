package Events;

import com.phidget22.*;

public class AttachDetachEvent 
{

	public static void main(String[] args)  throws Exception
	{
		//Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();
        
      //Address each object
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
         
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
      

        //Attach Event Temp Sensor
        temperatureSensor.addAttachListener(new AttachListener() 
        {
            public void onAttach(AttachEvent e) 
            {
                System.out.println("Temperature Sensor: Attach!");
            }
        });
        
        //Attach Event LEDs
        
        redLED.addAttachListener(new AttachListener()
        {
        	public void onAttach(AttachEvent e)
        	{
        		System.out.println("Red LED: Attach!");
        	}

        });
        
        greenLED.addAttachListener(new AttachListener()
        {
        	public void onAttach(AttachEvent e)
        	{
        		System.out.println("Green LED: Attach!");
        	}

        });
        
        //Attach Event Buttons
        redButton.addAttachListener(new AttachListener()
        {
        	public void onAttach(AttachEvent e)
        	{
        		System.out.println("Red Button: Attach!");
        	}

        });
        
        greenButton.addAttachListener(new AttachListener()
        {
        	public void onAttach(AttachEvent e)
        	{
        		System.out.println("Green Button: Attach!");
        	}

        });

        //Detach Event Temp Sensor
        temperatureSensor.addDetachListener(new DetachListener() 
        {
            public void onDetach(DetachEvent e) 
            {
                System.out.println("Temperature Sensor: Detach!");
            }
        });
        
        //Detach LEDs
        redLED.addDetachListener(new DetachListener()
        {
        	public void onDetach(DetachEvent e)
        	{
        		System.out.println("Red LED: Detach!");
        	}

        });
        
        greenLED.addDetachListener(new DetachListener()
        {
        	public void onDetach(DetachEvent e)
        	{
        		System.out.println("Green LED: Detach!");
        	}

        });
        
        //Detach Buttons
        redButton.addDetachListener(new DetachListener()
        {
        	public void onDetach(DetachEvent e)
        	{
        		System.out.println("Red Button: Detach!");
        	}

        });
        
        greenButton.addDetachListener(new DetachListener()
        {
        	public void onDetach(DetachEvent e)
        	{
        		System.out.println("Green Button: Detach!");
        	}

        });

        //Open
        temperatureSensor.open(1000);
        redLED.open(1000);
        greenLED.open(1000);
        redButton.open(1000);
        greenButton.open(1000);

        //Keep program running
        while (true) 
        {
            Thread.sleep(150);
        }

	}

}
