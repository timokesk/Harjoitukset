import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.Color;
import lejos.utility.Delay;

public class Varianturi {

	public static void main(String[] args) {
		EV3ColorSensor cs = new EV3ColorSensor(SensorPort.S3);
		
		int sininen = 0;
		int punainen = 0;
		int vihrea = 0;
		
		int vari;
		boolean jatkuu = true;
		boolean lopeta = false;
		
		naytaTilanne(sininen, punainen, vihrea);
		
		while (!Button.ESCAPE.isDown()) {
			switch (cs.getColorID()) {
			case Color.BLUE:
				vilkutaValoja();
				sininen++;
				vari = Color.BLUE;
				break;
			case Color.RED:
				vilkutaValoja();
				punainen++;
				vari = Color.RED;
				break;
			case Color.GREEN:
				vilkutaValoja();
				vihrea++;
				vari = Color.GREEN;
				break;
			default:
				vari = cs.getColorID();
				break;
			}
			LCD.clear();
			naytaTilanne(sininen, punainen, vihrea);
			
			do {
				if (vari != cs.getColorID()) {
					jatkuu = false;
				}
				if (Button.ESCAPE.isDown()) {
					lopeta = true;
					break;
				}
				Delay.msDelay(100);
			} while (jatkuu);
			
			if (lopeta) {
				break;
			}
			jatkuu = true;
			
		}
		
		cs.close();
	}
	
	public static void naytaTilanne(int sininen, int punainen, int vihrea) {
		LCD.drawString("Siniset: " + sininen, 0, 2);
		LCD.drawString("Punaiset: " + punainen, 0, 3);
		LCD.drawString("Vihreat: " + vihrea, 0, 4);
		LCD.drawString("ESC lopettaa", 0, 7);
	}
	
	public static void vilkutaValoja() {
		for (int i = 0; i < 3; i++) {
			Button.LEDPattern(1);
			Delay.msDelay(100);
			Button.LEDPattern(0);
			Delay.msDelay(100);
		}
	}

}
