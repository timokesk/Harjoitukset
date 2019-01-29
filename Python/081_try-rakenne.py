# -*- coding: cp1252 -*-

try:
	luku = int(input("Anna luku: "))

except Exception:
	print("Virheellinen syöte!")
	
else:
	print("Syöte oli kelvollinen.")