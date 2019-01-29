using System;
using System.Collections.Generic;

namespace Lab8
{
	public class Dice
	{

		Random random = new Random ();
		private int facet;
		List<int> results = new List<int> ();
		private int numberOfRolls = 0;

		public Dice ()
		{
			this.facet = 6;
		}
			
		public int Roll () {

			do {
				int result;
				result = random.Next (facet) + 1;
				numberOfRolls++;

				if (results.Contains (result) == false) {
					results.Add (result);
				}

			} while (results.Count < facet);

			/* testaa, mitä tuloksia results-listaan tallennettiin
			foreach (int result in results) {
				Console.WriteLine (result);
			}
			*/

			return numberOfRolls;

		}

	}
}

