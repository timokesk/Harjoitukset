# -*- coding: cp1252 -*-

import time

muistio = "muistio.txt"

try:
	muistio_testi = open(muistio,"r")
	muistio_testi.close()
	
except IOError:
	print("Oletusmuistioa ei löydy, luodaan tiedosto.")
	luo_muistio = open(muistio,"w")
	luo_muistio.close()
	

while True:
	print("Käytetään muistiota: ",muistio)
	print("""(1) Lue muistikirjaa
(2) Lisää merkintä
(3) Tyhjennä muistikirja
(4) Vaihda muistiota
(5) Lopeta\n""")
	
	valinta = input("Mitä haluat tehdä?: ")
	
	if valinta == "1":
		tiedosto = open(muistio,"r")
		print(tiedosto.read())
		tiedosto.close()
		
	elif valinta == "2":
		merkinta = input("Kirjoita uusi merkintä: ")
		merkinta = merkinta + ":::" + time.strftime("%X %x") + "\n"
		tiedosto = open(muistio,"a")
		tiedosto.write(merkinta)
		tiedosto.close()
		
	elif valinta == "3":
		tiedosto = open(muistio,"w")
		tiedosto.close()
		print("Muistio tyhjennetty.")
		
	elif valinta == "4":
		uusi_tiedosto = input("Anna tiedoston nimi: ")
		
		try:
			muistio_testi = open(uusi_tiedosto,"r")
			muistio_testi.close()
			
		except IOError:
			print("Tiedostoa ei löydy, luodaan tiedosto.")
			luo_muistio = open(uusi_tiedosto,"w")
			luo_muistio.close()
			
		muistio = uusi_tiedosto
		
	elif valinta == "5":
		print("Lopetetaan.")
		break
		
	else:
		print("Tuntematon valinta.")