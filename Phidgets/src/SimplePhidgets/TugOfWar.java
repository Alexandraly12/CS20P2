package SimplePhidgets;

import com.phidget22.*;

public class TugOfWar 
{

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
        
       for(int i = 3; i > 0; i--)
       {
    	   System.out.println(i);
    	   Thread.sleep(1000);
       }
        
       System.out.println("GO!");
       
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
		
        
		redLED.setState(true);
		greenLED.setState(true);
		Thread.sleep(1000);
		 
		greenLED.setState(false);
		redLED.setState(false);
		Thread.sleep(1000);
		
		if(Rcounter == 10)
		{
			System.out.println("Red Wins!!");
		}
		else if(Gcounter == 10)
		{
			System.out.println("Green Wins!");	
		}
		
		while(blinks < 5)
		{
			blinks += 1;
			if(Rcounter == 10)
			{		
				redLED.setState(true);
				Thread.sleep(800);
				redLED.setState(false);
				Thread.sleep(800);
			}
			
			else if(Gcounter == 10)
			{
				greenLED.setState(true);
				Thread.sleep(800);
				greenLED.setState(false);
				Thread.sleep(800);
			}

		}
  
        
	}

}
