import lejos.hardware.lcd.LCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3IRSensor;

public class Moottorit {

	public static void main(String[] args) {

		EV3IRSensor irSensor = new EV3IRSensor(SensorPort.S1);
		IrsChecker checkerThread = new IrsChecker(irSensor);
		checkerThread.start();
		LCD.drawString("Lopetus ENTER", 0, 4);
		
	}

}
