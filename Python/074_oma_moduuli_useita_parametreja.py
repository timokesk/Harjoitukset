# -*- coding: cp1252 -*-

def testaa(testattava):
	if len(testattava) < 5:
		return False
	
	if testattava.isalpha():
		return False
	
	if testattava.isdigit():
		return False
	
	return True