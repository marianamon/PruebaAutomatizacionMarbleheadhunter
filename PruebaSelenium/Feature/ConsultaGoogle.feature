Feature: Consulta en Google
Como usuario de google quiero acceder y al buscar una palabra con error 
ortogràfico validar que el buscador me presenta la opciòn de busqueda con la 
palabra correcta y la lista de resultados obtenidos sea mayor a 6.

Scenario: Consulta en Google exitosa
	Given Que ingrese a la pagina "https://www.google.com.co"
	And he Ingresado la palabra "pruebaz" en el campo de texto Buscar
	When de click en el boton Buscar
	Then deberia cargar una lista de resultados mayor a 6 con la palabra correcta pruebas