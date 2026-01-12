package Events;

import com.phidget22.*;

public class random {

	public static void main(String[] args) throws Exception
	{
		//Create
        DigitalOutput redLED = new DigitalOutput();

        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        
        //Attach Event 
        redLED.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
                System.out.println("Attach!");
            }
        });

        //Detach Event 
        redLED.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach!");
            }
        });

        //Open
        redLED.open(1000);

        //Keep program running
        while (true) {
            Thread.sleep(150);
        }
	}

}
