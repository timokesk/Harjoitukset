# -*- coding: cp1252 -*-

class Kilpailija:
	"""Kilpailija: sisältää pisteet ja värin"""
	
	pisteet = 0
	vari = "punainen"
	
	def __init__(self):
		self.vari = input("Anna minulle väri: ")
	
	def tiedot(self):
		print("Kilpailijalla",self.vari,"on",self.pisteet,"pistettä!")
		
	def tilanne(self):
		print("Olen",self.vari,"ja minulla on",self.pisteet,"pistettä!")
		
	def maali(self):
		self.pisteet += 1
	
eka = Kilpailija()
toka = Kilpailija()

eka.tilanne()
toka.tilanne()

print(eka.__doc__)