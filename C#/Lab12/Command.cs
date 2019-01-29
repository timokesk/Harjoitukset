using System;
using System.Collections.Generic;

namespace Lab12
{
	public class Command
	{
		Dictionary<String,int> commands = new Dictionary<String,int>();

		public Command ()
		{
			commands.Add ("stop", 1);
			commands.Add ("exit", 1);
			commands.Add ("quit", 1);
			commands.Add ("end", 1);
			commands.Add ("start", 2);
			commands.Add ("execute", 2);
			commands.Add ("print", 3);
		}

		public int executeCommand () {
			do {
				String command = Console.ReadLine ();

				int key = commands[command]; 
				switch (key)
				{
				case 1:
					return 1;
				case 2:
					Console.WriteLine ("Starting...");
					break;
				case 3:
					Console.WriteLine ("Printing...");
					break;
				}
					
			} while (true);
		}
	}
}

