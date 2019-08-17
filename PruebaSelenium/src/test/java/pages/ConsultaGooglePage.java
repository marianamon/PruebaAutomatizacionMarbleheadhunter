/** ========================================================================================================================
* @author  : Mariana Alzate 
* @version : 1.0 2019/17/08
* ===========================================================================================================================
* 
* Clase  para la referenciacion de objetos de los Steps: ConsultaGoogle_Steps para la ejecuciòn de la feature ConsultaGoogle,
* mediante la implementaciòn de Pagefactory
* Copyright (C) 2019
=============================================================================================================================
*/

package pages;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BaseClass;
import java.util.concurrent.TimeUnit;


public class ConsultaGooglePage extends BaseClass {
	

	 /**
     * Anotacion de Pagefactory para para almacenar en caché el elemento una vez que está ubicado
     */	
     @CacheLookup
	 
	/**
	 * Metodo para inicializar objeto txtBuscar y ejercer accion sobre el
	 * @param palabra El parámetro palabra define el contenido  a Buscar
	 */	
	@FindBy(how = How.NAME, using = "q") WebElement txtBuscar;
	public void setPalabra(String palabra) throws Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
		txtBuscar.sendKeys(palabra); 
    }

	
    
    /**
	 * Metodo para inicializar el objeto Boton Buscar y ejercer accion sobre el
	 */	
    @FindBy(how = How.NAME, using = "btnK") WebElement btnBuscar;
    public void clickBuscar() throws Exception {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
        btnBuscar.submit();
         
     }
    
  
    /**
	 * Metodo para validar que se retorna la palabra correcta en google y seleccionarla
	 */	
    @FindBy(how = How.XPATH, using = "//b/i") WebElement lblcorrecto;
    public  void verificarPalabra() throws Exception {
    	
    	String ValorEsperado="pruebas";
    	String ValorRetornado= lblcorrecto.getText();
    	
    	Assert.assertEquals(ValorEsperado, ValorRetornado);
    	
    	Log.info("***********************************************************************************************************");
		Log.info("La palabra corregida por google es: " + ValorRetornado);
		Log.info("***********************************************************************************************************");
	
    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
        lblcorrecto.click();
    }
    

    /**
	 * Metodo para obtener los resultados de la consulta en google y comparar 
	 * contra el resultado esperado
	 */	
    public  void verificarTest () throws Exception {
    	
         String userAgent ="Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.116 Safari/537.36"; 
         Document document = Jsoup.connect("https://www.google.com/search?q=pruebaz&rlz=1C1CHBF_esCO848CO848&oq=pruebaz&aqs=chrome.0.69i59j0l4j69i60.2782j0j7&sourceid=chrome&ie=UTF-8").userAgent(userAgent).get();
         Elements links = document.select( "h3");
         int TotalResultados= links.size();
       
         
           for (Element link : links) {

                String title = link.text();
                Log.info("***********************************************************************************************************");
        		Log.info("Title: " + title);
        		Log.info("***********************************************************************************************************");
        		Log.info("Total Resultados: " + TotalResultados);
        		Log.info("***********************************************************************************************************");
        	
        		String TotalEsperado = "";
				assert TotalEsperado != null && TotalResultados > 6;
				Log.info("El total de resultados es mayor o igual al esperado " + TotalEsperado);   
				Log.info("***********************************************************************************************************");
				
        	
    }
        }
           }
    	

  
    
