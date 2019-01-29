using System;

namespace Lab2
{
	public class Player
	{
		private Dice dice;

		public Player (Dice dice)
		{
			this.dice = dice;
		}

		//The player throws the dice
		public void ThrowDice (Dice dice) {
			int result = dice.Roll ();
			Console.WriteLine (result);
			
		}

	}
}

