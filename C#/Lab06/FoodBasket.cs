using System;

namespace Lab6
{
	public class FoodBasket
	{
		private double price = 100.0;

		public FoodBasket ()
		{
		}

		public void printPrice (int months) {
			int counter = 0;
			while (price < 105.0) {
				Console.WriteLine (price);
				price = price * 1.015;
				counter++;
			}
			Console.WriteLine ("Warning! The price goes over 105!");

			while (counter < months) {
				Console.WriteLine (price);
				price = price * 1.015;
				counter++;
			}
		}
	}
}

