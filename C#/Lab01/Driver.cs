using System;

namespace Lab1
{
	public class Driver
	{
		private Car myCar;

		public Driver (Car myCar)
		{
			this.myCar = myCar;
		}
		public void Drive (){
			
			//Tankkaa auton
			myCar.FillTank();

			 //Kiihdyttää niin kauan, kun nopeus pysyy alle arvon 50.0 JA bensamäärä vähintään 0.1
			while ( (myCar.GetSpeed() < 50.0) && (myCar.GetGasLevel() >= 0.1) ) {
				myCar.Accelerate();
			}

			//Hiljentää niin kauan, kun nopeus on yli arvon 0
			while ( myCar.GetSpeed() > 0 ) {
				myCar.Decelerate();
			}
		}
				
	}
}

