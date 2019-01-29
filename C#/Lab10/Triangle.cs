using System;

namespace Lab10
{
	public class Triangle
	{
		public Triangle ()
		{
		}

		private void drawStar (int count) {
			for (int i = 1; i <= count; i++) {
				Console.Write ("*");
			}
		}

		public void drawTriangle (int size) {

			Console.WriteLine ("Triangle of size " + size + " created");

			for (int i = 1; i <= size; i++) {
				drawStar (i);
				Console.WriteLine ("");
			}

		}
	}
}

