using System;

namespace Lab11
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			String input = Console.ReadLine ();
			Dictionary dictionary = new Dictionary ();
			String translation = dictionary.Translate (input);
			Console.WriteLine (translation);
		}
	}
}
