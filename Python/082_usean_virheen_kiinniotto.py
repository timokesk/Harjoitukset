# -*- coding: cp1252 -*-

try:
	tiedosto = input("Anna tiedoston nimi: ")
	sisalto = open(tiedosto,"r")
	luku = sisalto.read()
	sisalto.close()
	luku = int(luku)
	tulos = luku + 313
	
except IOError:
	print("Virheellinen tiedostonnimi")
	
except ValueError:
	print("Tiedoston sisältö virheellinen!")
	
else:
	print("Saatiin tulos",tulos)