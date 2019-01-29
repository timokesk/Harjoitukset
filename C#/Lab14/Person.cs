using System;
/// <summary>
/// <description>Timo Keskiniemi</description>
/// <version>version 1.0</version>
/// Mallintaa henkilöä, jolla on nimi.
/// </summary>
/// MUISTA: Iso alkukirjain muille paitsi private scope
namespace Personnel
{
	//Kaikki luokat perivät automaattisesti Object-luokan.
	//Perintää ei kirjoiteta näkyviin.
	public class Person
	{
		//Instanssimuuttuja (property...)
		private String name;

		//rakentaja, constructor
		/// <summary>
		/// Initializes a new instance of the <see cref="Personnel.Person"/> class.
		/// Asettaa annetun nimen.
		/// </summary>
		/// <param name="name">Name.</param>
		public Person (String name)
		{
			this.name = name;
		}

		//metodi
		/// <summary>
		/// Gets the info.
		/// </summary>
		/// <returns>The name of the person</returns>
		/// virtual tarkoittaa, että metodi on uudelleenmääriteltävissä lapsiluokassa
		public virtual String GetInfo() {
			return this.name;
		}
	}
}

