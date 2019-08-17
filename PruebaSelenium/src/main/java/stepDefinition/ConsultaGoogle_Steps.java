package stepDefinition;

import java.net.MalformedURLException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ConsultaGooglePage;

public class ConsultaGoogle_Steps {
	
	
	ConsultaGooglePage GooglePage = new ConsultaGooglePage();
	
	public ConsultaGoogle_Steps() throws MalformedURLException {
    }

    @And("^he Ingresado la palabra \"(.*)\" en el campo de texto Buscar$")
    public void heIngresadolapalabrapruebazenelcampodetextoBuscar(String palabra) throws Throwable {
    	GooglePage.setPalabra(palabra);
    }

  
    @When("^de click en el boton Buscar$")
    public void clickenelbotonBuscar() throws Exception{
    	GooglePage.clickBuscar();
       
    }
    
    @Then("^deberia cargar una lista de resultados mayor a 6 con la palabra correcta pruebas$")
    public void deberiacargarunalistaderesultadosmayora6conlapalabracorrectapruebas() throws Exception{
    	GooglePage.verificarPalabra();
    	GooglePage.verificarTest();
    	GooglePage.quitDriver();

    }

}
