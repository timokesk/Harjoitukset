using System;

namespace Lab3
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			Roulette roulette = new Roulette ();
			Player player = new Player (roulette);

			player.SpinRoulette (roulette);

		}
	}
}
