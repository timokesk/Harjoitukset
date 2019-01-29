# -*- coding: cp1252 -*-

import random

def tulkitse_voittaja(pelaaja,tietokone):
	if pelaaja == tietokone:
		tulos = "tasan"
		return tulos
	
	if pelaaja == "Jalka":
		if tietokone == "Ydinase":
			tulos = "tietokone"
		else:
			tulos = "pelaaja"
		return tulos
	
	elif pelaaja == "Ydinase":
		if tietokone == "Torakka":
			tulos = "tietokone"
		else:
			tulos = "pelaaja"
		return tulos
	
	else:
		if tietokone == "Jalka":
			tulos = "tietokone"
		else:
			tulos = "pelaaja"
		return tulos

	
def tulosta_tulos(tulos):
	if tulos == "tasan":
		print("Tasapeli!")
		
	elif tulos == "pelaaja":
		print("Voitit!")
		
	else:
		print("Hävisit!")

		
def main():
	
	kierrokset = 0
	voitot = 0
	tasan = 0
	
	while True:
		pelaaja = input("Jalka, Ydinase vai Torakka? (Lopeta lopettaa): ")
		
		if pelaaja == "Lopeta":
			break
		
		print("Sinä valitsit:",pelaaja)
		
		tietokone = random.randint(0,2)
		if tietokone == 1:
			tietokone = "Jalka"
		elif tietokone == 2:
			tietokone = "Ydinase"
		else:
			tietokone = "Torakka"
		print("tietokone valitsi:",tietokone)
			
		tulos = tulkitse_voittaja(pelaaja,tietokone)
		
		tulosta_tulos(tulos)
		
		if tulos == "tasan":
			tasan += 1
			
		if tulos == "pelaaja":
			voitot += 1
			
		kierrokset += 1
		
	print("Pelasit",kierrokset,"kierrosta, joista voitit",voitot,"ja pelasit tasan",tasan,"peliä.")
			
		
if __name__ == "__main__":
	main()