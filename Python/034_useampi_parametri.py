# -*- coding: cp1252 -*-

luku_1 = input("Anna luku: ")
luku_2 = input("Anna toinen luku: ")

luku_1 = int(luku_1)
luku_2 = int(luku_2)

if luku_1 % 2 == 0 and luku_2 % 2 == 0:
	print("Molemmat luvut ovat parillisia.")
	
elif (luku_1 % 2 == 0 and luku_2 % 2 == 1) or (luku_1 % 2 == 1 and luku_2 % 2 == 0):
	print("Toinen luku on parillinen.")
	
else:
	print("Molemmat luvut ovat parittomia.")