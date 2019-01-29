# -*- coding: cp1252 -*-

lista = []
alkioita = 0

while True:
	print("""Haluatko
(1)Lisätä listaan
(2)Poistaa listalta vai""")
	valinta = input("(3)Lopettaa?:")
	
	if valinta == "3":
		print("Listalla oli tuotteet:")
		for i in lista:
			print(i)
		break
		
	elif valinta == "1":
		tuote = input("Mitä lisätään?: ")
		lista.append(tuote)
		alkioita +=  1
		
	elif valinta == "2":
		print("Listalla on",alkioita,"alkiota.")
		poisto = int(input("Monesko niistä poistetaan?: "))
		
		try:
			lista.pop(poisto)
			
		except Exception:
			print("Virheellinen valinta.")
			
	else:
		print("Virheellinen valinta.")