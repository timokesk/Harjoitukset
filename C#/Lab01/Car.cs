using System;

namespace Lab1
{
	public class Car
	{
		//Instanssimuuttuja - ominaisuus - property
		private double speed;
		private double gasLevel;

		//Rakentaja - constructor
		//Tätä kutsutaan, kun luodaan uusi auto-olio
		public Car ()
		{
			//Uudella autolla nopeus nollaksi ja bensaa yksi litra
			this.gasLevel = 1.0;
			this.speed = 0.0;
		}
		//Metodit - mitä toiminnallisuuksia olemassa

		//Bensamäärä
		public double GetGasLevel(){
			return this.gasLevel;
		}

		//Nopeus
		public double GetSpeed(){
			return this.speed;
		}

		/* Kiihdyttää niin kauan kuin bensaa on jäljellä
		 * Lisää nopeutta arvolla 1 ja vähentää bensaa arvolla 0.1
		 */

		public void Accelerate () {
			Console.WriteLine ("Begin Accelerate(): " + this.speed + ", " + this.gasLevel);
			if (this.gasLevel >= 0.1) {
				this.speed = this.speed + 1;
				this.gasLevel = this.gasLevel - 0.1;
			}
			Console.WriteLine ("End Accelerate(): " + this.speed + ", " + this.gasLevel);
		}

		/* Tarkistaa ensin, onko nykyinen nopeus pienempi kuin 1, jos on asettaa nopeuden nollaksi.
		 * Muuten vähentää nopeutta arvolla 1.
		 */
		public void Decelerate () {
			Console.WriteLine ("Begin Decelerate(): " + this.speed + ", " + this.gasLevel);
			if (this.speed - 1.0 < 0) {
				this.speed = 0.0;
			} else {
				this.speed = this.speed - 1.0;
			}
			Console.WriteLine ("End Decelerate(): " + this.speed + ", " + this.gasLevel);
		}

		//Asettaa bensan määräksi arvon 20
		public void FillTank () {
			this.gasLevel = 20;
		}
	}
}

