package com.vmetry.onlinejobform.initializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Initializer {
	public static FileInputStream envFis = null;
	public static Properties envProp = null;
	public static FileInputStream locFis = null;
	public static Properties locProp = null;
	public static WebDriver wd = null;
	public static void initialize() throws IOException{
	envFis = new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"java"+File.separator+"com"+File.separator+"vmetry"+File.separator+"onlinejobform"+File.separator+"config"+File.separator+"env.properties"));
	envProp = new Properties();
	envProp.load(envFis);
	locFis = new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"java"+File.separator+"com"+File.separator+"vmetry"+File.separator+"onlinejobform"+File.separator+"config"+File.separator+"locator.properties"));
	locProp = new Properties();
	locProp.load(locFis);
	
	if(envProp.getProperty("BROWSER").equals("FIREFOX")){
		wd = new FirefoxDriver();
	}
	else if (envProp.getProperty("BROWSER").equals("CHROME")){
		System.setProperty("webdriver.chrome.driver",
					"C:\\Selenium Workspace\\DDDTest2\\Lib\\chromedriver.exe");
		wd= new ChromeDriver();
	}
	}
	public static WebElement getWebelementByXpath(String Xpath){
		return wd.findElement(By.xpath(locProp.getProperty(Xpath)));
		
	}
	
	}

