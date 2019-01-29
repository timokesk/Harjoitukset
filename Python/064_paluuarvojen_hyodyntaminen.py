# -*- coding: cp1252 -*-

def pituusmitta(syote):
	pituus = len(syote)
	return pituus

def main():
	while True:
		syote = input("Anna syöte (Lopeta lopettaa): ")
		
		if syote == "Lopeta":
			break
			
		pituus = str(pituusmitta(syote))
		
		if pituus == "0":
			print("Et antanut syötettä")
			
		else:
			print("Antamasi syöte oli",pituus,"merkkiä pitkä.")
	
if __name__ == "__main__":
	main()