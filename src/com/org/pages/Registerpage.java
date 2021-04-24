package com.org.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.library.PropertyReader;
import com.org.pageactions.CaptureScreenshot;
import com.org.pageactions.ElementActions;

public class Registerpage {
	
	WebDriver driver= null;
	WebDriverWait wait;
	ElementActions act;
	
	public Registerpage(WebDriver driver) {
		this.driver=driver;
		act=new ElementActions(driver);
		
		
	}
	
	public void enterUserName(String userid) throws IOException {
		act.enterDataintoTextbox(driver.findElement(By.xpath(PropertyReader.fetchDetails("Registrationpage_username"))), userid);
		
		
	}
	
	public void entermailId(String mail) throws IOException {
		act.enterDataintoTextbox(driver.findElement(By.xpath(PropertyReader.fetchDetails("Registrationpage_email"))), mail);
		
	}
	
	public void enterpassword(String password) throws IOException {
		act.enterDataintoTextbox(driver.findElement(By.xpath(PropertyReader.fetchDetails("Registrationpage_password"))), password);
		
	}
	
	public void confirmPassword(String cpassword) throws IOException {
		act.enterDataintoTextbox(driver.findElement(By.xpath(PropertyReader.fetchDetails("Registrationpage_cnfrmpassword"))), cpassword);
		
	}
	
	public void enterDOB(String date) throws IOException {
		act.enterDataintoTextbox(driver.findElement(By.xpath(PropertyReader.fetchDetails("Registrationpage_birth"))), date);
		
	}
	
	public void enterPhoneNumber(String Phone) throws IOException {
		act.enterDataintoTextbox(driver.findElement(By.xpath(PropertyReader.fetchDetails("Registrationpage_phone"))), Phone);
	}
	
	public void enterAddresstype(String addressType) throws IOException {
		if(addressType.equalsIgnoreCase("home"))
			act.clickButton(driver.findElement(By.xpath(PropertyReader.fetchDetails("Regpage_addtype_home"))));
		else
			act.clickButton(driver.findElement(By.xpath(PropertyReader.fetchDetails("Regpage_addtype_Office"))));
		
	}
	
	public void selectGender() throws IOException {
		
		act.selectTextInDropdown(driver.findElement(By.xpath(PropertyReader.fetchDetails("Regpage_sex"))), "Male");
	}
	
	public void selectCountry(String countryName) throws IOException {
		
		act.selectTextInDropdown(driver.findElement(By.xpath(PropertyReader.fetchDetails("Regpage_country"))), countryName);
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath(PropertyReader.fetchDetails("Regpage_country"))), countryName));
		Select country=new Select(driver.findElement(By.xpath(PropertyReader.fetchDetails("Regpage_country"))));
		country.selectByVisibleText(countryName);
	}
	
	public void selectState(String stateName) throws IOException {
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath(PropertyReader.fetchDetails("Regpage_state"))), stateName));
		Select state=new Select(driver.findElement(By.xpath(PropertyReader.fetchDetails("Regpage_state"))));
		state.selectByVisibleText(stateName);
	}
	
	public void selectCity(String cityName) throws IOException {
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath(PropertyReader.fetchDetails("Regpage_city"))), cityName));
		Select city=new Select(driver.findElement(By.xpath(PropertyReader.fetchDetails("Regpage_city"))));
		city.selectByVisibleText(cityName);
	}
	
	public void enterZipcode(String Zipcode) throws IOException {
		driver.findElement(By.xpath(PropertyReader.fetchDetails("Regpage_zipcode"))).sendKeys(Zipcode);
	}
	
	public void acceptTerms() throws IOException {
		driver.findElement(By.xpath(PropertyReader.fetchDetails("Regpage_terms"))).click();
	}
	
	public void signUpclick() throws IOException {
		driver.findElement(By.xpath(PropertyReader.fetchDetails("Regpage_SignUp"))).click();
	}	

}

