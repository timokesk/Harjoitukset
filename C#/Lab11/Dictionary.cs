using System;
using System.Collections.Generic;

namespace Lab11
{
	public class Dictionary
	{
		Dictionary<String,String> dictionary = new Dictionary<String,String> ();

		public Dictionary ()
		{
			dictionary.Add ("kissa", "cat");
			dictionary.Add ("koira", "dog");
		}

		public String Translate(String word) {
			if (dictionary.ContainsKey(word))
			String translation = dictionary[word];
			return translation;
		}
	}
}

