using System;

namespace Lab8
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

			int numberOfRolls = dice.Roll ();

			Console.WriteLine (numberOfRolls);
			
		}

	}
}

