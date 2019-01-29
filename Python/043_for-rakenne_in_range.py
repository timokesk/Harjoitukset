# -*- coding: cp1252 -*-

kierroksia = int(input("Kuinka monta kierrosta?: "))
tulos = 0

for kierros in range(kierroksia):
	tulos = tulos + kierros

print("Kertymäksi saatiin:",tulos)