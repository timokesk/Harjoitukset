using System;
using System.Collections.Generic;

namespace Lab9
{
	public class FoodBasket
	{
		private double price = 100.0;

		List<String> monthNames = new List<String> ();

		public FoodBasket ()
		{
			monthNames.Add("January");
			monthNames.Add("February");
			monthNames.Add("March");
			monthNames.Add("April");
			monthNames.Add("May");
			monthNames.Add("June");
			monthNames.Add("July");
			monthNames.Add("August");
			monthNames.Add("September");
			monthNames.Add("October");
			monthNames.Add("November");
			monthNames.Add("December");
		}

		public void printPrice (int months) {
			int counter = 0;
			while (price < 105.0) {
				Console.WriteLine (monthNames[counter] + ": " + price);
				price = price * 1.015;
				counter++;
			}
			Console.WriteLine ("Warning! The price goes over 105!");

			while (counter < months) {
				Console.WriteLine (monthNames[counter] + ": " + price);
				price = price * 1.015;
				counter++;
			}
		}
	}
}

