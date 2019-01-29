# -*- coding: cp1252 -*-

tiedosto = open("sanoja.txt","r")

sisalto = tiedosto.readlines()

for rivi in sisalto:
	rivi = rivi[:-1]
	
sisalto.sort()

print("Sanat laitettuna aakkosjärjestykseen:")

for rivi in sisalto:
	print(rivi,end="")