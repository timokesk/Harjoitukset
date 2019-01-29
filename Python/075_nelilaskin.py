# -*- coding: cp1252 -*-

import math

luku_1 = int(input("Anna ensimmäinen luku: "))
luku_2 = int(input("Anna toinen luku: "))

while True:
	print("""(1) +
	(2) -
	(3) *
	(4) /
	(5)sin(luku1/luku2)
	(6)cos(luku1/luku2)
	(7)Vaihda luvut
	(8)Lopeta""")
	print("Valitut luvut:",luku_1,luku_2)
	
	valinta = input("Tee valinta (1-8): ")

	if valinta == "1":

		tulos = luku_1 + luku_2
		print("Tulos on: ",tulos)
	
	elif valinta == "2":
		tulos = luku_1 - luku_2
		print("Tulos on: ",tulos)
	
	elif valinta == "3":
		tulos = luku_1 * luku_2
		print("Tulos on: ",tulos)

	elif valinta == "4":
		tulos = luku_1 / luku_2
		print("Tulos on: ",tulos)
		
	elif valinta == "5":
		tulos = math.sin(luku_1/luku_2)
		print("Tulos on: ",tulos)
		
	elif valinta == "6":
		tulos = math.cos(luku_1/luku_2)
		print("Tulos on: ",tulos)

	elif valinta == "7":
		luku_1 = int(input("Anna uusi ensimmäinen luku: "))
		luku_2 = int(input("Anna uusi toinen luku: "))
	
	elif valinta == "8":
		break
	
	else:
		print("Valintaa ei tunnistettu.")