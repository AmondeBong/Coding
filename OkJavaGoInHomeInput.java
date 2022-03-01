import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OkJavaGoInHomeInput{
    public static void main(String[] args){
        //팝업창으로 id, bright 받기
        String id = JOptionPane.showInputDialog("Enter ID");
        String bright = JOptionPane.showInputDialog("Enter a bright value");
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

        DimmingLights moodLamp = new DimmingLights(id+" / mood lamp");
        moodLamp.setBright(Double.parseDouble(bright)); // String 값을 double 값으로 변경
        moodLamp.on();
    }
}
