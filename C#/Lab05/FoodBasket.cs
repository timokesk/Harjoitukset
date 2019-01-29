using System;

namespace Lab5
{
	public class FoodBasket
	{

		private double price = 100.0;
			
		public FoodBasket ()
		{
		}

		public void printPrice (int months) {
			for (int i = 0; i < months; i++) {
				Console.WriteLine (price);
				price = price * 1.015;
			}
		}
	}
}

