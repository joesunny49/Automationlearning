package com.org.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.library.PropertyReader;
import com.org.pageactions.ElementActions;

public class LoginPage {
	
	WebDriver driver= null;
	ElementActions act;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		act=new ElementActions(driver);
		}
	
	public void enterUserId(String username) throws IOException {
		
        act.enterDataintoTextbox(driver.findElement(By.xpath(PropertyReader.fetchDetails("Loginpage_username"))),username);
	}
	public void enterPassword(String password) throws IOException {
		
		act.enterDataintoTextbox(driver.findElement(By.xpath(PropertyReader.fetchDetails("Loginpage_password"))), password);
		
	}
	
	public void clickloginButton() throws IOException {
		
		act.clickButton(driver.findElement(By.xpath(PropertyReader.fetchDetails("Login_button"))));
		}
	
	public void loginTab() throws IOException {
		act.clickButton(driver.findElement(By.xpath(PropertyReader.fetchDetails("Logintab"))));
		
	}
}
