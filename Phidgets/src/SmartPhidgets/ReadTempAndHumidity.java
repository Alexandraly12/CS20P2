package SmartPhidgets;

import com.phidget22.*;

public class ReadTempAndHumidity 
{

	public static void main(String[] args) throws Exception
	{
		//Create objects
		TemperatureSensor tempSensor = new TemperatureSensor();
		HumiditySensor humiditySensor = new HumiditySensor();
		
		//Open time
		tempSensor.open(1000);
		humiditySensor.open(1000);
		
		//Use Phidget
		while(true)
		{
			if(humiditySensor.getHumidity() > 30)
			{
				if(tempSensor.getTemperature() > 21)
				{
					System.out.println("Humidity: " + humiditySensor.getHumidity() +" %RH, "
									+ "Temperature: " + tempSensor.getTemperature() + " °C" );
				}
				
				else
				{
					System.out.println("Humidity: " + humiditySensor.getHumidity() +" %RH, "
							+ "Room is too cold." );
				}
				Thread.sleep(350);
			}
			
			else 
			{
				if(tempSensor.getTemperature() > 21)
				{
					System.out.println("Humidity is low. "
									+ "Temperature: " + tempSensor.getTemperature() + " °C" );
				}
				
				else
				{
					System.out.println("Humidity is low. "
							+ "Room is too cold." );
				}
				Thread.sleep(350);
			}
		}
	}

}
