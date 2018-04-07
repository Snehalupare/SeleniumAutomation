package com.crm.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbase {
	public static WebDriver driver;
	public static Properties prop;
public void TestBase(){ 
	try{
		prop = new Properties();
	FileInputStream file = new FileInputStream("D:\\Deeps\\WS\\CRMTesting\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");	
	}catch(FileNotFoundException e){
		e.printStackTrace();
	}catch(IOException e1){
		e1.printStackTrace();
	}
}
	public void intiallization(){
		String browsername = prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\harshal\\Desktop\\Selenium Jar Files\\Gecko Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\harshal\\Desktop\\Selenium Jar Files\\Gecko Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.get(prop.getProperty("url"));
	
	
	}
}
