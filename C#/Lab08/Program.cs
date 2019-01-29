using System;

namespace Lab8
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
