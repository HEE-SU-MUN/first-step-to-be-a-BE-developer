import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;



public class Ok_Java_Go_In_HomeInPut {
	

	public static void main(String[] args) {
		
         // Elevator call
		String id = args[0];
		String bright = args[1];
		Elevator myElavtor = new Elevator(id);
		myElavtor.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		// Light ON
		Lighting hallLamp = new Lighting(id +" / Hall Lamp");
		hallLamp.on();
		Lighting floorLamp = new Lighting(id +" floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+"moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		
		
		
	}

}
