# -*- coding: cp1252 -*-

class Kilpailija:
	pisteet = 0
	vari = "punainen"
	
	def tiedot(self):
		print("Kilpailijalla",self.vari,"on",self.pisteet,"pistettä!")
		
	def tilanne(self):
		print("Olen",self.vari,"ja minulla on",self.pisteet,"pistettä!")
		
	def maali(self):
		self.pisteet += 1
	
eka = Kilpailija()
eka.vari = "sininen"

eka.maali()
eka.tilanne()