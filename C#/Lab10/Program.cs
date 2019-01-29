using System;

namespace Lab10
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			Triangle triangle = new Triangle ();

			int number = 0;

			do {
				Console.Write("Give the size of the triangle: ");
				string input = Console.ReadLine ();
				if (Int32.TryParse (input, out number) && number > 0 && number <= 100) {
					triangle.drawTriangle (number);
				}
				else {
					Console.WriteLine ("Give an another input!");
				}
			} while (number <= 0 || number > 100);
		}
	}
}
