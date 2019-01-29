# -*- coding: cp1252 -*-

tiedostonimi = input("Minkäniminen tiedosto luodaan?: ")
teksti = input("Mitä kirjoitetaan tiedostoon?: ")

tiedosto = open(tiedostonimi,"w")

tiedosto.write(teksti)

tiedosto.close()

print("Luotiin tiedosto",tiedostonimi,"ja siihen tallennettiin teksti:",teksti)