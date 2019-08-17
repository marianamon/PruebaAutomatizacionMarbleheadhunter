$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ConsultaGoogle.feature");
formatter.feature({
  "line": 1,
  "name": "Consulta en Google",
  "description": "Como usuario de google quiero acceder y al buscar una palabra con error \r\nortogr�fico validar que el buscador me presenta la opci�n de busqueda con la \r\npalabra correcta y la lista de resultados obtenidos sea mayor a 6.",
  "id": "consulta-en-google",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Consulta en Google exitosa",
  "description": "",
  "id": "consulta-en-google;consulta-en-google-exitosa",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Que ingrese a la pagina \"https://www.google.com.co\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "he Ingresado la palabra \"pruebaz\" en el campo de texto Buscar",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "de click en el boton Buscar",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "deberia cargar una lista de resultados mayor a 6 con la palabra correcta pruebas",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.google.com.co",
      "offset": 25
    }
  ],
  "location": "Comunes_Steps.navigateTo(String)"
});
formatter.result({
  "duration": 6353365266,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pruebaz",
      "offset": 25
    }
  ],
  "location": "ConsultaGoogle_Steps.heIngresadolapalabrapruebazenelcampodetextoBuscar(String)"
});
formatter.result({
  "duration": 181150927,
  "status": "passed"
});
formatter.match({
  "location": "ConsultaGoogle_Steps.clickenelbotonBuscar()"
});
formatter.result({
  "duration": 3404365139,
  "status": "passed"
});
formatter.match({
  "location": "ConsultaGoogle_Steps.deberiacargarunalistaderesultadosmayora6conlapalabracorrectapruebas()"
});
formatter.result({
  "duration": 4476891662,
  "status": "passed"
});
});