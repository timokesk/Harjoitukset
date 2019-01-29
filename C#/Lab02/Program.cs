using System;

namespace Lab2
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			Dice dice = new Dice ();
			Player player = new Player (dice);

			player.ThrowDice (dice);
		}
	}
}
