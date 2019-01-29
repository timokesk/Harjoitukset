using System;
using Personnel;
using Hospital;
/// <summary>
/// @author Timo Keskiniemi
/// @version 1.0
/// Sairaalassa on hoitojono, joka on tietyn lääkärin vastuulla.
/// Hoitojonoon lisätään potilaita, joille tehdään jokin operaatio sairaalassa.
/// </summary>
namespace Lab14
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			Console.WriteLine ("**1. Luodaan henkilö");
			//new Personnel.Person ("Kake");
			//nimiavaruus 2 tapaa hoitaa (using Personnel tai Personnel.)
			Person p1 = new Person ("Maija");
			Person p2 = new Person ("Paavo");
			Console.WriteLine (p1.ToString ());
			//Console.WriteLine (p1); sama kuin yllä
			Console.WriteLine ("1. person " + p1.GetInfo ());
			Console.WriteLine ("2. person " + p2.GetInfo ());

			Console.WriteLine ("**2. Luodaan potilaita");
			Patient pat1 = new Patient ("Kake", "lobotomia");
			Patient pat2 = new Patient ("Kake2", "varpaan poisto");
			Patient pat3 = new Patient ("Kake3", "uusi silmä");
			Patient pat4 = new Patient ("Kake4", "uusi käsi");
			Patient pat5 = new Patient ("Kake5", "uusi maksa");

			Console.WriteLine ("1. patient " + pat1.GetInfo ());
			Console.WriteLine ("2. patient " + pat2.GetInfo ());
			Console.WriteLine ("3. patient " + pat3.GetInfo ());
			Console.WriteLine ("4. patient " + pat4.GetInfo ());
			Console.WriteLine ("5. patient " + pat5.GetInfo ());

			Console.WriteLine ("**3. Luodaan lääkäri");
			Doctor doc = new Doctor ("Sara", "aivokirurgi");
			Console.WriteLine ("1. doctor " + doc.GetInfo ());

			Console.WriteLine ("**4. Luodaan hoitojono");
			PatientQueue pq = new PatientQueue ("HUS", doc);
			pq.AddPatient (pat1);
			pq.AddPatient (pat2);
			pq.AddPatient (pat3);
			pq.AddPatient (pat4);
			pq.AddPatient (pat5);
			Console.WriteLine (pq.GetInfo ());
		}
	}
}
