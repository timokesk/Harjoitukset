using System;

namespace Lab3
{
	public class Player
	{
		private Roulette roulette;

		public Player (Roulette roulette)
		{
			this.roulette = roulette;
		}

		public void SpinRoulette(Roulette roulette) {
			int result = roulette.Spin ();
			Console.WriteLine (result);
		}
	}
}

