using System;
using Personnel;
using System.Collections.Generic;

namespace Hospital
{
	public class PatientQueue
	{
		private String hospital;
		private Doctor doctorInCharge;
		private List<Patient> queue = new List<Patient>();

		public PatientQueue (String hospital, Doctor doctorInCharge)
		{
			this.hospital = hospital;
			this.doctorInCharge = doctorInCharge;
		}
		public String GetInfo () {
			String temp = "Sairaala " + this.hospital;
			temp += "\nVastuulääkäri " + this.doctorInCharge.GetInfo ();
			foreach (Patient p in queue) {
				temp += "\n - " + p.GetInfo ();
			}
			return temp;
		}
		public void AddPatient(Patient patient) {
			queue.Add (patient);
		}
	}
}

