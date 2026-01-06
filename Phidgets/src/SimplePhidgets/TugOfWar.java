package SimplePhidgets;

import com.phidget22.*;

public class TugOfWar {

	public static void main(String[] args) throws Exception
	{
		//Create Objects
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
        
        //Open time
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        
        //Turn checker
        boolean prevRState = false;
        boolean prevGState = false;
        int Rcounter = 0;
        int Gcounter = 0;
        int blinks = 0;
        
        //Phidget
        
       
        	 while(Rcounter <= 10 || Gcounter <= 10)
             {
        		boolean currentRState = redButton.getState();
             	boolean currentGState = greenButton.getState();
             	
 	        	if(redButton.getState())
 	        	{
 	        		greenLED.setState(false);
 	        		if(currentRState != prevRState)
 	        		{
 	        			Rcounter += 1;
 	        			System.out.println("Number of Red Presses: " + Rcounter);
 	        		}
 	        	}
 	        	else
 	        	{
 	        		greenLED.setState(true);
 	        	}
 	        	
 	        	if(greenButton.getState())
 	        	{
 	        		redLED.setState(false);
 	        		if(currentGState != prevGState)
 	        		{
 	        			Gcounter += 1;
 	        			System.out.println("Number of Green Presses: " + Gcounter);
 	        		}
 	        	}
 	        	else
 	        	{
 	        		redLED.setState(true);
 	        	}
             	
             	Thread.sleep(250);
        		 
             }
        	 
        	 while(blinks <= 10)
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
