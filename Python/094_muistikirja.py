# -*- coding: cp1252 -*-

import pickle
import time

try:
	tiedosto = open("muistio.dat","rb")
	
except IOError:
	print("Virhe tiedostossa, luodaan uusi muistio.dat.")
	tiedosto = open("muistio.dat","w")
	tiedosto.close()
	muistio = []
	
else:
	muistio = pickle.load(tiedosto)
	tiedosto.close()
	
while True:
	print("""(1) Lue muistikirjaa
(2) Lisää merkintä
(3) Muokkaa merkintää
(4) Poista merkintä
(5) Tallenna ja lopeta\n""")
	
	valinta = input("Mitä haluat tehdä?: ")
	
	if valinta == "1":
		tiedosto = open("muistio.dat","rb")
		muistio = pickle.load(tiedosto)
		laskuri = 0
		for i in muistio:
			print(muistio[laskuri])
			laskuri += 1
		tiedosto.close()
			
	if valinta == "2":
		merkinta = input("Kirjoita uusi merkintä: ")
		merkinta = merkinta + ":::" + time.strftime("%X %x")
		muistio.append(merkinta)
		tiedosto = open("muistio.dat","wb")
		pickle.dump(muistio,tiedosto)
		tiedosto.close()
		
	if valinta == "3":
		merkinnat = 0
		for i in muistio:
			merkinnat += 1
			
		print("Listalla on",merkinnat,"merkintää.")
		poisto = int(input("Mitä niistä muutetaan?: "))
		poistettu = muistio.pop(poisto-1)
		print(poistettu)
		uusi = input("Anna uusi teksti: ")
		uusi = uusi + ":::" + time.strftime("%X %x")
		muistio.insert(poisto-1,uusi)
		tiedosto = open("muistio.dat","wb")
		pickle.dump(muistio,tiedosto)
		tiedosto.close()
		
	if valinta == "4":
		merkinnat = 0
		for i in muistio:
			merkinnat += 1
			
		print("Listalla on",merkinnat,"merkintää.")
		poisto = int(input("Mitä niistä poistetaan?: "))
		poistettu = muistio.pop(poisto-1)
		print("Poistettiin merkintä",poistettu)
		tiedosto = open("muistio.dat","wb")
		pickle.dump(muistio,tiedosto)
		tiedosto.close()
		
	if valinta == "5":
		tiedosto = open("muistio.dat","wb")
		pickle.dump(muistio,tiedosto)
		tiedosto.close()
		print("Lopetetaan.")
		break