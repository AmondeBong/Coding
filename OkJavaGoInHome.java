import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OkJavaGoInHome{
    public static void main(String[] args){
        String id = "JAVA APT 50";
        //Elevator call
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);
        //Security off
        Security mySecurity = new Security(id);
        mySecurity.off();
        //Light on
        Lighting hallLamp = new Lighting(id+" / hall lamp");
        hallLamp.on();

        Lighting floorLamp = new Lighting(id +" / floor lamp");
        floorLamp.on();

    }
}
