# -*- coding: cp1252 -*-

luku_1 = input("Anna ensimmäinen luku: ")
luku_2 = input("Anna toinen luku: ")

luku_1 = int(luku_1)
luku_2 = int(luku_2)

print("""(1) +
(2) -
(3) *
(4) /""")

valinta = input("Tee valinta (1-4): ")

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
	
else:
	print("Valintaa ei tunnistettu.")