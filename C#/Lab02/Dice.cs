using System;

namespace Lab2
{
	public class Dice
	{

		Random random = new Random ();
		//Number of facets
		private int facet;

		public Dice ()
		{
			this.facet = 6;
		}

		//Rolls the dice
		public int Roll () {
			
			int result;
			result = random.Next (facet) + 1;
			return result;
		}

	}
}

