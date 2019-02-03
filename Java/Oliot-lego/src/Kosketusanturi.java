import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.lcd.LCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.utility.Delay;
import lejos.utility.Stopwatch;

public class Kosketusanturi {

	public static void main(String[] args) {
		while (true) {
			int valinta = alkuvalinta();
			if (valinta == Button.ID_UP) {
				laskePainalluksia();
				continue;
			} else if (valinta == Button.ID_DOWN) {
				mittaaPainallustenVali();
				continue;
			} else {
				break;
			}
		}
		
	}
	
	public static int alkuvalinta() {
		LCD.drawString("Valitse A tai B:", 0, 0);
		LCD.drawString("Ylos = A", 2, 2);
		LCD.drawString("Alas = B", 2, 4);
		LCD.drawString("ESC lopettaa", 0, 7);
		int valinta;
		while (true) {
			valinta = Button.waitForAnyPress();
			if (valinta == Button.ID_UP || valinta == Button.ID_DOWN || valinta == Button.ID_ESCAPE) {
				break;
			}
		}
		LCD.clear();
		return valinta;
	}
	
	public static void laskePainalluksia() {
		LCD.drawString("Aloita", 0, 0);
		LCD.drawString("kosketusanturin", 0, 1);
		LCD.drawString("painallukset.", 0, 2);
		LCD.drawString("Enter lopettaa.", 0, 7);
		
		EV3TouchSensor ts = new  EV3TouchSensor(SensorPort.S1);
		float[] sample = new float[ts.sampleSize()];
		int laskuri = 0;
		LCD.drawString("Painalluksia: " + laskuri, 0, 4);
		
		while (!Button.ENTER.isDown()) {
			ts.fetchSample(sample, 0);
			if (sample[0] == 1) {
				do {
					Delay.msDelay(120);
					ts.fetchSample(sample, 0);
				} while (sample[0] == 1);
				LCD.clear();
				laskuri++;
				LCD.drawString("Painalluksia: " + laskuri, 0, 4);
				LCD.drawString("Enter lopettaa.", 0, 7);
			}
			
		}
		LCD.clear();
		ts.close();
	}
	
	public static void mittaaPainallustenVali () {
		LCD.drawString("Aloita ja lopeta", 0, 0);
		LCD.drawString("painamalla", 0, 1);
		LCD.drawString("kosketusanturia", 0, 2);
		
		EV3TouchSensor ts = new  EV3TouchSensor(SensorPort.S1);
		float[] sample = new float[ts.sampleSize()];
		ts.fetchSample(sample, 0);

		double tulos = 0.0;
		
		Stopwatch sw = new Stopwatch();
		
		while (sample[0] == 0) {
			ts.fetchSample(sample, 0);
			if (sample[0] == 1) {
				Sound.beep();
				LCD.clear();
				LCD.drawString("Tavoite: 5 s", 0, 3);
				sw.reset();
				Delay.msDelay(200);
				do {
					Delay.msDelay(1);
					ts.fetchSample(sample, 0);
				} while (sample[0] == 0);
				tulos = sw.elapsed();
				Sound.beep();
				break;
			}
		}
		ts.close();
		
		double pisteet = laskePisteet(tulos);
		
		LCD.clear();
		LCD.drawString("Aikasi: " + (double) tulos/1000 + " s", 0, 2);
		LCD.drawString("Pisteesi: " + (int) pisteet + "/1000", 0, 4);
		Delay.msDelay(5000);
		
		LCD.clear();
		
	}
	
	public static double laskePisteet(double tulos) {
		double pisteet = 0.0;
		if (tulos <= 5000) {
			pisteet = tulos/5000.0 * 1000.0;
		} else {
			pisteet = (10000.0 - tulos)/5000.0 * 1000.0;
		}
		if (pisteet < 0.0) {
			pisteet = 0.0;
		}
		return pisteet;
	}

}
