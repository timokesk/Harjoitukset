# -*- coding: cp1252 -*-

def toinenpotenssi(luku):
	tulos = luku**2
	print("Toinen potenssi on",tulos)

def main():
	luku = int(input("Anna lukuarvo: "))
	toinenpotenssi(luku)
	
if __name__ == "__main__":
	main()