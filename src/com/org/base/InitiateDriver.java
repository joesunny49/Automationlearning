package com.org.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.org.library.PropertyReader;
import com.org.pages.LoginPage;
import com.org.pages.Registerpage;

public class InitiateDriver{
	
	public WebDriver driver;
	public Registerpage register;
	public LoginPage login;
	
	@BeforeMethod
	public void startBrowser() throws IOException {
		if(PropertyReader.fetchDetails("Browsername").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver= new ChromeDriver();
		}
		else {
		if(PropertyReader.fetchDetails("Browsername").equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		else {
		
		if(PropertyReader.fetchDetails("Browsername").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe" ); 
			driver= new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe" ); 
			driver= new EdgeDriver();
		}}}
		
		driver.manage().window().maximize();
		driver.get(PropertyReader.fetchDetails("Application_URL"));
		
	    	
		

	}
		
}
