using System;

namespace Personnel
{
	public class Doctor : Person
	{
		private String title;
		public Doctor (String name, String title):base(name)
		{
			this.title = title;
		}
		public override string GetInfo () {
			return base.GetInfo () + ", " + this.title;
		}
	}
}

