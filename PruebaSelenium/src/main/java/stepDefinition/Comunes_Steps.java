package stepDefinition;



import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import utils.BaseClass;


public class Comunes_Steps {
	

	BaseClass claseBase = new BaseClass();
	
	 protected WebDriver driver;
	 
	
	public Comunes_Steps() throws MalformedURLException {
    }

	 @Given("^Que ingrese a la pagina \"(.*)\"$")
	    public void navigateTo(String url) throws MalformedURLException{
	    	claseBase.getDriver(url);
	    	
	 }

	
}

