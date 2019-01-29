using System;

namespace Lab12
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			Command command = new Command ();
			int result = command.executeCommand ();
		}
	}
}
