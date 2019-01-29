# -*- coding: cp1252 -*-

class Kilpailija:
	pisteet = 0
	vari = "punainen"
	
	def tiedot(self):
		print("Kilpailijalla",self.vari,"on",self.pisteet,"pistettä!")
	
eka = Kilpailija()
eka.vari = "sininen"
eka.pisteet = 10
eka.tiedot()