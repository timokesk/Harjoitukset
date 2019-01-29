using System;

namespace Lab3
{
	public class Roulette
	{

		Random random = new Random ();
		private int numbers;

		public Roulette ()
		{
			this.numbers = 36;
		}

		public int Spin () {
			
			int result = random.Next (numbers + 2);
			if (result == 37) {
				result = 0;
			}
			return result;
		}
	}
}

