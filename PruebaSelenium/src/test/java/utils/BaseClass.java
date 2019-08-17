package utils;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.Log;
import java.io.File;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;



public class BaseClass {

 protected static WebDriver driver;
 private static String fileSeperator = System.getProperty("file.separator");
    
 
 @Before
    public WebDriver getDriver(String url) throws MalformedURLException{
    	try {
    		
    		Log.info("***********************************************************************************************************");
    		Log.info("***********************************************************************************************************");
    		Log.info("[ Driver Status ] - levantando la instancia del driver");
    		Log.info("***********************************************************************************************************");
    		Log.info("***********************************************************************************************************");
    	
            
         
    			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Drivers\\chromedriver.exe");
    			
    			driver = new ChromeDriver();
    		    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
                driver.navigate().to(url);
                driver.manage().window().maximize();
    		
			
		} catch (Exception e) {
			Log.info("***********************************************************************************************************");
    		Log.info("***********************************************************************************************************");
    		Log.info("[ Driver Status ] - Excepcion al levantar la instancia del driver");
    		Log.info("***********************************************************************************************************");
    		Log.info("***********************************************************************************************************");
    		
			}
		return driver;
	}
     
    
 @After
 
		 /**
		  * Metodo para crear una carpeta con el nombre de la prueba y luego crear una imagen con el nombre del metodo de prueba
		  * @param screenShotName El parámetro screenShotName define el nombre de la imagen
		  * @param testName El parámetro testName define el nombre de el test a asociar con la evidencia
		  */	
		public static String takeScreenShot(WebDriver driver,
				String screenShotName, String testName) {
			try {
				File file = new File("Screenshots" + fileSeperator + "Results");
				if (!file.exists()) {
					Log.info("File created " + file);
					file.mkdir();
				}

				File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				File targetFile = new File("Screenshots" + fileSeperator + "Results" + fileSeperator + testName, screenShotName+ ".png");
				FileUtils.copyFile(screenshotFile, targetFile);

				return screenShotName;
			} catch (Exception e) {
				Log.info("An exception occured while taking screenshot " + e.getCause());
				System.out.println("An exception occured while taking screenshot " + e.getCause());
				return null;
			}
		}
		
	 	
	public void quitDriver() {
		
		try {
			driver.quit(); 
			Log.info("***********************************************************************************************************");
    		Log.info("***********************************************************************************************************");
    		Log.info("[ Driver Status ] - Cerrando la instancia del driver");
    		Log.info("***********************************************************************************************************");
    		Log.info("***********************************************************************************************************");
    		
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("***********************************************************************************************************");
    		Log.info("***********************************************************************************************************");
    		Log.info("[ Driver Status ] - Error cerrando la instancia del driver");
    		Log.info("***********************************************************************************************************");
    		Log.info("***********************************************************************************************************");
    		
		} 
		
	} 
}
