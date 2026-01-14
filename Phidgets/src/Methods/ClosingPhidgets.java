package Methods;

import com.phidget22.*;

public class ClosingPhidgets {

	public static void main(String[] args)  throws Exception
	{
		//Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open
        temperatureSensor.open(1000);
        
        //Use your Phidget
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        
        //Close Phidget
        temperatureSensor.close();
        
        //Printing temp after closing
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        
        //Open then printing temp
        temperatureSensor.open(1000);
        
        //Printing after opening again
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
	}

}
