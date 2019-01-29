# -*- coding: cp1252 -*-

class Emo:
	arvo = 0
	tila = "Toiminnassa"
	
	def nimi(self):
		print("Minä olen emoluokka.")
		
class Lapsi(Emo):
	
	def nimi(self):
		print("Minä olen lapsiluokka.")
		
emo = Emo()
lapsi = Lapsi()

print(emo.tila)
emo.nimi()
print(lapsi.tila)
lapsi.nimi()