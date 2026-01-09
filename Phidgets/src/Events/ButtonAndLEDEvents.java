package Events;

import com.phidget22.*;

public class ButtonAndLEDEvents 
{
	//Turn on/off LEDs with Global Variables
    static boolean turnRedLEDOn = false;
    static boolean turnGreenLEDOn = false;
	
	public static void main(String[] args) throws Exception
	{
		//Create
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();
        
        //Address
	    redButton.setHubPort(0);
	    redButton.setIsHubPortDevice(true);
	    greenButton.setHubPort(5);
	    greenButton.setIsHubPortDevice(true);
	    redLED.setHubPort(1);
	    redLED.setIsHubPortDevice(true);
	    greenLED.setHubPort(4);
	    greenLED.setIsHubPortDevice(true);
	    
	    //Event 
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                //Record button state to turn on/off the red LED
                turnRedLEDOn = e.getState(); 
            }
        });
        
        //Event 
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                //Record button state to turn on/off the green LED
                turnGreenLEDOn = e.getState();
            }
        });
        
        //Open
        redLED.open(1000);
        greenLED.open(1000);
        redButton.open(1000);
        greenButton.open(1000);
        
        //Turn checker and LED flashes
        boolean prevRState = false;
        boolean prevGState = false;
        int Rcounter = 0;
        int Gcounter = 0;
        int blinks = 0;
        
        //Start
        for(int i = 3; i > 0; i--)
        {
     	   System.out.println(i);
     	   Thread.sleep(1000);
        }
         
        System.out.println("GO!");
        
        //Use your Phidgets 
        while(Rcounter < 10 && Gcounter < 10)
 	   	{
         	boolean currentRState = redButton.getState();
 	     	boolean currentGState = greenButton.getState();
 	     	
 	    	if(redButton.getState())
 	    	{
 	    		redLED.setState(false);
 	    		if(currentRState != prevRState)
 	    		{
 	    			Rcounter += 1;
 	    		}
 	    	}
 	    	
 	    	if(greenButton.getState())
 	    	{
 	    		greenLED.setState(false);
 	    		if(currentGState != prevGState)
 	    		{
 	    			Gcounter += 1;
 	    		}
 	    	}
 	     	
 	     	Thread.sleep(150);
 	    }
        while(true) 
        {
            //turn red LED on based on red button input
        	redLED.setState(turnRedLEDOn);
            //turn green LED on based on green button input
            greenLED.setState(turnGreenLEDOn);
            //sleep for 150 milliseconds 
            Thread.sleep(150);
        }

	}

}
