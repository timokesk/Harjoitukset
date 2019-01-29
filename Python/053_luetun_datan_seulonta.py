# -*- coding: cp1252 -*-

tiedosto = open("merkkijonoja.txt","r")
sisalto = tiedosto.readlines()

for rivi in sisalto:
	rivi = rivi[:-1]
	
	if rivi.isalnum():
		print(rivi,"kelpaa salasanaksi.")
		
	else:
		print(rivi,"sisältää virheellisiä merkkejä.")
		
tiedosto.close()