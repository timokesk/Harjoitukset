using System;

namespace Personnel
{
	public class Patient: Person
	{
		private String procedure;
		public Patient (String name, String procedure):base(name)
		{
			this.procedure = procedure;
		}
		//override = tarkoituksella uudelleenmäärittelemässä perittyä metodia
		public override String GetInfo() {
			return base.GetInfo () + ", " + this.procedure;
		}
	}
}

