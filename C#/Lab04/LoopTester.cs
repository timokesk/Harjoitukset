using System;

namespace Lab4
{
	public class LoopTester
	{
		public LoopTester ()
		{
		}

		public void DoTheLoops() {
			Console.WriteLine("I'm looping here: ");

			int pc = 0, passengerLimit = 4;
			Console.WriteLine ("while loop:");
			while (pc <= passengerLimit) {
				Console.WriteLine ("Now I have " + pc + " passengers");
				pc = pc + 1;
			}

			Console.WriteLine ("for loop:");
			for (pc = 0; pc <= passengerLimit; pc++) {
				Console.WriteLine ("Now I have " + pc + " passengers");
			}

			for (int i = 0; i < 5; i++) {
				Console.WriteLine ("i = " + i);
			}

			for (int i = 0; i < 8; i++) {
				if (i != 4) {
					Console.WriteLine ("i = " + i);
				}
			}

			bool stop = false;
			int count = 0;
			while (!stop) {
				if (count == 2) {
					stop = true;
				}
				Console.WriteLine ("count = " + count);
				count++;
			}

		}
	}
}

