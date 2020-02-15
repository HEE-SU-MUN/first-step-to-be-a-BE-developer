import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class Ok_JavaGoinHome {
	

	public static void main(String[] args) {
		
         // Elevator call
		String id = "JAVA APT 507";
		Elevator myElavtor = new Elevator("id");
		myElavtor.callForUp(1);
		
		// Security off
		Security mySecurity = new Security("id");
		mySecurity.off();
		// Light ON
		Lighting hallLamp = new Lighting(id +" / Hall Lamp");
		hallLamp.on();
		Lighting floorLamp = new Lighting(id +" floor Lamp");
		floorLamp.on();
		
		
		
	}

}
