import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.utility.Delay;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class SanaPeli {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Pelit");
		lista.add("Laitteet");
		lista.add("Verkot");
		lista.add("Oliot");
		
		boolean jatkuu = true;
		
		int omatPisteet = 0;
		int laitteenPisteet = 0;
		
		while (jatkuu) {
			LCD.drawString("Arvaa sana:", 0, 0);
			LCD.drawString(lista.get(0), 4, 1);
			LCD.drawString(lista.get(1), 0, 2);
			LCD.drawString(lista.get(2), 9, 2);
			LCD.drawString(lista.get(3), 4, 3);
			LCD.drawString("Sinulla: " + omatPisteet, 0, 5);
			LCD.drawString("Minulla: " + laitteenPisteet, 0, 6);
			int veikkaan = Button.waitForAnyPress();
			
			if (veikkaan == Button.ID_UP) {
				veikkaan = 0;
			} else if (veikkaan == Button.ID_LEFT) {
				veikkaan = 1;
			} else if (veikkaan == Button.ID_RIGHT) {
				veikkaan = 2;
			} else if (veikkaan == Button.ID_DOWN) {
				veikkaan = 3;
			}
			
			LCD.clear();
			
			int laiteVeikkaa = ThreadLocalRandom.current().nextInt(0, 4);
			LCD.drawString("Arvaan sanan", 0, 0);
			LCD.drawString(lista.get(laiteVeikkaa), 0, 1);
			Delay.msDelay(3000);
			LCD.clear();
			
			int arvonta = ThreadLocalRandom.current().nextInt(0, 4);
			LCD.drawString("Oikea sana on", 0, 0);
			LCD.drawString(lista.get(arvonta), 0, 1);
			
			if (veikkaan == arvonta) {
				omatPisteet++;
				LCD.drawString("Arvasit oikein!", 0, 3);
			} else {
				LCD.drawString("Arvasit vaarin!", 0, 3);
			}
			
			if (laiteVeikkaa == arvonta) {
				laitteenPisteet++;
				LCD.drawString("Arvasin oikein!", 0, 4);
			} else {
				LCD.drawString("Arvasin vaarin!", 0, 4);
			}
			
			Delay.msDelay(5000);
			LCD.clear();
			
			LCD.drawString("Lopeta (keski)?", 0, 4);
			int keycode = Button.waitForAnyPress();
			LCD.clear();
			if (keycode == 2) {
				jatkuu = false;
			}
		}
	}

}
