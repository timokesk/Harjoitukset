# -*- coding: cp1252 -*-

import time

while True:
	print("""(1) Lue muistikirjaa
	(2) Lisää merkintä
	(3) Tyhjennä muistikirja
	(4) Lopeta\n""")
	
	valinta = input("Mitä haluat tehdä?: ")
	
	if valinta == "1":
		tiedosto = open("muistio.txt","r")
		print(tiedosto.read())
		tiedosto.close()
		
	elif valinta == "2":
		merkinta = input("Kirjoita uusi merkintä: ")
		merkinta = merkinta + ":::" + time.strftime("%X %x") + "\n"
		tiedosto = open("muistio.txt","a")
		tiedosto.write(merkinta)
		tiedosto.close()
		
	elif valinta == "3":
		tiedosto = open("muistio.txt","w")
		tiedosto.close()
		print("Muistio tyhjennetty.")
		
	elif valinta == "4":
		print("Lopetetaan.")
		break
		
	else:
		print("Tuntematon valinta.")