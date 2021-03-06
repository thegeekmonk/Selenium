package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.SeleniumTest;

public class PropertiesFile {

	public static Properties prop = new Properties();

	public static void readProperties()
	{


		try {
			InputStream input = new FileInputStream("C:\\Users\\AkhileshPC\\Selenium\\1002_Selenium_Properties\\src\\config\\config.properties");
			prop.load(input);
			
			SeleniumTest.browser = prop.getProperty("browser");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
		System.out.println(prop.getProperty("browser"));		

	}

	public static void writeProperties()
	{

		try {
			OutputStream output = new FileOutputStream("C:\\Users\\AkhileshPC\\Selenium\\1002_Selenium_Properties\\src\\config\\config.properties");
						
			prop.setProperty("Result","Pass");
			prop.store(output, null);
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		readProperties();
		
		//writeProperties();
		
//		System.out.println("After Writing data to properties File");
		
//		readProperties();

	}

}
