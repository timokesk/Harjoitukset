using System;

namespace Lab1
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			/*
			Car ferrari = new Car ();
			Car audi = new Car ();

			Console.WriteLine ("Ferrarilla bensaa " +
				ferrari.GetGasLevel() + " litraa.");
			Console.WriteLine ("Ferrarin nopeus " +
				ferrari.GetSpeed () + " km/h.");


			Console.WriteLine ("Audilla bensaa " +
				audi.GetGasLevel() + " litraa.");
			Console.WriteLine ("Audin nopeus " +
				audi.GetSpeed () + " km/h.");
			*/

			Car theCar = new Car ();
			Driver theDriver = new Driver (theCar);

			theDriver.Drive ();
		}
	}
}
