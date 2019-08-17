/** ================================================================================================================
* @author  : Mariana Alzate 
* @version : 1.0 2019/17/08
* ==================================================================================================================
* 
* Esta clase se crea para la implementacion de Log4j y definir los niveles de acceso que tendra la auditoria de errores:
* info-warn-error-fatal-Debug
* Copyright (C) 2019
===================================================================================================================
*/

package pages;


import org.apache.log4j.Logger;

public class Log {
	
	
	// Inicializa Log4j logs
    private static Logger Log = Logger.getLogger(Log.class.getName()); 
    
    
    

       
public static void startTestCase(String sTestCaseName){
   Log.info("****************************************************************************************");
   Log.info("****************************************************************************************");
   Log.info("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");
   Log.info("****************************************************************************************");
   Log.info("****************************************************************************************");
   }

   //Esto es para imprimir el registro para el final del caso de prueba
public static void endTestCase(String sTestCaseName){
   Log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
   Log.info("X");
   Log.info("X");
   Log.info("X");
   Log.info("X");
   }

   // se necesita crear estos metodos, para que puedan ser llamados 
public static void info(String message) {
       Log.info(message);
       }
public static void warn(String message) {
   Log.warn(message);
   }
public static void error(String message) {
   Log.error(message);
   }
public static void fatal(String message) {
   Log.fatal(message);
   }
public static void debug(String message) {
   Log.debug(message);
   }
}


